/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica;
import java.util.Scanner;
/**
 *
 * @author albertobarnetche
 */
public class SPPABarnetcheSA4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double a;
        Scanner datos= new Scanner(System.in);
        System.out.println("introdusca un angulo entre 0 y 360");
        a= datos.nextDouble();
        
        System.out.println("que funcion quiere calcular?");
        System.out.println("1.seno");
        System.out.println("2.coseno");
        System.out.println("3.tangente");
        double anguloRadianes = Math.toRadians(a);
        int op;
        double res;
        op=datos.nextInt();
        
        if(op == 1){
        res=Math.sin(anguloRadianes);
        System.out.println("el seno de " + a + "es: " + res + ".");
        }
        else if (op == 2){
        res=Math.cos(anguloRadianes);
        System.out.println("el seno de " + a + "es: " + res + ".");
        }
        else if (op == 3){
        res=Math.tan(anguloRadianes);
        System.out.println("el seno de " + a + "es: " + res + ".");
        }
        
        
             
        
        
    }
    
}
