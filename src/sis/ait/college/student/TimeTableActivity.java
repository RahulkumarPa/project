package sis.ait.college.student;

import sis.ait.college.R;
import android.app.Activity;
import android.os.Bundle;

public class TimeTableActivity extends Activity{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.timetable_screen);
		getActionBar().setTitle("  TimeTable");
	}

}

