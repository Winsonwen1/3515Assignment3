package edu.temple.coloractivity;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

class ColorAdapter extends BaseAdapter {
    private ArrayList<String> mList;
    private Context conte;

    public ColorAdapter(ArrayList<String> list, Context conte) {
        this.mList = list;
        this.conte = conte;
    }


    @Override
    public int getCount() {
        return mList.size();
    }

    @Override
    public Object getItem(int position) {
        return mList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {


        TextView mTextView = new TextView(conte.getApplicationContext());
        mTextView.setId(position);
        mTextView.setText(mList.get(position));
        if (position != 0) {
            mTextView.setBackgroundColor(Color.parseColor(mList.get(position)));
        }
        return mTextView;

    }
}
