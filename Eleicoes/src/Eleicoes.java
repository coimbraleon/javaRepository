
public class Eleicoes {

	public static void main(String[] args) {
		int anoNascimento= 2008;
		int Idade= (2021 - anoNascimento);
		System.out.println("Sua idade � " + Idade);
		if (Idade>=16) {
			System.out.println("Voc� pode votar!");
		} else {
			System.out.println("Voc� n�o poder� votar esse ano!");
		}
	}

}
