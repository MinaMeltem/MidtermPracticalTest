package com.example.practicaltest;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by C4Q on 12/19/16.
 */
public class ContainerFragment extends Fragment {

    ArrayAdapter mVineAdapter; //Question: there are more adapter types such as, simple adapter,list adapter etc ?
    ListView mListView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootview = inflater.inflate(R.layout.fragment_layout, container, false);

        String [] vineData={}; // i dont know how to retrieve the data from   into this array in ordder to display in  listview

        List<String> names = new ArrayList<String>(Arrays.asList(vineData));

        mVineAdapter = new ArrayAdapter<String>(getActivity(),R.layout.vine_item_layout, R.id.vine_title_tv, vineData);
        mListView = (ListView) rootview.findViewById(R.id.vine_list_lv);
        mListView.setAdapter(mVineAdapter);

        return rootview;
    }
}
