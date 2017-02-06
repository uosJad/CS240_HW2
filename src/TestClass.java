import java.util.Random;


public class TestClass {

	public static void main(String[] args) {
		stackArrayTest();

		
		
		
		
		
		
	}
	
	public static void stackArrayTest(){
		// test stack array
		StackInterface<Integer> tempSA = new StackArray<>();
		
		for (int i = 0; i < 10; i++){
			int t = new Random().nextInt(100);
			tempSA.push(t);
			System.out.print(t+ " ");
		}
		System.out.println();
		//System.out.println(tempSA.pop());
		
		for (int i = 0; i < 5; i++){
			System.out.print(tempSA.pop()+ " ");
		}
		System.out.println();
		
		for (int i = 0; i < 5; i++){
			int t = new Random().nextInt(100);
			tempSA.push(t);
			System.out.print(t+ " ");
		}
		
		System.out.println();

		for (int i = 0; i < 10; i++){
			System.out.print(tempSA.pop()+ " ");
		}
	}

	
	
}
