//yo
/*
    hello word
 */

import java.lang.Math;
import java.util.Scanner;// importing scanner class for using input feature of java language


public class HelloWorld {

    public static void  main(String args[]){

        System.out.print("HEllo World ".indexOf("ld")); //prints index of "ld" without any newline print
        System.out.println(" sameer!!".charAt(5));//prints letter at 5th index with newline println

        Scanner inp = new Scanner(System.in); // creating object of scanner class

        System.out.print("enter value: ");
        String a = inp.next();// or .nextInt(); if data_type is int. This stores value give in "a" .nextInt() is a method in scanner class for integer input

        System.out.println(a);

        var.hey(); // since hey() is not a static method it can't be called inside a static method
    }
    public void hey() {

        for (int o = 0; o < 2; ++o) {
            System.out.println("hey how are you");
        }

        int x =2;
        x = (int)Math.pow((double)x,(double)3); // type casting double to integer

        System.out.println(x + "sam");
    }

    static HelloWorld  var = new HelloWorld(); // that's how you create an object

}
