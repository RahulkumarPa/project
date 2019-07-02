package sis.ait.college;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class StudentSignUpActivity extends Activity{
	Spinner spSelectSem,spSelectBranch;
	ArrayAdapter<CharSequence> adSelectSem,adSelectBranch;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.sign_up_student);
		getActionBar().setTitle("  Student");
		
		spSelectSem = (Spinner) findViewById(R.id.spSelectSem);
		adSelectSem = ArrayAdapter.createFromResource(this, R.array.sp_select_semester, android.R.layout.simple_spinner_item);
		adSelectSem.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		spSelectSem.setAdapter(adSelectSem);
		
		spSelectBranch = (Spinner) findViewById(R.id.spSelectBranch);
		adSelectBranch = ArrayAdapter.createFromResource(this, R.array.sp_select_branch, android.R.layout.simple_spinner_item);
		adSelectBranch.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		spSelectBranch.setAdapter(adSelectBranch);
		
		spSelectSem.setOnItemSelectedListener(new OnItemSelectedListener() {

			@Override
			public void onItemSelected(AdapterView<?> arg0, View arg1,
					int arg2, long arg3) {
				// TODO Auto-generated method stub
				if(arg2==0)
				{
					Toast.makeText(getApplicationContext(), "Semester:-1", Toast.LENGTH_LONG).show();
				}
				else if(arg2==1)
				{
					Toast.makeText(getApplicationContext(), "Semester:-2", Toast.LENGTH_LONG).show();
				}
				else if(arg2==2)
				{
					Toast.makeText(getApplicationContext(), "Semester:-3", Toast.LENGTH_LONG).show();
				}
				else if(arg2==3)
				{
					Toast.makeText(getApplicationContext(), "Semester:-4", Toast.LENGTH_LONG).show();
				}
				else if(arg2==4)
				{
					Toast.makeText(getApplicationContext(), "Semester:-5", Toast.LENGTH_LONG).show();
				}
				else if(arg2==5)
				{
					Toast.makeText(getApplicationContext(), "Semester:-6", Toast.LENGTH_LONG).show();
				}
				else if(arg2==6)
				{
					Toast.makeText(getApplicationContext(), "Semester:-7", Toast.LENGTH_LONG).show();
				}
				else
				{
					Toast.makeText(getApplicationContext(), "Semester:-8", Toast.LENGTH_LONG).show();
				}
			}

			@Override
			public void onNothingSelected(AdapterView<?> arg0) {
				// TODO Auto-generated method stub
				
			}
		});
		
		spSelectBranch.setOnItemSelectedListener(new OnItemSelectedListener() {

			@Override
			public void onItemSelected(AdapterView<?> arg0, View arg1,
					int arg2, long arg3) {
				// TODO Auto-generated method stub
				if(arg2==0)
				{
					Toast.makeText(getApplicationContext(), "Civil Engineering", Toast.LENGTH_LONG).show();
				}
				else if(arg2==1)
				{
					Toast.makeText(getApplicationContext(), "Computer Engineering", Toast.LENGTH_LONG).show();
				}
				else if(arg2==2)
				{
					Toast.makeText(getApplicationContext(), "Electrical Engineering", Toast.LENGTH_LONG).show();
				}
				else if(arg2==3)
				{
					Toast.makeText(getApplicationContext(), "Information Technology", Toast.LENGTH_LONG).show();
				}
				else 
				{
					Toast.makeText(getApplicationContext(), "Mechanical Engineering", Toast.LENGTH_LONG).show();
				}
			}

			@Override
			public void onNothingSelected(AdapterView<?> arg0) {
				// TODO Auto-generated method stub
				
			}
		});
	}

}
