import java.util.Date;
import java.util.ArrayList;



public class BankAccount {
    
    private ArrayList<Transaction> allTransaction = new ArrayList<Transaction>();
    private String number; // Номер счета
    private int accountNumberSeed = 121321213; // начальный номер счета
    private String owner; // Владелец

    // метод для доступа к притаву 
    public String getNumber(){
        return number;
    }

    public String getOwner(){
        return owner;
    }

    public double getbalance(){
        double balance = 0;
        for (Transaction item:allTransaction) {
            balance+=item.getAmount();
        }
        return balance;
    }

    //метод для добавление денег на счет 
    public void addbalance(double amount, Date date, String note){ }
    public void withdrawalbalance(double amount, Date date, String note){ }

    // Конструктор, который при создании нового объекта
    // Передает владельца и начальный баланс
    public BankAccount(String name, double initialBalance){
        this.owner = name;
        accountNumberSeed++;
        this.number = Integer.toString(accountNumberSeed);


        addBalance(initialBalance, new Date(), "Начальный баланс");
    }

    
    public void addBalance(double amount, Date date, String note){
        
        if(amount > 0){
            Transaction deposit = new Transaction(amount, date, note);
            allTransaction.add(deposit);
        }
        else {
            System.out.println("Сумма депозита должна быть положительный");
        }
    }

    //метод для снятия денег со счета
    public void withdrawalBalance(double amount,Date date, String note){
        if(amount <= 0){
            System.out.println("Ошибка: баланс должен быть положительным");
        }
        else if (getbalance() - amount < 0){
            System.out.println("Ошибка: отсутсвует требуемый баланс");
        }
        else{
            Transaction withdrawal = new Transaction(-amount, date, note);
            allTransaction.add(withdrawal);
        }
    }

    public void getAccounthistory(){

        double balance = 0;
        for(Transaction item: allTransaction){
            balance+=item.getAmount();
            System.out.println(item.getdate() + "\t" + item.getAmount() + "\t" + item.getnotes() + " " + balance );
        }

    }

    public void addTransaction(int nuber, String notes) {
        if(nuber < 0){
            System.out.println("Число должно быть положительное");
        }
        else{
            Transaction transaction = new Transaction(nuber, new Date(), notes);
            allTransaction.add(transaction);

        }
    }

    public void minusTransaction(int balance, String notes) {
        if (balance <= 0){
            System.out.println("Число должно быть больше нуля");
        }
        else{
            if (getbalance() < balance){
                System.out.println("Не хватает средств");
            }
            else{
                Transaction transaction = new Transaction(-balance, new Date(),notes);
                allTransaction.add(transaction);
            }
        }
    }

    
    
    


}
