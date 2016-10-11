package com.ipsos.savascilve.ptapp;

import android.content.Context;
import android.widget.ArrayAdapter;

import com.ipsos.savascilve.ptapp.Model.Family;

import java.util.ArrayList;

/**
 * Created by zencifil on 11/10/2016.
 */

public class FamilyAdapter extends ArrayAdapter<Family> {

    public FamilyAdapter(Context context, ArrayList<Family> families) {
        super(context, 0, families);
    }
}
