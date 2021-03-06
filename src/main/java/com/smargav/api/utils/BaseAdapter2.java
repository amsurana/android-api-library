package com.smargav.api.utils;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.List;

/**
 * Created by amu on 13/05/16.
 */
public class BaseAdapter2<T> extends BaseAdapter {

    private Context context;
    private List<T> objects;
    private int layout;

    public BaseAdapter2(Context context, List<T> objects) {
        this.context = context;
        this.objects = objects;
    }

    public BaseAdapter2(Context context, List<T> objects, int layout) {
        this.context = context;
        this.objects = objects;
        this.layout = layout;
    }

    @Override
    public int getCount() {
        if (objects == null) {
            return 0;
        }
        return objects.size();
    }

    @Override
    public Object getItem(int position) {
        return objects.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null && layout != 0) {
            convertView = View.inflate(context, layout, null);
            return convertView;
        }
        return convertView;
    }
}
