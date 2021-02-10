package com.example.ejercicioclase;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View;
import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
private EditText etnum;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etnum = (EditText) findViewById(R.id.txtnum);
    }
        public void MainActivity2 (View v) {
            Intent i=new Intent(this, MainActivity2.class);
            i.putExtra("txtnum", etnum.getText().toString());
            startActivity(i);
    }
}