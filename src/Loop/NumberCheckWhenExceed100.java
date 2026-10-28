// Question: How can a program read numbers until a negative value and report the minimum and maximum?
package Loop;
//A program which reads a sequence of positive integers and stop when the user fills a negative value and show the user his max and min nuber in the sequence

import java.util.Scanner;

public class NumberCheckWhenExceed100 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your numbers");
        int n = s.nextInt();
        int max = n;
        int min = n;

        if (n>=0){
            while(true){
                n = s.nextInt();
                if (n<0)
                    break;

//                if (n>max)
//                    max = n;
                //if max is assign to a ternary operator ; max = if n > max then max = n else max = max
                max = n > max? n : max;
                min = n < min? n : min;
//
//                if (n<min)
//                    min = n;
            }
            System.out.println("min ="+min + " max = "+max );
        } else
            System.out.println(n + "is invalid");
    }
}
