package UF5NF1_Cas1_Act2;

/**
 * Created by acastells on 18/11/16.
 */
public class NumArr {

    /*Atributs*/

    int [] valors = new int[10];

    /*Constructor*/

    public NumArr(int[] valors){
        this.valors = valors;
    }

    /*Metodes*/

    /*Funcio que retorna el nombre de parells (0 no incluit) */

    public int parells(){
        int numParells = 0;
        for (int i = 0; i < this.valors.length; i++) {
            if(valors[i]%2 == 0 && valors[i] > 0) numParells++;
        }
        return numParells;
    }

}
