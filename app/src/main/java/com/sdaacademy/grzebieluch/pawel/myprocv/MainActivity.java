package com.sdaacademy.grzebieluch.pawel.myprocv;

import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.sdaacademy.grzebieluch.pawel.myprocv.Model.EmailItem;
import com.sdaacademy.grzebieluch.pawel.myprocv.Model.PhoneItem;
import com.sdaacademy.grzebieluch.pawel.myprocv.Model.WebItem;
import com.sdaacademy.grzebieluch.pawel.myprocv.Views.CvRow;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    @BindView(R.id.mainActivityRowHolder)
    LinearLayout rowHolder;
    @BindView(R.id.mainActivityToolbar)
    Toolbar toolbar;
    @BindView(R.id.mainActivityNavigationView)
    NavigationView navigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
//        View phoneView = findViewById(R.id.phoneNumber);
//        phoneView.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                dial("tel: 506021570");
//            }
//        });
//
//        View emailView = findViewById(R.id.mainActivityEmailView);
//        emailView.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                sendEmail();
//            }
//        });
//        View gitHubView = findViewById(R.id.mainActivityGitHubView);
//        gitHubView.setOnClickListener((new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                startNewViewIntent("http://wp.pl");
//            }
//        }));
//
//        View myAdressView = findViewById(R.id.mainActivityHomeAdressView);
//        myAdressView.setOnClickListener((new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                startNewViewIntent("https://www.google.pl/maps/place/Włodzimierza+Majakowskiego+44,+Wrocław/@51.1265037,16.9454602");
//            }
//        }));


        //  LinearLayout linearLayout = (LinearLayout) findViewById(R.id.mainActivityRowHolder);
        navigationView.setNavigationItemSelectedListener(this);

        setupRows();
        setSupportActionBar(toolbar);

        // CvRow homeAdress = new CvRow(this, "54-317 Wrocław, Majakowskiego 44/19", R.drawable.ic_my_location_24dp);
//        CvRow test = new CvRow(this,  "Test row", R.drawable.mydrawnface);
//        CvRow test2 = new CvRow(this, "Test row", R.drawable.mydrawnface);
//        CvRow test3 = new CvRow(this, "Test row", R.drawable.mydrawnface);
//        CvRow test4 = new CvRow(this, "Test row", R.drawable.mydrawnface);
//        CvRow test5 = new CvRow(this, "Test row", R.drawable.mydrawnface);
//        CvRow test6 = new CvRow(this, "Test row", R.drawable.mydrawnface);
//        linearLayout.addView(telefon);
//        linearLayout.addView(emailAdress);
//        linearLayout.addView(gitHub);
//        linearLayout.addView(homeAdress);
//        linearLayout.addView(test);
//        linearLayout.addView(test2);
//        linearLayout.addView(test3);
//        linearLayout.addView(test4);
//        linearLayout.addView(test5);
//        linearLayout.addView(test6);


//        phoneNumber.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                dial("tel: 506021570");
//            }
//        });
//
//        emailAdress.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                sendEmail();
//            }
//        });
//       gitHub.setOnClickListener((new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                startNewViewIntent("http://wp.pl");
//            }
//        }));
//
//        homeAdress.setOnClickListener((new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                startNewViewIntent("https://www.google.pl/maps/place/Włodzimierza+Majakowskiego+44,+Wrocław/@51.1265037,16.9454602");
//            }
//        }));
//
//
//
//    }

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_activity_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    private void setupRows() {
//        CvRow telefon = new CvRow(this, new PhoneItem("Moj numer telefonu", R.drawable.ic_call_black_24dp, "506021570"));
//        CvRow emailAdress = new CvRow(this,
//                new EmailItem("Moj Email", R.drawable.ic_mail_outline_black_24dp, new String[]{"grzebieluch.pawel@gmail.com"}, "Email from MyProCV"));
//        CvRow gitHub = new CvRow(this, new WebItem("GitHub, Gearanvil", R.drawable.git_icon, "http://wp.pl"));

//        rowHolder.addView(telefon);
//        rowHolder.addView(emailAdress);
//        rowHolder.addView(gitHub);

        CvRow [] cvRows = new CvRow[]{
                new CvRow(this, new PhoneItem("Moj numer telefonu", R.drawable.ic_call_black_24dp, "506021570")),
                new CvRow(this,
                        new EmailItem("Moj Email", R.drawable.ic_mail_outline_black_24dp, new String[]{"grzebieluch.pawel@gmail.com"}, "Email from MyProCV")),
                new CvRow(this, new WebItem("GitHub, Gearanvil", R.drawable.git_icon, "http://wp.pl"))

        };
        for (CvRow cvRow : cvRows) {
            rowHolder.addView(cvRow);
        }
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        toolbar.setTitle(item.getTitle());

        switch (item.getItemId()) {
            case R.id.navigationMenuContact:
                Toast.makeText(this, "Dane kontaktowe", Toast.LENGTH_SHORT).show();
                break;
            case R.id.navigationMenuEducation:
                Toast.makeText(this, "Wykształcenie", Toast.LENGTH_SHORT).show();
                break;
            case R.id.navigationMenuExp:
                Toast.makeText(this, "Doświadczenie", Toast.LENGTH_SHORT).show();
                break;
            case R.id.navigationMenuSkills:
                Toast.makeText(this, "Umiejętności", Toast.LENGTH_SHORT).show();
                break;
            case R.id.navigationMenuHobby:
                Toast.makeText(this, "Hobby", Toast.LENGTH_SHORT).show();
                break;

        }
        return false;
    }

//    private void startNewIntent(String action, String data) {
//        Intent intent = new Intent(action);
//        intent.setData(Uri.parse(data));
//        startActivity(intent);
//    }
//
//    private void startNewViewIntent(String url) {
//        startNewIntent(Intent.ACTION_VIEW, url);
//
//    }
//
//    private void sendEmail() {
//        Intent intent = new Intent(Intent.ACTION_SENDTO);
//        intent.setData(Uri.parse("mailto:"));
//        intent.putExtra(Intent.EXTRA_EMAIL, new String[]{"grzebieluch.pawel@gmail.com"});
//        intent.putExtra(Intent.EXTRA_SUBJECT, "Message from MyProCV");
//        startActivity(intent);
//    }
//
//    private void dial(String phoneNumber) {
//        startNewIntent(Intent.ACTION_DIAL, phoneNumber);
//
//    }
}
