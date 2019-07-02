package sis.ait.college.gridview_activities;

import sis.ait.college.FormActivity;
import sis.ait.college.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;

public class SignoutActivity extends Activity{
	AlertDialog.Builder alert;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.sign_out_screen);
		getActionBar().setTitle("SignOut");
		alert = new AlertDialog.Builder(SignoutActivity.this);
		alert.setTitle("Confirm SignOut...");
		alert.setMessage("Are you sure you want to Sign Out?");
		alert.setIcon(R.drawable.alert_signout);
		
		alert.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
			
			@Override
			public void onClick(DialogInterface dialog, int which) {
				// TODO Auto-generated method stub
				Intent i = new Intent(SignoutActivity.this, FormActivity.class);
				i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP); 
			/*	i.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK); */
				startActivity(i);
			}
		});
		alert.setNegativeButton("No", new DialogInterface.OnClickListener() {
			
			@Override
			public void onClick(DialogInterface dialog, int which) {
				// TODO Auto-generated method stub
				
			}
		});
		alert.show();
	}

}
