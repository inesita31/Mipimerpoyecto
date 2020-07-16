import java.util.Scanner;
// si utlizamos java.util* importamos  todas las clases, para este caso solo necesitamos
//scaner

public class PaqueteEscaner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//String nombre;

//Scanner mi_objeto;
		
	Scanner entrada = new Scanner(System.in);
	System.out.println("introduce  tu nombre");
	String nombre_usuario= entrada.nextLine();
	System.out.println("introduce  tu edad");
	int edad = entrada.nextInt();
	
	
	System.out.println(" hola "  + nombre_usuario  +  " el año que viene tendras " + (edad +1) + " años ");

		
	}

}
