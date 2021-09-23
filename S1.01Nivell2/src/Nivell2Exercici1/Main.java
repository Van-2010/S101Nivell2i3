package Nivell2Exercici1;

public class Main {

	public static void main(String[]args) {
		Cycle unicycle=new Unicycle();
		Cycle bicycle=new Bicycle();
		Cycle tricycle=new Tricycle();
		
		unicycle.ride();
		bicycle.ride();
		tricycle.ride();
		
		System.out.println("Aquest transport té "+unicycle.wheels()+" roda");
		System.out.println("Aquest transport té "+bicycle.wheels()+" rodes");
		System.out.println("Aquest transport té "+tricycle.wheels()+" rodes");
		
		Cycle[]c= {new Unicycle(),new Bicycle(),new Tricycle()};
		((Unicycle)c[0]).balance();
		((Bicycle)c[1]).balance();
		
		
		
}
	
	
}
