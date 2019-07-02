package sis.ait.college;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class SignUpActivity extends Activity{
	Button btnStudent,btnParent;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.sign_up_screen);
		getActionBar().setTitle("  Select User");
		
		btnStudent = (Button) findViewById(R.id.btnStudent);
		btnParent = (Button) findViewById(R.id.btnParent);
		
		btnStudent.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Toast.makeText(getApplicationContext(), "Student", Toast.LENGTH_LONG).show();
				Intent i = new Intent(SignUpActivity.this,StudentSignUpActivity.class);
				startActivity(i);
			}
		});
		
		btnParent.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Toast.makeText(getApplicationContext(), "Parent", Toast.LENGTH_LONG).show();
				Intent i = new Intent(SignUpActivity.this,ParentSignUpActivity.class);
				startActivity(i);
			}
		});
	}

}
