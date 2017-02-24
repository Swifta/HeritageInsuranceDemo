package com.moyinoluwa.heritageinsurancedemo.mobilemoney;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by moyinoluwa on 2/24/17.
 */

public class MobileMoneyRequest {
    @SerializedName("chargeObject")
    @Expose
    public ChargeObject chargeObject;
    @SerializedName("amount")
    @Expose
    public String amount;
    @SerializedName("merchantreferenceId")
    @Expose
    public String merchantreferenceId;
    @SerializedName("paymentMethodId")
    @Expose
    public String paymentMethodId;
    @SerializedName("countrycode")
    @Expose
    public String countrycode;
    @SerializedName("currency")
    @Expose
    public String currency;

    /**
     * No args constructor for use in serialization
     *
     */
    public MobileMoneyRequest() {
    }

    /**
     *
     * @param amount
     * @param chargeObject
     * @param countrycode
     * @param merchantreferenceId
     * @param paymentMethodId
     * @param currency
     */
    public MobileMoneyRequest(ChargeObject chargeObject, String amount, String merchantreferenceId, String paymentMethodId, String countrycode, String currency) {
        super();
        this.chargeObject = chargeObject;
        this.amount = amount;
        this.merchantreferenceId = merchantreferenceId;
        this.paymentMethodId = paymentMethodId;
        this.countrycode = countrycode;
        this.currency = currency;
    }
}
