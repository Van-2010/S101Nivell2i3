package Nivell2Exercici1;

public class Cycle {
protected int rodes;

public Cycle(int rodes) {
	this.rodes=rodes;
}
public Cycle() {
	this.rodes=1;
}
public void ride() {
	wheels();
}
public int wheels() {
	return rodes;
}
}
