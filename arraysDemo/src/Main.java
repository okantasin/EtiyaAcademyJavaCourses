public class Main {
    public static void main(String[] args) {
        String student1="okan";
        String student2="ozan";
        String student3="Ahmet";
        String student4="Mehmet";

        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);
        System.out.println(student4);

        String [] students = new String[4];
        students[0]="okan";
        students[1]="ozan";
        students[2]="ahmet";
        students[3]="mehmet";


        for (int i =0; i<students.length; i++){
            System.out.println(students[i]);

        }


    }
}