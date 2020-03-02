package com.sometning.zeesh.dashboard.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.sometning.zeesh.dashboard.Model.Product;
import com.sometning.zeesh.dashboard.R;

import java.util.ArrayList;

public class StoreProductAdapter extends RecyclerView.Adapter<StoreProductAdapter.ViewHolder> {
    ArrayList<Product> productModels;
    Context context;

    public StoreProductAdapter(Context context, ArrayList<Product> productModels) {
        this.context = context;
        this.productModels = productModels;
    }

    @NonNull
    @Override
    public StoreProductAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.store_product_row_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull StoreProductAdapter.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return productModels.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView picture;
        TextView price, description;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);


        }
    }
}
