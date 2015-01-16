package com.landa.waitStaff;


import java.util.ArrayList;

import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.landa.R;

public class TableStatusFrag extends ListFragment{
	private ArrayList<Table> statusTables;
	private static final String TAG = "TableListStatusFrag";
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		getActivity().setTitle(R.string.table); //Activity hosts this fragment, which contains a List View of Tables
		statusTables = TableListForStatus.get(getActivity()).getTables1(); //get our list of 21 tables we created.
		
		ArrayAdapter<Table> adapter =
				new ArrayAdapter<Table>(getActivity(),android.R.layout.simple_list_item_1, statusTables);
		setListAdapter(adapter);
	}

	//alternative method makes this useless
	@Override
	public void onListItemClick(ListView l, View v, int position, long id) {
		Table t = (Table)(getListAdapter()).getItem(position);
		Log.d(TAG, t.getmId() + " was clicked");
		//GlobalVars.toDisplayInView = t.getmTable_Number(); //we have the name of the table we want to show in the info view.
		
	}
	//----
	
	
	
	
	//-----
	private class TableAdapter extends ArrayAdapter<Table> {
		public TableAdapter(ArrayList<Table> tables) {
			super(getActivity(), 0, tables);
		}
	}
	
}