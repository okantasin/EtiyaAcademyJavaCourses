public class Main {
    public static void main(String[] args) {

        String[][] cities = new String[3][3];
        cities[0][0] ="Ankara";  cities[0][1] ="Ankara";  cities[0][2] ="Ankara";
        cities[1][0] ="Ankara";  cities[1][1] ="Ankara";  cities[1][2] ="Ankara";
        cities[2][0] ="Ankara";  cities[2][1] ="Ankara";  cities[2][2] ="Ankara";

        for(int i = 0 ; i<=2;i++){
            for(int j=0; j<=2;j++){
                System.out.println(cities[i][j]);
            }
        }

    }
}