package aplication;

import entities.Account;
import entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {
		
		//A seguir a variável recebe um objeto de mesma classe.
		Account x = new Account(1020, "Alex", 1000.0);
		
		//A seguir, usando o conceito de polimorfismo a vaiável da 
		//superclasse recebe objeto da subclasse. O mesmo acontece
		//no upcasting.
		Account y = new SavingsAccount(1023, "Maria", 1000.0, 0.01);
		
		x.withdraw(50.0);
		y.withdraw(50.0);
		
		System.out.println(x.getBalance());
		System.out.println(y.getBalance());
	}

}
