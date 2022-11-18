

public class Product {


    public Product(){

    }
    public Product(String name) {
        this.name = name;
    }

    public Product(String name, double discount, String imageUrl, String color, int stock) {
        this.name = name;
        this.discount = discount;
        this.imageUrl = imageUrl;
        this.color = color;
        this.stock = stock;
    }

    private String name;
   private double discount;
   private String imageUrl;
   private String color;
   private int stock;

    public String getName() {
        return name;
    }

    public double getDiscount() {
        return discount;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public String getColor() {
        return color;
    }

    public int getStock() {
        return stock;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setStock(int stock) {
        if(stock<0){
            stock=0;
        }
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", discount=" + discount +
                ", imageUrl='" + imageUrl + '\'' +
                ", color='" + color + '\'' +
                ", stock=" + stock +
                '}';
    }
}
