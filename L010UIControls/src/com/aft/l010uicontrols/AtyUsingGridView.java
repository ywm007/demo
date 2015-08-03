package com.aft.l010uicontrols;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.GridView;

public class AtyUsingGridView extends Activity {

	private GridView gridView;
	private ArrayAdapter<String> adapter;
	private String[] datas = new String[]{
			"hello","hello1","hello2",
			"hello","hello1","hello2",
			"hello","hello1","hello2",
			"hello","hello1","hello2",
			"hello","hello1","hello2",
			"hello","hello1","hello2",
			"hello","hello1","hello2",
			"hello","hello1","hello2",
			"hello","hello1","hello2",
			"hello","hello1","hello2",
			"hello","hello1","hello2",
			"hello","hello1","hello2",
			"hello","hello1","hello2",
			"hello","hello1","hello2",
			"hello","hello1","hello2",
			"hello","hello1","hello2",
			"hello","hello1","hello2",
			"hello","hello1","hello2"
	};
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.aty_using_gridview);
		gridView = (GridView) findViewById(R.id.gridView);
		adapter = new ArrayAdapter<String>(AtyUsingGridView.this, android.R.layout.simple_list_item_1,datas);
		gridView.setAdapter(adapter);
	}
}
