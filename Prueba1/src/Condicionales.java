import java.util.*;
public class Condicionales {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner entrada = 	new Scanner(System.in);
	
	System.out.println(" Introduce tu edad");
	
	int edad = entrada.nextInt();
		
	if (edad < 18){
		System.out.println(" eres un adolescente");
			
	}
	
	else if(edad >40)
	{
		System.out.println(" eres maduro");
		
	}
else{
		
		System.out.println(" cuidate");
	}
}
}


