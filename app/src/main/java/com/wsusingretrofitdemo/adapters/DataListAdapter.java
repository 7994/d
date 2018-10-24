package com.wsusingretrofitdemo.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.wsusingretrofitdemo.R;
import com.wsusingretrofitdemo.model.ListModel;
import com.wsusingretrofitdemo.utils.Utils;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;


public class DataListAdapter extends RecyclerView.Adapter<DataListAdapter.MyViewHolder> {
    Context context;

    private LayoutInflater inflater = null;
    public ArrayList<ListModel> objList = null;

    public DataListAdapter(Context context) {
        this.context = context;
        objList = new ArrayList<>();
        inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }


    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.row_data_list, parent, false);
        Utils.applyFontFace(context, itemView);
        return new MyViewHolder(itemView);
    }

    @Override
    public int getItemCount() {

        Utils.print("SIzeeeeeeeeeeee===================" + objList.size());
        return objList.size();
    }


    @Override
    public long getItemId(int position) {
        // TODO Auto-generated method stub
        return position;
    }

    public void addData(ArrayList<ListModel> mobjList) {

        objList = new ArrayList<>();
        objList.addAll(mobjList);
        this.notifyDataSetChanged();
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        // TODO Auto-generated method stub

//        holder.row.setTag(position);
//        holder.row.setOnClickListener((View.OnClickListener) context);
        holder.txtTitle.setText(objList.get(position).stationBeanList.get(position).stationName);
        Utils.print("===================" + objList.get(position).stationBeanList.size());

    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.txtTitle)
        TextView txtTitle;
        @BindView(R.id.row)
        RelativeLayout row;

        public MyViewHolder(View convertView) {
            super(convertView);
            ButterKnife.bind(this, convertView);

        }
    }


}