/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EsparasPackage;

import java.util.Scanner;

public class Esparas_LabActivity1 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        
        System.out.print("Input amount in ¥: ");
        double yen = console.nextDouble();
        
        //convert to peso. $1 = PHP0.4114
        double peso = (yen * 0.4114);
        System.out.print("Equivalent in PHP: " + peso);
    }
}
