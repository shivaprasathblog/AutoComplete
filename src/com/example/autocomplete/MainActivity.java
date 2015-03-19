package com.example.autocomplete;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class MainActivity extends Activity {

	AutoCompleteTextView au;
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) 
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        String s[]={"John David "," John Smith ","joy Fisher"," peter Roberts","Daniel Smith ","Daniel Martin","Joyce Tyler"," David Bell ","Jacintha Vance","Janet Parker"};
        
        au=(AutoCompleteTextView)findViewById(R.id.autoCompleteTextView1);
        
        ArrayAdapter<String> ad=new ArrayAdapter<String>(this,android.R.layout.test_list_item,s);
        
        au.setAdapter(ad);
        
        au.setThreshold(3);
    }
}