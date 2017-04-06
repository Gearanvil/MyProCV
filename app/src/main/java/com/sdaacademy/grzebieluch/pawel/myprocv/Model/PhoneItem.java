package com.sdaacademy.grzebieluch.pawel.myprocv.Model;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;


/**
 * Created by RENT on 2017-04-05.
 */

public class PhoneItem extends CvItem {

    private Uri uri;

    public PhoneItem(String caption, int icon, String phoneNumber) {
        super(caption, icon);
        uri = Uri.parse("tel:"+phoneNumber);
    }

    @Override
    public void performAction(Context context) {
        Intent intent = new Intent(Intent.ACTION_DIAL);
        intent.setData(uri);
        context.startActivity(intent);

    }

}
