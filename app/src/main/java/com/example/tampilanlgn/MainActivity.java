package com.example.tampilanlgn;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
//import android.widget.ArrayAdapter;
//import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    //deklarasi atribut
    EditText textnama;
    TextView hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textnama=(EditText)findViewById(R.id.Txtnama);
        hasil=(TextView)findViewById(R.id.Lbl_nama);
    }

    public void tampilnama(View view) {
        hasil.setText("nama anda :  "+textnama.getText());
    }
}