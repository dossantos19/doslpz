/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.clasificaredades;

import java.util.Scanner;

public class ClasificarEdades {
    
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int sumaMayor = 0;
    int sumaMenor = 0;
    int countMayor = 0;
    int countMenor = 0;
   
    for (int i = 1; i <= 5; i++) {
    System.out.print("Ingrese la edad de la persona " + i + ": ");
        int edad = scanner.nextInt();
        if (edad >= 18) {
            sumaMayor += edad;
            countMayor++;
  } 
        else {
        sumaMenor += edad;
        countMenor++;
   }
  }
    double promedioMayores = countMayor > 0 ? (double) sumaMayor / countMayor : 0;
    double promedioMenores = countMenor > 0 ? (double) sumaMenor / countMenor : 0;
    
    
    System.out.println("Promedio de edades de mayores de edad: " + promedioMayores);
    System.out.println("Promedio de edades de menores de edad: " + promedioMenores);
    scanner.close();
}
}