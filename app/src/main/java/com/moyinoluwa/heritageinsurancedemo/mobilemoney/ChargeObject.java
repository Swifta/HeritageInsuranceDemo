package com.moyinoluwa.heritageinsurancedemo.mobilemoney;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by moyinoluwa on 2/24/17.
 */

public class ChargeObject {
    @SerializedName("cardNo")
    @Expose
    public String cardNo;

    /**
     * No args constructor for use in serialization
     *
     */
    public ChargeObject() {
    }

    /**
     *
     * @param cardNo
     */
    public ChargeObject(String cardNo) {
        super();
        this.cardNo = cardNo;
    }
}
