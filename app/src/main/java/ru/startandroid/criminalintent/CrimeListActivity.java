package ru.startandroid.criminalintent;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;

/**
 * Created by Anna on 05.01.2017.
 */

public class CrimeListActivity extends SingleFragmentActivity {
    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Button btn_add=(Button) findViewById(R.id.button_add_crime);
        btn_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Crime c = new Crime();
                Intent i =new Intent(CrimeListActivity.this, CrimePagerActivity.class); //Вызов CrimeFragment
                i.putExtra("EXTRA_CRIME_ID", c.getId());
                i.putExtra("EXTRA_CRIME_NEW", true);
                startActivity(i);
            }
        });
    }

}
