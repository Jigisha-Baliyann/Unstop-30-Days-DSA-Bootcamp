// https://unstop.com/courses/unstop-practice-interview-pep/30-days-dsa-bootcamp/day-introduction-to-programming-37651/coding-question-37719

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Main {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ct = 0;
        int num = 2;
        while (ct<n) {
            if (isPrime(num)) 
                ct++;
            num++;
        }
        num--;
        System.out.println(num*num);
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
}

// Execution Time = 0.101 seconds
// Testcase Passed = 12/12
// score = 100
