package encriptacion;

public class Cesar {

static String alfabeto = "ABCDEFGHIJKLMN�OPQRSTUVWXYZ"; //String que contiene el alfabeto
static String alfabetoEncrip =""; 
static String palabraEncrip ="";
static String palabraDesencrip ="";


//Encriptamos la palabra
public String encriptador(int a,int b, String p){
	
	String palabra = p;
	
	for(int i=0;i<alfabeto.length();i++){
		int c = (a*i + b) % 27;
		alfabetoEncrip += alfabeto.charAt(c);
	}
	
	for(int i=0;i<palabra.length();i++){
		char letraPalabra = palabra.charAt(i);
		
		for(int j=0;j<alfabeto.length();j++){
			if(letraPalabra==alfabeto.charAt(j)){
				palabraEncrip += alfabetoEncrip.charAt(j);
				
			}else{
				if(letraPalabra==' '){
					palabraEncrip += ' ';
				}
				
			}
			
		}
		
		
	}
	
	return palabraEncrip;
	
}

/*M�todo que comprueba si el n�mero es primo*/
public Boolean comprobarPrimo(int a){

	Boolean esPrimo;
	
	if(a % 3 == 0)esPrimo=false;
	else esPrimo=true;
	return esPrimo;
}
}
