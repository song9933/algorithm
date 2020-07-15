package Programmers;

import java.util.Scanner;

public class Solution07 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int answer = 0;
	for (int i = 2; i<=n ; i++) {
		for(int j = 2; j<=i; j++) {
			if(j == i ) {
				++answer;
			} else if(  i%j == 0) {
				break;
			}
		}
	}
	System.out.println(answer);
}
}
