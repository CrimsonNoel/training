package ch14_collection;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
// Product(mon,con,carname,qty,remark);


public class Ex_Collection_05 {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner scan = new Scanner(new File("src/ch14_collection/car.txt"));
		List<Product> li = new ArrayList<Product>();
		while(scan.hasNext()){
			String line = scan.nextLine();
			String[] str = line.split(",");
			Product pd = new Product(line);		
			li.add(pd);
//			System.out.println(pd);
		}
		
		System.out.println("1) 월별 리스트");
		Iterator<Product> it = li.iterator();
		// map(mon,list)
		Map<Integer, List<Product>> map1 = new HashMap<>();
		while(it.hasNext()) {
			Product p = it.next();
			if(!map1.containsKey(p.mon)) {
				map1.put(p.mon, new ArrayList<Product>());		}
			// ArrayList에 추가한 값을 if에서 빠져나온뒤 map1에 추가한다 아니면 while문안에서 계속 돌아서 if찍힐떄마다 추가된다.
			    map1.get(p.mon).add(p);
		}
//			System.out.println(map1);
			for(Integer m : map1.keySet()) {
				System.out.println(m+"월");
				List<Product> li1 = map1.get(m); 
				// m은 map1의 value값. return타입이 List<Product>
				for(Product p1 : li1) {
					System.out.println(p1);
				}	}
			System.out.println("2) 월별 \t 생산 \t 판매\t 반품 합계현황");
			// 생산1;  판매2;	 반품3;
			Iterator<Product> it2 = li.iterator();
			Map<Integer, int[]> map2 = new HashMap<>();
			
			while(it2.hasNext()) {
				Product p = it2.next();
				if(!map2.containsKey(p.mon)) {
					map2.put(p.mon, new int[3]);		}
				map2.get(p.mon)[p.con-1]+=p.qty;
			}
			for(Integer m : map2.keySet()) {
				System.out.print("   "+m+"월:\t");
				int[] arr = map2.get(m); 
				for(int p1 : arr) {
					System.out.print(" "+p1+"\t");
				}
				System.out.println();
				}
			
			System.out.println("3) 제품별 총 생산,판매,변동 현황");
			it = li.iterator(); // iterator은 한번쓰면 작동안함.대신 다시 주소를 만들어주면 거기서또 사용가능
			Map<String, int[]> map3 = new HashMap<>();
			while(it.hasNext()) {
				Product p = it.next();
				if(!map3.containsKey(p.carname)) {
					map3.put(p.carname, new int[3]);		}
				map3.get(p.carname)[p.con-1]+=p.qty;
			}
			for(String m : map3.keySet()) {
				System.out.print("   "+m+"월:\t");
				int[] arr = map3.get(m); 
				for(int p1 : arr) {
					System.out.print(" "+p1+"\t");
				}
				System.out.println();
				}
			
			System.out.println("4) 월별 제품별 총 생산, 판매, 변동 현황");
			it = li.iterator(); // iterator은 한번쓰면 작동안함.대신 다시 주소를 만들어주면 거기서또 사용가능
			Map<String, int[]> map4 = new TreeMap<>(); // hashmap도 가능하지만 순서를 재정의해야한다.
			while(it.hasNext()) {					   // treemap으로하면 깔끔하게 순서대로 나온다.
				Product p = it.next();
				String key = (p.mon>9?p.mon+"":"0"+p.mon)+":"+p.carname;
				if(!map4.containsKey(key)) {
					map4.put(key, new int[3]);		}
				map4.get(key)[p.con-1]+=p.qty;
			}
			
			String mon = "";
			for(String m : map4.keySet()) {
				String[] str = m.split(":");
				if(!str[0].equals(mon)) // 괄호 틀리면 넣지말고 해보자.
					System.out.println(str[0]+"월>");
					mon = str[0];
					System.out.print("\t"+str[1]+"\t");
				
				int[] arr = map4.	get(m); 
				for(int p1 : arr) {
					System.out.print(p1+"\t");
				}
				System.out.println();
				}
							
	
	}	}

class Product {
	String carname,remark;
	int mon,qty,con;



	public Product(String line) {
		super();
		String[] str = line.split(",");
		this.mon = Integer.parseInt(str[0]);
		this.con = Integer.parseInt(str[1]);
		this.carname = str[2];
		this.qty = Integer.parseInt(str[3]);
//		this.remark = ((remark!=null)? str[4] : " "); // 삼항안되네?
		
		try {   // remark 예외처리 이용
		this.remark = str[4];	
		}catch(Exception e) {
//			e.printStackTrace();
			remark=" ";
		}}		
	



	@Override
	public String toString() {
		return "Product [mon=" + mon + ", con=" + con + ", " + (carname != null ? "carname=" + carname + ", " : "")
				+ "qty=" + qty + ", " + (remark != null ? "remark=" + remark : "") + "]";
	}
	
	
	
}
