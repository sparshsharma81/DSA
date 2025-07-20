// package dsa-git.codeforce.A. Only One Digit;
/*
 You are given an integer x
. You need to find the smallest non-negative integer y
 such that the numbers x
 and y
 share at least one common digit. In other words, there must exist a decimal digit d
 that appears in both the representation of the number x
 and the number y
.

Input
The first line contains an integer t
 (1≤t≤1000
) — the number of test cases.

The first line of each test case contains one integer x
 (1≤x≤1000
).

Output
For each test case, output one integer y
 — the minimum non-negative number that satisfies the condition.
 */
import java.util.*;
public class Main {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int x = sc.nextInt();
            int min = Integer.MAX_VALUE;
            while(x!=0){
                int a = x%10;
                min = Math.min(a,min);
                x/=10;
            }
            System.out.println(min);
        }
    }
}
