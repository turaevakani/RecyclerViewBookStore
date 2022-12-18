package com.geektech.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView bookStoreRecyclerView;
    private ArrayList<String> bookList = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bookStoreRecyclerView = findViewById(R.id.recycler_view);
        loadData();
        BookStoreAdapter storeAdapter = new BookStoreAdapter(bookList);
        bookStoreRecyclerView.setAdapter(storeAdapter);

    }

    private void loadData() {
        bookList.add("Madame Bovary");
        bookList.add("War and Peace");
        bookList.add("The Great Gatsby");
        bookList.add("Jane Eyre");
        bookList.add("The Stories of Anton Chekhov");
        bookList.add("Pride and Prejudice");
        bookList.add("The Brothers Karamazov");
        bookList.add("The Master and Margarita");
        bookList.add("Don Juan");
        bookList.add("Hamlet");
        bookList.add("Crime and Punishment");
        bookList.add("The Idiot");
        bookList.add("Mother");
    }
}