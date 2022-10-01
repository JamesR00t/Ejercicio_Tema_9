package main;

public class Main {

	public static void main(String[] args) {
		
		Cliente cliente = new Cliente();
	
		System.out.println("Edad: " + (cliente.edad = 20));
		System.out.println("Nombre: " + (cliente.nombre = "Benito"));
		System.out.println("Telefono: " + (cliente.telefono = 1234567890));
		System.out.println("Credito: " + (cliente.credito = 10000) + "\n");
				
		Trabajador trabajador = new Trabajador();
		
		
		System.out.println("Edad: " + (trabajador.edad = 30));
		System.out.println("Nombre: " + (trabajador.nombre = "Camelo"));
		System.out.println("Telefono: " + (trabajador.telefono = 987654332));
		System.out.println("Credito: " + (trabajador.salario = 90000));
		

	}

}

class Persona {
	int edad;
	String nombre;
	long telefono;
}

class Cliente extends Persona{
	int credito;
}

class Trabajador extends Persona{
	int salario;
}