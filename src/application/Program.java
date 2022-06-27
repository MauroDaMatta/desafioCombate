package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Champion;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);		
		
		Champion c1 = new Champion();
		System.out.println("Digite os dados do primeiro campeão: ");
		System.out.print("Nome: ");
		c1.setName(sc.nextLine());
		System.out.print("Vida inicial: ");
		c1.setLife(sc.nextInt());
		System.out.print("Ataque: ");
		c1.setAttack(sc.nextInt());
		System.out.print("Armadura: ");
		c1.setArmor(sc.nextInt());
		
		Champion c2 = new Champion();
		System.out.println();
		sc.nextLine();
		System.out.println("Digite os dados do segundo campeão: ");
		System.out.print("Nome: ");
		c2.setName(sc.nextLine());
		System.out.print("Vida inicial: ");
		c2.setLife(sc.nextInt());
		System.out.print("Ataque: ");
		c2.setAttack(sc.nextInt());
		System.out.print("Armadura: ");
		c2.setArmor(sc.nextInt());
		
		System.out.println();
		System.out.print("Quantos turnos você deseja executar? ");
		int turn = sc.nextInt();
		
		for (int i=0; i<turn; i++) {
			c1.takeDamage(c2);
			c2.takeDamage(c1);
			System.out.println();
			System.out.println("Resultado do turno "+ (i+1) + ":");
			System.out.println(c2.status(c1));
			System.out.println(c1.status(c2));
			System.out.println();
			if (c1.getLife() <= 0 || c2.getLife() <= 0) {
				break;
			}
		}
		
		System.out.println();
		System.out.println("FIM DO COMBATE");
		
		
		
	
		sc.close();
	}

}
