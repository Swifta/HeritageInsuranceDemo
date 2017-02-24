package com.moyinoluwa.heritageinsurancedemo.transaction;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by moyinoluwa on 10/11/16.
 */

public class FromUser {
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("display")
    @Expose
    private String display;
    @SerializedName("shortDisplay")
    @Expose
    private String shortDisplay;

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
     * The display
     */
    public String getDisplay() {
        return display;
    }

    /**
     *
     * @param display
     * The display
     */
    public void setDisplay(String display) {
        this.display = display;
    }

    /**
     *
     * @return
     * The shortDisplay
     */
    public String getShortDisplay() {
        return shortDisplay;
    }

    /**
     *
     * @param shortDisplay
     * The shortDisplay
     */
    public void setShortDisplay(String shortDisplay) {
        this.shortDisplay = shortDisplay;
    }

}
