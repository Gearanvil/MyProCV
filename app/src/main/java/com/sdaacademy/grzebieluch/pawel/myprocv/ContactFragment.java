package com.sdaacademy.grzebieluch.pawel.myprocv;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.sdaacademy.grzebieluch.pawel.myprocv.Model.EmailItem;
import com.sdaacademy.grzebieluch.pawel.myprocv.Model.PhoneItem;
import com.sdaacademy.grzebieluch.pawel.myprocv.Model.WebItem;
import com.sdaacademy.grzebieluch.pawel.myprocv.Views.CvRow;


public class ContactFragment extends Fragment {

    private LinearLayout rowHolder;

    public ContactFragment() {
        // Required empty public constructor
    }

    public static ContactFragment newInstance() {
        ContactFragment fragment = new ContactFragment();
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
                new CvRow(getActivity(), new PhoneItem("Moj numer telefonu", R.drawable.ic_call_black_24dp, "506021570")),
                new CvRow(getActivity(),
                        new EmailItem("Moj Email", R.drawable.ic_mail_outline_black_24dp, new String[]{"grzebieluch.pawel@gmail.com"}, "Email from MyProCV")),
                new CvRow(getActivity(), new WebItem("GitHub, Gearanvil", R.drawable.git_icon, "http://wp.pl"))

        };
        for (CvRow cvRow : cvRows) {
            rowHolder.addView(cvRow);
        }
    }


}
