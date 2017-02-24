package com.moyinoluwa.heritageinsurancedemo.transaction;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by moyinoluwa on 10/11/16.
 */

public class TransactionResponse {
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("kind")
    @Expose
    private String kind;
    @SerializedName("date")
    @Expose
    private String date;
    @SerializedName("amount")
    @Expose
    private String amount;
    @SerializedName("fromKind")
    @Expose
    private String fromKind;
    @SerializedName("fromUser")
    @Expose
    private FromUser fromUser;
    @SerializedName("toKind")
    @Expose
    private String toKind;
    @SerializedName("toUser")
    @Expose
    private ToUser toUser;
    @SerializedName("type")
    @Expose
    private Type type;
    @SerializedName("currency")
    @Expose
    private Currency currency;
    @SerializedName("description")
    @Expose
    private String description;

    /**
     *
     * @return
     * The id
     */
    public String getId() {
        return id;
    }

    /**
     *
     * @param id
     * The id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     *
     * @return
     * The kind
     */
    public String getKind() {
        return kind;
    }

    /**
     *
     * @param kind
     * The kind
     */
    public void setKind(String kind) {
        this.kind = kind;
    }

    /**
     *
     * @return
     * The date
     */
    public String getDate() {
        return date;
    }

    /**
     *
     * @param date
     * The date
     */
    public void setDate(String date) {
        this.date = date;
    }

    /**
     *
     * @return
     * The amount
     */
    public String getAmount() {
        return amount;
    }

    /**
     *
     * @param amount
     * The amount
     */
    public void setAmount(String amount) {
        this.amount = amount;
    }

    /**
     *
     * @return
     * The fromKind
     */
    public String getFromKind() {
        return fromKind;
    }

    /**
     *
     * @param fromKind
     * The fromKind
     */
    public void setFromKind(String fromKind) {
        this.fromKind = fromKind;
    }

    /**
     *
     * @return
     * The fromUser
     */
    public FromUser getFromUser() {
        return fromUser;
    }

    /**
     *
     * @param fromUser
     * The fromUser
     */
    public void setFromUser(FromUser fromUser) {
        this.fromUser = fromUser;
    }

    /**
     *
     * @return
     * The toKind
     */
    public String getToKind() {
        return toKind;
    }

    /**
     *
     * @param toKind
     * The toKind
     */
    public void setToKind(String toKind) {
        this.toKind = toKind;
    }

    /**
     *
     * @return
     * The toUser
     */
    public ToUser getToUser() {
        return toUser;
    }

    /**
     *
     * @param toUser
     * The toUser
     */
    public void setToUser(ToUser toUser) {
        this.toUser = toUser;
    }

    /**
     *
     * @return
     * The type
     */
    public Type getType() {
        return type;
    }

    /**
     *
     * @param type
     * The type
     */
    public void setType(Type type) {
        this.type = type;
    }

    /**
     *
     * @return
     * The currency
     */
    public Currency getCurrency() {
        return currency;
    }

    /**
     *
     * @param currency
     * The currency
     */
    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    /**
     *
     * @return
     * The description
     */
    public String getDescription() {
        return description;
    }

    /**
     *
     * @param description
     * The description
     */
    public void setDescription(String description) {
        this.description = description;
    }

}
