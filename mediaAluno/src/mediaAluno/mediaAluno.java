package mediaAluno;

public class mediaAluno {

	public static void main(String[] args) {
		int notaUm= 10;
		int notaDois= 10;
		int media= (notaUm + notaDois) /2;
		if (media== 10) {
			System.out.println("Aprovado com Distin��o!");
		} else if (media< 7) {
			System.out.println("Reprovado");
		} else {
			System.out.println("Aprovado");
		}
}
}