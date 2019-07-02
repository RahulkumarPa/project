package sis.ait.college.gridview_activities;

import sis.ait.college.R;
import android.app.Activity;
import android.os.Bundle;

public class EventsActivity extends Activity{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.events_screen);
		getActionBar().setTitle("  Events");
	}

}

