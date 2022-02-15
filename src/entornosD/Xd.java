package entornosD;
import java.util.Arrays;
public class Xd {

    /**
     * Este método comprueba si un vector está ordenado de menor a mayor
     * @param vector(int[])
     * @return
     */
    public boolean comprobar(int[] vector){
        boolean respuesta=false;
        int numero;

        for(int c=0; c< vector.length; c++){
            numero=vector[c];
            if(numero<vector[c+1])
                respuesta=true;
            else{
                respuesta=false;
                break;
            }
        }
        return respuesta;
    }

    /**
     * Este método recibe un vector de números y lo devuelve ordenado de menor a mayor
     * @param vector(int[])
     * @return
     */
    public int[] ordenar(int[] vector){
        Arrays.sort(vector);
        return vector;
    }

    public static void main(String[] args) {

        int[] vector={1, 3, 2};
        Xd xd=new Xd();


        System.out.println(xd.comprobar(vector));
        System.out.println(Arrays.toString(xd.ordenar(vector)));

    }
}
