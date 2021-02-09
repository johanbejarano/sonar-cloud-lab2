package com.vortexbird.sonarlab.sonarlab1;

public class NoCompliantClasss {

	public int descripcion;
	
	int metodo1(int a) {
		int b = 12;
		if (a == 1) {
			return b;
		}
		return b;
	}

	public Object clone() {
		// Asi se clona esto
		return "Clonado";
	}

	public void noCortoCircuito() {
		if (getTrue() | getFalse()) {
			
		}
	}

	private boolean getTrue() {
		return true;
	}
	
	private boolean getFalse() {
		return false;
	}
	
	public void descripcion() {
		//No se hizo por que....
		this.descripcion = 1;
		this.descripcion++;
		
		String mensaje = "Descripcion " + descripcion;
		System.out.println(mensaje);
	}

	public int getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(int descripcion) {
		this.descripcion = descripcion;
	}
	
	public void caseIncompletos() {
		int myVariable = 1;
		switch (myVariable) {
		  case 1:
		    System.out.println(1);
		    break;
		  case 2:  // Both 'doSomething()' and 'doSomethingElse()' will be executed. Is it on purpose ?
		    System.out.println(2);
		  default:
		    System.out.println(3);
		    break;
		}
	}
	
	

}
