package Programmers;

import java.util.Scanner;

public class Solution06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int answer = 0;
		if(a>b) {
			for(int i = b; i<=a; i++) {
				answer += i;
			} 
		} else if(a<b) {
			for(int j = a; j<=b; j++) {
				answer +=j;
			}
		} else {
			answer = a;
		}
		System.out.println("answer = "+ answer);
	}
}
