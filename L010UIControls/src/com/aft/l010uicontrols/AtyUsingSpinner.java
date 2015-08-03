package com.aft.l010uicontrols;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class AtyUsingSpinner extends Activity {

	private Spinner spinner;
	private ArrayAdapter<String> adapter;
	private String[] data = new String[]{"abc","efg","bpm"};
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.aty_using_spinner);
		spinner = (Spinner) findViewById(R.id.spinner1);
		adapter = new ArrayAdapter<String>(AtyUsingSpinner.this,android.R.layout.simple_list_item_1,data);
		spinner.setAdapter(adapter);
	}
}
