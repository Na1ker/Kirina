import java.security.acl.Owner;
import java.util.Date;
import java.util.Scanner;
import javax.swing.text.html.HTMLDocument.RunElement;

/**
 * Test
 */
public class Test {

    /**
     * @param args
     */
    public static void main(String[] args) {


        boolean y = true;

        Scanner input = new Scanner(System.in);
        
        System.out.println("Введите ФИО");
        String fio = input.nextLine();
        System.out.println("Введите начальный баланс");
        int balanc = input.nextInt();
        BankAccount account = new BankAccount(fio, balanc);


        
        while (y) {

            System.out.println("0 - Выход и программы\t 1 -Добавление баланса\t 2 -  Снятие баланса \t 3 - Просмотр журнала транзакций");
            int keyboard =  input.nextInt();
            
            switch (keyboard) {
                case 0:
                y = false;
                input.close();
                break;
                 case 1:
                 System.out.println("Добавление баланса"); 
                 int b = input.nextInt();
                 account.addTransaction(b, "Пополнение");
                     break;
                        case 2:
                        System.out.print("Сумма снятия:");
                        int balance = input.nextInt();
                        account.minusTransaction(balance, "Снятие");
                            break;
                                case 3:
                                account.getAccounthistory();
                                break;
                
            } 
        }

        // BankAccount account = new BankAccount("cfif", 1000);
        // System.out.println("Создан новый счет номер: " + account.getNumber());
        // System.out.println("Владелец: " + account.getOwner());
        // System.out.println("Начальный баланс: " + account.getbalance());

        // //Снятие и добавление баланса 
        // account.withdrawalBalance(300, new Date(), "За аренду");
        // System.out.println("На счете " + account.getNumber() + " баланс " + account.getbalance());
        // account.addBalance(800, new Date(), "Перевод");
        // System.out.println("На счете " + account.getNumber() + " баланс " + account.getbalance());
        // account.getAccounthistory();


        
        
    }
}