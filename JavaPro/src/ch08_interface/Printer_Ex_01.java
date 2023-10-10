package ch08_interface;
public class Printer_Ex_01 {
	public static void main(String[] args) {
		Printerable able = PrinterManager.getPrinter("INK");
		able.print();
		able = PrinterManager.getPrinter("LAZER");
		able.print();
		}}

class PrinterManager{
	
	public static Printerable getPrinter(String type) {
//		Printerable p = new Inkzer();
		
		if (type.equals("INK"))
			return new InkZet();
		else
			return new LazerZet();
	}}
interface Printerable{
	void print();
}
class InkZet implements Printerable{

	@Override
	public void print() {
		System.out.println("잉크젯 Pinter에서 출력함");
	}}
class LazerZet implements Printerable{

	@Override
	public void print() {
		System.out.println("레이저젯 Pinter에서 출력함");
	}}