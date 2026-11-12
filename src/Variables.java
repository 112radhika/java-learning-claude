public class Variables {
    public static void main(String[] args) {
        /*String productName = "Laptop";
        double price = 55000.50;
        int quantity = 2;
        boolean inStock = true;
        char grade = 'A';

        double total = price * quantity;

        System.out.println("Product: " + productName);
        System.out.println("Total: " + total);
        System.out.println("In stock: " + inStock);

        // Casting
        int roundedTotal = (int) total;
        System.out.println("Rounded total: " + roundedTotal);

        // String + number
        System.out.println("Quantity: " + quantity + 1);   // observe the output!
        System.out.println("Sum: " + (quantity + 1));      // and this one
        
        int a = 10;
        int b = 3;
        System.out.println((double)a / b);
        
        System.out.println("Total: " + 5 + 3);
        System.out.println(5 + 3 + " Total");
        
        byte p = 10;
        p = (byte)(p + 5);
        System.out.println(p);
        
        char c = 'A';
        System.out.println(c+1); //The char is promoted to int using its ASCII value (A = 65).
    */
    	
    	String name = "Ram";
    	double price = 50.50;
    	int quantity = 5;
    	boolean in_stock = true;
    	System.out.println("Name : " +name);
    	System.out.println("Price : " +price);
    	System.out.println("Quantity : " +quantity);
    	System.out.println("In stock : " +in_stock);
    	
    	double totalPrice = price * quantity;
    	System.out.println("Total : " +totalPrice);
    	
    	double r = 99.99;
    	System.out.println(r);
    	int s = (int)r;
    	System.out.println(s);
    	
    	int alphabet = 'A';
    	System.out.println(alphabet); //ASCII value is printed;
    	
    	/*int x = 10.5;
    	long big = 9876543210;
    	String s = 'Hello';*/
    }
}