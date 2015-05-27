
package encriptacion;

import java.util.Scanner;

public class Enigma {
	//llamamos a la clase Cesar
	static Cesar cesar = new Cesar();
	
	static int valor1;
	static int valor2 = -1;
	static String palabra;
	static String palabraEncriptada;
	static String palabraDesencriptada;
	static Scanner sc;
	
	public static void main(String[] args) {
		
		introducirValores();
		palabra=getPalabra().toUpperCase();
			
			palabraEncriptada = cesar.encriptador(valor1, valor2, palabra);
			System.out.println("La palabra encriptada es: "+palabraEncriptada);
			

	}
	
	
	//Comprovamos si son primos y está comprendidos entre los valores 0 y 26
	public static void introducirValores(){
		
		sc = new Scanner(System.in);
		
		System.out.println("Introduce un número comprendido entre 0 y 26 y primo relativo de 27");	
		valor1 = sc.nextInt();
		
		while(valor1<0 || valor1>26 || cesar.comprobarPrimo(valor1)!=true){
			System.out.println("Introduce un número comprendido entre 0 y 26 y primo relativo de 27");	
			valor1 = sc.nextInt();
		}
		

		
		while(valor2<0 || valor2>26){
			System.out.println("Introduce un número comprendido entre 0 y 26");	
			valor2 = sc.nextInt();
		}
		
		
	}


//Le pedimos al usuario que introduzca la palabra que quiere encriptar o desencriptar
	public static String getPalabra(){
		
		sc = new Scanner(System.in);
		
			System.out.println("Introduce mensaje a encriptar");
			palabra = sc.nextLine();
			
		sc.close();
		return palabra;
	}
}
	
