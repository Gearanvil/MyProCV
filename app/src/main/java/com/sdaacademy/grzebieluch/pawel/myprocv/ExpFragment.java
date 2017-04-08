package com.sdaacademy.grzebieluch.pawel.myprocv;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.sdaacademy.grzebieluch.pawel.myprocv.Model.WebItem;
import com.sdaacademy.grzebieluch.pawel.myprocv.Views.CvRow;


public class ExpFragment extends Fragment {

    private LinearLayout rowHolder;

    public ExpFragment() {
        // Required empty public constructor
    }

    public static ExpFragment newInstance() {
        ExpFragment fragment = new ExpFragment();
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_contact, container, false);
        rowHolder = (LinearLayout) view.findViewById(R.id.fragmentRowHolder);
        setupRows();
        return view;

    }


    public void setupRows() {
        CvRow[] cvRows = new CvRow[]{
                new CvRow(getActivity(),
                        new WebItem("Amazon Fulfillment Polska, Logistyczna 6",
                                R.drawable.ic_amazon_24dp,
                                "https://www.amazon.de/gp/switch-language/homepage.html/?tag=pldomain-21&ie=UTF8&language=pl_PL"))
        };
        for (CvRow cvRow : cvRows) {
            rowHolder.addView(cvRow);
        }
    }


}
