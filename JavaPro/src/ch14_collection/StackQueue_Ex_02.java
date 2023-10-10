package ch14_collection;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StackQueue_Ex_02 {
	public static void main(String[] args) {
			Stack<String> st = new Stack<String>();
			Queue<String> q = new LinkedList<String>();
			//Queue 인터페이스의 구현제인 LinkedList 사용
			st.push("0"); st.push("1");	st.push("2");
			q.offer("0"); q.offer("1"); q.offer("2");
			
			System.out.println("= Stack =");
			while(!st.empty()) {
				System.out.println(st.pop());
			}
			
			System.out.println("= Queue =");
			while(!q.isEmpty()) {
				System.out.println(q.poll());
			}
		
		
		
	}

}
