package com.sometning.zeesh.dashboard;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class TestActivity extends AppCompatActivity implements View.OnClickListener {

    LinearLayout addCart , cart , checkout ,storeProduct;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);

        addCart = findViewById(R.id.addCart);
        cart = findViewById(R.id.cart);
        checkout = findViewById(R.id.checkOut);
        storeProduct = findViewById(R.id.storeProduct);

        addCart.setOnClickListener(this);
        cart.setOnClickListener(this);
        checkout.setOnClickListener(this);
        storeProduct.setOnClickListener(this);
    }



    @Override
    public void onClick(View view) {

        int id = view.getId();

        switch (id)
        {
            case R.id.addCart:
                sendUserToActivity(new AddToCatActivity());
                break;
            case R.id.cart:
                sendUserToActivity(new CartActivity());
                break;
            case R.id.checkOut:
                sendUserToActivity(new CheckOutActivity());
                break;
            case R.id.storeProduct:
                sendUserToActivity(new StoreProductActivity());
                break;

        }
    }

    private void sendUserToActivity(Activity activity) {

        Intent intent = new Intent(TestActivity.this , activity.getClass());
        startActivity(intent);

    }
}
