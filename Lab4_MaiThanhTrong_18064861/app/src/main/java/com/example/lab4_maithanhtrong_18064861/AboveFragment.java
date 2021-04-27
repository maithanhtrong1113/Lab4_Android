package com.example.lab4_maithanhtrong_18064861;



import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;

public class AboveFragment extends Fragment {
    private TextView tvQuantity;
    private TextView tvProductPrice;
    private ImageButton imgBtnRemove;
    private ImageButton imgBtnAdd;
    private int tempQuantity;
    private Listener listener;

    public interface Listener {
        void onSendData(int quantity, double price);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_above, container, false);

        tvQuantity = view.findViewById(R.id.tvQuantity);
        tvProductPrice = view.findViewById(R.id.tvProductPrice);
        imgBtnRemove = view.findViewById(R.id.imgBtnRemove);
        imgBtnAdd = view.findViewById(R.id.imgBtnAdd);
        tempQuantity = Integer.parseInt(String.valueOf(tvQuantity.getText()));

        String currentString = String.valueOf(tvProductPrice.getText());
        String[] separated = currentString.split(" ");


        imgBtnRemove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvQuantity.setText(String.valueOf(tempQuantity--));
                listener.onSendData(Integer.parseInt(String.valueOf(tvQuantity.getText())), Double.parseDouble(separated[0]));
            }
        });

        imgBtnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvQuantity.setText(String.valueOf(tempQuantity++));
                listener.onSendData(Integer.parseInt(String.valueOf(tvQuantity.getText())), Double.parseDouble(separated[0]));
            }
        });
        return view;
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        if (context instanceof Listener) {
            listener = (Listener) context;
        } else {
            throw new RuntimeException(context.toString() + " must implement AboveFragment");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        listener = null;
    }
}
