public class Main {
    public static void main(String[] args) {
        CustomerManager customerManager = new CustomerManager();
        customerManager.add();
        customerManager.delete();
        customerManager.update();

/*Class referans tiptir
 *Bellekte oluşturulur
 * Stack -> CustomerManager tanımlanır
 * Heap  -> new CustomerManager();
 */


        //value
        int number1=10;
        int number2=20;
        number2=number1;
        number1=30;
        System.out.println(number2);

        int[] ints=new int[]{1,2,3};
        int[] ints1 = new int[]{4,5,6};
        ints1=ints;
        ints[0]=10;
        System.out.println(ints1[0]);
    }

}