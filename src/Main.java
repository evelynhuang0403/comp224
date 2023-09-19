// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Account johnAccount = new Account("1234","savings",100);

//        System.out.println(johnAccount.balance);

        johnAccount.increaseBalance(10);

//        System.out.println(johnAccount.balance);

        System.out.println(johnAccount.decreaseBalance(50));

        johnAccount.setType("Chequing");
        System.out.println(johnAccount.getType());

        Account account1 = new Account("1234","savings",100);
        Account account2 = new Account("1234","savings",100);
        Account account3 = new Account("1234","savings",100);

        account1.print();
        account2.print();
        account3.print();
    }
    }
