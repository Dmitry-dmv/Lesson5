package chernyh.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String [] names = {"Gorgiy", "Aleksandr", "Maria", "Olga"};

        String wynik = findLongestName(names);
        System.out.println( wynik);
    }

    public static String findLongestName(String [] names){
        int size = names.length;
        String longestName = names[0];

        for(int i = 0; i <= 3; i++){
            if(names[i].length() > longestName.length()){
                longestName = names[i];
            }}

        return longestName;
    }

}
    public static String getUserInput() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public static boolean checkStringLength (String s) {
        return s.length() == 5;
    }

    public static boolean checkPalindrome(String s) {
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        String reversed = sb.toString();

        return s.equalsIgnoreCase(reversed);
    }

    public static void main(String[] args) {
        String userInput;
        while (true) {
            System.out.println("Dear user, input string length of which is 5");
            userInput = getUserInput();

            if (!checkStringLength(userInput)) {
                System.out.println("String length was not 5");
                continue;
            } else break;
        }
        System.out.println("String " + userInput + " is palindrome: " + checkPalindrome(userInput));
    }
}




public static void main(String[]args){
        function censor(str) {
        return str.replace(/бяка/g, 'вырезано цензурой')
        }

        function mul(str) {
        return str.replace(/\D/g, '').split('').reduce((ml, num) => num * ml)
        }
        }
public static void main(String[]args){

        }
        String a = "HelloHelloHelloHello";
        String b = "Hello";
        int times = 0;
        for (int i = 0; i <= a.length() - b.length(); i++) {
        String substring = a.subString(i, i + b.length());
        if (substring.equals(b)) {
        times = times + 1;
        }
        }
        System.out.println(times);

public static void main(String[] args) {
        String str = "I love Java";
        String[] words = str.split(" ");
        for (String word : words) {
        System.out.println(word);
        }
        }
        }




	// write your code here


