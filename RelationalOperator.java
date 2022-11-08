package datatype;

public class RelationalOperator {
	public static void main(String[] args) {
		float num1 = 7.8f;
		float num2 = 6.3f;
		boolean isGreater = num1 > num2;
		boolean isLesser = num1 < num2;
		boolean isGreaterEqual = num1 >= num2;
		boolean isLesserEqual = num1 <= num2;
		boolean isEqual = num1==num2;
		boolean isNotEqual = num1 != num2;
		System.out.println(" 5.5 > 6.5 = "+isGreater);
		System.out.println(" 5.5 < 6.5 = "+isLesser);
		System.out.println(" 5.5 is greater than or equal to 6.5 = "+isGreaterEqual);
		System.out.println(" 5.5 is lesser than or equal to 6.5 = "+isLesserEqual);
		System.out.println(" 5.5 is Equal to 6.5 = "+isEqual);
		System.out.println(" 5.5 is is not equal to 6.5 = "+isNotEqual);
		
		
	}

}
