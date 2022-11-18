public class Main {

    public static void main(String[] args) {
        String message = "Heyy yoo heyyy yoo";
        message.substring(2, 4);
        int total1 = sum(15, 7);
        int total2=sum2(1,2,3,4);
        System.out.println(total1);
        System.out.println(total2);

    }

    public static void add() {
        System.out.println("Added");

    }

    public static void delete() {
        System.out.println("Added");

    }

    public static void update() {
        System.out.println("Added");

    }


    public static int sum(int number1, int number2) {

        int total = number1 + number2;
        return total;
    }

    public static int sum2(int... numbers){
        int total=0;
        for(int number:numbers){
            total+=number;
        }
        return total;
    }
}
