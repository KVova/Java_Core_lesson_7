package volodymyr;

public class AirplaneControl {
	
//	int distance = 20 + (int) Math.random() * 68; 
//	//[0;1) //0*68=0+20=20 //1*68=68+20=88 //[20;88]
	
//
//	public int getDistance() {
//		return distance;
//	}
//
//	public void setDistance(int distance) {
//		this.distance = distance;
//	}
	
	//int distance = (int) Math.random() * 100;
	
	void up() {
		System.out.println("Plane is moving UP : " +(int)(Math.random() * 1000)+" kilometers");
	}
	
	void down() {
		System.out.println("Plane is moving DOWN : " +(int) (Math.random() * 1000)+" kilometers");
	}
	
	void left() {
		System.out.println("Plane is moving LEFT : " +(int) (Math.random() * 1000)+" kilometers");
	}
	
	void right() {
		System.out.println("Plane is moving RIGHT : " +(int) (Math.random() * 1000)+" kilometers");
	}
	
}
