import java.util.Scanner;


public class Animo {
	public static void main (String[] args) {
		System.out.println("Buenas, como se siente hoy? (alegre/triste/nervioso)");
		String estado;
		Scanner s = new Scanner(System.in);
		estado = s.nextLine();
		
		switch(estado) {
			case "alegre": 
				System.out.println("Enhorabuena!");
				break;
			
			case "triste":
				System.out.println("Cual es el colmo de Batman? Que le Robin");
				break;
				
			case "nervioso":
				System.out.println("Eso también puede ocurrir");
				break;
				
			default:
				System.out.println("Lo siento, no soy especialista en emociones humanas");
		}
		
		
	}
}
