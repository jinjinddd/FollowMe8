package com.example.sd;

import androidx.annotation.Nullable;

import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

public class CourseAddRequest extends StringRequest {
    final static private String URL = "http://mymg.dothome.co.kr/UserSchedule.php";
    private Map<String, String> parameters;

        public CourseAddRequest(String userID, String courseTitle, String courseProfessor, String courseRoom,int courseStartTimeHour ,int courseStartTimeMinute,int courseEndTimeHour,int courseEndTimeMinute, Response.Listener<String> listener){
            super(Method.POST, URL, listener, null);
            parameters = new HashMap<>();
            parameters.put(" userID", userID);
            parameters.put(" courseTitle", courseTitle);
            parameters.put("courseProfessor", courseProfessor);
            parameters.put("courseRoom", courseRoom);
            parameters.put("courseStartTimeHour", courseStartTimeHour + "");
            parameters.put("courseStartTimeMinute", courseStartTimeMinute + "");
            parameters.put("courseEndTimeHour", courseEndTimeHour + "");
            parameters.put("courseEndTimeMinute", courseEndTimeMinute+ "");
        }

        @Override
        public Map<String, String> getParams() {
            return parameters;
        }
}
