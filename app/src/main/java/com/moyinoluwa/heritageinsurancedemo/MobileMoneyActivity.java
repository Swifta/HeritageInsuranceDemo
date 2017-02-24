package com.moyinoluwa.heritageinsurancedemo;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.TaskStackBuilder;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.app.NotificationCompat;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.moyinoluwa.heritageinsurancedemo.mobilemoney.ChargeObject;
import com.moyinoluwa.heritageinsurancedemo.mobilemoney.MobileMoneyRequest;
import com.moyinoluwa.heritageinsurancedemo.mobilemoney.MobileMoneyResponse;
import com.moyinoluwa.heritageinsurancedemo.transaction.TransactionService;
import com.moyinoluwa.heritageinsurancedemo.transaction.Url;

import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import rx.Observable;
import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

public class MobileMoneyActivity extends AppCompatActivity {
    //    EditText amount;
//    EditText description;
    TextView textView;
    Button button;
    ProgressBar progressBar;
    String paymentText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mobile_money);

//        amount = (EditText) findViewById(R.id.amount);
//        description = (EditText) findViewById(R.id.description);
        textView = (TextView) findViewById(R.id.payment_text);
        button = (Button) findViewById(R.id.pay);
        progressBar = (ProgressBar) findViewById(R.id.progress_bar);

        paymentText = getIntent().getStringExtra("payment_info");
        textView.setText(paymentText);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

//    public void confirmPaymentWithMobileMoney(View view) {
//        String amountText = "5000";
////        String descText = description.getText().toString();
//        String descText = paymentText;
//
//        if (amountText.isEmpty() || descText.isEmpty()) {
//            Toast.makeText(this, "Please fill in all the fields", Toast.LENGTH_SHORT).show();
//        } else {
//
////            amount.setVisibility(View.GONE);
////            description.setVisibility(View.GONE);
//            textView.setVisibility(View.GONE);
//            button.setVisibility(View.GONE);
//            progressBar.setVisibility(View.VISIBLE);
//
//            String basicAuth = "Basic " + Base64.encodeToString(String.format("%s:%s", "agent1",
//                    "1234").getBytes(), Base64.NO_WRAP);
//
//            TransactionRequest transactionRequest = new TransactionRequest("customer1", amountText,
//                    descText, "cedis");
//
//            final Retrofit retrofit = new Retrofit.Builder()
//                    .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
//                    .addConverterFactory(GsonConverterFactory.create())
//                    .baseUrl(Url.BASE_URL)
//                    .build();
//
//            TransactionService transactionService = retrofit.create(TransactionService.class);
//
//            final Observable<TransactionResponse> registerObservable =
//                    transactionService.performTransaction(basicAuth, transactionRequest);
//
//            registerObservable.subscribeOn(Schedulers.io())
//                    .observeOn(AndroidSchedulers.mainThread())
//                    .unsubscribeOn(Schedulers.io())
//                    .subscribe(new Subscriber<TransactionResponse>() {
//
//                        @Override
//                        public void onCompleted() {
//                        }
//
//                        @Override
//                        public void onError(Throwable e) {
//
////                            amount.setVisibility(View.VISIBLE);
////                            description.setVisibility(View.VISIBLE);
//                            textView.setVisibility(View.VISIBLE);
//                            button.setVisibility(View.VISIBLE);
//                            progressBar.setVisibility(View.GONE);
//
//                            Toast.makeText(MobileMoneyActivity.this, e.getMessage(), Toast.LENGTH_SHORT).show();
//                        }
//
//                        @Override
//                        public void onNext(TransactionResponse transactionResponse) {
////                            amount.setText("");
////                            description.setText("");
//
////                            amount.setVisibility(View.VISIBLE);
////                            description.setVisibility(View.VISIBLE);
//                            textView.setVisibility(View.VISIBLE);
//                            button.setVisibility(View.VISIBLE);
//                            progressBar.setVisibility(View.GONE);
//
//                            AlertDialog.Builder alertBuilder = new AlertDialog.Builder
//                                    (MobileMoneyActivity.this);
//
//                            alertBuilder.setMessage("Transaction started successfully! You'll receive a notification " +
//                                    "about the status of the transaction within 10 minutes!")
//                                    .setPositiveButton("OK", new DialogInterface.OnClickListener() {
//                                        @Override
//                                        public void onClick(DialogInterface dialog, int which) {
//                                            createNotification();
//                                            Intent i = new Intent(MobileMoneyActivity.this, NavigationActivity
//                                                    .class);
//                                            startActivity(i);
//                                        }
//                                    }).create()
//                                    .show();
//                        }
//                    });
//        }
//    }

    public void confirmPaymentWithMobileMoney(View view) {
        String amountText = "5000";
        String descText = paymentText;

        textView.setVisibility(View.GONE);
        button.setVisibility(View.GONE);
        progressBar.setVisibility(View.VISIBLE);

        ChargeObject chargeObject = new ChargeObject("256781644531");

        MobileMoneyRequest mobileMoneyRequest = new MobileMoneyRequest(chargeObject, amountText,
                "merchantreferenceId", "1", "GH", "NGN");

        final Retrofit retrofit = new Retrofit.Builder()
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl(Url.MOBILE_MONEY_BASE_URL)
                .build();

        TransactionService transactionService = retrofit.create(TransactionService.class);

        final Observable<MobileMoneyResponse> registerObservable = transactionService
                .performMobileMoneyTransaction("Bearer 1f38bb8f-c507-38fc-9ec3-20fa314b6ab3",
                        mobileMoneyRequest);

        registerObservable.subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .unsubscribeOn(Schedulers.io())
                .subscribe(new Subscriber<MobileMoneyResponse>() {

                    @Override
                    public void onCompleted() {
                    }

                    @Override
                    public void onError(Throwable e) {
                        textView.setVisibility(View.VISIBLE);
                        button.setVisibility(View.VISIBLE);
                        progressBar.setVisibility(View.GONE);

                        Toast.makeText(MobileMoneyActivity.this, e.getMessage(), Toast.LENGTH_SHORT).show();
                    }

                    @Override
                    public void onNext(MobileMoneyResponse mobileMoneyResponse) {
                        textView.setVisibility(View.VISIBLE);
                        button.setVisibility(View.VISIBLE);
                        progressBar.setVisibility(View.GONE);

                        if (mobileMoneyResponse.getStatus() == "01") {
                            AlertDialog.Builder alertBuilder = new AlertDialog.Builder
                                    (MobileMoneyActivity.this);

                            alertBuilder.setTitle(mobileMoneyResponse.getDescription())
                                    .setMessage("Transaction started successfully! You'll receive" +
                                            " a notification about the status of the transaction " +
                                            "within 10 minutes!")
                                    .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                                        @Override
                                        public void onClick(DialogInterface dialog, int which) {
                                            createNotification();
                                            Intent i = new Intent(MobileMoneyActivity.this,
                                                    NavigationActivity.class);
                                            startActivity(i);
                                        }
                                    }).create()
                                    .show();
                        }
                    }
                });

    }

    private void createNotification() {
        NotificationCompat.Builder notificationBuilder = (NotificationCompat.Builder) new
                NotificationCompat.Builder(this)
                .setSmallIcon(android.R.drawable.ic_menu_info_details)
                .setContentTitle("Transaction successful")
                .setContentText("Your transaction was successful! Check the app for more details.")
                .setAutoCancel(true);

        Intent i = new Intent(this, TransactionActivity.class);

        TaskStackBuilder taskStackBuilder = TaskStackBuilder.create(this);
        taskStackBuilder.addParentStack(MainActivity.class);
        taskStackBuilder.addNextIntent(i);

        PendingIntent pendingIntent = taskStackBuilder.getPendingIntent(0, PendingIntent
                .FLAG_UPDATE_CURRENT);

        notificationBuilder.setContentIntent(pendingIntent);

        NotificationManager notificationManager = (NotificationManager) getSystemService(Context
                .NOTIFICATION_SERVICE);

        notificationManager.notify(0, notificationBuilder.build());
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();
        switch (id) {
            case android.R.id.home:
                Intent i = new Intent(MobileMoneyActivity.this, InsuranceTypeActivity.class);
                startActivity(i);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
