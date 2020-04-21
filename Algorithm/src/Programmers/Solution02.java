/**
 * Programmers 연습문제
 * 정수 n을 입력받아 n의 약수를 모두 더한 값을 리턴하는 함수
 */
package Programmers;

import java.util.Scanner;

public class Solution02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = 0;
		for(int i = 1; i<=n;i++) {
			if(n%i ==0) {
				sum += i;
			}
		} System.out.println(sum);
}
}
