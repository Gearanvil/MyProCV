package com.sdaacademy.grzebieluch.pawel.myprocv.Model;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;


/**
 * Created by RENT on 2017-04-05.
 */
//
//Intent intent = new Intent(Intent.ACTION_SENDTO);
//        intent.setData(Uri.parse("mailto:"));
//        intent.putExtra(Intent.EXTRA_EMAIL, new String[]{"grzebieluch.pawel@gmail.com"});
//        intent.putExtra(Intent.EXTRA_SUBJECT, "Message from MyProCV");
//        startActivity(intent);
public class EmailItem extends CvItem {

    private Uri uri;

    public EmailItem(String caption, int icon, String [] emails,String subject) {
        super(caption, icon);
        uri = Uri.parse("mailto:");
    }

    @Override
    public void performAction(Context context) {
        Intent intent = new Intent(Intent.ACTION_SENDTO);
        intent.setData(uri);
        intent.putExtra(Intent.EXTRA_EMAIL, new String[]{"grzebieluch.pawel@gmail.com"});
        intent.putExtra(Intent.EXTRA_SUBJECT, "Message from MyProCV");
        context.startActivity(intent);

    }

}
