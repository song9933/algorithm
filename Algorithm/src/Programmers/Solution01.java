/**
 * Programmers 연습문제
 * 길이가 n이고, 수박수박수박수....와 같은 패턴을 유지하는 문자열을 리턴하는 함수, solution을 완성하세요. 예를들어 n이 4이면 수박수박을 리턴하고 3이라면 수박수를 리턴하면 됩니다.
 */
package Programmers;

import java.util.Scanner;

public class Solution01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuffer sb = new StringBuffer();
		int n = sc.nextInt();
		String[] arr = {"수", "박"};
		for(int i = 0; i<n ; i++) {
			sb.append(arr[i%2]);
		} System.out.println(sb.toString());
	}
}
