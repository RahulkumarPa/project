package sis.ait.college.student;

import sis.ait.college.R;
import android.app.Activity;
import android.os.Bundle;

public class StudentProfileActivity extends Activity{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.student_profile_screen);
		getActionBar().setTitle("  Profile");
	}

}
