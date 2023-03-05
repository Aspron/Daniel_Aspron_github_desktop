package entornos;

import java.util.Scanner;

public class Usuario {
	int Dni;
	String nombre;
	String apellidos;
	Scanner sc = new Scanner(System.in);
	public int getDni() {
		return Dni;
	}
	public void setDni(int dni) {
		Dni = dni;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	void usuario() {
		 System.out.println("Introduzca su dni");
		 Dni =sc.nextInt();
		 System.out.println("Introduzca su nombre");
		 nombre = sc.nextLine();
		 System.out.println("Introduzca sus apellidos");
		 apellidos = sc.nextLine();
		 System.out.println("Usuario creado con Dni" + Dni +"con nombre y apellidos " + nombre + apellidos);
	}
}
