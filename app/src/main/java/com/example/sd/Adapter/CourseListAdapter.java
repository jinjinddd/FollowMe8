package com.example.sd.Adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.sd.Course;
import com.example.sd.R;

import org.w3c.dom.Text;

import java.util.List;

public class CourseListAdapter extends BaseAdapter {

    private Context context;
    private List<Course> courseList;

    public CourseListAdapter(Context context, List<Course> courseList){
        this.context=context;
        this.courseList=courseList;
    }
    @Override
    public int getCount() {
        return courseList.size();
    }

    @Override
    public Object getItem(int i) {
        return courseList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View v = View.inflate(context, R.layout.course, null);
        TextView courseGrade = (TextView) v.findViewById(R.id.courseGrade);
        TextView courseTerm = (TextView) v.findViewById(R.id.courseTerm);
        TextView courseTitle = (TextView) v.findViewById(R.id.courseTitle);
        TextView courseArea = (TextView) v.findViewById(R.id.courseArea);
        TextView courseCredit = (TextView) v.findViewById(R.id.courseCredit);
        TextView courseID = (TextView) v.findViewById(R.id.courseID);

        courseTitle.setText(courseList.get(i).getCourseTitle());
        courseCredit.setText(courseList.get(i).getCourseCredit());
        courseTerm.setText(courseList.get(i).getCourseTerm());
        courseGrade.setText(courseList.get(i).getCourseGrade());
        courseArea.setText(courseList.get(i).getCourseArea());
        courseID.setText(courseList.get(i).getCourseID()+"");

        return v;
    }
}
