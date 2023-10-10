package ch08_interface;
public class Ex_Interface_02 {
	public static void main(String[] args) {
			Tank t = new Tank();
			DropShip d = new DropShip();
			Marine m = new Marine();
			AsCenter as = new AsCenter();
			as.repair(t);
			as.repair(d);
			as.repair(m);
	}}
interface Repairable{}

class Unit{
	int hp;
	final int MAX;
	Unit(int hp) {
		super();
		this.hp = hp;
		MAX = hp;	}	}

class AirUnit extends Unit{
	AirUnit(int hp){ super(hp); }}
class GrandUnit extends Unit{
	GrandUnit(int hp) {
		super(hp);	}	}
class Tank extends GrandUnit implements Repairable{
	Tank() {		super(150);	}
	public String toString() {
		return "Tank";	}}
class DropShip  extends GrandUnit implements Repairable{
	DropShip() {		super(125);}
	public String toString() {
		return "DropShip";	}}
class Marine  {
	public String toString() {
		return "Marine";	}}
class AsCenter{
	void repair(Object r) {
		if(r instanceof Repairable) {
			System.out.println(r+"이(가) 수리 되었습니다");
		}else {
			System.out.println(r+"은 수리 할 수 없습니다.");
		}		}
}






//class AsCenter extends Unit{  // 내가 해본거
//	int Unit;					// Unit 들어있는게 탱크랑 드랍쉽 밖에 없다.
//	AsCenter(int hp) {			// Object 하면 전부 다잡을수있다.
//		super(hp);
//		this.hp = Unit;	}
//	void repair(int hp) {			}}