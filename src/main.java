/**
 * Created by acastells on 11/11/16.
 */
import UF5NF1_Cas1_Act1.*;
import UF5NF1_Cas1_Act2.*;
public class main {

    public static void main(String[] args) {
        new main().init();
    }

    public void init(){
        MiCadena asd = new MiCadena("132s");
        numArr xifres = new numArr(new int[]{0,1,2,3,4,5,6,7,8,9});

        System.out.print(xifres.parells());
    }
}
