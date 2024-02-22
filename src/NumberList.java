import java.util.Scanner;

public class NumberList {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String  numbers = "";
        while (true){
            System.out.println("Enter a number-> ");
            int number = input.nextInt();
            System.out.println("Do you want to input again ( y/n) -> ");
            String ask = input.next();
            numbers = numbers+ " " + number;
            if(ask.equalsIgnoreCase("y")){
               continue;
            }else break;
        }
        System.out.println("[ "+numbers+ " ]");
    }
}