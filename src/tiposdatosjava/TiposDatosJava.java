/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiposdatosjava;

/**
 *
 * @author ASUS
 */
public class TiposDatosJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println(" Programa tipos de datos, operadores y expresiones Java");
        System.out.println(" Introducción a la programación");
        System.out.println(" José Adrián Criollo Jiménez");
        System.out.println("-------");
 
        
        //Tipos, operadores y expresiones - Enteros - Int
        
        int num1 = 12;
        int num2 = 4;
        int num3 = num1 + num2;
        System.out.println(" El valor de la variable entera num3 es: " +num3);
        
        //Tipos, operadores y expresiones - Double
        System.out.println("------");
        double dec1 = 0.5;
        double dec2 = 11.55;
        double dec3 = dec1 * dec2;
        System.out.println(" El valor de la variable decimal dec3 es: " +dec3);
        
         //Tipos, operadores y expresiones - Char
         System.out.println("------");
         char letra1 = 'M';
         char letra2 = 'C';
         System.out.println(" Los caracteres son: " +letra1 + letra2);
         
        //Tipos, operadores y expresiones - String
        System.out.println("------");
        
        String nombre, apellido, domicilio, telefono;
        
        //Inicializar los String
        nombre = "José Adrian";
        apellido = "Criollo Jiménez";
        domicilio = "Loja";
        telefono = "0939102163";
        
        System.out.println("Presentar variables string");
        System.out.println("Mi nombre es: "+nombre);
        System.out.println("Mi apellido es: "+apellido);
        System.out.println("Vivo en: "+domicilio);
        System.out.println("Mi numero de telefono es: "+telefono);
        System.out.println("\n");
        System.out.println("Me llamo " +nombre+""+apellido+ ", vivo en "+domicilio+ ", y mi telefono es " +telefono+"\n");
        
        System.out.println(" Presentar en una sola linea");
        
        System.out.println("Me llamo "+nombre+""+apellido+
                ", vivo en "+domicilio+ ", y mi telefono es "
                        +telefono+"\n");
        
        System.out.println("Presentar contatenando variables de tipo string \n");
        
        System.out.println("Me llamo ".concat(nombre).concat(apellido).concat(" vivo en ").concat(domicilio).concat("y mi telefono es").concat(telefono));
    }
    
}
