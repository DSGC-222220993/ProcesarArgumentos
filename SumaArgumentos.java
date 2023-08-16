public class SumaArgumentos {
    public static void main(String[] arguments) {if (arguments.length < 3) {
        //verifica que se hayan proporcionado 3 o mas argumentos en la linea de comandos
        System.out.println("Escribe al menos tres valores numericos para conformar el arreglo");
        return;
        //si los argumentos dados son menos de 3 entonces el programa termina de ejecutarse
    }
        int x=Integer.parseInt(arguments[0]);
        // convierte el primer arg[0] en entero y lo almacena en la variable x
        int [] arreglo=new int[arguments.length-1];
        //este arreglo resta un argumento a la longitud total, pues este valor tomara la posicion de variable x

        for (int i = 1; i < arguments.length ; i++) {
            //recorre los argumentos a partir de x para convertirlos en enteros
            arreglo[i-1]=Integer.parseInt(arguments[i]);
            // los arguments se almacenan en arreglo
        }
        boolean existe=false; // con esta variable booleana se determina si se encontro un par que sumados sean igual a x
        for (int i = 0; i < arreglo.length-1; i++) {
            for (int j = i+1; j <arreglo.length ; j++) {
                // con los bucles se verifican las posibles combinaciones pertenecientes al arreglo
                if (arreglo[i] + arreglo[j] == x) {
                    existe = true;
                    break;
                }
            }
            if (existe) { //si se encuentra una suma con igualdad x se establece como true y se "rompe" el bucle
                break;
            }
        }
        //imprime resultados
        if (existe){
            System.out.println("Si se pueden sumar ciertos valores del arreglo que den igual a "+ x);
        }else{
            System.out.println("No hay una posible combinacion que de igual a el valor "+ x);
        }
    }
}
