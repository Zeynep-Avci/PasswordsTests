package at.ac.fhcampuswien;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class PasswordTest {
    private static Password pw;

    @BeforeAll
    static void init(){
        pw = new Password();
    }


    //Test is correct
    @Test
    @DisplayName("pass is valid")
    public void testIsValid_Scenario1(){ assertTrue(pw.checkPassword("PasZU2od3$?!%9id"));
    }

    //Das Kennwort muss zwischen 8 und 25 Zeichen lang sein
    @Test
    @DisplayName("pass is shorter than 8")
    public void testIsValid_Scenario2(){ assertFalse(pw.checkPassword("Pb5(ui")); }

    @Test
    @DisplayName("pass is longer than 25")
    public void testIsValid_Scenario3(){ assertFalse(pw.checkPassword("Pb5(i45!tan5634891dddj75bshvdsmioeghosf926$?!%")); }

    //• Das Kennwort muss aus Klein- und Großbuchstaben bestehen.
    @Test
    @DisplayName("pass contains only uppercase letters")
    public void testIsValid_Scenario4(){ assertFalse(pw.checkPassword("BHFWZJP729$?!%86K")); }

    @Test
    @DisplayName("pass contains only lowercase letters")
    public void testIsValid_Scenario5(){ assertFalse(pw.checkPassword("abajvbw826$%f")); }

    //• Das Kennwort muss Zahlen enthalten
    @Test
    @DisplayName("pass contains no numbers")
    public void testIsValid_Scenario6(){ assertFalse(pw.checkPassword("abajvbwSKKT$f!")); }

    //• Das Kennwort muss mindestens eines der folgenden Sonderzeichen enthalten:
    //()#$?!%/@ Andere Sonderzeichen sind nicht erlaubt.
    @Test
    @DisplayName("pass contains no characters")
    public void testIsValid_Scenario7(){ assertFalse(pw.checkPassword("zuawfew656GDGHJ")); }

    // Wenn Zahlen enthalten sind dürfen nicht mehr als zwei Zahlen fortlaufend sein z.B.
    //123 oder 456 sind nicht erlaubt.
    //• Es darf nicht eine Zahl öfters als 3-mal hintereinander kommen z.B. 1111 ist nicht
    //erlaubt

}
