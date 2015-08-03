package com.aft.l010uicontrols;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends ListActivity {

	private ArrayAdapter<ListCellData> adapter;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		adapter = new ArrayAdapter<ListCellData>(this,
				android.R.layout.simple_list_item_1);
		setListAdapter(adapter);

		adapter.add(new ListCellData(this, "RadioGroup", new Intent(MainActivity.this,AtyUsingRadioGroup.class)));
		adapter.add(new ListCellData(this, "CheckBox", new Intent(MainActivity.this,AtyUsingCheckBox.class)));
		adapter.add(new ListCellData(this, "DatePicker", new Intent(MainActivity.this,AtyUsingDatePicker.class)));
		adapter.add(new ListCellData(this, "TimePicker", new Intent(MainActivity.this,AtyUsingTimePicker.class)));
		adapter.add(new ListCellData(this, "Spinner", new Intent(MainActivity.this,AtyUsingSpinner.class)));
		adapter.add(new ListCellData(this, "ProgressBar", new Intent(MainActivity.this,AtyUsingProgressBar.class)));
		adapter.add(new ListCellData(this, "SeekBar", new Intent(MainActivity.this,AtyUsingSeekBar.class)));
		adapter.add(new ListCellData(this, "AutoCompleteTextView",new Intent(this, AtyUsingAutoCompleteTextView.class)));
		adapter.add(new ListCellData(this, "GridView",new Intent(this, AtyUsingGridView.class)));
		adapter.add(new ListCellData(this, "ProgressDialog",new Intent(this, AtyUsingProgressDialog.class)));
		adapter.add(new ListCellData(this, "Notification",new Intent(this, AtyUsingNotification.class)));
		adapter.add(new ListCellData(this, "ScrollView",new Intent(this, AtyUsingScrollView.class)));
		adapter.add(new ListCellData(this, "RatingBar",new Intent(this, AtyUsingRatingBar.class)));
		adapter.add(new ListCellData(this, "ImageSwitcher",new Intent(this, AtyUsingImageSwitcher.class)));
		adapter.add(new ListCellData(this, "Gallery",new Intent(this, AtyUsingGallery.class)));
		adapter.add(new ListCellData(this, "EditText",new Intent(this, AtyUsingEditText.class)));
	}

	@Override
	protected void onListItemClick(ListView l, View v, int position, long id) {
		ListCellData data = adapter.getItem(position);
		data.startActivity();
		super.onListItemClick(l, v, position, id);

	}
}
