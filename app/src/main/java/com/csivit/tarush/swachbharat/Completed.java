package com.csivit.tarush.swachbharat;

import android.app.ListActivity;
import android.support.v4.app.ListFragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;

public class Completed extends ListActivity {

    String[] itemname ={
            "Location 1",
            "Location 2",
            "Location 3",
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_completed);

        this.setListAdapter(new ArrayAdapter<String>(
                this, R.layout.list_completed,
                R.id.Itemname,itemname));
    }

}

