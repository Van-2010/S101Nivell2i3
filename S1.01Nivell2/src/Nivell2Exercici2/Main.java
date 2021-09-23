package Nivell2Exercici2;


public class Main {

	public static void main(String[]args) {
		 Raton marron=new Raton();
		 Jerbo loco=new Jerbo();
		 Hamster aburrido=new Hamster();
		 
		marron.rosegar();
		marron.saltar();
		marron.escarbar();
		
		loco.rosegar();
		loco.saltar();
		loco.escarbar();
		
		aburrido.rosegar();
		aburrido.saltar();
		aburrido.escarbar();
		
		Roedor[]roedores= {new Raton(),new Jerbo(),new Hamster()};
		((Raton)roedores[0]).saltar();
		((Jerbo)roedores[1]).rosegar();
		
	}
	
}
