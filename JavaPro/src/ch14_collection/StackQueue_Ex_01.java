package ch14_collection;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/*
 * Stack 클래스 : LIFO(Last in First out) -- class -방 입구가 하나다 차곡차곡 .. 먼저들가면 나중 
 *              Vector 클래스의 하위 클래스임					     나중에 들어가면 먼저나오는
 *     void push(Object)   : 객체를 stack에 저장. 추가.
 *     Object pop()   : stack에서 객체 꺼냄. 리턴. stack에서 객체 제거
 *     Object peek()  : stack에서 객체를 조회.       
 *     
 * Queue 인터페이스 : FIFO (First in First out) -- interface - 입구 출구가있다. 먼저 들가면 먼저 나옴
 *              LinkedList 클래스가 구현함.
 *     void offer(Object)  : 객체를 Queue에 저장. 추가
 *     Object poll()  : 객체를 Queue에서 꺼냄 저장. 리턴. Queue에서 제거        
 *     Object peek()  : Queue에서 객체를 조회.
 *     
 * LinkedList : Queue, List 인터페이스를 모두 구현.           
 */
public class StackQueue_Ex_01 {
	public static void main(String[] args) {
		String cars[] = {"소나타", "그렌져", "SM5", "K9"};
		Stack<String> stack = new Stack<String>();
		for(String s : cars) { stack.push(s);}
		System.out.println("===============================");
		System.out.println("스택에 저장된 객체의 갯수: "+stack.size()+" -> "+stack);
		System.out.println(stack.peek()+" : peek"); 
		//가장 뒤에꺼. 나중에 들어갔으니 먼저 나온다.
		System.out.println("스택에 저장된 객체의 갯수: "+stack.size()+" -> "+stack);
		System.out.println(stack.pop()+" : pop"); 
		System.out.println("스택에 저장된 객체의 갯수: "+stack.size()+" -> "+stack);
		
		Queue<String> queue = new LinkedList<String>();
		for(String s : cars) { queue.offer(s);}
		System.out.println("큐에 저장된 객체의 갯수: "+queue.size()+" -> "+queue);
		System.out.println(queue.peek()+" : peek");
		// 가장 앞에꺼. 먼저 들어간놈이 저 나온다
		System.out.println("큐에 저장된 객체의 갯수: "+queue.size()+" -> "+queue);
		System.out.println(queue.poll()+" : poll");
		System.out.println("큐에 저장된 객체의 갯수: "+queue.size()+" -> "+queue);
		
		
	}

}
