package appewtc.masterung.testaddfragment;

import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import appewtc.masterung.testaddfragment.fragment.MainFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Add Fragment for First Create Activity
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.fraContent, MainFragment.newInstance("Doramon"), "MainFragment")
                    .commit();

        }


    }   // Main Method

    @Override
    protected void onPostCreate(@Nullable Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);

        if (savedInstanceState == null) {
            MainFragment mainFragment = (MainFragment)
                    getSupportFragmentManager().findFragmentByTag("MainFragment");
            mainFragment.changeName("Nopita");
        }

    }
}   // Main Class
