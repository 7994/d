package com.wsusingretrofitdemo.model;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by EchoIT on 2/15/2018.
 */

public class ListModel implements Serializable{
    public String title = "";

    public String id = "";
    public String executionTime = "";

    public ArrayList<DataModel> stationBeanList;

    public ListModel() {
        stationBeanList = new ArrayList<>();
    }

}
