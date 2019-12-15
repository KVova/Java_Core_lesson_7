package volodymyr;

public class Application {

	public static void main(String[] args) {
		
		Su_27 planeSu_27 = new Su_27(52, 23, 23000, new AirplaneControl(), 305, "Oplot");
		
		planeSu_27.StartEngine();
		planeSu_27.DrivePlane();
		planeSu_27.getAirplaneControl().up();
		planeSu_27.getAirplaneControl().left();
		planeSu_27.getAirplaneControl().down();
		planeSu_27.getAirplaneControl().right();
		planeSu_27.stealthTechnology();
		planeSu_27.nuclearStrike();
		planeSu_27.turboBust();
		planeSu_27.planeLanding();
		
	}
	
}
