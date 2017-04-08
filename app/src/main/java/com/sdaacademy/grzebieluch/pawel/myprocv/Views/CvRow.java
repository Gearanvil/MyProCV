package com.sdaacademy.grzebieluch.pawel.myprocv.Views;

import android.content.Context;
import android.content.res.Resources;
import android.support.annotation.NonNull;
import android.util.DisplayMetrics;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.sdaacademy.grzebieluch.pawel.myprocv.Model.CvItem;
import com.sdaacademy.grzebieluch.pawel.myprocv.Model.EmailItem;
import com.sdaacademy.grzebieluch.pawel.myprocv.Model.NoActionItem;
import com.sdaacademy.grzebieluch.pawel.myprocv.Model.PhoneItem;
import com.sdaacademy.grzebieluch.pawel.myprocv.Model.WebItem;

/**
 * Created by RENT on 2017-04-04.
 */

public class CvRow extends LinearLayout {
    public CvRow(final Context context, CvItem cvItem) {
        super(context);

        setLayoutParams(context);
        ImageView iconField = setIconParams(context, cvItem);
        TextView textField = setTextParams(context, cvItem);
        addViews(iconField, textField);


        if (cvItem instanceof WebItem) {
            final WebItem webItem = (WebItem) cvItem;


            this.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {

                    webItem.performAction(context);
                }
            });
        }
        if (cvItem instanceof PhoneItem) {
            final PhoneItem phoneItem = (PhoneItem) cvItem;


            this.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {

                    phoneItem.performAction(context);
                }
            });
        }
        if (cvItem instanceof EmailItem) {
            final EmailItem emailItem = (EmailItem) cvItem;


            this.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {

                    emailItem.performAction(context);
                }
            });
        }
        if (cvItem instanceof NoActionItem) {
            final NoActionItem noActionItem = (NoActionItem) cvItem;


            this.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {

                    noActionItem.performAction(context);
                }
            });
        }

    }


    private void addViews(ImageView iconField, TextView textField) {
        addView(iconField);
        addView(textField);
    }

    @NonNull
    private TextView setTextParams(Context context, CvItem cvItem) {
        TextView textField = new TextView(context);
        textField.setText(cvItem.getCaption());
        textField.setLayoutParams(new LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, dpToPx(48, context)));
        textField.setTextSize(16);
        textField.setPadding(dpToPx(32, context), 0, 0, 0);
        textField.setGravity(Gravity.CENTER_VERTICAL);
        return textField;
    }

    @NonNull
    private ImageView setIconParams(Context context, CvItem cvItem) {
        ImageView iconField = new ImageView(context);
        iconField.setImageResource(cvItem.getIcon());
        iconField.setLayoutParams(new LayoutParams(dpToPx(24, context), dpToPx(24, context)));
        return iconField;
    }

    private void setLayoutParams(Context context) {
        this.setLayoutParams(new LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, dpToPx(48, context)));
        this.setPadding(dpToPx(16, context), 0, dpToPx(16, context), 0);
        this.setOrientation(HORIZONTAL);
        this.setGravity(Gravity.CENTER);
    }

    public static int dpToPx(float dp, Context context) {
        Resources resources = context.getResources();
        DisplayMetrics metrics = resources.getDisplayMetrics();
        float px = dp * ((float) metrics.densityDpi / DisplayMetrics.DENSITY_DEFAULT);
        return (int) px;
    }

    public static int pxToDp(float px, Context context) {
        Resources resources = context.getResources();
        DisplayMetrics metrics = resources.getDisplayMetrics();
        float dp = px / ((float) metrics.densityDpi / DisplayMetrics.DENSITY_DEFAULT);
        return (int) dp;
    }

    private void setListeners(final Context context, CvItem cvItem) {
        if (cvItem instanceof WebItem) {
            final WebItem webItem = (WebItem) cvItem;


            this.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {

                    webItem.performAction(context);
                }
            });
        }
    }


}
