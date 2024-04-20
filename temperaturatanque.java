/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.temperaturatanque;

/**
 *
 * @author USUARIO
 */
import java.util.Scanner;

public class TemperaturaTanque {
    public static void main(String[] args){
        
    Scanner scanner = new Scanner(System.in);

    double[][] valores={
    {20, 30, 40},  // Mañana
    {25, 35, 45},  // Tarde
    {15, 25, 35}   // Noche
};

        System.out.print("Ingrese el momento del día mañana, tarde, noche: ");
        String momentoDia = scanner.nextLine().toLowerCase();
        System.out.print("Ingrese la temperatura actual del tanque de combustible en grados Celsius: ");
        double temperatura = scanner.nextDouble();
        String resultado = evaluarTemperatura(momentoDia, temperatura, valores);

    System.out.println("La temperatura se clasifica como: " + resultado +
                " para el momento del día " + momentoDia + ".");
    }
    public static String evaluarTemperatura(String momentoDia, double temperatura, double[][] valores){
        int indiceMomentoDia;
        switch (momentoDia) {
            case "mañana":
            indiceMomentoDia = 0;
            break;
            case "tarde":
            indiceMomentoDia = 1;
            break;
            case "noche":
            indiceMomentoDia = 2;
            break;
            default:
        return "Error: No valido.";
}

        if (temperatura < valores[indiceMomentoDia][0]) {
         return "Muy Buena";
        } 
        else if (temperatura < valores[indiceMomentoDia][2]) {
            
        return "Normal";
    } 
        else {
        return "Peligrosa";
    }
}
}