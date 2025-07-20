// package dsa-git.codeforce.Sum;

/*
 A. Sum
time limit per test1 second
memory limit per test256 megabytes
You are given three integers a
, b
, and c
. Determine if one of them is the sum of the other two.

Input
The first line contains a single integer t
 (1≤t≤9261
) — the number of test cases.

The description of each test case consists of three integers a
, b
, c
 (0≤a,b,c≤20
).

Output
For each test case, output "YES" if one of the numbers is the sum of the other two, and "NO" otherwise.

You can output the answer in any case (for example, the strings "yEs", "yes", "Yes" and "YES" will be recognized as a positive answer).
 */
import java.util.*;
public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            if(a+b ==c || a+c ==b || b+c == a)System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
