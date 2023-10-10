package ch15_lambda;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import java.util.stream.Collectors;

public class LambdaStream_Ex_01 {
	static String carName = "BMW";
	static int con = 1;
	
	public static void main(String[] args) throws FileNotFoundException{
	
		BufferedReader br = new BufferedReader(new FileReader("src/ch14_collection/car.txt"));
		br.lines()
				.map(s->new Product(s))
				.filter(s->s.getCarname().equals(carName)&&s.getCon()==con)
				.forEach(s->System.out.println(s));	
		System.out.println("==================================================");
		
		Scanner scan = new Scanner(new File("src/ch14_collection/car.txt"));
		scan.tokens()
		.map(s->new Product(s))
		.collect(Collectors.groupingBy(s->s.getMon()))
		.forEach((k,v)->{
			System.out.println(k+"월>");
			for(Product p : v) {
				System.out.println(p);
			}
		});
	}}

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
		
		try {   
		this.remark = str[4];	
		}catch(Exception e) {
			remark=" ";
		}}		
	

	

	public String getCarname() {
		return carname;
	}




	public void setCarname(String carname) {
		this.carname = carname;
	}




	public String getRemark() {
		return remark;
	}




	public void setRemark(String remark) {
		this.remark = remark;
	}




	public int getMon() {
		return mon;
	}




	public void setMon(int mon) {
		this.mon = mon;
	}




	public int getQty() {
		return qty;
	}




	public void setQty(int qty) {
		this.qty = qty;
	}




	public int getCon() {
		return con;
	}




	public void setCon(int con) {
		this.con = con;
	}




	@Override
	public String toString() {
		return "Product [mon=" + mon + ", con=" + con + ", " + (carname != null ? "carname=" + carname + ", " : "")
				+ "qty=" + qty + ", " + (remark != null ? "remark=" + remark : "") + "]";
	}
	
	
	
}
