// https://unstop.com/courses/unstop-practice-interview-pep/30-days-dsa-bootcamp/day-introduction-to-programming-37651/coding-question-37724

import java.util.Scanner;

public class Main {
    public static int countBraveSoldiers(int n) {
        // Write your logic here.
        int ct = 0;
        for (int i=0; i<n; i++)
            if (isPrime(i) && !isPerfectSquare(i))
                ct++;
        return ct;
    }
  
    public static boolean isPrime(int num) {
        if (num<2) return false;
        if (num==2 || num==3) return true;
        for (int i=2; i*i<=num; i++) {
            if (num%i==0)
                return false;
        }
        return true;
    }
  
    public static boolean isPerfectSquare(int num) {
        if (num==1) return true;
        else if (num==2 || num==3) return false;
        for (int i=2; i*i<=num; i++) {
            if (i*i == num)
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); // no. of soldiers in army
        int result = countBraveSoldiers(n);
        System.out.println(result);
    }
}

// Execution Time = 0.251 seconds
// Testcase Passed = 12/12
// score = 100

