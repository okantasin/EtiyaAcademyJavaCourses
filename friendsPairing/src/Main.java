public class Main {
    public static void main(String[] args) {

        int number = 220;
        int number1 = 204;
        int total = 0;
        int total1 = 0;


        for (int i = 1; i < number1; i++) {
            if (number % i == 0) {
                total += i;

            }
        }
        for (int i = 1; i < number1; i++) {
            if(number1%i==0){
            total1 += i;
        }
    }
        if((number == total1 && (number1 == total))){
            System.out.println("bu iki sayı arkadaştır");
        }else {
            System.out.println("bu iki sayı arkadaş değildir");
        }
    }
}
