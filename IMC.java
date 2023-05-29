import java.util.Scanner;

public class IMC {

	public static void main(String[] args) {

		Scanner imc = new Scanner(System.in);
		double peso, altura, soma;

		System.out.println("entre com seu peso:");
		peso = imc.nextDouble();

		System.out.println("entre com sua altura:");
		altura = imc.nextDouble();
		soma = (peso / (altura * altura));

		if (soma < 18.5) {
			System.out.println("Você esta abaixo do peso");
		} else if (soma <= 24.9) {
			System.out.println("Seu Imc " + soma + " Você esta peso normal");
		} else if (soma <= 34.9) {
			System.out.println("Seu Imc " + soma + "Você esta com obesidade grau I");
		} else if (soma <= 39.9) {
			System.out.println("Seu Imc " + soma + " Você esta com obesidade grau II");
		} else if (soma >= 40) {
			System.out.println("Seu Imc " + soma + " Você esta com Obesidade Grau III ou Mórbidade");
		}
	}
}