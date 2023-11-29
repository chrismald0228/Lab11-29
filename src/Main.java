import java.util.*;
//example 1
//example 2
//example 3
interface Encryptable{
    void encrypt();
    void decrypt();
}

class Secret implements Encryptable{
    private String message;
    private int shift;
    private boolean encrypted;

    public Secret(){
        message = "";
        shift = 0;
        encrypted = false;
    }
    public Secret(String mes, int newShift){
        message = mes;
        shift = newShift;
    }
    public void encrypt(){
        String encryptString = "";
        for(int i=0;i<message.length();i++){
            int ascii = message.charAt(i);
            int nAscii = ascii + shift;
            char nChar = (char) nAscii;

            encryptString+=nChar;
        }
        message = encryptString;
        encrypted = true;
    }
    public void decrypt(){
        String encryptString = "";
        for(int i=0;i<message.length();i++){
            int ascii = message.charAt(i);
            int nAscii = ascii - shift;
            char nChar = (char) nAscii;

            encryptString += nChar;
        }
        message = encryptString;
        encrypted = false;
    }

    public void setMessage(String newMessage){
        message = newMessage;
    }
    public void setShift(int newShift){
        shift = newShift;
    }
    public String getMessage(){
        return message;
    }

}

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        Secret secret = new Secret("gang", rand.nextInt(25));
        System.out.println(secret.getMessage());
        secret.encrypt();
        System.out.println(secret.getMessage());
        secret.decrypt();
        System.out.println(secret.getMessage());

    }
}