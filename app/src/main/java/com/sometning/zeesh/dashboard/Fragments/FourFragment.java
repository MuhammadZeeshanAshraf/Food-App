package com.sometning.zeesh.dashboard.Fragments;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import androidx.fragment.app.Fragment;

import com.sometning.zeesh.dashboard.AddToCatActivity;
import com.sometning.zeesh.dashboard.BeverageActivity;
import com.sometning.zeesh.dashboard.CartActivity;
import com.sometning.zeesh.dashboard.CheckOutActivity;
import com.sometning.zeesh.dashboard.PizzaActivity;
import com.sometning.zeesh.dashboard.R;
import com.sometning.zeesh.dashboard.StoreProductActivity;
import com.sometning.zeesh.dashboard.TestActivity;

public class FourFragment extends Fragment implements View.OnClickListener{



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_four, container, false);
        LinearLayout addCart , cart , checkout ,storeProduct , pizza , bev ;

        addCart = view.findViewById(R.id.addCart);
        cart = view.findViewById(R.id.cart);
        checkout = view.findViewById(R.id.checkOut);
        storeProduct = view.findViewById(R.id.storeProduct);
        pizza = view.findViewById(R.id.pizza);
        bev =view.findViewById(R.id.addbev);

        addCart.setOnClickListener(this);
        cart.setOnClickListener(this);
        checkout.setOnClickListener(this);
        storeProduct.setOnClickListener(this);
        pizza.setOnClickListener(this);
        bev.setOnClickListener(this);

        return view;
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

            case R.id.pizza:
                sendUserToActivity(new PizzaActivity());
                break;

            case R.id.addbev:
                sendUserToActivity(new BeverageActivity());
                break;
        }

    }

    private void sendUserToActivity(Activity activity) {

        Intent intent = new Intent(getContext() , activity.getClass());
        startActivity(intent);

    }
}
