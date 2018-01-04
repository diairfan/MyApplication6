package fanes.irfan.myapplication6;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class ImageViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_view);

        Button btn_next_image = (Button)findViewById(R.id.btn_next_image);
        Button btn_back_image = (Button) findViewById(R.id.btn_back_image);

         final ImageView image_view_obj = (ImageView) findViewById(R.id.image_view);
         final int[] images = {R.drawable.android1,R.drawable.android2, R.drawable.android3};
        final int[] current_image = {0};
        btn_next_image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                current_image[0]++;
                current_image[0] = current_image[0] % images.length;
                image_view_obj.setImageResource(images[current_image[0]]);
            }
        });
        btn_back_image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                current_image[0]--;
                current_image[0] = current_image[0] % images.length;
                image_view_obj.setImageResource(images[current_image[0]]);
            }
        });


    }
}
