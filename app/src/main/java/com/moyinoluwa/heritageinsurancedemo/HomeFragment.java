package com.moyinoluwa.heritageinsurancedemo;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment {
    RecyclerView recyclerView;
    TransactionAdapter transactionAdapter;

    public HomeFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_home, container, false);


        recyclerView = (RecyclerView) v.findViewById(R.id.heritage_recycler_view);

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
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setAdapter(transactionAdapter);

        return v;
    }

}
