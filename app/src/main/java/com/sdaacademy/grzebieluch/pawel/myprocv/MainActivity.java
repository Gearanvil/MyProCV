package com.sdaacademy.grzebieluch.pawel.myprocv;

import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.sdaacademy.grzebieluch.pawel.myprocv.Model.EmailItem;
import com.sdaacademy.grzebieluch.pawel.myprocv.Model.PhoneItem;
import com.sdaacademy.grzebieluch.pawel.myprocv.Model.WebItem;
import com.sdaacademy.grzebieluch.pawel.myprocv.Views.CvRow;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    //    @BindView(R.id.mainActivityRowHolder)
//    LinearLayout rowHolder;
    @BindView(R.id.mainActivityToolbar)
    Toolbar toolbar;
    @BindView(R.id.mainActivityNavigationView)
    NavigationView navigationView;
    @BindView(R.id.mainActivityDrawerLayout)
    DrawerLayout drawerLayout;
    @BindView(R.id.mainActivityContainer)
    FrameLayout container;

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
        navigationView.getMenu().performIdentifierAction(R.id.navigationMenuContact,0);

       //setupRows();
       // getSupportFragmentManager().beginTransaction().replace(R.id.mainActivityContainer, ContactFragment.newInstance()).commit();

        setSupportActionBar(toolbar);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this,drawerLayout,toolbar,R.string.app_name,R.string.app_name);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();
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

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case  R.id.mainActivityMenuSettings:
                InfoFragment.newInstance().show(getSupportFragmentManager(),"");
                break;
        }



        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        drawerLayout.closeDrawer(Gravity.LEFT);

        toolbar.setTitle(item.getTitle());

        uncheckMenuItems();
        item.setChecked(true);



        Fragment fragment = null;

        switch (item.getItemId()) {
            case R.id.navigationMenuContact:
               fragment = ContactFragment.newInstance();
                break;
            case R.id.navigationMenuEducation:
                fragment=SchoolFragment.newInstance();
                break;
            case R.id.navigationMenuExp:
                fragment=ExpFragment.newInstance();
                break;
            case R.id.navigationMenuSkills:
                Toast.makeText(this, "Umiejętności", Toast.LENGTH_SHORT).show();
                break;
            case R.id.navigationMenuHobby:
                Toast.makeText(this, "Hobby", Toast.LENGTH_SHORT).show();
                break;
            case R.id.navigationMenuSend:
                fragment=FormFragment.newInstance();
                break;

        }
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.mainActivityContainer, fragment)
                .commit();
        return false;
    }

    private void uncheckMenuItems() {
        for (int i = 0; i < navigationView.getMenu().size(); i++) {
            if (navigationView.getMenu().getItem(i).isChecked()) {
                navigationView.getMenu().getItem(i).setChecked(false);
            }
        }
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
