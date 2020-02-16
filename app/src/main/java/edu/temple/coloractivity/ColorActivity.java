package edu.temple.coloractivity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.Spinner;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class ColorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        final ArrayList<String>  strs = new ArrayList<>();
        strs.add("---Please Choose one of Colour---");
        strs.add("RED");
        strs.add("GREEN");
        strs.add("YELLOW");
        strs.add("BLUE");
        strs.add("GRAY");
        strs.add("CYAN");
        strs.add("MAGENTA");
        strs.add("GREY");
        strs.add("LIME");
        strs.add("OLIVE");
        strs.add("MAROON");

        final ColorAdapter adapter = new ColorAdapter(strs,this);
        final Spinner spinner = (Spinner) findViewById(R.id.spinner);
        spinner.setAdapter(adapter);


        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                ConstraintLayout cl = (ConstraintLayout) findViewById(R.id.Layout);
                if(position!=0) {

                    cl.setBackgroundColor(Color.parseColor(strs.get(position)));
                   // spinner.setBackgroundColor(Color.parseColor("WHITE"));

                    //((TextView)spinner.getAdapter().getView(position,view,parent)).setBackgroundColor(Color.parseColor("WHITE"));
                    //((TextView)adapter.getItemId(position)).setBackgroundColor(Color.parseColor("WHoITE"));
                    ((TextView)findViewById((int)adapter.getItemId(position))).setBackgroundColor(Color.parseColor("WHITE"));



                }else{
                    cl.setBackgroundColor(Color.parseColor("WHITE"));
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });




    }

}
