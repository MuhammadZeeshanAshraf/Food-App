package com.sometning.zeesh.dashboard.Fragments;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.sometning.zeesh.dashboard.Adapter.ItemsAdapter;
import com.sometning.zeesh.dashboard.Adapter.StoreAdapter;
import com.sometning.zeesh.dashboard.Model.Item;
import com.sometning.zeesh.dashboard.Model.Store;
import com.sometning.zeesh.dashboard.R;

import java.util.ArrayList;


public class SearchItemsFragment extends Fragment {

    ArrayList<Item> items;
    ItemsAdapter itemsAdapter;
    RecyclerView recyclerView;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_search_items, container, false);
        recyclerView = view.findViewById(R.id.rv_search_item_recyclyerview);

        showRecyclerView();
        return view;

    }

    private void showRecyclerView()
    {
        items = new ArrayList<>();

        for (int i = 0; i < 7; i++) {
            Item model = new Item();
            items.add(model);
        }

        LinearLayoutManager brandlayoutManager = new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false);

        recyclerView.setLayoutManager(brandlayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());

        itemsAdapter = new ItemsAdapter(getContext(), items);

        recyclerView.setAdapter(itemsAdapter);
    }


}
