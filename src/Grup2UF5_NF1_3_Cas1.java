/**
 * Created by acastells on 11/11/16.
 */
import UF5NF1_Cas1_Act1.*;
import UF5NF1_Cas1_Act2.*;
public class Grup2UF5_NF1_3_Cas1 {

    public static void main(String[] args) {
        new Grup2UF5_NF1_3_Cas1().init();
    }

    public void init(){
        MiCadena asd = new MiCadena("132s");
        NumArr xifres = new NumArr(new int[]{0,1,2,3,4,5,6,7,8,9});

        System.out.print(xifres.parells());
    }
}
