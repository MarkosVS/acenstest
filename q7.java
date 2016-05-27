// Questão 07 - Processo Seletivo Acens
/**
* @author Marcos Vinicius dos Santos Sombra
*/

// importação da bibilioteca para utilizar valores aleatórios
import java.util.Random;
// importar a classe para receber dados do teclado
import java.util.Scanner;
class Q7 {
	public static void main (String[] args){
		// instancia um objeto da classe Scanner
		Scanner ler = new Scanner(System.in);
		// instancia um objeto da classe Random
		Random randGen = new Random();
		// declaracao da variavel do texto
		String msg;
		System.out.println("Informe a mensagem a ser encriptada:");
		// recebe a string
		msg = ler.nextLine();
		// cria uma chave aleatória entre 1 e 5
		int key = randGen.nextInt(5) + 1;
		// imprime na tela a mensagem encriptada
		System.out.println("Sua mensagem foi encriptada com a cifra de César com chave = " + key + ". E o resultado foi esse:");
		String msgCrip = cifra(msg, key);
		System.out.println(msgCrip);
		// imprime na tela a mensagem original
		System.out.println("Digite a chave para ver a mensagem original:");
		int n = ler.nextInt();
		// confere se o numero digitado é igual a chave
		if(n == key){
			System.out.println(decifra(msgCrip, key));
		}
		else{
			System.out.println("Chave incorreta");
		}
	}

	// metodo que encripta a mensagem
	public static String cifra(String mensagem, int chave){
		StringBuilder builder = new StringBuilder();
		for(int i = 0; i < mensagem.length(); i++){
			char c = (char)(mensagem.charAt(i) + chave);
			builder.append(c);
		}
		return builder.toString();
	}

	// metodo que desencripta a mensagem
	public static String decifra(String mensagem, int chave){
		return cifra(mensagem, -chave);
	}
}
