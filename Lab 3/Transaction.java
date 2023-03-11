import java.util.Date;


public class Transaction {
    
    private double amount; // сумма для вклада или снятия 

    private Date date; // дата операции

    private String notes; // примечание

    //конструктор который создает новую транзакцию 
    public Transaction(double amount, Date date, String notes){
        this.amount = amount;
        this.date = date;
        this.notes = notes;
    }
    //методы доступа к закрытым полям 
    public double getAmount(){
        return amount;
    }

    public Date getdate(){
        return date;
    }
    
    public String getnotes(){
        return notes;
    }

}
