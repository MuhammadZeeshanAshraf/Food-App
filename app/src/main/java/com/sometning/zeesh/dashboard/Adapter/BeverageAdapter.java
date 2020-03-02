package com.sometning.zeesh.dashboard.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.sometning.zeesh.dashboard.Model.Product;
import com.sometning.zeesh.dashboard.R;

import java.util.ArrayList;

public class BeverageAdapter extends RecyclerView.Adapter<BeverageAdapter.ViewHolder> {
    ArrayList<Product> productModels;
    Context context;

    public BeverageAdapter(ArrayList<Product> productModels, Context context) {
        this.productModels = productModels;
        this.context = context;
    }

    @NonNull
    @Override
    public BeverageAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.bev_row_item, parent, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull BeverageAdapter.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return productModels.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
