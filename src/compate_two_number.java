import java.util.Scanner;

public class compate_two_number {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int num1 = in.nextInt();
        int num2 = in.nextInt();

        in.close();

        if(num1>num2) System.out.print(">");
        else if(num1<num2) System.out.println("<");
        else System.out.println("==");
    }
}
