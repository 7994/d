package com.wsusingretrofitdemo.activities;

import android.os.Bundle;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.wsusingretrofitdemo.R;
import com.wsusingretrofitdemo.adapters.DataListAdapter;
import com.wsusingretrofitdemo.api.DatafetchListAPI;
import com.wsusingretrofitdemo.backend.ResponseListener;
import com.wsusingretrofitdemo.utils.Const;
import com.wsusingretrofitdemo.utils.Utils;

import butterknife.BindView;
import butterknife.ButterKnife;

public class DataListActivity extends AppCompatActivity implements ResponseListener{

    @BindView(R.id.lstview)
    RecyclerView lstview;
    @BindView(R.id.swipeContainer)
    SwipeRefreshLayout swipeContainer;

    DataListAdapter dataListAdapter=null;
    DatafetchListAPI datafetchListAPI = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_list);
        ButterKnife.bind(this);
        init();
    }

    private void init() {
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        lstview.setLayoutManager(layoutManager);
        dataListAdapter = new DataListAdapter(DataListActivity.this);
        lstview.setAdapter(dataListAdapter);


        callApi(1);

        swipeContainer.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                callApi(1);
            }
        });
    }



    private void callApi(int tag) {
        if (Utils.isOnline(
                this)) {
            Utils.showProgress(this);
            if (tag == 1) {
                if (datafetchListAPI == null)
                    datafetchListAPI = new DatafetchListAPI(this, this);
                datafetchListAPI.execute();
            }
        } else
            Utils.showToastMessage(this, getResources().getString(R.string.checkInternet), false);

    }

    @Override
    public void onResponse(String tag, Const.API_RESULT result, Object obj) {
        Utils.dismissProgress();
        if (tag == Const.DATALIST_API) {
            try {
                swipeContainer.setRefreshing(false);
                Utils.print("<<<<<<<<"+result);
                if (result == Const.API_RESULT.SUCCESS) {
                    if (datafetchListAPI.objList == null || datafetchListAPI.objList.size() <= 0) {
                        lstview.setVisibility(View.GONE);
//                        txtNoDataFound.setVisibility(View.VISIBLE);
                    } else {
//                        txtNoDataFound.setVisibility(View.GONE);
                        lstview.setVisibility(View.VISIBLE);
                        dataListAdapter.addData(datafetchListAPI.objList);
                    }
                } else {
                    swipeContainer.setRefreshing(false);
                    lstview.setVisibility(View.GONE);
//                    txtNoDataFound.setVisibility(View.VISIBLE);
                }
            } catch (NullPointerException e) {
                e.printStackTrace();
            }
        }
    }
}
