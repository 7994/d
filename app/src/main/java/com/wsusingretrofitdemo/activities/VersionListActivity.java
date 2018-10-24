package com.wsusingretrofitdemo.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.wsusingretrofitdemo.R;
import com.wsusingretrofitdemo.adapters.VersionDataAdapter;
import com.wsusingretrofitdemo.api.VersionDataAPI;
import com.wsusingretrofitdemo.backend.ResponseListener;
import com.wsusingretrofitdemo.model.DModel;
import com.wsusingretrofitdemo.utils.Const;
import com.wsusingretrofitdemo.utils.Utils;

import butterknife.ButterKnife;

public class VersionListActivity extends AppCompatActivity implements ResponseListener{

    VersionDataAPI newgetDataAPI=null;
    DModel dModel=null;
    private RecyclerView recyclerView;
    VersionDataAdapter dataAdapter=null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new2);
        ButterKnife.bind(this);
        init();
    }

    private void init() {

        recyclerView = (RecyclerView) findViewById(R.id.card_recycler_view);
        recyclerView.setHasFixedSize(true);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);
        dataAdapter = new VersionDataAdapter(VersionListActivity.this);
        recyclerView.setAdapter(dataAdapter);

        callApi(1);
    }
    private void callApi(int tag) {
        if (Utils.isOnline(this)) {
            Utils.showProgress(this);
            if (tag == 1) {
                if (newgetDataAPI == null)
                    newgetDataAPI = new VersionDataAPI(this, this);
                newgetDataAPI.execute();
            }
        } else
            Utils.showToastMessage(this, getResources().getString(R.string.checkInternet), false);

    }

    @Override
    public void onResponse(String tag, Const.API_RESULT result, Object obj) {
        Utils.dismissProgress();
        if (tag == Const.DGet_API && result == Const.API_RESULT.SUCCESS) {
            Utils.dismissProgress();
            if (tag == Const.LIST_API) {
                try {
//                    swipeContainer.setRefreshing(false);
//                    if (result == Const.API_RESULT.SUCCESS) {
                        if (newgetDataAPI.objList == null || newgetDataAPI.objList.size() <= 0) {
                            recyclerView.setVisibility(View.GONE);
//                            txtNoDataFound.setVisibility(View.VISIBLE);
                        } else {
//                            txtNoDataFound.setVisibility(View.GONE);
                            recyclerView.setVisibility(View.VISIBLE);
                            dataAdapter.addData(newgetDataAPI.objList);
                        }
//                    } else {
////                        swipeContainer.setRefreshing(false);
//                        recyclerView.setVisibility(View.GONE);
////                        txtNoDataFound.setVisibility(View.VISIBLE);
//                    }
                } catch (NullPointerException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
