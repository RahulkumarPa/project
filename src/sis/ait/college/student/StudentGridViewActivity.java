package sis.ait.college.student;

import sis.ait.college.R;
import sis.ait.college.gridview_activities.AttendanceActivity;
import sis.ait.college.gridview_activities.ComplainActivity;
import sis.ait.college.gridview_activities.EventsActivity;
import sis.ait.college.gridview_activities.FeedbackActivity;
import sis.ait.college.gridview_activities.NewsActivity;
import sis.ait.college.gridview_activities.ResultActivity;
import sis.ait.college.gridview_activities.SignoutActivity;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class StudentGridViewActivity extends Activity implements OnItemClickListener{
	String gv_student_menunames[] = new String[] {"Profile","Syllabus","Assignment","Timetable","Result","Attendance","Events","News","Complain","Feedback","Signout"};
	GridView gv_StudentMenu;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.gv_student_screen);
		getActionBar().setTitle("  Menu");
		
		gv_StudentMenu = (GridView) findViewById(R.id.gvStudentMenu);
		gv_StudentMenu.setAdapter(new StudentImageAdapter(this,gv_student_menunames));
		gv_StudentMenu.setOnItemClickListener(this);
	}

	class StudentImageAdapter extends BaseAdapter
	{
		Context context;
		String gv_student_menu_names[];
		public StudentImageAdapter(Context context,String gv_student_menu_names[]) {
			// TODO Auto-generated constructor stub
			this.context = context;
			this.gv_student_menu_names = gv_student_menu_names;
		}
		@Override
		public int getCount() {
			// TODO Auto-generated method stub
			return gv_student_menu_names.length;
		}

		@Override
		public Object getItem(int position) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public long getItemId(int position) {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public View getView(int position, View convertView, ViewGroup parent) {
			// TODO Auto-generated method stub
			LayoutInflater inflater = (LayoutInflater) context.getSystemService(LAYOUT_INFLATER_SERVICE);
			View grid;
			if(convertView==null)
			{
				grid = new View(context);
				grid = inflater.inflate(R.layout.gv_raw_student, null);
			}
			else
			{
				grid = (View)convertView;
			}
			TextView tv_rawStudent = (TextView) grid.findViewById(R.id.tv_rawStudent);
			ImageView iv_rawStudent = (ImageView) grid.findViewById(R.id.iv_rawStudent);
			tv_rawStudent.setText(gv_student_menu_names[position]);
			String menu_name = gv_student_menu_names[position];
			if(menu_name.equalsIgnoreCase("Profile"))
			{
				iv_rawStudent.setImageResource(R.drawable.profile);
			}
			if(menu_name.equalsIgnoreCase("Syllabus"))
			{
				iv_rawStudent.setImageResource(R.drawable.syllabus);
			}
			if(menu_name.equalsIgnoreCase("Assignment"))
			{
				iv_rawStudent.setImageResource(R.drawable.assignment);
			}
			if(menu_name.equalsIgnoreCase("Timetable"))
			{
				iv_rawStudent.setImageResource(R.drawable.timetable);
			}
			if(menu_name.equalsIgnoreCase("Result"))
			{
				iv_rawStudent.setImageResource(R.drawable.result);
			}
			if(menu_name.equalsIgnoreCase("Attendance"))
			{
				iv_rawStudent.setImageResource(R.drawable.attendance);
			}
			if(menu_name.equalsIgnoreCase("Events"))
			{
				iv_rawStudent.setImageResource(R.drawable.events);
			}
			if(menu_name.equalsIgnoreCase("News"))
			{
				iv_rawStudent.setImageResource(R.drawable.news);
			}
			if(menu_name.equalsIgnoreCase("Complain"))
			{
				iv_rawStudent.setImageResource(R.drawable.complain);
			}
			if(menu_name.equalsIgnoreCase("Feedback"))
			{
				iv_rawStudent.setImageResource(R.drawable.feedback);
			}
			if(menu_name.equalsIgnoreCase("Signout"))
			{
				iv_rawStudent.setImageResource(R.drawable.signout);
			}
			return grid;
			}
			
			
		}
		
	@Override
	public void onItemClick(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
		// TODO Auto-generated method stub
		String get_name = ((TextView)arg1.findViewById(R.id.tv_rawStudent)).getText().toString();
		Toast.makeText(StudentGridViewActivity.this, get_name, Toast.LENGTH_SHORT).show(); 
		if(get_name.equalsIgnoreCase("Profile"))
		{
			Intent i = new Intent(StudentGridViewActivity.this, StudentProfileActivity.class);
			startActivity(i);
		}
		if(get_name.equalsIgnoreCase("Syllabus"))
		{
			Intent i = new Intent(StudentGridViewActivity.this, SyllabusActivity.class);
			startActivity(i);
		}
		if(get_name.equalsIgnoreCase("Assignment"))
		{
			Intent i = new Intent(StudentGridViewActivity.this, AssignmentActivity.class);
			startActivity(i);
		}
		if(get_name.equalsIgnoreCase("Timetable"))
		{
			Intent i = new Intent(StudentGridViewActivity.this, TimeTableActivity.class);
			startActivity(i);
		}
		if(get_name.equalsIgnoreCase("Result"))
		{
			Intent i = new Intent(StudentGridViewActivity.this, ResultActivity.class);
			startActivity(i);
		}
		if(get_name.equalsIgnoreCase("Attendance"))
		{
			Intent i = new Intent(StudentGridViewActivity.this, AttendanceActivity.class);
			startActivity(i);
		}
		if(get_name.equalsIgnoreCase("Events"))
		{
			Intent i = new Intent(StudentGridViewActivity.this, EventsActivity.class);
			startActivity(i);
		}
		if(get_name.equalsIgnoreCase("News"))
		{
			Intent i = new Intent(StudentGridViewActivity.this, NewsActivity.class);
			startActivity(i);
		}
		if(get_name.equalsIgnoreCase("Complain"))
		{
			Intent i = new Intent(StudentGridViewActivity.this, ComplainActivity.class);
			startActivity(i);
		}
		if(get_name.equalsIgnoreCase("Feedback"))
		{
			Intent i = new Intent(StudentGridViewActivity.this, FeedbackActivity.class);
			startActivity(i);
		}
		if(get_name.equalsIgnoreCase("Signout"))
		{
			Intent i = new Intent(StudentGridViewActivity.this, SignoutActivity.class);
			startActivity(i);
		}
	}
	
	
}
