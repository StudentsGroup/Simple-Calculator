import java.util.Scanner;
public class BasicCalculator{
		//Function for addition
	public static double addition(double num1, double num2){
		
		return num1 + num2;
	}
	//Function for subtraction
	public static double subtraction(double num1, double num2){
		
		return num1 - num2;
	}
	//Function for multiplication
	public static double multiplication(double num1, double num2){
		
		return num1 * num2;
	}
	//Fuction for division
	public static double division(double num1, double num2){
		
		
		return num1 / num2;
	}
	//Fuction for modulus
	public static double modulus(double num1, double num2){
		
		return num1 % num2;
	}
	
	public static boolean isWholeNumber(double number){
		return Math.floor(number) == number;
	}

	
	//Main Method
	public static void main(String arg[]){
		//For Taking Input
		Scanner input = new Scanner(System.in);
	System.out.print("----------------------| Basic Calculator |---------------------");
		
		System.out.println("\n");
		
		System.out.println("Operations can be performed in this Basic Calculator");
		
		System.out.println("(+) Operator for Addition");
		System.out.println("(-) Operator for Subtraction");
		System.out.println("(*) Operator for Multiplication");
		System.out.println("(/) Operator for Division");
		System.out.println("(%) Operator for Modulus"+"\n");
		
	
		
		
		//Taking Input for the First Number
		System.out.print("Enter First Number: ");
		 double num1 = input.nextDouble();
		
		//Taking Input for the Operator
		System.out.print("Choose Operator: ");
		char operator = input.next().charAt(0);
		
		//Taking Input for the Second Number
		System.out.print("Enter Second Number: ");
		double num2 = input.nextDouble();
		
		double result = 0;
		switch(operator){
			
			case '+':
			
			// Calls the addition function
			result = addition(num1, num2);
			break;
			
			case '-':
			// Calls the subtraction Function
			result = subtraction(num1, num2);
			break;
			
			
			case '*':
			// Calls the multiplication function
			result = multiplication(num1, num2);
			break;
			
			
			case '/':
			
		// Checks the condition for 0
		if(num2 == 0){
			
		// Gives this message
		System.out.println("Error: Division by Zero");
		return;
		}
		
			// Calls the division function
			result = division(num1, num2);
			break;
			
			case '%':
			
			// Calls the modulus function
			result = modulus(num1, num2);
			break;
			
			default:
			
			System.out.println("Invalid Operator!");
		}
		
		//Checks the condition for whole number or decimal number
		if(isWholeNumber(result)){
			
			//Whole number result
			System.out.println("Result: "+ (int)result);
		}
		else{
			
			// Decimal result
			System.out.println("Result: " + result);
		}
		System.out.println("---------------------------------------------------------------");
	}
			}