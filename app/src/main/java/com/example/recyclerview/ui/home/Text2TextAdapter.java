package com.example.recyclerview.ui.home;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recyclerview.R;

import java.util.List;

public class Text2TextAdapter extends RecyclerView.Adapter<Text2TextAdapter.ViewHolder> {
    private List<Text2TextItem> cardItems;

    public Text2TextAdapter(List<Text2TextItem> cardItems) {
        this.cardItems = cardItems;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.holiday_layout, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Text2TextItem cardItem = cardItems.get(position);
        holder.titleTextView.setText(cardItem.getTitle());
        holder.descriptionTextView.setText(cardItem.getDescription());
    }

    @Override
    public int getItemCount() {
        return cardItems.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView titleTextView;
        TextView descriptionTextView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            titleTextView = itemView.findViewById(R.id.holidaytitle); // Replace with the actual ID
            descriptionTextView = itemView.findViewById(R.id.holidaydate); // Replace with the actual ID
        }
    }
}
