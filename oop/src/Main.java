public class Main {
    public static void main(String[] args) {
        Product product = new Product();

        product.setName("Erkek bot");
        product.setColor("black");
        product.setDiscount(13);
        product.setImageUrl("image.jpeg");
        product.setStock(-15);
        System.out.println(product.toString());

        Product product2 = new Product("kalem");
        System.out.println(product2.toString());

        Product product3 = new Product("masa",15,"image2.jpeg","beyaz",15);
        System.out.println(product3.toString());

    }
}

