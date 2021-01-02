package conditionalOperators;

public class SwitchCaseStatements {
	public static void main(String[] args) {
		int dayOfWeek=3;
		switch(dayOfWeek) {
		case 1:
			System.out.println("I am on leave");
			break;
		case 2:
			System.out.println("I am at office");
			break;
		case 3:
			System.out.println("I will attend meeting");
			break;
			default:
				System.out.println("Holiday");
		}
		
	}
}
