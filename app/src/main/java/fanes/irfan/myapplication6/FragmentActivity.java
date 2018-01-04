package fanes.irfan.myapplication6;

import android.app.FragmentManager;
import android.app.Fragment;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import fanes.irfan.myapplication6.Fragment2Activity;
import fanes.irfan.myapplication6.R;

import static fanes.irfan.myapplication6.R.layout.activity_conten_fragmen;

public class FragmentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(activity_conten_fragmen);

        Button btn_frag_two = (Button) findViewById(R.id.btn_frag_two);
        loadFragment(new Fragment2Activity(), null, null);

        btn_frag_two.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                if (v == findViewById(R.id.btn_frag_two)) {
                    //get the component
                    EditText name_obj = (EditText) findViewById(R.id.txt_name);
                    EditText email_obj = (EditText) findViewById(R.id.txt_email);
                    if (name_obj.getText().toString().length() == 0) {
                        name_obj.setError("name is required!");
                    } else if (email_obj.getText().toString().length() == 0) {
                        email_obj.setError("email is required!");
                    } else if (!isValidEmail(email_obj.getText().toString())) {
                        email_obj.setError("Please use valid email address!");
                    } else {
                        //get the strings
                        String name = String.valueOf(name_obj.getText());
                        String email = String.valueOf(email_obj.getText());
                        //send it to load fragment method
                        loadFragment(new Fragment2Activity(), name, email);
                    }
                }
            }
        });
    }

    private void loadFragment(Fragment fragment, String a, String b) {
        if (a == null && b == null) {
            // create a FragmentManager
            FragmentManager fm = getFragmentManager();
            // create a FragmentTransaction to begin the transaction and replace the Fragment
            FragmentTransaction fragmentTransaction = fm.beginTransaction();
            // replace the FrameLayout with new Fragment
            fragmentTransaction.replace(R.id.fragment_place, fragment);
            fragmentTransaction.commit(); // save the changes
        } else {
            Bundle bundle = new Bundle();
            bundle.putString("name", a);
            bundle.putString("email", b);
            fragment.setArguments(bundle);

            // create a FragmentManager
            FragmentManager fm = getFragmentManager();
            // create a FragmentTransaction to begin the transaction and replace the Fragment
            FragmentTransaction fragmentTransaction = fm.beginTransaction();
            // replace the FrameLayout with new Fragment
            fragmentTransaction.replace(R.id.fragment_place, fragment);
            fragmentTransaction.commit(); // save the changes
        }
    }

    private boolean isValidEmail(String target) {
        Log.i("INFO: ", String.valueOf(android.util.Patterns.EMAIL_ADDRESS.matcher(target).matches()));
        return android.util.Patterns.EMAIL_ADDRESS.matcher(target).matches();
    }
}
