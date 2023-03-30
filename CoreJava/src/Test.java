
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] numbers= {2,3,4,5};
		
		System.out.println("##### Before Swap");
		System.out.println(numbers[0]);
		System.out.println(numbers[1]);
		
		numbers[0]= numbers[0]+numbers[1];
		numbers[1] = numbers[0]-numbers[1];
		numbers[0] = numbers[0]-numbers[1];
		System.out.println("##### After Swap");
		System.out.println(numbers[0]);
		System.out.println(numbers[1]);
		
		for (int i : numbers) {
			System.out.print(i);
		}

	}

}
