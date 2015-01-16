package com.landa.waitStaff;

import java.util.ArrayList;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.landa.R;
import com.landa.cs4444.UserSelectionTableSelect;
import com.landa.customer.Customer_Activity_Single_Pane;
import com.landa.helpers.AsyncHelper;
import com.landa.waitStaff.Table;
import com.landa.waitStaff.Table_List;
import com.landa.waitStaff.WaitInfo;

public class waitTableList extends ListActivity 
{
	// TODO Create customer spinner, to make it all pretty, functional now
	// though.
	
	
	private ArrayList<Table> mTables;
	private static final String TAG = "Chatlist";

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		
	
		mTables = Table_List.get(this).getTables();
		ArrayAdapter<Table> adapter = new ArrayAdapter<Table>(this,
				android.R.layout.simple_list_item_1, mTables);
		setListAdapter(adapter);
		
	}
	
	@Override
	// Create the menu for HELP and REFILL button
	public boolean onCreateOptionsMenu(Menu menu) {
		MenuInflater inflater = getMenuInflater();
		inflater.inflate(R.menu.server_menu, menu);
		return true;
	}

	public boolean onOptionsItemSelected(MenuItem item) {
		Intent myIntent = new Intent(waitTableList.this,
				TableStatus.class);
		waitTableList.this.startActivity(myIntent);
		
		return true;
		}
	
    @Override 
    public void onListItemClick(ListView l, View v, int position, long id) {
        // Do something when a list item is clicked
		
    	
        	Intent myIntent = new Intent(waitTableList.this,
    				WaitInfo.class);
        	Long tableNo = id+1;
        	
        	
        	
    		myIntent.putExtra("tableNo", tableNo.toString() );
    		Log.i(TAG, tableNo.toString());
    		waitTableList.this.startActivity(myIntent);	
    	
     	
    }


}
