package com.ipsos.savascilve.ptapp;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.ListFragment;
import android.support.v4.content.ContextCompat;
import android.view.View;
import android.widget.ListView;

import com.ipsos.savascilve.ptapp.Adapter.FamilyAdapter;
import com.ipsos.savascilve.ptapp.Model.Family;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class TodayFamListFragment extends ListFragment {

    private ArrayList<Family> _families;
    private FamilyAdapter _familyAdapter;
    private String _fldCode;
    private static final String TODAYFAMLIST_URL = "";

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        //TODO open here for rest call. also make some research for passing fld code!!!
        /*
        AsyncHttpClient client = new AsyncHttpClient();
        RequestParams params = new RequestParams();
        params.put("fldCode", _fldCode);
        client.get(TODAYFAMLIST_URL, params, new AsyncHttpResponseHandler() {
            @Override
            public void onSuccess(int statusCode, Header[] headers, byte[] responseBody) {
                super.onSuccess(statusCode, headers, responseBody);
            }

            @Override
            public void onFailure(int statusCode, Header[] headers, byte[] responseBody, Throwable error) {
                super.onFailure(statusCode, headers, responseBody, error);
            }
        });
        */

        _families = new ArrayList<>();
        _families.add(new Family("01W1049", "TEST HANESI", "ISTANBUL", "ADALAR", "HEYBELIADA MAH.", "HEYBESIZ", "HEYBECI", "3"));
        _families.add(new Family("01W2399", "SINEM OZBAKAN", "ISTANBUL", "USKUDAR", "BARBAROS MAH.", "NATO YOLU- SELVI CD", "ASLANAGZI", "5"));
        _familyAdapter = new FamilyAdapter(getActivity(), _families);

        setListAdapter(_familyAdapter);

        getListView().setDivider(ContextCompat.getDrawable(getActivity(), android.R.color.black));
        getListView().setDividerHeight(1);
    }

    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
    }

    private void openFamDetailActivity(int position) {
        Family family = (Family)getListAdapter().getItem(position);
        Intent intent = new Intent(getActivity(), FamDetailActivity.class);
        intent.putExtra(MainActivity.EXTRA_FAMCODE, family.getFamCode());

    }
}
