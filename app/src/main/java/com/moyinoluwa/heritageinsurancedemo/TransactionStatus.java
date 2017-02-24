package com.moyinoluwa.heritageinsurancedemo;

/**
 * Created by moyinoluwa on 10/10/16.
 */

public class TransactionStatus {
    String name;
    String status;
    String date;

    public TransactionStatus(String name, String status, String date) {
        this.name = name;
        this.status = status;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public String getStatus() {
        return status;
    }

    public String getDate() {
        return date;
    }
}
