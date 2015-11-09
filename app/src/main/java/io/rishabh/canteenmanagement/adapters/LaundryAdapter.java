package io.rishabh.canteenmanagement.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

import io.rishabh.canteenmanagement.R;

/**
 * Created by rishabh on 9/11/15.
 */
public class LaundryAdapter extends BaseAdapter {
    private LayoutInflater mInflater;
    ArrayList<String> itemsArrayList;
    Context context;


    public LaundryAdapter(Context context, ArrayList<String> itemsArrayList) {
        this.mInflater = LayoutInflater.from(context);
        this.itemsArrayList = itemsArrayList;
        this.context = context;
    }

    @Override
    public int getCount() {
        return itemsArrayList.size();
    }

    @Override
    public Object getItem(int position) {
        return itemsArrayList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view;
        ViewHolder holder;

        //I f initially view is null
        if (convertView == null) {

            //View of one item of  list
            view = mInflater.inflate(R.layout.items_list_view, parent, false);
            holder = new ViewHolder();

            //Link to elemets of holder
            holder.name = (TextView) view.findViewById(R.id.itemName);
            holder.price = (TextView)view.findViewById(R.id.price);
            view.setTag(holder);

        } else {
            view = convertView;
            holder = (ViewHolder) view.getTag();
        }
        final String items = itemsArrayList.get(position);

        holder.name.setText("A");
        holder.price.setText("b");

        return null;
    }
    private class ViewHolder {
        public TextView name;
        public TextView price;
    }
}
