/**
 * 프로그래머스 - 완주하지못한 선수
 */
package Programmers;

public class Solution05 {
public static void main(String[] args) {
	String[] part = new String[] {"nick","teo","anna"};
	String[] compl = new String[] {"nick","anna"};
	int i ;
	for (i=0; i<compl.length;i++) {
		if(!part[i].equals(compl[i])) {
			System.out.println(part[i]);
		}
	}
	
	
}
}
