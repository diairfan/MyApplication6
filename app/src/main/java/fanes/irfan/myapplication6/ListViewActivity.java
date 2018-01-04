package fanes.irfan.myapplication6;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class ListViewActivity extends AppCompatActivity {


        private ListView lvItem;
        private String[] bahasapemrograman = new String[]{
                "ASP.NET","C++","C#" ,"BASIC", "SQL",
                "PHP", "Phyton","Javascript","Java",
                "Visual Basic"};
        //mendeklarasikan listview var dan menginisialasi array tipe data string




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);

        getSupportActionBar().setTitle("ListView MyApplication6"); //tampil title



            lvItem = (ListView) findViewById(R.id.list_view);
            ArrayAdapter<String> adapter = new ArrayAdapter<String>(ListViewActivity.this, android.R.layout.simple_list_item_1, android.R.id.text1, bahasapemrograman);
    /*

    Membinding atau memformat data
     */

            lvItem.setAdapter(adapter);
            //menset data di dalam listview

            //Step 3
            lvItem.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    Toast.makeText(ListViewActivity.this, "Memilih : "+bahasapemrograman[position], Toast.LENGTH_LONG).show();

                    //memanggil set on Item ClickListener untuk Listview, jadi jika salah satu item list view diklik akan
                    //akan bereaksi menampilkan toast atau aksi lainya.
                    //Step 4
                }
            });
        }
    }

