package com.example.lab4;

import android.content.Context;
import android.media.Image;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class CategoryRecyclerViewAdapter extends RecyclerView.Adapter<CategoryRecyclerViewAdapter.ViewHolder> {

    private final LayoutInflater inflater;
    private final List<CosmeticRecyclerItem> items;

    public CategoryRecyclerViewAdapter(Context context, List<CosmeticRecyclerItem> items) {
        this.inflater = LayoutInflater.from(context);
        this.items = items;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.item_cosmetic_list, parent,
                false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        CosmeticRecyclerItem item = items.get(position);
        holder.textView.setText(item.getCategoryTitle());
        holder.imageView.setImageResource(item.getResource());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(v.getContext(), "Category " + (holder.getAdapterPosition() + 1), Toast.LENGTH_SHORT).show();
                Log.d("recyclerView", "Category" + (holder.getAdapterPosition() + 1));
            }
        });
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        final TextView textView;
        final ImageView imageView;
        ViewHolder(View view){
            super(view);
            textView = view.findViewById(R.id.categoryTitle);
            imageView = view.findViewById(R.id.categoryLogo);
        }
    }

}
