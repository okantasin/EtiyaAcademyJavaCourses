public class Main {
    public static void main(String[] args) {
        int number1=20;
        int number2=25;
        int number3=2;

        int enBuyuk = number1;

        if(enBuyuk<number2){
            enBuyuk=number2;
        }
        if(enBuyuk<number3){
            enBuyuk=number3;
        }

        System.out.println(enBuyuk);
    }
}