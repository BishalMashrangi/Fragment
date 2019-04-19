package com.e.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;

import adapter.ProductsAdapter;
import model.Products;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);

        List<Products> productsList = new ArrayList<>();

        productsList.add(new Products("Apple Watch", "Rs. 60000", R.drawable.applewatch, "This is a Apple Watch. It is Very Good."));
        productsList.add(new Products("Cricket Bat", "Rs. 1500", R.drawable.cricketbat, "This is a Cricket Bat. It is Used To Play Cricket."));
        productsList.add(new Products("Football", "Rs. 13000", R.drawable.football, "Nice One"));
        productsList.add(new Products("Chelsea Jersey", "Rs. 5000", R.drawable.jersey, "Good One"));
        productsList.add(new Products("Mac Book", "Rs. 210000", R.drawable.macbook, "Better One"));
        productsList.add(new Products("Projector", "Rs. 150000", R.drawable.projector, "Dhamakedaar"));
        productsList.add(new Products("Nike Shoes", "Rs.10000", R.drawable.shoes, "Chamakdaar"));
        productsList.add(new Products("Smart TV", "Rs.200000", R.drawable.smarttv, "Babbal"));
        productsList.add(new Products("Sound System", "Rs. 75000", R.drawable.soundsystem, "Ding Ding"));
        productsList.add(new Products("Watch Rolex", "Rs.118000", R.drawable.watch, "Dung Dung"));


        ProductsAdapter productsAdapter = new ProductsAdapter(this, productsList);
        recyclerView.setAdapter(productsAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        //recyclerView.setLayoutManager(new GridLayoutManager(this, 2));
        //recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));

    }
}
