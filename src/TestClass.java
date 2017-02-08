import java.util.Random;


public class TestClass {

	public static void main(String[] args) {
		//stackArrayTest();
		//stackTest();
		
		
		
		
		
		
	}
	
	public static void stackTest(){
		//StackInterface<Integer> tempSA = new StackArray<>();
		//StackInterface<Integer> tempSA = new StackVector<>();
		StackInterface<Integer> tempSA = new StackNode<>();
		
		System.out.print("push 12 (last 2 are not added to stack due to size limit): ");
		for (int i = 0; i < 12; i++){
			int t = new Random().nextInt(100);
			tempSA.push(t);
			System.out.print(t+ " ");
		}
		System.out.println();
		//System.out.println(tempSA.pop());
		
		System.out.print("Popped 5: ");
		for (int i = 0; i < 5; i++){
			System.out.print(tempSA.pop()+ " ");
		}
		System.out.println();
		
		System.out.print("Pushed 5: ");
		for (int i = 0; i < 5; i++){
			int t = new Random().nextInt(100);
			tempSA.push(t);
			System.out.print(t+ " ");
		}
		
		System.out.println();
		
		System.out.print("Pop all: ");
		for (int i = 0; i < 10; i++){
			System.out.print(tempSA.pop()+ " ");
		}
	}

	
	
}
