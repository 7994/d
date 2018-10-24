package com.wsusingretrofitdemo.adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.wsusingretrofitdemo.R;
import com.wsusingretrofitdemo.model.DModel;
import com.wsusingretrofitdemo.utils.Utils;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by Echo on 8/22/2018.
 */

public class VersionDataAdapter extends RecyclerView.Adapter<VersionDataAdapter.MyViewHolder> {

    Context context;

    private LayoutInflater inflater = null;
    public ArrayList<DModel> objList = null;

    public VersionDataAdapter(Context context) {
        this.context = context;
        objList = new ArrayList<>();
        inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }


    @Override
    public VersionDataAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.card_row, parent, false);
        Utils.applyFontFace(context, itemView);
        return new VersionDataAdapter.MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.tv_name.setText(objList.get(position).name);
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

    public void addData(ArrayList<DModel> mobjList) {
        objList = new ArrayList<>();
        objList.addAll(mobjList);
        this.notifyDataSetChanged();
    }




    public class MyViewHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.tv_name)
        TextView tv_name;
        @BindView(R.id.tv_version)
        TextView tv_version;
        @BindView(R.id.tv_api_level)
        TextView tv_api_level;

        public MyViewHolder(View convertView) {
            super(convertView);
            ButterKnife.bind(this, convertView);
        }
    }

}