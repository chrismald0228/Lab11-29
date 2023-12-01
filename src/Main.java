import java.util.*;
import java.text.*;
//example 1
class Flight{
    private int flightNumber;
    private DateFormat departureTime;
    private int flightDuration;

    public DateFormat delayFlight(int numberOfMinutes){

    }
}
//example 2
//abstract class BankAccount{
//    private String owner;
//    private float balance;
//    public float getBalance(){
//        return balance;
//    }
//    public void setBalance(float amount){
//        balance = amount;
//    }
//    public void deposit(float amount){
//        balance += amount;
//    }
//    abstract void withdrawal(float amount);
//}
//class CheckingAccount extends BankAccount{
//    private float InsufficientFundsFee;
//    private float balance = super.getBalance();
//    public void withdrawal(float amount){
//         super.setBalance(balance - amount);
//    }
//}
//class SavingsAccount extends BankAccount{
//    private float balance = super.getBalance();
//    private double annualInterestRate = 0.05;
//    public void withdrawal(float amount){
//        super.setBalance(balance - amount);
//    }
//    public void depositMonthlyInterest(){
//        super.setBalance(balance += balance*annualInterestRate);
//    }
//}
////example 3
//interface Encryptable{
//    void encrypt();
//    void decrypt();
//}
//
//class Secret implements Encryptable{
//    private String message;
//    private int shift;
//    private boolean encrypted;
//
//    public Secret(){
//        message = "";
//        shift = 0;
//        encrypted = false;
//    }
//    public Secret(String mes, int newShift){
//        message = mes;
//        shift = newShift;
//    }
//    public void encrypt(){
//        String encryptString = "";
//        for(int i=0;i<message.length();i++){
//            int ascii = message.charAt(i);
//            int nAscii = ascii + shift;
//            char nChar = (char) nAscii;
//
//            encryptString+=nChar;
//        }
//        message = encryptString;
//        encrypted = true;
//    }
//    public void decrypt(){
//        String encryptString = "";
//        for(int i=0;i<message.length();i++){
//            int ascii = message.charAt(i);
//            int nAscii = ascii - shift;
//            char nChar = (char) nAscii;
//
//            encryptString += nChar;
//        }
//        message = encryptString;
//        encrypted = false;
//    }
//
//    public void setMessage(String newMessage){
//        message = newMessage;
//    }
//    public void setShift(int newShift){
//        shift = newShift;
//    }
//    public String getMessage(){
//        return message;
//    }
//
//}

public class Main {
    public static void main(String[] args) {
//        //example 3
//        Random rand = new Random();
//        Secret secret = new Secret("gang", rand.nextInt(25));
//        System.out.println(secret.getMessage());
//        secret.encrypt();
//        System.out.println(secret.getMessage());
//        secret.decrypt();
//        System.out.println(secret.getMessage());

    }
}