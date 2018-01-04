package fanes.irfan.myapplication6;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;


    public class Fragment2Activity extends Fragment implements View.OnClickListener {

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
            View view = inflater.inflate(R.layout.activity_fragment2, container, false);
            TextView name_obj = view.findViewById(R.id.tv_name_val);
            TextView email_obj = view.findViewById(R.id.tv_email_val);
            Bundle bundle = getArguments();
            Button btn_obj = view.findViewById(R.id.button_to_one);
            btn_obj.setOnClickListener(this);

            if (bundle != null) {
                if (bundle.containsKey("name")) {
                    name_obj.setText("Name : " + bundle.getString("name"));
                }

                if (bundle.containsKey("email")) {
                    email_obj.setText("Email : " + bundle.getString("email"));
                }
            }
            return view;
        }

        @Override
        public void onClick(View view) {
            switch (view.getId()) {

                case R.id.button_to_one:
                    Fragment fragment1Activity = new Fragment1Activity();
                    FragmentManager fm = getFragmentManager();
                    // create a FragmentTransaction to begin the transaction and replace the Fragment
                    FragmentTransaction fragmentTransaction = fm.beginTransaction();
                    // replace the FrameLayout with new Fragment
                    fragmentTransaction.replace(R.id.fragment_place, fragment1Activity);
                    fragmentTransaction.commit(); // save the changes
                    break;

                default:
                    break;
            }
        }
    }
