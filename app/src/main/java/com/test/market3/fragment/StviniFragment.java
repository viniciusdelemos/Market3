package com.test.market3.fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.test.market3.R;

import java.util.ArrayList;
import java.util.List;


public class StviniFragment extends Fragment {

    public static final String TAG = "stvini";

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.statsfragment, container, false);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        List<String> content = new ArrayList<>();
        content.add("mercado 1");
        content.add("mercado 2");
        content.add("mercado 3");
        content.add("mercado 4");
        content.add("mercado 5");
        content.add("mercado 6");
        content.add("mercado 7");
        content.add("mercado 8");
        content.add("mercado 9");
        content.add("mercado 10");
        content.add("mercado 11");
        content.add("mercado 12");
        content.add("mercado 13");
        content.add("mercado 14");
        content.add("mercado 15");
        content.add("mercado 16");
        content.add("mercado 17");
        content.add("mercado 18");
        content.add("mercado 19");
        content.add("mercado 20");
        ListView listView = (ListView) getActivity().findViewById(R.id.listView);
        listView.setAdapter(new ArrayAdapter<>(getActivity(), android.R.layout.simple_list_item_1, content));
    }
}
