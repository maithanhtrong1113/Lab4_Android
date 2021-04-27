package com.example.lab4_maithanhtrong_18064861;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class ProductCategoryActivity extends AppCompatActivity {
    private List<Product> products = new ArrayList<Product>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_category);

        //Add data into products
        products.add(new Product("Ca nấu lẩu, nấu mì mini (giao màu ngẫu nhiên)", "Devang", R.drawable.ca_nau_lau));
        products.add(new Product("KHÔ GÀ BƠ TỎI (GÀ CHÀ BÔNG CAY) (1KG)", "LTD Food", R.drawable.ga_bo_toi));
        products.add(new Product("Xe cần cẩu đa năng", "Thế giới đồ chơi", R.drawable.xa_can_cau));
        products.add(new Product("Đồ chơi dạng mô hình", "Thế giới đồ chơi", R.drawable.do_choi_dang_mo_hinh));
        products.add(new Product("Lãnh đạo giản đơn", "Minh Long Book", R.drawable.lanh_dao_gian_don));
        products.add(new Product("Hiểu lòng con trẻ", "Minh Long Book", R.drawable.hieu_long_con_tre));

        MyListAdapter adapter = new MyListAdapter(this, products);

        ListView listView = (ListView) findViewById(R.id.list_view);
        listView.setAdapter(adapter);
    }
}