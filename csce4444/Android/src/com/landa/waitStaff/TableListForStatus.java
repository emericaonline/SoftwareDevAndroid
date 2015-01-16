package com.landa.waitStaff;

import java.util.ArrayList;
import java.util.UUID;


import android.content.Context;

public class TableListForStatus {
	private ArrayList<Table> statusTables;
	private static TableListForStatus statusTable_List;
	private Context myAppContext;

	private TableListForStatus(Context appContext) {
		myAppContext = appContext;
		statusTables = new ArrayList<Table>(); //create list
		for (int i = 1; i < 22; i++) {// when wait staff starts, create list of
										// tables 1-21
			Table t = new Table();
			t.setmTable_Number("Table " + i);
			statusTables.add(t); //store list of tables 1-21
		}
		Table x = new Table();
		x.setmTable_Number("View Table Status");
		statusTables.add(x);
	}

	public static  TableListForStatus get(Context c) {
		if (statusTable_List == null) {
			statusTable_List = new TableListForStatus(c.getApplicationContext());
		}
		return statusTable_List;
	}

	public ArrayList<Table> getTables1() {
		return statusTables; //list getter
	}

	public Table getTable1(UUID id) {
		for (Table t : statusTables) {
			if (t.getmId().equals(id))
				;
			return t;
		}
		return null;
	}
}



