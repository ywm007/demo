package com.example.l010userlistview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class CustomListViewAdapter extends BaseAdapter {
	private Context context;
	
	public CustomListViewAdapter(Context context) {
		this.context = context;
	}
	
	private CustomListCellData[] cdata = new CustomListCellData[] {
			new CustomListCellData("hello01", "dsc1", R.drawable.img1),
			new CustomListCellData("hello02", "dsc2", R.drawable.img2),
			new CustomListCellData("hello03", "dsc3", R.drawable.img3),
			new CustomListCellData("hello04", "dsc4", R.drawable.img4),
			new CustomListCellData("hello05", "dsc5", R.drawable.img5),
			new CustomListCellData("hello01", "dsc1", R.drawable.img1),
			new CustomListCellData("hello02", "dsc2", R.drawable.img2),
			new CustomListCellData("hello03", "dsc3", R.drawable.img3),
			new CustomListCellData("hello04", "dsc4", R.drawable.img4),
			new CustomListCellData("hello05", "dsc5", R.drawable.img5),
			new CustomListCellData("hello01", "dsc1", R.drawable.img1),
			new CustomListCellData("hello02", "dsc2", R.drawable.img2),
			new CustomListCellData("hello03", "dsc3", R.drawable.img3),
			new CustomListCellData("hello04", "dsc4", R.drawable.img4),
			new CustomListCellData("hello05", "dsc5", R.drawable.img5),
			new CustomListCellData("hello01", "dsc1", R.drawable.img1),
			new CustomListCellData("hello02", "dsc2", R.drawable.img2),
			new CustomListCellData("hello03", "dsc3", R.drawable.img3),
			new CustomListCellData("hello04", "dsc4", R.drawable.img4),
			new CustomListCellData("hello05", "dsc5", R.drawable.img5) };

	@Override
	public View getView(int arg0, View arg1, ViewGroup arg2) {
		LinearLayout linearLayout = (LinearLayout) arg1;
		if (linearLayout == null) {
			linearLayout = (LinearLayout) LayoutInflater.from(this.context)
					.inflate(R.layout.custom_listcell, null);
		}
		CustomListCellData data = getItem(arg0);
		System.out.println("ywm >> position = " + arg0);
		ImageView imageView = (ImageView) linearLayout
				.findViewById(R.id.imageView);
		TextView textNameView = (TextView) linearLayout
				.findViewById(R.id.textName);
		TextView textDscView = (TextView) linearLayout
				.findViewById(R.id.textDsc);

		imageView.setImageResource(data.getIconid());
		textNameView.setText(data.getUserName());
		textDscView.setText(data.getDsc());
		return linearLayout;
	}

	public Context getContext() {
		return context;
	}

	public void setContext(Context context) {
		this.context = context;
	}

	@Override
	public long getItemId(int arg0) {
		return arg0;
	}

	@Override
	public CustomListCellData getItem(int arg0) {
		return cdata[arg0];
	}

	@Override
	public int getCount() {
		return cdata.length;
	}

}
