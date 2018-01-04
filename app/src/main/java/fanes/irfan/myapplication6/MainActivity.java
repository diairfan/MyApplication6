package fanes.irfan.myapplication6;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn_frame = findViewById(R.id.btn_frame);
        Button btn_Gride = findViewById(R.id.btn_gride);
        Button btn_rela = findViewById(R.id.btn_rela);
        Button btn_table = findViewById(R.id.btn_table);
        Button btn_linear = findViewById(R.id.btn_linear);
        Button btn_widget = findViewById(R.id.btn_widget);
        Button btn_image = findViewById(R.id.btn_image);
        Button btn_list = findViewById(R.id.btn_list);
        Button btn_card = findViewById(R.id.btn_card);
        Button btn_rec = findViewById(R.id.btn_rec);
        Button btn_calculator = findViewById(R.id.btn_calculator);
        Button btn_fragment = findViewById(R.id.btn_fragment);

        btn_table.setOnClickListener(this);
        btn_frame.setOnClickListener(this);
        btn_Gride.setOnClickListener(this);
        btn_rela.setOnClickListener(this);
        btn_linear.setOnClickListener(this);
        btn_widget.setOnClickListener(this);
        btn_list.setOnClickListener(this);
        btn_image.setOnClickListener(this);
        btn_card.setOnClickListener(this);
        btn_rec.setOnClickListener(this);
        btn_calculator.setOnClickListener(this);
        btn_fragment.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_frame:
                startActivity(new Intent(this, FrameLayoutActivity.class));
                break;


            case R.id.btn_gride:
                startActivity(new Intent(this, GrideLayoutActivity.class));
                break;

            case R.id.btn_rela:
                startActivity(new Intent(this, RelatifLayoutActivity.class));
                break;

            case R.id.btn_table:
                startActivity(new Intent(this, TableLayoutActivity.class));
                break;

            case R.id.btn_linear:
                startActivity(new Intent(this, LinearLayoutActivity.class));
                break;

            case R.id.btn_widget:
                startActivity(new Intent(this, WidgetActivity.class));
                break;

            case R.id.btn_image:
                startActivity(new Intent(this, ImageViewActivity.class));
                break;

            case R.id.btn_list:
                startActivity(new Intent(this, ListViewActivity.class));
                break;

            case R.id.btn_card:
                startActivity(new Intent(this, CardViewActivity.class));
                break;

            case R.id.btn_calculator:
                startActivity(new Intent(this, CalculatorActivity.class));
                break;

            case R.id.btn_rec:
                startActivity(new Intent(this, RecyclerViewActivity.class));
                break;


            case R.id.btn_fragment:
                startActivity(new Intent(this, FragmentActivity.class));
                break;

        }
    }


}
