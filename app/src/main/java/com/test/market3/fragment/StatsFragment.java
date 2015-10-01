package com.test.market3.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.test.market3.R;

import java.util.ArrayList;
import java.util.List;

public class StatsFragment extends Fragment {

    public static final String TAG = "stats";

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.statsfragment, container, false);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        List<String> content = new ArrayList<>();
        content.add("list 1");
        content.add("list 2");
        content.add("list 3");
        content.add("list 4");
        content.add("list 5");
        content.add("list 6");
        content.add("list 7");
        content.add("list 8");
        content.add("list 9");
        content.add("list 10");
        content.add("list 11");
        content.add("list 12");
        content.add("list 13");
        content.add("list 14");
        content.add("list 15");
        content.add("list 16");
        content.add("list 17");
        content.add("list 18");
        content.add("list 19");
        content.add("list 20");
        ListView listView = (ListView) getActivity().findViewById(R.id.listView);
        listView.setAdapter(new ArrayAdapter<>(getActivity(), android.R.layout.simple_list_item_1, content));
    }
}

