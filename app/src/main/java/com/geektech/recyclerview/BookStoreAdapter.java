package com.geektech.recyclerview;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class BookStoreAdapter extends RecyclerView.Adapter<BookStoreViewHolder> {

    private ArrayList<String> bookList;

    public BookStoreAdapter(ArrayList<String> bookList) {
        this.bookList = bookList;
    }

    @NonNull
    @Override
    public BookStoreViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new BookStoreViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_bookstore, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull BookStoreViewHolder viewHolder, int position) {
        viewHolder.bind(bookList.get(position));
    }

    @Override
    public int getItemCount() {
        return bookList.size();
    }
}
