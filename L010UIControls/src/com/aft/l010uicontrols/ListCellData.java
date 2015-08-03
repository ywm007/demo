package com.aft.l010uicontrols;

import android.content.Context;
import android.content.Intent;

public class ListCellData {
	private Context context;
	private String controlName = "";
	private Intent relatedIntent = null;

	public ListCellData(Context context,String name,Intent relatedIntent){
		this.context = context;
		this.controlName = name;
		this.relatedIntent = relatedIntent;
	}

	public Context getContext() {
		return context;
	}

	public String getControlName() {
		return controlName;
	}

	public Intent getRelatedIntent() {
		return relatedIntent;
	}

	public void startActivity(){
		getContext().startActivity(getRelatedIntent());
	}
	
	@Override
	public String toString() {
		return getControlName();
	}
}
