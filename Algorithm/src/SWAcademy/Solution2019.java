package SWAcademy;

import java.util.Scanner;

/**
 * 
 * @author Joo Young Song
 *
	1부터 주어진 횟수까지 2를 곱한 값(들)을 출력하시오.

	주어질 숫자는 30을 넘지 않는다.
 */
public class Solution2019 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int num = 1;
	for(int i = 0; i<= n ; i++) {
		System.out.print(num+" ");
		num = num*2;
	}
}
}
