package com.aft.listgridviewdemo;


import android.app.ListActivity;
import android.os.Bundle;

public class MainActivity extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.custom_listview_activity);
		setListAdapter(new CustomListViewAdapter(this));
    }
    
}
