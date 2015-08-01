package cellar.badgeroo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by brij on 24/7/15.
 */
public class FoodListAdapter extends BaseAdapter {

    private static ArrayList<FoodItem> listContact;

    private LayoutInflater mInflater;

    public FoodListAdapter(Context menuFragment, ArrayList<FoodItem> results) {
        listContact = results;
        mInflater = LayoutInflater.from(menuFragment);
    }

    @Override
    public int getCount() {
        // TODO Auto-generated method stub
        return listContact.size();
    }

    @Override
    public Object getItem(int arg0) {
        // TODO Auto-generated method stub
        return listContact.get(arg0);
    }

    @Override
    public long getItemId(int arg0) {
        // TODO Auto-generated method stub
        return arg0;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        // TODO Auto-generated method stub
        ViewHolder holder;
        if(convertView == null){
            convertView = mInflater.inflate(R.layout.food_item, null);
            holder = new ViewHolder();
            holder.txtpic = (ImageView) convertView.findViewById(R.id.lv_food_item_pic);
            holder.txtname = (TextView) convertView.findViewById(R.id.lv_food_item_name);
            holder.txtprice = (TextView) convertView.findViewById(R.id.lv_food_item_price);

            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        holder.txtpic.setImageResource(listContact.get(position).getPhotoUrl());
        holder.txtname.setText(listContact.get(position).getName());
        holder.txtprice.setText(Double.toString(listContact.get(position).getPrice()));

        return convertView;
    }

    static class ViewHolder{
        ImageView txtpic;
        TextView txtname, txtprice;
    }
}
