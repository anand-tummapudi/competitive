
public class Fibanasi {

	public static void main(String[] args) {
		int n = 5;
		System.out.println("Find - "+n+"th element of the fibanassi series");
		
		System.out.println("Result:"+fib(n));
	}
	
	static int fib(int n){
		if(n<=1)
			return n;
		else return fib(n-1)+fib(n-2);
		
	}

}
