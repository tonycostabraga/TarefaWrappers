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

	System.out.println ("Por favor, digite um c�digo de 3 d�gitos:");
	codigo = leia.nextInt();
	
	System.out.println ("Por favor, Digite uma letra qualquer:");
	letra = leia.next().charAt(0);
	
	System.out.println ("O C�digo digitado do tipo primitivo �:\t" + codigo);
	System.out.println("O nome do autor digitado do tipo String �:\t"+ letra);
	
	Integer codigow = codigo;
	Character letraw = letra;
	
	System.out.println("O c�digo primitivo convertido em wrapper �:\t"+codigow);
	System.out.println("O caracter primitivo convertido em wrapper �:\t" + letraw);
	
	
		
		
	}

}
