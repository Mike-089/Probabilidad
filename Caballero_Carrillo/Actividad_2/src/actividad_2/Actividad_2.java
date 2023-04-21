/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package actividad_2;

import javax.swing.JOptionPane;

public class Actividad_2 {

    public static void main(String[] args) {
        // TODO code application logic here
       
        //Pedimos datos para rralizar las permutaciones y combinaciones 
        int n = Integer.parseInt(JOptionPane.showInputDialog("Cuanto elementos(n) quieres"));
        int k = Integer.parseInt(JOptionPane.showInputDialog("Cual va ser el tamaño del grupo"));

        //Se empieza a realizar la medicion del tiempo en nanosegundos
        long inicio = System.nanoTime();
        
        //Se realiza la formula para sacar las permutaciones
        long a = factorial(n) / factorial(n - k);
        System.out.println("El numero de permutaciones de " + k + " grupos y " + n + " elementos es: " + a);
       
        //Se realiza la formula para sacar las combinaciones
        long b = factorial(n) / (factorial(k) * factorial(n - k));
        System.out.println("El numero de combinaciones de " + k + " grupos y " + n + " elementos es: " + b);
         
        //Se finaliza la medicion del tiempo
        long fin = System.nanoTime();
        
        //Se calcula la diferencia entre el tiempo
        long total = fin - inicio;
        
        //El total se trasforma de nanosegundos a milisegundos
        double totalseg = total / 1000000.00;
        
        //Muestra en pantalla el tiempo de ejecución
        System.out.println("Tiempo de ejecucion: " + totalseg + " milisegundos.");
    }
    
     //Se calcula el factorial
    public static long factorial(int n) {
        long res = 1;
        for (int i = 1; i <= n; i++) {
            res *= i;
        }
        return res;
    }
}
