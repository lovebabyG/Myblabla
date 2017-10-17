package com.example.myblabla.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by yijia_gong on 17/10/17.
 */

public class Now {

    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More {
        @SerializedName("txt")
        public String info;
    }

}
