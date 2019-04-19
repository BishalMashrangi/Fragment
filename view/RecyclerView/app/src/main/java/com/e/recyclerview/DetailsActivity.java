package com.e.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailsActivity extends AppCompatActivity {

    ImageView imgLarge;
    TextView tvNameLarge, tvPriceLarge, tvDetails;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        imgLarge = findViewById(R.id.imgLarge);
        tvNameLarge = findViewById(R.id.tvNameLarge);
        tvPriceLarge = findViewById(R.id.tvPriceLarge);
        tvDetails = findViewById(R.id.tvDetails);

        Bundle bundle = getIntent().getExtras();

        if (bundle != null) {
            imgLarge.setImageResource(bundle.getInt("image"));
            tvNameLarge.setText(bundle.getString("name"));
            tvPriceLarge.setText(bundle.getString("price"));
            tvDetails.setText(bundle.getString("detail"));
        }

    }
}
