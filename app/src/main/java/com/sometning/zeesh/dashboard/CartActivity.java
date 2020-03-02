package com.sometning.zeesh.dashboard;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.sometning.zeesh.dashboard.Adapter.CartAdapter;
import com.sometning.zeesh.dashboard.Adapter.StoreProductAdapter;
import com.sometning.zeesh.dashboard.Model.Product;

import java.util.ArrayList;

public class CartActivity extends AppCompatActivity {

    ArrayList<Product> products;
    CartAdapter cartAdapter;
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cart);

        recyclerView = findViewById(R.id.rv_cartItems);

        products = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            Product model = new Product();
            products.add(model);
        }

        LinearLayoutManager brandlayoutManager = new LinearLayoutManager(CartActivity.this, LinearLayoutManager.VERTICAL, false);

        recyclerView.setLayoutManager(brandlayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());

        cartAdapter = new CartAdapter(CartActivity.this, products);

        recyclerView.setAdapter(cartAdapter);
    }
}
