import java.util.Optional;

public class Main {
    public static void main(String[] args) {

        String message = "Herkesin vardır bir derdi";
        System.out.println(message);
        System.out.println(message.length());
        System.out.println(message.charAt(4));
        System.out.println(message.concat(" dedi yazar"));
        System.out.println(message.startsWith("H"));
        System.out.println(message.endsWith("i"));
        char[] chars = new char[5];
        message.getChars(0,5,chars,0);
        System.out.println(chars);
        System.out.println(message.indexOf("a"));
        System.out.println(message.lastIndexOf("a"));

        System.out.println(message.replace(' ','-'));
        System.out.println(message.substring(5));
        System.out.println(message.substring(2,5));

        for (String sentence: message.split("")) {
            System.out.println(sentence);

        }
        System.out.println(message.toLowerCase());
        System.out.println(message.toUpperCase());


    }
}