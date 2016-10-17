package com.ipsos.savascilve.ptapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.ipsos.savascilve.ptapp.Model.Family;

import org.w3c.dom.Text;

import java.util.ArrayList;

/**
 * Created by zencifil on 11/10/2016.
 */

public class FamilyAdapter extends ArrayAdapter<Family> {

    public static class ViewHolder {
        TextView famCode;
        TextView famName;
        TextView famAddress;
    }
    public FamilyAdapter(Context context, ArrayList<Family> families) {
        super(context, 0, families);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Family family = getItem(position);

        ViewHolder viewHolder;

        if (convertView == null) {
            viewHolder = new ViewHolder();
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.famlist_row, parent, false);

            viewHolder.famCode = (TextView)convertView.findViewById(R.id.listItemFamCode);
            viewHolder.famName = (TextView)convertView.findViewById(R.id.listItemFamName);
            viewHolder.famAddress = (TextView)convertView.findViewById(R.id.listItemFamAddress);
            convertView.setTag(viewHolder);
        }
        else {
            viewHolder = (ViewHolder)convertView.getTag();
        }

        viewHolder.famCode.setText(family.getFamCode());
        viewHolder.famName.setText(family.getFamName());
        viewHolder.famAddress.setText(family.getAddress());

        return convertView;
    }
}
