package sis.ait.college.parent;

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

public class ParentGridViewActivity extends Activity implements OnItemClickListener{
	String gv_parent_menunames[] = new String[] {"Profile","Result","Attendance","Events","News","Complain","Feedback","Signout"};
	GridView gv_ParentMenu;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.gv_parent_screen);
		getActionBar().setTitle("  Menu");
		
		gv_ParentMenu = (GridView) findViewById(R.id.gvParentMenu);
		gv_ParentMenu.setAdapter(new ParentImageAdapter(this, gv_parent_menunames));
		gv_ParentMenu.setOnItemClickListener(this);
	}
	class ParentImageAdapter extends BaseAdapter
	{
		Context context;
		String gv_parent_menu_names[];
		ParentImageAdapter(Context context,String gv_parent_menu_names[])
		{
			this.context = context;
			this.gv_parent_menu_names = gv_parent_menu_names;
		}
		@Override
		public int getCount() {
			// TODO Auto-generated method stub
			return gv_parent_menu_names.length;
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
				grid = inflater.inflate(R.layout.gv_raw_parent, null);
			}
			else
			{
				grid = (View)convertView;
			}
			TextView tv_rawParent = (TextView) grid.findViewById(R.id.tv_rawParent);
			ImageView iv_rawParent = (ImageView) grid.findViewById(R.id.iv_rawParent);
			tv_rawParent.setText(gv_parent_menu_names[position]);
			String menu_name = gv_parent_menu_names[position];
			if(menu_name.equalsIgnoreCase("Profile"))
			{
				iv_rawParent.setImageResource(R.drawable.profile);
			}
			if(menu_name.equalsIgnoreCase("Result"))
			{
				iv_rawParent.setImageResource(R.drawable.result);
			}
			if(menu_name.equalsIgnoreCase("Attendance"))
			{
				iv_rawParent.setImageResource(R.drawable.attendance);
			}
			if(menu_name.equalsIgnoreCase("Events"))
			{
				iv_rawParent.setImageResource(R.drawable.events);
			}
			if(menu_name.equalsIgnoreCase("News"))
			{
				iv_rawParent.setImageResource(R.drawable.news);
			}
			if(menu_name.equalsIgnoreCase("Complain"))
			{
				iv_rawParent.setImageResource(R.drawable.complain);
			}
			if(menu_name.equalsIgnoreCase("Feedback"))
			{
				iv_rawParent.setImageResource(R.drawable.feedback);
			}
			if(menu_name.equalsIgnoreCase("Signout"))
			{
				iv_rawParent.setImageResource(R.drawable.signout);
			}
				return grid;
		}

	}
	@Override
	public void onItemClick(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
		// TODO Auto-generated method stub
		String get_name = ((TextView)arg1.findViewById(R.id.tv_rawParent)).getText().toString();
		Toast.makeText(ParentGridViewActivity.this, get_name, Toast.LENGTH_SHORT).show(); 
		if(get_name.equalsIgnoreCase("Profile"))
		{
			Intent i = new Intent(ParentGridViewActivity.this, ParentProfileActivity.class);
			startActivity(i);
		}
		if(get_name.equalsIgnoreCase("Result"))
		{
			Intent i = new Intent(ParentGridViewActivity.this, ResultActivity.class);
			startActivity(i);
		}
		if(get_name.equalsIgnoreCase("Attendance"))
		{
			Intent i = new Intent(ParentGridViewActivity.this, AttendanceActivity.class);
			startActivity(i);
		}
		if(get_name.equalsIgnoreCase("Events"))
		{
			Intent i = new Intent(ParentGridViewActivity.this, EventsActivity.class);
			startActivity(i);
		}
		if(get_name.equalsIgnoreCase("News"))
		{
			Intent i = new Intent(ParentGridViewActivity.this, NewsActivity.class);
			startActivity(i);
		}
		if(get_name.equalsIgnoreCase("Complain"))
		{
			Intent i = new Intent(ParentGridViewActivity.this, ComplainActivity.class);
			startActivity(i);
		}
		if(get_name.equalsIgnoreCase("Feedback"))
		{
			Intent i = new Intent(ParentGridViewActivity.this, FeedbackActivity.class);
			startActivity(i);
		}
		if(get_name.equalsIgnoreCase("Signout"))
		{
			Intent i = new Intent(ParentGridViewActivity.this, SignoutActivity.class);
			startActivity(i);
		}
	}
	
}
