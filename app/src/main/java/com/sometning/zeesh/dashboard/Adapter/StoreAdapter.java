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
import com.sometning.zeesh.dashboard.Model.Store;
import com.sometning.zeesh.dashboard.R;

import java.util.ArrayList;

public class StoreAdapter extends RecyclerView.Adapter<StoreAdapter.ViewHolder> {
    ArrayList<Store> productModels;
    Context context;

    public StoreAdapter(Context context, ArrayList<Store> productModels) {
        this.context = context;
        this.productModels = productModels;
    }

    @NonNull
    @Override
    public StoreAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.search_store_item , parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull StoreAdapter.ViewHolder holder, int position) {

//        holder.picture.setImageResource(productModels.get(position).getPicture());
//        holder.price.setText(productModels.get(position).getPrice());
//        holder.description.setText(productModels.get(position).getDescription());
//
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
