
package hilos;

/* Clase que define las características de un objeto
* que denominaremos Hilo e imprime el nombre y tiempo de espera
*/

public class Hilos extends Thread {

    private String nom;
    private int retar;

    // Constructor para inicializar el nombre del hilo y tiempo de retardo
    public Hilos(String a, int b) {

        nom = a;
        retar = b;

    }

    // El metodo run() ejecuta
    // threads. Cuando run() termina el thread muere
    public void run() {

        // Con el método sleep retrasamos la ejecución el tiempo especificado
        try {

            sleep(retar);

        } catch (InterruptedException e) {

    }

        // Imprimimos el nombre y tiempo que hemos retardado el hilo
        System.out.println("Prueba Hilos: " + nom + " " + retar);

    }

}
