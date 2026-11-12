import java.util.Scanner;

public class UserScannerInput {
    public static void main(String[] args) {
       /* Scanner sc = new Scanner(System.in);

        System.out.print("Enter price: ");
        double price = sc.nextDouble();

        System.out.print("Enter quantity: ");
        int quantity = sc.nextInt();
        sc.nextLine();
        
        System.out.print("Enter product name: ");
        String name = sc.nextLine();

        double total = price * quantity;
        System.out.println(name + " total = " + total);

        sc.close();*/
    	
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Enter first number: ");
    	int firstNum = sc.nextInt();
    	System.out.println("Enter second number: ");
    	int secondNum = sc.nextInt();
    	System.out.println("Sum is: "+ (firstNum+secondNum));
    	System.out.println("Difference is: "+ (firstNum-secondNum));
    	System.out.println("Product is: "+ (firstNum*secondNum));
    	System.out.println("Quotient is: "+ (firstNum/secondNum));
    	System.out.println("Remainder is: "+ (firstNum%secondNum));
    	
    	System.out.println("Enter a number greater than 0: ");
    	int enteredNumber = sc.nextInt();
    	String evenOrOdd = (enteredNumber % 2 == 0)? "Even number" : "Odd number";
    	System.out.println(evenOrOdd);
    	
    	System.out.println("Enter product price: ");
    	double productPrice = sc.nextDouble();
    	System.out.println("Enter product quantity: ");
    	int productQty = sc.nextInt();
    	double totalAmount = productPrice * productQty;
    	System.out.println("Total amount: " + totalAmount);
    	double finalAmount = (totalAmount > 1000)? totalAmount - totalAmount*.1 : totalAmount;
    	System.out.println("Final Amount after discount(if eligible): " +finalAmount);
    	
    	//swapping without third variable

    	int a = 10;
    	int b = 20;
    	System.out.println("Before swapping: "+a+" "+b);
    	a = a+b;
    	b = a-b;
    	a = a-b;
    	System.out.println("After swapping: "+a+" "+b);
    	
    	//swapping with third variable
    	System.out.println("Enter first number: ");
    	int x = sc.nextInt();
    	System.out.println("Enter second number: ");
    	int y = sc.nextInt();
    	System.out.println("Before swapping: "+x+" "+y);
    	int z = x;
    	x = y;
    	y = z;
    	System.out.println("After swapping: "+x+" "+y);
    	
    	System.out.println("Enter a number: ");
    	int originalNumber = sc.nextInt();
    	int lastDigit = originalNumber%10;
    	int newNumber = originalNumber/10;
    	System.out.println("Last digit of the Original number: " +lastDigit);
    	System.out.println("New number after removing last digit from Original number: " +newNumber);

    			
    			
    			
    			
   
    	


    	

    	
    	
    }
}