package com.sdaacademy.grzebieluch.pawel.myprocv.Model;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;



/**
 * Created by RENT on 2017-04-05.
 */

public class WebItem extends CvItem {

    private Uri uri;

    public WebItem(String caption, int icon, String url) {
        super(caption, icon);
        uri = Uri.parse(url);
    }

    @Override
    public void performAction(Context context) {
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(uri);
        context.startActivity(intent);

    }

}
