package com.example.l010userlistview;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends Activity implements OnItemClickListener {

	private ListView listView = null;
	ArrayAdapter<ListCellData> adapter;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		adapter = new ArrayAdapter<ListCellData>(this,android.R.layout.simple_list_item_1);
//		adapter = new ArrayAdapter<String>(this,R.layout.list_cell);
		adapter.add(new ListCellData("ywm", "man", 23));
		adapter.add(new ListCellData("ywm1", "man", 32));
		
		listView = (ListView) findViewById(R.id.listView);
		listView.setAdapter(adapter);
		
		listView.setOnItemClickListener(this);
	}

	@Override
	public void onItemClick(AdapterView<?> arg0, View arg1, int position, long arg3) {
		ListCellData data = adapter.getItem(position);
		Toast.makeText(this, String.format("name:%s",data.getUserName()),Toast.LENGTH_SHORT).show();
	}


}