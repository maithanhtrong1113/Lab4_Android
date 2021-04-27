package com.example.lab4_maithanhtrong_18064861;



public class Cable {
    private String name;
    private float rating;
    private int review;
    private double price;
    private double discount;
    private int imageResourceId;

    public static final Cable[] cables = {
            new Cable("Dây Máy In USB 2.0 UGREEN USB10362 Có Chip khuếch đại cao cấp dài 10M UGREEN USB10374Us122 Hàng chính hãng", 5, 4, 275, 0, R.drawable.cable_1),
            new Cable("Dây Cáp USB 2 Đầu Dương 1.5m ( Đen )", 5, 7, 18.6, 8.8, R.drawable.cable_2),
            new Cable("Cáp sạc micro cao cấp dây tròn usb 2.0 dài 2M màu đen UGREEN USB60138Us289 Hàng chính hãng", 4.5f, 6, 58, 3.6, R.drawable.cable_3),
            new Cable("Cáp Chuyển Đổi USB 3.0 To Lan - USB Sang Lan", 4.5f, 6, 165, 4.3, R.drawable.cable_4),
            new Cable("Cáp tín hiệu USB 2.0 nối dài dây tròn mạ vàng cao cấp dài 3M màu đen UGREEN USB10317Us103 Hàng chính hãng", 5, 1, 77, 1.3, R.drawable.cable_5),
            new Cable("Dây Cáp Nối Dài USB 2.0 (Từ 1m đến 10m)", 4.5f, 3, 33, 5.9, R.drawable.cable_6)
    };

    public Cable(String name, float rating, int review, double price, double discount, int imageResourceId) {
        this.name = name;
        this.rating = rating;
        this.review = review;
        this.price = price;
        this.discount = discount;
        this.imageResourceId = imageResourceId;
    }

    public String getName() {
        return name;
    }

    public float getRating() {
        return rating;
    }

    public int getReview() {
        return review;
    }

    public double getPrice() {
        return price;
    }

    public double getDiscount() {
        return discount;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }

    public static Cable[] getCables() {
        return cables;
    }
}
