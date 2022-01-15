import java.util.Scanner;

public class calculator {
	public static void main(String[] args) {
		char operator;
		double num1,num2,result;
		
		//Creating an object of scanner class
		Scanner input=new Scanner(System.in);
		
		//asking user to choose the operator
		System.out.println("Choose an operator:+,-,*or/");
		operator=input.next().charAt(0);
		
		//Asking users to enter the numbers
		System.out.println("Enter the first number");
		num1=input.nextDouble();
		
		System.out.println("Enter the second number");
		num2=input.nextDouble();
		
		switch(operator) {
		
		//addition
		case'+':
			result=num1+num2;
			System.out.println(num1+"+"+num2+"="+result);
			break;
			
			//Subraction
		case'-':
			result=num1-num2;
			System.out.println(num1+"-"+num2+"="+result);
			break;
			
			//multiplication
		case'*':
			result=num1*num2;
			System.out.println(num1+"*"+num2+"="+result);
			break;
			
			//Division
		case'/':
			result=num1/num2;
			System.out.println(num1+"/"+num2+"="+result);
			break;
			
			default:
				System.out.println("Invalid operator.Enter the proper operator");
				break;
		}
		
		input.close();
	}

}
