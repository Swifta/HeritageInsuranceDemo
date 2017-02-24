package com.moyinoluwa.heritageinsurancedemo;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;

public class InsuranceTypeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_insurance_type);

        getSupportActionBar().setTitle("Select Insurance Type");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    public void goToMobileMoneyActivity(View view) {
        String title = "";

        switch (view.getId()) {
            case R.id.annuity:
                title = "Annuity";
                break;
            case R.id.grouplp:
                title = "Group Life Plan";
                break;
            case R.id.investmentplan:
                title = "Investment Plan";
                break;
            case R.id.carinsurance:
                title = "Car Insurance";
                break;
        }
        showAlertDialog(title);
    }

    private void showAlertDialog(String title) {
        final String bundledText = "Pay ₵5000 for John Doe's " + title;

        AlertDialog.Builder alertBuilder = new AlertDialog.Builder(InsuranceTypeActivity.this);
        alertBuilder.setTitle(title)
                .setMessage("Name: John Doe\n\nInsurance type: " + title + "\n\nCost: ₵5000")
                .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Intent i = new Intent(InsuranceTypeActivity.this, MobileMoneyActivity.class);
                        i.putExtra("payment_info", bundledText);
                        startActivity(i);
                    }
                })
                .setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });

        AlertDialog alertDialog = alertBuilder.create();
        alertDialog.show();
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();
        switch (id) {
            case android.R.id.home:
                Intent i = new Intent(InsuranceTypeActivity.this, NavigationActivity.class);
                startActivity(i);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
