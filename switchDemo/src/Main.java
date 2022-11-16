public class Main {
    public static void main(String[] args) {
        char grade = 'A';
        switch(grade){
            case 'A':
                System.out.println("Passed");
                break;
            case'B':
                System.out.println("Passed B");
                break;
            case'C':
                System.out.println("Passed C");
            default:
                System.out.println("Error not found ");
        }
    }
}