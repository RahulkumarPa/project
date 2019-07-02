package sis.ait.college.parent;

import sis.ait.college.R;
import android.app.Activity;
import android.os.Bundle;

public class ParentProfileActivity extends Activity{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.parent_profile_screen);
		getActionBar().setTitle("  Profile");
	}

}
