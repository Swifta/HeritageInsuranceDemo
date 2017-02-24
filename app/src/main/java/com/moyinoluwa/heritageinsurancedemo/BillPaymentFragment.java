package com.moyinoluwa.heritageinsurancedemo;


import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class BillPaymentFragment extends Fragment {
    ProgressBar progressBar;
    TextView textView;
    Button button;
    EditText editText;


    public BillPaymentFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_bill_payment, container, false);

        textView = (TextView) v.findViewById(R.id.customer_id);
        button = (Button) v.findViewById(R.id.verify_customer);
        progressBar = (ProgressBar) v.findViewById(R.id.progress_bar);
        editText = (EditText) v.findViewById(R.id.customer_id);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (editText.getText().toString().isEmpty()) {
                    Snackbar.make(v, "Please enter a customer id", Snackbar.LENGTH_SHORT).show();
                } else if (editText.getText().toString().equals("customer1")) {
                    textView.setVisibility(View.GONE);
                    button.setVisibility(View.GONE);
                    progressBar.setVisibility(View.VISIBLE);

                    Intent i = new Intent(getActivity(), InsuranceTypeActivity.class);
                    startActivity(i);
                } else {
                    textView.setVisibility(View.GONE);
                    button.setVisibility(View.GONE);
                    progressBar.setVisibility(View.VISIBLE);

                    Snackbar.make(v, "Please enter a correct customer id", Snackbar.LENGTH_SHORT)
                            .show();

                    progressBar.setVisibility(View.GONE);
                    textView.setVisibility(View.VISIBLE);
                    button.setVisibility(View.VISIBLE);
                }
            }
        });

        return v;
    }
}
