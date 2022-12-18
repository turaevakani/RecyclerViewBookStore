package com.geektech.recyclerview;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class BookStoreViewHolder extends RecyclerView.ViewHolder {
    private TextView tvBooks;
    public BookStoreViewHolder(@NonNull View itemView) {
        super(itemView);
        tvBooks = itemView.findViewById(R.id.tv_books);
    }
    public void bind(String book){
        tvBooks.setText(book);

    }
}
