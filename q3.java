// Questão 03 - Processo Seletivo Acens
/**
* @author Marcos Vinicius dos Santos Sombra
*/
class Q3 {
	public static void main (String[] args){
		double a = 80000;
		double b = 200000;
		int cont = 1;
		while(a < b){
			double cresA = a * 0.03;
			double cresB = b * 0.015;
			a = a + cresA;
			b = b + cresB;
			System.out.println("Após o " + cont + "º ano, a população de A era " + a + " e a de B era " + b + ".");
			cont++;
		}
		System.out.println("Levou " + --cont + " anos para a população de A ultrapassar/igualar a de B.");
	}
}