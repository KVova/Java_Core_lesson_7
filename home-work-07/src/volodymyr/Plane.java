package volodymyr;

import java.text.DecimalFormat;

public abstract class Plane {

	private int lenght;
	private int width;
	private int weight;
	private AirplaneControl airplaneControl;
		
	public Plane(int lenght, int width, int weight, /*int ready, double fly,*/AirplaneControl airplaneControl) {
		super();
		this.lenght = lenght;
		this.width = width;
		this.weight = weight;
//		this.ready = ready;
//		this.fly = fly;
		this.airplaneControl = airplaneControl;
	}

	public int getLenght() {
		return lenght;
	}

	public void setLenght(int lenght) {
		this.lenght = lenght;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public AirplaneControl getAirplaneControl() {
		return airplaneControl;
	}

	public void setAirplaneControl(AirplaneControl airplaneControl) {
		this.airplaneControl = airplaneControl;
	}

	//[0;1) //0*68=0+20=20 //1*68=68+20=88 //[20;88]
	void StartEngine() {
		System.out.println("Time to fly " + (20 + (int)(Math.random() * 68)) +" sec.");
	}
	
	void DrivePlane() {
		DecimalFormat dFormat = new DecimalFormat("#.##");
		System.out.println("Plane will be driving with full fuel tank " +dFormat.format(Math.random() * 1000)+" kilometers");
	}
	
	//abstract void planeLanding(String landing);
	void planeLanding() {
		System.out.println("The plane is landing");
	}
}
