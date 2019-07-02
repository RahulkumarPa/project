package sis.ait.college.gridview_activities;

import sis.ait.college.R;
import android.app.Activity;
import android.os.Bundle;

public class FeedbackActivity extends Activity{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.feedback_screen);
		getActionBar().setTitle("  Feedback");
	}

}

