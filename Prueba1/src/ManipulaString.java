
public class ManipulaString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String  frase= "hoy es un hermoso dia";
		
		
	  String frase_resumen= frase.substring(1, 3);
			  
		// esto toma dos parametros en inicio  de donde voy a tomar la psocion a estraer y  el segundo paramentro es el que no quiero estraer	  
		  System.out.println(frase_resumen);
		  
		  
		 
		 //metodo equals devuelcde true si dos cadenas de caracteres son iguales y sino devueve un false
		  
		  String  alumno1, alumno2;
		  
		  alumno1="laura";
		  alumno2="laura";
		  
		  System.out.println(alumno1.equals(alumno2));
		  
		  
		  //IgnoreCase  no distingue de mayusculas o minusculas
		  
		  System.out.println(alumno1.equalsIgnoreCase(alumno2)); //nos deberia dar true
		  
	}

}
