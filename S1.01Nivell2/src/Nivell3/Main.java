package Nivell3;

public class Main {
	public static void main(String[]args) {
		 Hereva rica=new Hereva(); //creaci� objecte
		 
		 ClasseBase pobre=(ClasseBase)rica;//casting
		 pobre.invocat();//Ens retorna el m�tode de la classe filla
	}
}
