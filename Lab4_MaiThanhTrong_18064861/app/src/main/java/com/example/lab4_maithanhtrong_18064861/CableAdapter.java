package com.example.lab4_maithanhtrong_18064861;



import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class CableAdapter extends RecyclerView.Adapter<CableAdapter.ViewHolder> {
    private Cable[] cables;

    public CableAdapter(Cable[] cables) {
        this.cables = cables;
    }

    @NonNull
    @Override
    public CableAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        CardView cv = (CardView) LayoutInflater.from(parent.getContext())
                .inflate(R.layout.card_cable, parent, false);
        return new ViewHolder(cv);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder,final int position) {
        CardView cardView = holder.cardView;
        ImageView cableImage = (ImageView) cardView.findViewById(R.id.cable_image);
        TextView cableName = (TextView) cardView.findViewById(R.id.tvCableName);
        RatingBar cableRating = (RatingBar) cardView.findViewById(R.id.tvCableRating);
        TextView cableReview = (TextView) cardView.findViewById(R.id.tvCableReview);
        TextView cablePrice = (TextView) cardView.findViewById(R.id.tvCablePrice);
        TextView cableDiscount = (TextView) cardView.findViewById(R.id.tvCableDiscount);

        Drawable drawable = ContextCompat.getDrawable(cardView.getContext(), cables[position].getImageResourceId());
        cableImage.setImageDrawable(drawable);

        int tempDiscount = (int) (cables[position].getDiscount() * 10);

        String pattern = "#.000";
        DecimalFormat decimalFormat = new DecimalFormat(pattern);

        cableName.setText(cables[position].getName());
        cableRating.setRating(cables[position].getRating());
        cableReview.setText("(" + String.valueOf(cables[position].getReview()) + ")");
        cablePrice.setText(decimalFormat.format(cables[position].getPrice()) + " đ");
        cableDiscount.setText("-" + String.valueOf(tempDiscount) + "%");
    }

    @Override
    public int getItemCount() {
        return cables.length;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        private CardView cardView;

        public ViewHolder(CardView v) {
            super(v);
            cardView = v;
        }
    }
}

