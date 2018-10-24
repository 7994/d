package com.wsusingretrofitdemo.api;

import android.app.Activity;
import android.content.Context;

import com.wsusingretrofitdemo.backend.ResponseListener;
import com.wsusingretrofitdemo.backend.ResponseModel;
import com.wsusingretrofitdemo.backend.ResponseModel1;
import com.wsusingretrofitdemo.model.DModel;
import com.wsusingretrofitdemo.utils.Const;
import com.wsusingretrofitdemo.utils.Utils;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.http.GET;


public class VersionDataAPI {

    private final static String API = Const.DGet_API;
    private ResponseListener responseListener = null;
    private Context context = null;
    private static IRequestData iRequestData = null;

   public ArrayList<DModel>objList=null;


    public VersionDataAPI(Context _context, ResponseListener _responseListener) {
        this.context = _context;
        responseListener = _responseListener;
        iRequestData = Utils.retrofit.create(IRequestData.class);
    }

    // Request Api Param
    private interface IRequestData {
        @GET(API)
        Call<ResponseModel1<DModel>> getResponseData(
        );
    }

    public Void execute() {
        try {

            Call<ResponseModel1<DModel>> call = iRequestData.getResponseData();
            call.enqueue(new Callback<ResponseModel1<DModel>>() {

                @Override
                public void onResponse(Call<ResponseModel1<DModel>> call, Response<ResponseModel1<DModel>> response) {
                    int status = 0;
                    String mesg = "";
                    try {
                        Utils.print("?????????"+objList);
                        Utils.print("Message==>"+ response.code() );

                        status = response.code();
                        objList = new ArrayList<>();
                        if (status == 200) {
                            objList.addAll(response.body().android);
                            Utils.print("OBJ==>"+ objList.size());
//                            dModel = response.body().result.get(0);

                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    doCallBack(status, mesg);
                }

                @Override
                public void onFailure(Call<ResponseModel1<DModel>> call, Throwable t) {
                    Utils.print("Upload error:"+ t.getMessage());
                    doCallBack(-2, t.getMessage());
                }
            });
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    /*
     * Send control back to the caller which includes
     * Status: Successful or Failure Message: Its an Object, if required
     */
    private void doCallBack(final int code, final String mesg) {
        ((Activity) context).runOnUiThread(new Runnable() {
            @Override
            public void run() {
                if (code == 200) {
                    responseListener.onResponse(API, Const.API_RESULT.SUCCESS, null);
                } else if (code >= 0) {
                    Utils.showToastMessage(context, mesg, false);
                    responseListener.onResponse(API, Const.API_RESULT.FAIL, null);
                } else if (code < 0) {
                    responseListener.onResponse(API, Const.API_RESULT.FAIL, null);
                }
            }
        });
    }
}