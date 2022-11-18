public class Main {
    public static void main(String[] args) {
        int[] numbers = new int[]{1,2,3,4,5,6,7};
        int findNumber=5;
        boolean isPresent= false;

        for(int number:numbers){
            if(number==findNumber){
                isPresent=true;
                break;
            }
        }
        if (isPresent = true) {
            System.out.println("Number is present");
        }else{
            System.out.println("Number not found");
        }
    }
}