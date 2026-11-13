import java.util.Scanner;

public class IfElseSwitch {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//Read a number and print whether it is positive, negative, or zero.
		System.out.println("Enter a number: ");
		int number = sc.nextInt();
		if(number>0) {
			System.out.println("Positive number");
		}
		else if(number<0) {
			System.out.println("Negative number");
		}
		else {
			System.out.println("Number is zero");
		}
		
		//Read marks (0-100) and print a grade: 90+ is A, 75+ is B, 50+ is C, 
		//otherwise Fail. Also reject marks below 0 or above 100.
		
		System.out.println("Please enter the marks: ");
		int marks = sc.nextInt();
		if(marks<0 || marks>100) {
			System.out.println("Invalid");
		}
		else if(marks >= 90) {
			System.out.println("Grade A");
		}
		else if(marks >= 75) {
			System.out.println("Grade B");
		}
		else if(marks >= 50) {
			System.out.println("Grade C");
		}
		else {
			System.out.println("Failed");
		}
		
		
		//Read three numbers and print the largest.
		System.out.println("Enter the first number: ");
		int firstNumber = sc.nextInt();
		System.out.println("Enter the second number: ");
		int secondNumber = sc.nextInt();
		System.out.println("Enter the third number: ");
		int thirdNumber = sc.nextInt();
		if(firstNumber > secondNumber) {
			if(firstNumber > thirdNumber) {
				System.out.println(firstNumber + " is the largest");
			}
			else {
				System.out.println(thirdNumber + " is the largest");
			}
		}
		else {
			if(secondNumber > thirdNumber) {
				System.out.println(secondNumber + " is the largest");
			}
			else {
				System.out.println(thirdNumber + " is the largest");
			}
		}
		
		//Read a year and print whether it is a leap year 
		//(divisible by 4 and not by 100, or divisible by 400)
		System.out.println("Enter the year: ");
		int year = sc.nextInt();
		if((year % 4 == 0 && year % 100!= 0) || (year % 400 == 0)){
			System.out.println("Leap year");
		}
		else {
			System.out.println("Not a leap year");
		}
		
		//Read a number 1-7 and print the day name using switch. 
		//Then rewrite it with the arrow form.
		
		System.out.println("Enter a number from 1-7 : ");
		int day = sc.nextInt();
		switch(day) {
		case 1: System.out.println("Monday");
				break;
		case 2: System.out.println("Tuesday");
				break;
		case 3: System.out.println("Wednesday");
				break;
		case 4: System.out.println("Thursday");
				break;
		case 5: System.out.println("Friday");
				break;
		case 6: System.out.println("Saturday");
				break;
		case 7: System.out.println("Sunday");
				break;
		default:System.out.println("Invalid");
		}
		
		//arrow method
		System.out.println("Enter a number from 1-7 : ");
		int day1 = sc.nextInt();
		switch (day1) {
	    case 1 -> System.out.println("Monday");
	    case 2 -> System.out.println("Tuesday");
	    case 3 -> System.out.println("Wednesday");
	    case 4 -> System.out.println("Thursday");
	    case 5 -> System.out.println("Friday");
	    case 6 -> System.out.println("Saturday");
	    case 7 -> System.out.println("Sunday");
	    default -> System.out.println("Invalid");
	}
		
		//Read a browser name and use switch on the String. Test with “Chrome” and “chrome”. 
		//What happens, and how can you fix it? (Hint: .toLowerCase())
		String browser = sc.next().toLowerCase();
		  switch (browser) {
		     case "chrome" -> System.out.println("Launch Chrome");
		     case "firefox" -> System.out.println("Launch Firefox");
		     default -> System.out.println("Unsupported browser");
		  }
			
		sc.close();
	}

}
