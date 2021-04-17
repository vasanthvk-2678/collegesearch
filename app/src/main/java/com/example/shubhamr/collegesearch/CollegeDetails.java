package com.example.shubhamr.collegesearch;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class CollegeDetails extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_college_details);
    }
    public void weba1(View view)
    {
        openUrl1("http://www.loyolacollege.edu/");

    }
    public void  openUrl1(String url)

    {
        Uri uri1=Uri.parse(url);
        Intent lanuch=new Intent(Intent.ACTION_VIEW,uri1);
        startActivity(lanuch);
    }

    public void weba2(View view)
    {
        openUrl2("http://www.psgcas.ac.in/");

    }
    public void  openUrl2(String url)

    {
        Uri uri2=Uri.parse(url);
        Intent lanuch=new Intent(Intent.ACTION_VIEW,uri2);
        startActivity(lanuch);
    }
    public void weba3(View view)
    {
        openUrl3("http://www.queenmaryscollege.edu.in/");

    }
    public void  openUrl3(String url)

    {
        Uri uri3=Uri.parse(url);
        Intent lanuch=new Intent(Intent.ACTION_VIEW,uri3);
        startActivity(lanuch);
    }
    public void weba4(View view)
    {
        openUrl4("http://mcc.edu.in/");

    }
    public void  openUrl4(String url)

    {
        Uri uri4=Uri.parse(url);
        Intent lanuch=new Intent(Intent.ACTION_VIEW,uri4);
        startActivity(lanuch);
    }
    public void weba5(View view)
    {
        openUrl5("http://www.ethirajcollege.edu.in/");

    }
    public void  openUrl5(String url)

    {
        Uri uri5=Uri.parse(url);
        Intent lanuch=new Intent(Intent.ACTION_VIEW,uri5);
        startActivity(lanuch);
    }

}