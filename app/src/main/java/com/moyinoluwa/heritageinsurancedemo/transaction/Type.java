package com.moyinoluwa.heritageinsurancedemo.transaction;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by moyinoluwa on 10/11/16.
 */

public class Type {
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("internalName")
    @Expose
    private String internalName;
    @SerializedName("from")
    @Expose
    private From from;
    @SerializedName("to")
    @Expose
    private To to;

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
     * The from
     */
    public From getFrom() {
        return from;
    }

    /**
     *
     * @param from
     * The from
     */
    public void setFrom(From from) {
        this.from = from;
    }

    /**
     *
     * @return
     * The to
     */
    public To getTo() {
        return to;
    }

    /**
     *
     * @param to
     * The to
     */
    public void setTo(To to) {
        this.to = to;
    }
}
