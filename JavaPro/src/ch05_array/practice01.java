package ch05_array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class practice01 {
/*
 * 로또번호
 */
	public static void main(String[] args) {
		int[] balls = new int[45];
		int[] lotto = new int[6];
		for(int i=0; i<balls.length; i++) {
			balls[i] = i + 1;}
			
		for(int i=0; i<1000; i++) {
			int f=(int)(Math.random()*45);
			int t=(int)(Math.random()*45);
			
		int temp = balls[f];
		balls[f] = balls[t];
		balls[t] = temp;
					
		}
		
		for(int i=0; i<lotto.length; i++) {
			lotto[i]=balls[i];
		}
		
//		Arrays.sort(lotto);
//		for(int b : lotto) {
//			System.out.print(b+",");
//		}
//		System.out.println();
		
		for(int b=0; b<lotto.length; b++) {
			System.out.print(lotto[b]+",");
		}
		System.out.println();

		for(int i=0; i<lotto.length; i++) {
			boolean change = false;
			for(int j=0; j<lotto.length-1-i; j++) {
				if(lotto[j]>lotto[j+1]) {
					int temp = lotto[j];
					lotto[j] = lotto[j+1];
					lotto[j+1] = temp;
					change = true;
				}
//				System.out.println(lotto[i]+","+lotto[j]);
				
			}
			
				
				
				
			if(!change) break;
				for(int b : lotto) {
					System.out.print(b+",");
				}
				System.out.println();
			}
		}
		
		
		
		
		
		
		
	}


