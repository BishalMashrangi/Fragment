package adapter;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.e.recyclerview.DetailsActivity;
import com.e.recyclerview.MainActivity;
import com.e.recyclerview.R;

import java.util.List;

import model.Products;

public class ProductsAdapter extends RecyclerView.Adapter<ProductsAdapter.ProductsViewHolder> {

    Context mContext;
    List<Products> productsList;

    public ProductsAdapter(Context mContext, List<Products> productsList) {
        this.mContext = mContext;
        this.productsList = productsList;
    }

    @NonNull
    @Override
    public ProductsViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.product, viewGroup, false);

        return new ProductsViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ProductsViewHolder productsViewHolder, int i) {

        final Products products = productsList.get(i);

        productsViewHolder.imgProfile.setImageResource(products.getImageId());
        productsViewHolder.tvName.setText(products.getName());
        productsViewHolder.tvPrice.setText(products.getPrice());

        //Adding Click Listener

        productsViewHolder.imgProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (v.getId() == R.id.imgProfile) {
                    Intent intent = new Intent(mContext, DetailsActivity.class);

                    intent.putExtra("image", products.getImageId());
                    intent.putExtra("name", products.getName());
                    intent.putExtra("price", products.getPrice());
                    intent.putExtra("detail", products.getDetails());

                    mContext.startActivity(intent);
                }
            }
        });

    }

    @Override
    public int getItemCount() {
        return productsList.size();
    }

    public class ProductsViewHolder extends RecyclerView.ViewHolder {

        ImageView imgProfile;
        TextView tvName, tvPrice;

        public ProductsViewHolder(@NonNull View itemView) {
            super(itemView);

            imgProfile = itemView.findViewById(R.id.imgProfile);
            tvName = itemView.findViewById(R.id.tvName);
            tvPrice = itemView.findViewById(R.id.tvPrice);

        }
    }

}
