import java.util.Scanner;

public class ReverseString
{
    public static void main(String[] args)
    {
        System.out.println("Enter string to reverse: ");

        Scanner read = new Scanner(System.in);
        String str = read.nextLine();
        String reverse = "";

        for(int i = str.length() - 1; i>= 0; i--)
        //reads the string you put in and counts the characters starting from the end, going backwards
        {
            reverse = reverse + str.charAt(i);
            //starts reading from the end
        }
        System.out.println("Reversed string is: ");
        System.out.println(reverse);
    }
}