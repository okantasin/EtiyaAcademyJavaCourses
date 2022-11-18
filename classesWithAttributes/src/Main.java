public class Main {
    public static void main(String[] args) {
        Product product = new Product();
        product.setDescription("Laptop");
        product.setName("Asus");
        product.setPrice(150);
        product.setStockAmount(5);

        Product product1 = new Product("Hp","Laptop",3000,2);
        ProductManager productManager = new ProductManager();
        productManager.add(product);
        productManager.add(product1);
    }
}