package fanes.irfan.myapplication6;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.annotation.SuppressLint;
import android.provider.Telephony;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.sql.Array;

import static android.widget.Toast.makeText;

import static android.widget.Toast.makeText;

public class WidgetActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_widget);

        Button btn_obj = (Button) findViewById(R.id.btn_one);
        btn_obj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                makeText(WidgetActivity.this,"Button Clicked", Toast.LENGTH_SHORT).show();
            }
        });

        final EditText txt_obj = (EditText)findViewById(R.id.txt_one);

        btn_obj.setOnClickListener(new View.OnClickListener() {

                                       @Override
                                       public void onClick(View view) {
                                           makeText(WidgetActivity.this, "Memilih : ", Toast.LENGTH_SHORT).show();

                                       }
                                   }

            );}}
