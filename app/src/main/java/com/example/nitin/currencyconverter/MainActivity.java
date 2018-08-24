package com.example.nitin.currencyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void converter(View view){
        EditText amount = (EditText) findViewById(R.id.amountEditText);
        String amountInRiyal = amount.getText().toString();
        double amountInRiyalDouble = Double.parseDouble(amountInRiyal);
        double amountInRupeeDouble = amountInRiyalDouble*0.055;
        String amountInRupee = String.format("%.2f", amountInRupeeDouble);
        Toast.makeText(this, "QR "+amountInRupee, Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
