package com.example.soojin.management;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by SOOJIN on 2017-06-04.
 */

//실제로 회원을 삭제 할 수 있는 클래스
public class DeleteRequest extends StringRequest{

    final static private String URL = "http://sjlim333.cafe24.com/Delete.php";
    private Map<String, String> parameters;

    public DeleteRequest(String userID, Response.Listener<String> listener){
        super(Request.Method.POST, URL, listener, null);
        parameters = new HashMap<>();
        parameters.put("userID", userID);
    }

    @Override
    public Map<String, String> getParams(){
        return parameters;
    }
}
