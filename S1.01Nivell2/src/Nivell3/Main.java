package Nivell3;

public class Main {
	public static void main(String[]args) {
		 Hereva rica=new Hereva(); //creació objecte
		 
		 ClasseBase pobre=(ClasseBase)rica;//casting
		 pobre.invocat();//Ens retorna el mètode de la classe filla
	}
}
