package com.example.locproviderinfo;

import androidx.appcompat.app.AppCompatActivity;

import android.location.LocationManager;
import android.os.Bundle;
import android.widget.TextView;

import java.util.List;

public class MainActivity extends AppCompatActivity {
  TextView mtexInfo;
  LocationManager locManager;
  List<String> locProviderList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mtexInfo = findViewById(R.id.textInfo);
        locManager = (LocationManager) getSystemService(LOCATION_SERVICE);
        locProviderList = locManager.getAllProviders();
        mtexInfo.setText("");

        for(String locProvider : locProviderList){
            mtexInfo.append("Loc : Provider : " + locProvider + "\n");
            mtexInfo.append("Enabled : " +locManager.isProviderEnabled(locProvider) + "\n\n");
        }
    }
}