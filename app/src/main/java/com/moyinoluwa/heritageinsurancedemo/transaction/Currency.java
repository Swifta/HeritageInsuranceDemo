package com.moyinoluwa.heritageinsurancedemo.transaction;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by moyinoluwa on 10/11/16.
 */

public class Currency {
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("internalName")
    @Expose
    private String internalName;
    @SerializedName("symbol")
    @Expose
    private String symbol;
    @SerializedName("prefix")
    @Expose
    private String prefix;
    @SerializedName("decimalDigits")
    @Expose
    private Integer decimalDigits;

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
     * The name
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @param name
     * The name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @return
     * The internalName
     */
    public String getInternalName() {
        return internalName;
    }

    /**
     *
     * @param internalName
     * The internalName
     */
    public void setInternalName(String internalName) {
        this.internalName = internalName;
    }

    /**
     *
     * @return
     * The symbol
     */
    public String getSymbol() {
        return symbol;
    }

    /**
     *
     * @param symbol
     * The symbol
     */
    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    /**
     *
     * @return
     * The prefix
     */
    public String getPrefix() {
        return prefix;
    }

    /**
     *
     * @param prefix
     * The prefix
     */
    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    /**
     *
     * @return
     * The decimalDigits
     */
    public Integer getDecimalDigits() {
        return decimalDigits;
    }

    /**
     *
     * @param decimalDigits
     * The decimalDigits
     */
    public void setDecimalDigits(Integer decimalDigits) {
        this.decimalDigits = decimalDigits;
    }
}
