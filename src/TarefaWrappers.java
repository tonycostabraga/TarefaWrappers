/**
 * 
 * @author Tony da Costa Braga
 *
 */
import java.util.*;

public class TarefaWrappers {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int codigo;
		char letra;
		Scanner leia = new Scanner(System.in);

	System.out.println ("Por favor, digite um código de 3 dígitos:");
	codigo = leia.nextInt();
	
	System.out.println ("Por favor, Digite uma letra qualquer:");
	letra = leia.next().charAt(0);
	
	System.out.println ("O Código digitado do tipo primitivo é:\t" + codigo);
	System.out.println("O nome do autor digitado do tipo String é:\t"+ letra);
	
	Integer codigow = codigo;
	Character letraw = letra;
	
	System.out.println("O código primitivo convertido em wrapper é:\t"+codigow);
	System.out.println("O caracter primitivo convertido em wrapper é:\t" + letraw);
	
	
		
		
	}

}
