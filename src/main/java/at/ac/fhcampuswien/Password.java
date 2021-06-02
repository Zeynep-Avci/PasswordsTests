package at.ac.fhcampuswien;
import java.util.Scanner;
import java.util.regex.*;


public class Password {
    //https://www.techiedelight.com/validate-password-java/
    //https://riptutorial.com/regex/example/5023/matching-various-numbers
/*
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);
        String pass;

        // Enter username and press Enter
        System.out.println("Enter password");
        pass = myObj.nextLine();

        System.out.println();
    }

 */

    public boolean checkPassword(String pass){
        //Das Kennwort muss zwischen 8 und 25 Zeichen lang sein = .{8,25}
        //• Das Kennwort muss aus Klein- und Großbuchstaben bestehen = .*[a-z].*[A-Z]
        //• Das Kennwort muss Zahlen enthalten = .*[0-9]
        //• Das Kennwort muss mindestens eines der folgenden Sonderzeichen enthalten:
        //()#$?!%/@ Andere Sonderzeichen sind nicht erlaubt = .*[()#$?!%/@]
        //• Es darf nicht eine Zahl öfters als 3-mal hintereinander kommen z.B. 1111 ist nicht
        //erlaubt = .\d{0,3}

        if(pass.matches("^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[()#$?!%/@]).\\d{0,3}.{8,25}$")) {
            return true;
        }else{
            return false;
        }
    }
/*
    public boolean checkPassword2(String pass){
        if (pass.matches("\\d{0,3}")){
            return true;
        }else{
            return false;
        }
    }
    */
    /*
    public boolean checkPassword(String pass) {
        // Wenn Zahlen enthalten sind dürfen nicht mehr als zwei Zahlen fortlaufend sein z.B.
        //123 oder 456 sind nicht erlaubt.
        if (pass.matches(".\d")) {
            return true;
        } else {
            return false;
        }
    }
     */
}
