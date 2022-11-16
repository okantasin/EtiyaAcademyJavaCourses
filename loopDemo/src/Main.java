public class Main {
    public static void main(String[] args) {
        //for
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
        System.out.println("Döngü bitti");
        //while
        int i = 0;
        while (i < 10) {
            System.out.println(i);
            i+=2;
        }

        int j = 100;
        do{
            System.out.println(j);
            j+=2;
        }while (j<10);
        System.out.println("Do-While Döngüsü Bitti");

    }
}