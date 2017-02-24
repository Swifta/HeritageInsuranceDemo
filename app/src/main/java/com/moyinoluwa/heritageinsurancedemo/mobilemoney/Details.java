package com.moyinoluwa.heritageinsurancedemo.mobilemoney;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by moyinoluwa on 2/24/17.
 */

public class Details {
    @SerializedName("mfisaTxnId")
    @Expose
    private String mfisaTxnId;
    @SerializedName("callbackurl")
    @Expose
    private String callbackurl;

    public String getMfisaTxnId() {
        return mfisaTxnId;
    }

    public void setMfisaTxnId(String mfisaTxnId) {
        this.mfisaTxnId = mfisaTxnId;
    }

    public String getCallbackurl() {
        return callbackurl;
    }

    public void setCallbackurl(String callbackurl) {
        this.callbackurl = callbackurl;
    }
}
