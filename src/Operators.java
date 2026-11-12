
public class Operators {

	public static void main(String[] args) {
		
		int a = 5;
		System.out.println(a++);
		System.out.println(a);
		System.out.println(++a);
		System.out.println(a++ + a);
		
		 int i = 5;
		 i = i++;
		 System.out.println(i);
		 i = ++i;
		 System.out.println(i);
		 
		 int x = 10;
		 x += 5.5; //hidden casting is there. so no error. value is 15
		 System.out.println(x);
		 
		 int y = 10;
		 //y = y + 5.5;  compile error
		 System.out.println(y); 



	}

}
