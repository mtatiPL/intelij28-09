import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KryptografTest {

    @Test
    void szyfrujJezeliPusteSlowo() {

        String aktualna=Kryptograf.szyfruj("");
    String oczekiwana="";
        Assertions.assertEquals(oczekiwana,aktualna);
    }


    @Test
    void szyfrujJezeliDlugoscMaPierwCalkowity() {

        String aktualna=Kryptograf.szyfruj("Mama");
        String oczekiwana="Mmaa";
        Assertions.assertEquals(oczekiwana,aktualna);
    }

    @Test
    void szyfrujJezeliDlugoscPlusJedenMaPierwCalkowity() {

        String aktualna=Kryptograf.szyfruj("ala i as");
        String oczekiwana="a alisa ";
        Assertions.assertEquals(oczekiwana,aktualna);
    }


    @Test
    void szyfrujJezeliDlugoscDowolna() {

        String aktualna=Kryptograf.szyfruj("ala ma psa ");
        String oczekiwana="ams laa a    p  ";
        Assertions.assertEquals(oczekiwana,aktualna);
    }

    @Test
    void szyfrujJezeliDlugoscDowolnaBezSpacji() {

        String aktualna=Kryptograf.szyfruj("abcdefghij ");
        String oczekiwana= "aei bfj cg dh";
        Assertions.assertEquals(oczekiwana,aktualna);
    }


    @Test
    void szyfrujJezeliOdszyfrowanie() {

        String aktualna=Kryptograf.szyfruj("ams laa a    p  ");
        String oczekiwana= "ala ma psa";
        Assertions.assertEquals(oczekiwana,aktualna);
    }
}