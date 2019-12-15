package volodymyr;

public class Su_27 extends Plane implements Special{

//	int nuclearWarheads;
	int maxPlaneSpeed;
	String planeName;
//	int speed;

//	public Su_27(int lenght, int width, int weight, int ready, double fly, AirplaneControl airplaneControl,
//			int nuclearWarheads, int maxPlaneSpeed, int speed) {
//		super(lenght, width, weight, ready, fly, airplaneControl);
//		this.nuclearWarheads = nuclearWarheads;
//		this.maxPlaneSpeed = maxPlaneSpeed;
//		this.speed = speed;
//	}

//	@Override
//	public void turboBust() {
//		if (maxPlaneSpeed <= Math.random() * speed) {
//			System.out.println("The plane not use turbo Bust...");
//		}
//		else {
//			System.out.println("The plane use turbo bust during " +(Math.random() * maxPlaneSpeed + speed)+" sec.");
//		}
//	}

	public int getMaxPlaneSpeed() {
		return maxPlaneSpeed;
	}

	public Su_27(int lenght, int width, int weight, AirplaneControl airplaneControl, int maxPlaneSpeed, String planeName) {
	super(lenght, width, weight, airplaneControl);
	this.maxPlaneSpeed = maxPlaneSpeed;
	this.planeName = planeName;
	}

	public void setMaxPlaneSpeed(int maxPlaneSpeed) {
		this.maxPlaneSpeed = maxPlaneSpeed;
	}

	public String getPlaneName() {
		return planeName;
	}

	public void setPlaneName(String planeName) {
		this.planeName = planeName;
	}

	@Override
	public void turboBust() {
		System.out.println("The plane use turbo bust during " +(int)(Math.random() * maxPlaneSpeed + maxPlaneSpeed)+" sec.");
	}
		
	@Override
	public void stealthTechnology() {
		System.out.println("The plane is not visible during "+(int)(Math.random()*60)+" sec.");
	}

	@Override
	public void nuclearStrike() {
		//nuclearWarheads = (int) Math.random() * 10;
		System.out.println( "Overthrown " +(int) (Math.random() * 10)+" number of nuclear warheads.");
	}

}