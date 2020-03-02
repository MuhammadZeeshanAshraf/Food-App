package com.sometning.zeesh.dashboard.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.sometning.zeesh.dashboard.Model.Item;
import com.sometning.zeesh.dashboard.Model.Product;
import com.sometning.zeesh.dashboard.R;

import java.util.ArrayList;

public class ItemsAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    ArrayList<Item> productModels;
    Context context;
    private static int EVEN = 0;
    private static int ODD = 1;

    public ItemsAdapter(Context context, ArrayList<Item> productModels) {
        this.context = context;
        this.productModels = productModels;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view ;

        if(viewType == EVEN)
        {
            view = LayoutInflater.from(parent.getContext()).inflate(R.layout.search_items_item, parent, false);

            return new ViewHolder(view);
        }
        else
        {
            view = LayoutInflater.from(parent.getContext()).inflate(R.layout.store_second_item, parent, false);

            return new SecondViewHolder(view);

        }

    }

    @Override
    public int getItemViewType(int position) {

        if(position % 2 == 0)
        {
            return EVEN;
        }
        else
        {
            return ODD;
        }
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

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

    public class SecondViewHolder extends RecyclerView.ViewHolder {
        ImageView picture;
        TextView price, description;


        public SecondViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }


}
