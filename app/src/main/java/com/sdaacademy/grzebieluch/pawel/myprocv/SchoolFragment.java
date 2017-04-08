package com.sdaacademy.grzebieluch.pawel.myprocv;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.sdaacademy.grzebieluch.pawel.myprocv.Model.EmailItem;
import com.sdaacademy.grzebieluch.pawel.myprocv.Model.NoActionItem;
import com.sdaacademy.grzebieluch.pawel.myprocv.Model.PhoneItem;
import com.sdaacademy.grzebieluch.pawel.myprocv.Model.WebItem;
import com.sdaacademy.grzebieluch.pawel.myprocv.Views.CvRow;


public class SchoolFragment extends Fragment {

    private LinearLayout rowHolder;

    public SchoolFragment() {
        // Required empty public constructor
    }

    public static SchoolFragment newInstance() {
        SchoolFragment fragment = new SchoolFragment();
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
                new CvRow(
                        getActivity(),
                        new NoActionItem("WSZ Edukacja we Wrocławiu \n" +
                                "Kierunek: Informatyka, Specjalizacja: Grafika komputerowa\n" +
                                "2012-2015",
                                R.drawable.ic_school_black_24dp))
        };
        for (CvRow cvRow : cvRows) {
            rowHolder.addView(cvRow);
        }
    }


}
