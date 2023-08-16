public class SumaPrefija {
    public static void main(String[] argumentito) {
        if (argumentito.length==0){
        //recibe la confirmacion de que se han proporcionado datos en la linea de comandos
            System.out.println("Escribe al menos una variable numerica entera como argumento en la linea de comando");
             return;// pide los datos si es que no se han proporcionado
         }
    // crea un arreglo de enteros donde se almacenaran los numeros de la cadena de argumentos
        int[] numeritos=new int[argumentito.length];
    // arreglo donde se almacenan los resultados de las sumas
        int[] sumaDePrefijos=new int[argumentito.length];
        int sumita=0;//seguimiento

        for (int i=0; i< argumentito.length; i++) {
             try { // supervisa el manejo y la conversion de cada argumentito
            numeritos[i] = Integer.parseInt(argumentito[i]); // se almacenan los argumentos en la posicion i
            sumita += numeritos[i]; // valor acumulado
            sumaDePrefijos[i] = sumita; // almacena la suma de argumentos en la misma linea
            System.out.println(numeritos[i] + " -> " + sumaDePrefijos[i]); //imprime los argumentitos a la izq y su valor aculado a la der

        } catch (NumberFormatException e) {
            System.out.println("El argumento proporcionado " + argumentito[i] + " no es valido :(");
            // como la instruccion convierte los argumentos a variables int, en caso de que se ingresara
            // una letra u otro simbolo, entonces surgiria una excepción de conversión
            }
        }
    }
}
