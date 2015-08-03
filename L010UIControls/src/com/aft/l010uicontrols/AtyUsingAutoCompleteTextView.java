package com.aft.l010uicontrols;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.MultiAutoCompleteTextView;

public class AtyUsingAutoCompleteTextView extends Activity {

	private AutoCompleteTextView actv;
	private MultiAutoCompleteTextView mactv;
	
	private ArrayAdapter<String> acAdapter,macAdapter;
	
	private String data[] = new String[]{
			"hello","hello1","hello2"
	};
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.aty_autocomplete_textview);
		
		actv = (AutoCompleteTextView) findViewById(R.id.actv);
		mactv = (MultiAutoCompleteTextView) findViewById(R.id.mactv);
		
		acAdapter = new ArrayAdapter<String>(AtyUsingAutoCompleteTextView.this,android.R.layout.simple_expandable_list_item_1,data);
		actv.setAdapter(acAdapter);
		
		macAdapter = new ArrayAdapter<String>(AtyUsingAutoCompleteTextView.this,android.R.layout.simple_expandable_list_item_1,data);
		mactv.setTokenizer(new MultiAutoCompleteTextView.CommaTokenizer());
		mactv.setAdapter(macAdapter);
	}
}
