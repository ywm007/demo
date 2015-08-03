package com.example.l010userlistview;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

public class CustomListView extends Activity {
	
	private ListView listView = null;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.custom_listview);
	
		listView = (ListView) findViewById(R.id.listView);
		listView.setAdapter(new CustomListViewAdapter(CustomListView.this));
	}
}
