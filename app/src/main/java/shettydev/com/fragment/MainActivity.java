package shettydev.com.fragment;

import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import shettydev.com.fragment.fragment.LM_Fragement;
import shettydev.com.fragment.fragment.PM_Fragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        if(findViewById(R.id.flContainer) != null) {

            Configuration configuration = getResources().getConfiguration();



            if (configuration.orientation == Configuration.ORIENTATION_LANDSCAPE) {
                LM_Fragement ls_fragment = new LM_Fragement();
                getSupportFragmentManager().beginTransaction().replace(R.id.flContainer, ls_fragment).commit();
            } else {
                PM_Fragment pm_fragment = new PM_Fragment();
                getSupportFragmentManager().beginTransaction().replace(R.id.flContainer, pm_fragment).commit();
            }
        }

    }
}
