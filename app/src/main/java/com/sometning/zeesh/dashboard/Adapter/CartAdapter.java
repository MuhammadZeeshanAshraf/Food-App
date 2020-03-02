package com.sometning.zeesh.dashboard.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.RecyclerView;

import com.sometning.zeesh.dashboard.Model.Product;
import com.sometning.zeesh.dashboard.R;
import com.zerobranch.layout.SwipeLayout;

import java.util.ArrayList;

import static androidx.recyclerview.widget.RecyclerView.NO_POSITION;

public class CartAdapter extends RecyclerView.Adapter<CartAdapter.ViewHolder> {
    ArrayList<Product> productModels;
    Context context;

    public CartAdapter(Context context, ArrayList<Product> productModels) {
        this.context = context;
        this.productModels = productModels;
    }

    @NonNull
    @Override
    public CartAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.cart_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CartAdapter.ViewHolder holder, int position) {



    }

    private void remove(Context context, int position) {
        Toast.makeText(context, "removed item " + position, Toast.LENGTH_SHORT).show();
    }

    @Override
    public int getItemCount() {
        return productModels.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        SwipeLayout swipeLayout;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            swipeLayout = itemView.findViewById(R.id.swipe_layout);

            swipeLayout.setOnActionsListener(new SwipeLayout.SwipeActionsListener() {
                @Override
                public void onOpen(int direction, boolean isContinuous) {

                    if (direction == SwipeLayout.LEFT && isContinuous) {
                        if (getAdapterPosition() != NO_POSITION) {
                            remove(itemView.getContext(), getAdapterPosition());
                        }
                    }
                }

                @Override
                public void onClose() {

                }
            });
        }
    }
}
