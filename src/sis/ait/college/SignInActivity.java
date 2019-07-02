package sis.ait.college;

import sis.ait.college.parent.ParentGridViewActivity;
import sis.ait.college.student.StudentGridViewActivity;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.AdapterView.OnItemSelectedListener;

public class SignInActivity extends Activity{
	Spinner spSelectUser;
	TextView tvForgotPass;
	Button btnSignIn;
	ArrayAdapter<CharSequence> adSelectUser;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.sign_in_screen);
		getActionBar().setTitle("  SignIn");
		
		spSelectUser = (Spinner) findViewById(R.id.spSelectUser);
		adSelectUser = ArrayAdapter.createFromResource(this, R.array.sp_select_user, android.R.layout.simple_spinner_item);
		adSelectUser.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		spSelectUser.setAdapter(adSelectUser);
		
		tvForgotPass = (TextView) findViewById(R.id.tvForgotPass);
		btnSignIn = (Button) findViewById(R.id.btnSignIn);
		spSelectUser.setOnItemSelectedListener(new OnItemSelectedListener() {

			@Override
			public void onItemSelected(AdapterView<?> arg0, View arg1,
					int arg2, long arg3) {
				// TODO Auto-generated method stub
	/*			String item = arg0.getItemAtPosition(arg2).toString();
				Toast.makeText(arg0.getContext(), item, Toast.LENGTH_LONG).show(); */
				if(arg2==0)
				{
					Toast.makeText(getApplicationContext(), "Student", Toast.LENGTH_SHORT).show();
					btnSignIn.setOnClickListener(new OnClickListener() {
						
						@Override
						public void onClick(View arg0) {
							// TODO Auto-generated method stub
							Intent i = new Intent(SignInActivity.this,StudentGridViewActivity.class);
							startActivity(i);
						}
					});
				}
				else
				{
					Toast.makeText(getApplicationContext(), "Parent", Toast.LENGTH_SHORT).show();
					btnSignIn.setOnClickListener(new OnClickListener() {
						
						@Override
						public void onClick(View arg0) {
							// TODO Auto-generated method stub
							Intent i = new Intent(SignInActivity.this,ParentGridViewActivity.class);
							startActivity(i);
						}
					});
				} 
			}

			@Override
			public void onNothingSelected(AdapterView<?> arg0) {
				// TODO Auto-generated method stub
				
			}
		});
	
		tvForgotPass.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent i = new Intent(SignInActivity.this,ForgotPassActivity.class);
				startActivity(i);
			}
		});
	}

}
