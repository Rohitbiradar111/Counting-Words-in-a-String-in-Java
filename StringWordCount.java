//This program Counts the Number of words in a String in Java

import java.util.Scanner;
public class StringWordCount {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String = ");
        String str = sc.nextLine();
        sc.close();
        int count = 1;
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i) == ' ')
            {
                count = count + 1;
            }
        }
        System.out.println("Number of Words in the String = "+count);
        System.out.println("Length of the String = "+str.length());
    }
}