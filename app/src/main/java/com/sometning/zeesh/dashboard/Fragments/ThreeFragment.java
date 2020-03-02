package com.sometning.zeesh.dashboard.Fragments;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;
import com.sometning.zeesh.dashboard.Adapter.ProductAdapter;
import com.sometning.zeesh.dashboard.Adapter.TabAdapter;
import com.sometning.zeesh.dashboard.Model.Product;
import com.sometning.zeesh.dashboard.R;

import java.util.ArrayList;


public class ThreeFragment extends Fragment {

    ArrayList<Product> products;
    ProductAdapter productAdapter;
    RecyclerView recyclerView;

    TabAdapter tabAdapter;
    ImageView search;
    ViewPager viewPager;
    TabLayout tablayout;
    LinearLayout linearLayout , mainLayout ;

    CardView back , searchText;
    TextView store;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_three, container, false);
        recyclerView = view.findViewById(R.id.rv_three_store);
        search = view.findViewById(R.id.iv_three_search_button);
        linearLayout = view.findViewById(R.id.ll_three_linear_tab_layout);
        linearLayout.setVisibility(View.GONE);
        mainLayout = view.findViewById(R.id.lin);
        back = view.findViewById(R.id.cv_three_back_button);
        searchText = view.findViewById(R.id.cv_three_search_text);
        store = view.findViewById(R.id.tv_three_store);
        storeRecyclerView();

        viewPager = view.findViewById(R.id.vp_three_viewpager);
        tabAdapter = new TabAdapter(getActivity().getSupportFragmentManager());
        viewPager.setAdapter(tabAdapter);
        tablayout = view.findViewById(R.id.tl_three_tablayout);
        tablayout.setupWithViewPager(viewPager);


        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                linearLayout.setVisibility(View.VISIBLE);
                store.setVisibility(View.GONE);
                back.setVisibility(View.VISIBLE);
                searchText.setVisibility(View.VISIBLE);
            }
        });

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                linearLayout.setVisibility(View.GONE);
                store.setVisibility(View.VISIBLE);
                back.setVisibility(View.GONE);
                searchText.setVisibility(View.GONE);

            }
        });
        return view;
    }

    public void storeRecyclerView()
    {
        products = new ArrayList<>();

        for (int i = 0; i < 7; i++) {
            Product model = new Product();
            products.add(model);
        }

        LinearLayoutManager brandlayoutManager = new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false);

        recyclerView.setLayoutManager(brandlayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());

        productAdapter = new ProductAdapter(getContext(), products);

        recyclerView.setAdapter(productAdapter);
    }

}
