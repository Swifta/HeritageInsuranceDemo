package com.moyinoluwa.heritageinsurancedemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.MenuItem;

import java.util.ArrayList;
import java.util.List;

public class TransactionActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    TransactionAdapter transactionAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transaction);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        recyclerView = (RecyclerView) findViewById(R.id.heritage_recycler_view);

        List<TransactionStatus> transactionStatusList = new ArrayList<TransactionStatus>();
        transactionStatusList.add(new TransactionStatus("4th of August, 2016", "Successful",
                "8:00 AM"));
        transactionStatusList.add(new TransactionStatus("5th of August, 2016", "Failed", "9:00 " +
                "AM"));
        transactionStatusList.add(new TransactionStatus("6th of August, 2016", "Failed", "12:00 " +
                "PM"));
        transactionStatusList.add(new TransactionStatus("7th of August, 2016", "Successful",
                "2:35 AM"));
        transactionStatusList.add(new TransactionStatus("7th of August, 2016", "Successful",
                "6:50 AM"));

        transactionAdapter = new TransactionAdapter(transactionStatusList);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(transactionAdapter);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();
        switch (id) {
            case android.R.id.home:
                Intent i = new Intent(TransactionActivity.this, NavigationActivity.class);
                startActivity(i);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
