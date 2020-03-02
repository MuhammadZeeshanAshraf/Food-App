package com.sometning.zeesh.dashboard;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toast;

import com.sometning.zeesh.dashboard.Adapter.ProductAdapter;
import com.sometning.zeesh.dashboard.Adapter.StoreProductAdapter;
import com.sometning.zeesh.dashboard.Model.Product;
import com.sometning.zeesh.dashboard.Model.Store;

import java.util.ArrayList;

public class StoreProductActivity extends AppCompatActivity {

    ArrayList<Product> products;
    StoreProductAdapter productAdapter;
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_store_product);
        recyclerView = findViewById(R.id.rv_storeproducts);


        ItemTouchHelper helper = new ItemTouchHelper(new ItemTouchHelper.SimpleCallback(0 , ItemTouchHelper.LEFT ) {
            @Override
            public boolean onMove(@NonNull RecyclerView recyclerView, @NonNull RecyclerView.ViewHolder viewHolder, @NonNull RecyclerView.ViewHolder target) {
                return false;
            }

            @Override
            public void onSwiped(@NonNull RecyclerView.ViewHolder viewHolder, int direction) {

                int pos = viewHolder.getAdapterPosition();
                Toast.makeText(StoreProductActivity.this, pos + "", Toast.LENGTH_SHORT).show();

            }
        });
        products = new ArrayList<>();

        for (int i = 0; i < 7; i++) {
            Product model = new Product();
            products.add(model);
        }

        LinearLayoutManager brandlayoutManager = new LinearLayoutManager(StoreProductActivity.this, LinearLayoutManager.VERTICAL, false);

        recyclerView.setLayoutManager(brandlayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());

        productAdapter = new StoreProductAdapter(StoreProductActivity.this, products);

        recyclerView.setAdapter(productAdapter);
        helper.attachToRecyclerView(recyclerView);
    }
}
