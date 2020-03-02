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

import com.sometning.zeesh.dashboard.Adapter.ProductAdapter;
import com.sometning.zeesh.dashboard.Adapter.StoreAdapter;
import com.sometning.zeesh.dashboard.Model.Product;
import com.sometning.zeesh.dashboard.Model.Store;
import com.sometning.zeesh.dashboard.R;

import java.util.ArrayList;

public class SearchStoreFragment extends Fragment {

    ArrayList<Store> stores;
    StoreAdapter storeAdapter;
    RecyclerView recyclerView;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_search_store, container, false);
        recyclerView = view.findViewById(R.id.rv_search_store_recyclyerview);

        showRecyclerView();
        return view;
    }

    private void showRecyclerView() {
        stores = new ArrayList<>();

        for (int i = 0; i < 7; i++) {
            Store model = new Store();
            stores.add(model);
        }

        LinearLayoutManager brandlayoutManager = new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false);

        recyclerView.setLayoutManager(brandlayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());

        storeAdapter = new StoreAdapter(getContext(), stores);

        recyclerView.setAdapter(storeAdapter);
    }


}
