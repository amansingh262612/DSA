import java.util.Scanner;
import java.math.*;

public class loops {
    public static void main(String[] args) {
        // int age = 23;
        // String check = (age > 18) ? "is Adult" : "Under age!!";
        // System.out.println(check);

        // char x = 'a';
        // char y = 'b';
        // int b = x;
        // int c = (x + y + 95);
        // System.out.println(b);
        // System.out.println(c);

        // --------------------------------
        // int nos = 2367;
        // int temp = 0;
        // int rev = 0;
        // do {
        // temp = nos % 10;
        // rev = (rev * 10) + temp;
        // nos /= 10;
        // } while (nos > 0);
        // System.out.println(rev);

        // -------------------
        // int nos = 0;
        // for (int i = 0; i < 5; i++) {
        // System.out.println("nos is: " + nos);
        // nos++;
        // if (nos >= 3) {
        // System.out.println("nos is: " + nos);
        // break;
        // }
        // }

        // ----------------------------
        /* Q- keep entering the nos until user enter element multiple of 10 */

        Scanner sc = new Scanner(System.in);
        int nos;

        // do {
        // System.out.println("enter the value :");
        // nos = sc.nextInt();
        // System.out.println("Value entered in nos is :" + nos);
        // if (nos % 10 == 0) {
        // System.out.println("the entered nos is muliple of 10: " + nos);
        // break;
        // }

        // } while (nos >= 0);

        // ----------------------------
        // do {
        // System.out.println("Enter nos");
        // nos = sc.nextInt();
        // if (nos % 10 == 0) {
        // // System.out.println("since its a multiple of 10 so : " + nos);
        // continue;
        // }
        // if (nos < 0) {
        // break;
        // }
        // System.out.println("Entered nos is :" + nos);
        // System.out.println("Enter negetive value to exit !");
        // } while (nos >= 0);

        // ------------------------
        // for prime check in Single entery Element
        // int count = 0;
        // System.out.println("Enter nos :");
        // nos = sc.nextInt();
        // if (nos == 1 || nos == 0) {
        // System.out.println("not prime or is composite nos");
        // }
        // for (int i = 2; i < nos; i++) {
        // if (nos % i == 0) {
        // count++;
        // System.out.println("Not prime");
        // }
        // }
        // if (count == 0) {
        // System.out.println("is Prime");
        // }
        // }

        // ---------------------
        // PRime check in Array and printing all the prime values :

        // int arr[] = { 3, 2, 13, 6, 7, 12 };

        // // outer loop for nos selection :
        // for (int i = 0; i < arr.length; i++) {
        // int temp = arr[i];
        // int count = 0;
        // // inner code for Prime nos checking :
        // if (temp == 0 || temp == 1) {
        // System.out.println("is composite nos");
        // }
        // for (int x = 2; x < Math.sqrt(temp); x++) {
        // if (temp % x == 0) {
        // count += 1;
        // System.out.println("is not prime");
        // temp = 0;
        // }
        // }
        // if (count == 0) {
        // System.out.println("is prime ");
        // }

        // }

        // ------------------------

    }
}