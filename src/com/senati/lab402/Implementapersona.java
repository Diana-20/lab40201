package com.senati.lab402;

public class Implementapersona {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Crear un objeto policia con la clase persona
		Persona policia = new Persona();
		policia.id = 1;
		policia.nombre = "Roberto";
		policia.apellido ="Gonzales";
		policia.sexo = true;
		policia.ecivil = 's';
		
		System.out.println(policia.toString());
	}

}
