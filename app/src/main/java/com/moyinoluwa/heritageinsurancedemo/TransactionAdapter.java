package com.moyinoluwa.heritageinsurancedemo;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.support.v4.app.TaskStackBuilder;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.NotificationCompat;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

/**
 * Created by moyinoluwa on 9/26/16.
 */

public class TransactionAdapter extends RecyclerView.Adapter<TransactionAdapter.ViewHolder> {
    List<TransactionStatus> transactionStatusList;

    private Context context;

    public TransactionAdapter(List<TransactionStatus> statusList) {
        this.transactionStatusList = statusList;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        context = parent.getContext();

        LayoutInflater inflater = LayoutInflater.from(context);
        View v = inflater.inflate(R.layout.transaction_activity_item, parent, false);

        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, int position) {
        final String status = transactionStatusList.get(position).getStatus();
        holder.recipientTextView.setText(transactionStatusList.get(position).getName());

        if (transactionStatusList.get(position).getStatus().equals("Successful")) {
            holder.statusTextView.setTextColor(ContextCompat.getColor(context, android.R.color.holo_green_dark));
            holder.statusTextView.setText("Successful");
        } else {
            holder.statusTextView.setTextColor(ContextCompat.getColor(context, android.R.color
                    .holo_red_dark));
            holder.statusTextView.setText("Failed");
        }

        holder.rechargeTimeTextView.setText(transactionStatusList.get(position).getDate());
        holder.amountTextView.setText("₵100");
        holder.resendButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                createNotification(status);
                Toast.makeText(context, "Transaction notification resent!", Toast.LENGTH_SHORT)
                        .show();
            }
        });
    }

    private void createNotification(String status) {
        String statusMessage;

        if (status.equals("Successful")) {
            statusMessage = "Transaction successful! :D Open the app for details.";
        } else {
            statusMessage = "Transaction failed! :( Open the app for details.";
        }

        NotificationCompat.Builder notificationBuilder = (NotificationCompat.Builder) new
                NotificationCompat.Builder(context)
                .setSmallIcon(R.drawable.logo)
                .setContentTitle("Resent Transaction status")
                .setContentText(statusMessage)
                .setAutoCancel(true);

        Intent i = new Intent(context, TransactionActivity.class);

        TaskStackBuilder taskStackBuilder = TaskStackBuilder.create(context);
        taskStackBuilder.addParentStack(MainActivity.class);
        taskStackBuilder.addNextIntent(i);

        PendingIntent pendingIntent = taskStackBuilder.getPendingIntent(0, PendingIntent
                .FLAG_UPDATE_CURRENT);

        notificationBuilder.setContentIntent(pendingIntent);

        NotificationManager notificationManager = (NotificationManager) context.getSystemService
                (Context.NOTIFICATION_SERVICE);

        notificationManager.notify(0, notificationBuilder.build());
    }

    @Override
    public int getItemCount() {
        return transactionStatusList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        ImageView networkIconView;
        TextView recipientTextView;
        TextView rechargeTimeTextView;
        TextView statusTextView;
        TextView amountTextView;
        Button resendButton;

        private ViewHolder(View itemView) {
            super(itemView);

            networkIconView = (ImageView) itemView.findViewById(R.id.network_icon);
            recipientTextView = (TextView) itemView.findViewById(R.id.recipient);
            rechargeTimeTextView = (TextView) itemView.findViewById(R.id.recharge_time);
            statusTextView = (TextView) itemView.findViewById(R.id.status);
            amountTextView = (TextView) itemView.findViewById(R.id.amount);
            resendButton = (Button) itemView.findViewById(R.id.resend_notification_button);
        }
    }
}
