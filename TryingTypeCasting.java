// A. Converting a float to int type.

public class TryingTypeCasting {
	public static void main(String[] args) {
		
		double doubleValue = 1500.50;
		System.out.println("The value without 'type casting': " + doubleValue);
		int valueConvertedToInt = (int) doubleValue;
		System.out.println("Type casting: " + valueConvertedToInt);
	}
}