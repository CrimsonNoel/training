package ch14_collection;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/*
 * Set 예제 : 중복불가, 정렬
 * Lotto 번호(1~45) 생성기 Set 이용하여 출력하기
 */
public class Ex_Collection_03 {

	public static void main(String[] args) {
			Set<Integer> lotto = new TreeSet<Integer>(); // Hash가 아니네?
			while(lotto.size()<6) {
				lotto.add((int)(Math.random()*45+1));
				             // ( Math ) Math 괄호 안하면 답이안나온다? 괄호 인트떄문인듯
			}
			System.out.println(lotto);}}
			
			