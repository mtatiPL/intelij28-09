public class Kryptograf {
    public static String szyfruj(String slowo){
        String szyfr="";
        int pierwiastek=1;
        int dlugosc=slowo.length();








        while(pierwiastek*pierwiastek<dlugosc){
            pierwiastek++;
        }



        while (pierwiastek*pierwiastek<slowo.length()-1){
            slowo=slowo+" ";
        }







        for (int k=0; k<pierwiastek; k++){
        for (int i=k; i<slowo.length(); i=i+pierwiastek)
        {
                szyfr=szyfr+slowo.charAt(i);
            }
        }
        return szyfr;
    }
}
