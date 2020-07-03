package SWAcademy;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 
 * @author Joo Young Song
 *
		2개의 수 a, b를 입력 받아, a를 b로 나눈 몫과 나머지를 출력하는 프로그램을 작성하라.
		
		[제약 사항]
		
		각 수는 1이상 10000이하의 정수이다.
		
		
		[입력]
		
		가장 첫 줄에는 테스트 케이스의 개수 T가 주어지고, 그 아래로 각 테스트 케이스가 주어진다.
		
		각 테스트 케이스의 첫 번째 줄에는 2개의 수가 주어진다.

 */
public class Solution2029 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int i = 1; i<=t; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			int fir = a/b;
			int sec = a%b;
			System.out.println("#"+ i + " " + fir +" " + sec);
		}
		
	}
}
