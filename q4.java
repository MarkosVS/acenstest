// Questão 04 - Processo Seletivo Acens
/**
* @author Marcos Vinicius dos Santos Sombra
*/

// importação da bibilioteca para utilizar valores aleatórios
import java.util.Random;

class Q4 {
	public static void main (String[] args){
		// declaração dos arrays
		int[] rand1 = new int[10];
		int[] rand2 = new int[10];
		int[] rand3 = new int[20];
		// instancia um objeto da classe Random
		Random randGen = new Random();
		// inicio do for para preencher os arrays
		for(int i = 0; i < rand1.length; i++){
			rand1[i] = randGen.nextInt(100) + 1;
			rand2[i] = randGen.nextInt(100) + 1;
			if(i%2 == 0){
				rand3[i] = rand1[i];
			}else{
				rand3[i] = rand2[i];
			}
		}
		// imprime os arrays
		for(int j: rand1){
			System.out.println("Array 01 - " + j);
		}
		for(int c: rand2){
			System.out.println("Array 02 - " + c);
		}
		for(int a: rand3){
			System.out.println("Array 03 - " + a);
		}
	}		
}
