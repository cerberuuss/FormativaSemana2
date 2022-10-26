/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package supermercado;
import java.util.Scanner;
/**
 *
 * @author sebco
 */
public class Supermercado {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // 
        int app = 1;
        while (app==1){
            
            Scanner entrada = new Scanner(System.in);
            
            System.out.println("Ingrese codigo: ");
            int codigo = entrada.nextInt();
            entrada.nextLine(); //este nextLine es para que no se salte el siguiente input

            System.out.println("Ingrese descripcion: ");
            String desc = entrada.nextLine();  
            for(int i = 0; i<2;i++){
                if(desc.equals("")){
                    System.out.println("Debe ingresar una descripcion: ");
                    desc = entrada.nextLine(); 
                }
                if(i==1){
                    System.out.println("Ha sobrepasado la cantidad maxima de intentos. ¡Adios!");
                    app++;//intento sacarlo del while para qe detenga el programa pero no funciona :c
                }
            }
      
            System.out.println("Ingrese precio: ");
            int precio = entrada.nextInt();

            System.out.println("Ingrese cantidad: ");
            int cantidad = entrada.nextInt();

            Productos nuevo;
            nuevo = new Productos(codigo, desc,precio);

            System.out.println("--- Datos del producto ---");
            System.out.println("Codigo: " + nuevo.codigo);
            System.out.println("Descripcipn: " + nuevo.descripcion);
            System.out.println("Precio: " + nuevo.precio);
            System.out.println("Cantidad: " + cantidad);
            System.out.println("Total a pagar: " + (nuevo.precio*cantidad));
            
        }
        
    }
    
}
