package com.easz.kensapp1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // onClick
    public void onClickShowOnMap(View view) {

    }

    public void onClickFindMe(View view) {
        Intent intent = new Intent(this, MapsActivity.class);

        // get Street
        EditText et_address = (EditText)findViewById(R.id.et_address);
        String address = et_address.getText().toString();

        //putExtra Street
        intent.putExtra(MapsActivity.ADDRESS, address);

        startActivity(intent);
    }

    public void onClickStart(View view) {
        // place 100ft Geofence around location (address)
    }
}