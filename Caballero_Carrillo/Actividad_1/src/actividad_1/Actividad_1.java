/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package actividad_1;

import javax.swing.JOptionPane;

/**
 * Consiste en elaborar dos programas (A y B) que tengan como referencia las
 * vocales minúsculas del alfabetoespañol (a,e,i,o,u) y los números
 * (0,1,2,3,4,5,6,7,8,9). Específicamente, se necesita que ambos (A y B)
 * permitan obtener e imprimir en pantalla lo siguiente: a.Número de
 * permutaciones en grupos de 2 elementos. b.Número de combinaciones en grupos
 * de 2 elementos. Posteriormente, comparar el desempeño entre ambos en términos
 * del tiempo de ejecución.
 */
public class Actividad_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        char[] letras = {'a', 'e', 'i', 'o', 'u'};
        int[] numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        //Se da a elegir al usuario haciendo uso de un switch entre los dos programas (permutaciones y combinaciones)
        int pg = Integer.parseInt(JOptionPane.showInputDialog("MENÚ PRINCIPAL\nEscribe el programa \n1) Permutaciones \n"
                + "2) Combinaciones"));
        switch (pg) {
            case 1:
                
               //Se empieza a realizar la medicion del tiempo de las permutaciones en nanosegundos
                long inicio1 = System.nanoTime();
                
                //Se realiza la formula para sacar las permutaciones de las vocales
                long a = factorial(letras.length) / factorial(letras.length - 2);
                System.out.println("El numero de permutaciones de 2 grupos de {a, e, i, o, u} es: " + a + "\n");
                
                //Se realiza la formula para sacar las permutaciones de los numeros del 1 al 9
                long b = factorial(numeros.length) / factorial(numeros.length - 2);
                System.out.println("El numero de permutaciones de 2 grupos de {1, 2, 3, 4, 5, 6, 7, 8, 9} es: " + b + "\n");
                 
                //Se finaliza la medicion del tiempo de las permutaciones
                long fin1 = System.nanoTime();
                
                //Se calcula la diferencia entre el tiempo
                long total1 = fin1 - inicio1;
                
                //El total se trasforma de nanosegundos a milisegundos
                double totalseg = total1 / 1000000.00;
                
                //Muestra en pantalla el tiempo de ejecución
                System.out.println("Tiempo de ejecucion: " + totalseg + " milisegundos.");
                
                break;
            
            case 2:
                
               //Se empieza a realizar la medicion del tiempo de las combinaciones en nanosegundos
                long inicio2 = System.nanoTime();
                
                //Se realiza la formula para sacar las combinaciones de las vocales
                long c = factorial(letras.length) / (factorial(2) * factorial(letras.length - 2));
                System.out.println("El numero de combinaciones de 2 grupos de {a, e, i, o, u} es: " + c + "\n");
               
                //Se realiza la formula para sacar las combinaciones de los numeros del 1 al 9
                long d = factorial(numeros.length) / (factorial(2) * factorial(numeros.length - 2));
                System.out.println("El numero de combinaciones de 2 grupos de {1, 2, 3, 4, 5, 6, 7, 8, 9} es: " + d + "\n");
                
                //Se finaliza la medicion del tiempo de las combinaciones
                long fin2 = System.nanoTime();
                
                //Se calcula la diferencia entre el tiempo
                long total2 = fin2 - inicio2;
                
                //El total se trasforma de nanosegundos a milisegundos
                double totalseg2 = total2 / 1000000.00;
                
                //Muestra en pantalla el tiempo de ejecución
                System.out.println("Tiempo de ejecucion: " + totalseg2 + " milisegundos.");
                
                break;
        }

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
