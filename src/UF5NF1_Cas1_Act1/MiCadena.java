package UF5NF1_Cas1_Act1;

/**
 * Created by acastells on 11/11/16.
 */

//Creem clase
public class MiCadena {
    private String cadena = "";

    //Constructors

    public MiCadena(String cadena1){
        this.cadena = cadena1;
    }

    //Gets y sets

    public String getMiCadena() {
        return cadena;
    }

    public void setMiCadena(String cadena) {
        this.cadena = cadena;
    }

    //Metodes

    /*Inicialitzar el valor de la cadena.*/
    public void reset(){
        this.cadena = "";
    }

    /*La longitud de la cadena.*/

    public int length(){
        int longitud = 0;
        if (!this.cadena.isEmpty()){
            try {
                while (this.cadena.charAt(longitud) != '\0'){
                    longitud++;
                }
            }
            catch (Exception e){            }
        }
        return longitud;
    }

    /*Començament y finalizacio de cadena*/

    /*Cercar lletra dins de la cadena
    *
    *
    * */

    public int cercar (String value){
        int index = -1;
        for (int i = 0; i < this.cadena.length(); i++){
            if((this.cadena.charAt(i)+"").equals(value) && index < 0) index = i;
        }
        return index;
    }

    /*Valor ascii*/

    public int toASCII (){
        int total = 0;
        for (int i = 0; i < this.cadena.length(); i++) {
            total += this.cadena.charAt(i);
        }

        return total;
    }

    /*Contar número d’aparició d’una lletra dins la cadena.*/

    public int charCount(char x){
        int total = 0;
        for (int i = 0; i < this.cadena.length(); i++) {
            if((this.cadena.charAt(i)+"").equalsIgnoreCase(x+"")) total++;
        }

        return total;
    }

    /*ParseInt*/

    public int parseInt(){
        try {
            return Integer.parseInt(this.cadena);
        }catch (NumberFormatException e){
           System.out.println(e);
        }
        return -1;
    }
}


