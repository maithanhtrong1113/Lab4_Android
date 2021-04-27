package com.example.lab4_maithanhtrong_18064861;



import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class MyListAdapter extends ArrayAdapter<Product> {
    private Activity context;
    private List<Product> products;

    public MyListAdapter(Activity context, List<Product> products) {
        super(context, R.layout.mylist, products);
        this.context = context;
        this.products = products;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View rowView = inflater.inflate(R.layout.mylist, null, true);

        ImageView photo = (ImageView) rowView.findViewById(R.id.photo);
        TextView name = (TextView) rowView.findViewById(R.id.name);
        TextView supplier = (TextView) rowView.findViewById(R.id.supplier);

        photo.setImageResource(products.get(position).getImageResourceId());
        name.setText(products.get(position).getName());
        supplier.setText(products.get(position).getSupplier());

        return rowView;
    }
}

