package ch14_collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Ex_Collection_01 해답
public class Ex_Collection_01_ {

	public static void main(String[] args) {

			int sum = 0;
			List<Integer> li = new ArrayList<>();
			li.add(10);	li.add(40);	li.add(30);	li.add(60);	li.add(30);
			li.add(55);	li.add(70);
		
			for(int n :li) {
				sum+=n;
			}
			System.out.println(li);
			Collections.sort(li);
			System.out.println(li);
			System.out.println("평균: "+sum/li.size());
			System.out.println("중간 숫자:"+li.get(li.size()/2));
	}

}
