/*
 memory limit per test256 megabytes
Isa, wanting to join the climbing group Climbing Camels, decided to start climbing mountains. In order to be accepted as a climbing camel, Isa must climb all the available N
 mountains. However, for Isa to be allowed to climb the mountain of a certain level, she must have climbed other easier mountains first.

Your mission is: given the number of mountains and pairs of mountains (A,B)
 where mountain of level A
 must be climbed before mountain of level B
 determine the lexicographically smallest order in which Isa can climb all the mountains and become a climbing camel.

An order A
 is lexicographically smaller than another order B
 if there exists an i
 such that Ai<Bi
 and for all j
 with 1≤j<i
, Aj=Bj
.

Input
The first line contains two integers N
 and M
 (1≤N,M≤2⋅105)
.

In each of the next M
 lines, two integers A
 and B
 (1≤A<B≤N)
 are given, where in order to climb the mountain of level B
, Isa must first have climbed the mountain of level A
. Certainly A<B
, because a lower difficulty level is easier to climb .

Output
Print N
 numbers representing the lexicographically smallest order that Isa must follow to become a climbing camel, or −1
 if there is no existing order that allows Isa to climb all the mountains.


 */
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
    }
}
