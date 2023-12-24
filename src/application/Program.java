package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        /* obs. nao consigo instanciar a Account acc1 porque é uma conta do tipo Account(por ela ser uma classe abstrata). as outras eu consigo.
    Account acc1 = new Account(1001, "Alex", 1000.0);
    Account acc2 = new SavingsAccount(1002, "Maria", 1000.0, 0.01);
    Account acc3 = new BusinessAccount(1003, "Bob", 1000.0, 500.0);
         */

        /* criar uma lista e adicionar contas dentro dela.*/
        List<Account> list = new ArrayList<>();
        list.add(new SavingsAccount(1001, "Alex", 500.0, 0.01));
        list.add(new BusinessAccount(1002, "Maria", 1000.0, 400.0));
        list.add(new SavingsAccount(1004, "Bob", 300.0, 0.01));
        list.add(new BusinessAccount(1005, "Ana", 500.0, 500.0));
        /* o for vai me retornar a soma de todos os saldos. cada vez que vai iterando, ele vai guardando na variavel sum*/
        double sum = 0;
        for (Account li : list) {
            sum += li.getBalance();
        }
        System.out.printf("Total balance: %.2f%n", sum);
        /* depoisitar o valor de 10.0 em cada conta.*/
        for (Account li : list) {
            li.deposit(10.0);
        }
        /* mostrar o valor de cada conta atualizado ja com os 10.0 a mais.*/
        for (Account li : list) {
            System.out.printf("Updated balance Account %d: $%.2f%n", li.getNumber(),  li.getBalance());
        }
    }
}
