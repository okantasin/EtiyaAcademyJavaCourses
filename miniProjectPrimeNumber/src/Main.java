public class Main {
    public static void main(String[] args) {
        int number = 25;
        boolean isPrime = true;
        if(number==1){
            System.out.println("asal sayi degildir");
            return;
        }
        if (number<1){
            System.out.println("gecersiz sayi");
        }
        for (int i = 0; i < number; i++) {
            if (number % i == 0) {
                isPrime = false;
            }
        }

        if (isPrime) {
            System.out.println("sayi asaldir");
        }else{
            System.out.println("sayi asal degildir");
        }
    }
}