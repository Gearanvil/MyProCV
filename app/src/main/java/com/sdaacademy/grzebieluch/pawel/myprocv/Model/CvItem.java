package com.sdaacademy.grzebieluch.pawel.myprocv.Model;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by RENT on 2017-04-05.
 */

public abstract class CvItem {
    private String caption;
    private int icon;

    public CvItem(String caption, int icon) {
        this.caption = caption;
        this.icon = icon;
    }

    public String getCaption() {
        return caption;
    }

    public int getIcon() {
        return icon;
    }
    public abstract void performAction(Context context);
}
