/*
Uma empresa pretende ajustar os salários de seus funcionários conforme a tabela a seguir:

Salário 				Percentual de Aumento
até R$ 1200,00			10%
acima de R$ 1200,00 	5%

Faça um programa, em Java, que receba o salário atual do funcionário; calcule e mostre o
aumento que esse funcionário receberá e seu novo salário.
 */


import java.util.Scanner;

public class AdjustNewSalary {
	public static void main(String[] args) {
		
		System.out.println("CALCULATE READJUSTMENT");
		
		double currentSalary, newSalary, increase;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Inform the employer's current salary: ");
		currentSalary = input.nextDouble();
		
		if (currentSalary <= 1200) {
			newSalary = currentSalary * 1.1;
			increase = newSalary - currentSalary;
			
			System.out.println("Percentual: 10%");
			System.out.println("New salary: $" + newSalary);
			System.out.println("After the readjust, the salary increased in $" + increase);
		} else {
			newSalary = currentSalary * 1.05;
			increase = newSalary - currentSalary;
			
			System.out.println("Percentual: 5%");
			System.out.println("New salary: $" + newSalary);
			System.out.println("After the readjust, the salary increased in $" + increase);
		}

	}
}
