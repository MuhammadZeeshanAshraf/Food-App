package com.sometning.zeesh.dashboard;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.sometning.zeesh.dashboard.Adapter.CartAdapter;
import com.sometning.zeesh.dashboard.Adapter.PizzaAdapter;
import com.sometning.zeesh.dashboard.Model.Product;

import java.util.ArrayList;

public class PizzaActivity extends AppCompatActivity {

    ArrayList<Product> products;
    PizzaAdapter pizzaAdapter;
    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pizza);

        recyclerView = findViewById(R.id.rv_pizza);

        products = new ArrayList<>();

        for (int i = 0; i < 4; i++) {
            Product model = new Product();
            products.add(model);
        }

        LinearLayoutManager brandlayoutManager = new LinearLayoutManager(PizzaActivity.this, LinearLayoutManager.VERTICAL, false);

        recyclerView.setLayoutManager(brandlayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());

        pizzaAdapter = new PizzaAdapter( products, PizzaActivity.this);

        recyclerView.setAdapter(pizzaAdapter);
    }
}
