package main;

import objetos.Series;

/*
 * author: Raul
 *  */

public class mainApp {

	public static void main(String[] args) {
//		Crearemos una clase llamada Serie con las siguientes caracter�sticas:
//		� Sus atributos son titulo, numero de temporadas, entregado, genero y creador.
//		� Por defecto, el numero de temporadas es de 3 temporadas y entregado false. El 
//		resto de atributos ser�n valores por defecto seg�n el tipo del atributo.
//		� Los constructores que se implementaran ser�n:
//		o Un constructor por defecto.
//		o Un constructor con el titulo y creador. El resto por defecto.
//		o Un constructor con todos los atributos, excepto de entregado.
		
		Series serie1 = new Series();
		Series serie2 = new Series("Elden Ring", "Hidetaka Miyazaki");
		Series serie3 = new Series("Elden Ring", 1, "Fantasia", "Hidetaka Miyazaki");
		
		System.out.println(serie1.toString());
		System.out.println(serie2.toString());
		System.out.println(serie3.toString());
		
	}

}
