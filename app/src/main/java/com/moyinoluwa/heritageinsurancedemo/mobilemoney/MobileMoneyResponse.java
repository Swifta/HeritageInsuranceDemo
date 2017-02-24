package com.moyinoluwa.heritageinsurancedemo.mobilemoney;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by moyinoluwa on 2/24/17.
 */

public class MobileMoneyResponse {
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("details")
    @Expose
    private Details details;
    @SerializedName("mfisarequestid")
    @Expose
    private String mfisarequestid;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Details getDetails() {
        return details;
    }

    public void setDetails(Details details) {
        this.details = details;
    }

    public String getMfisarequestid() {
        return mfisarequestid;
    }

    public void setMfisarequestid(String mfisarequestid) {
        this.mfisarequestid = mfisarequestid;
    }
}
