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
        boolean menu = true;
        int cont=0;
        while (true){
            
            Scanner entrada = new Scanner(System.in);
            //Ingresar codigo producto
            /*System.out.println("Ingrese codigo: ");
            int codigo = entrada.nextInt();*/
            System.out.println("Ingrese codigo: ");
            String cod = entrada.nextLine();
            if (cod.equals("")){
                while (cont<2){
                    System.out.println("Debe ingresar un codigo: ");
                    cod = entrada.nextLine();
                    if(cod.equals("")){
                        cont++;
                    } 
                    else{
                        cont=2;
                }
            if (cont==2){
                    System.out.println("Ha sobrepasado la cantidad maxima de intentos. ¡Adios!");
                    menu=false; 
                    return;
                }
            }
            }
            int codigo=Integer.parseInt(cod);
            
            //Ingresar descripcion producto
            System.out.println("Ingrese descripcion: ");
            String desc = entrada.nextLine(); 
            if (desc.equals("")){
                while (cont<2){
                    System.out.println("Debe ingresar una descripcion: ");
                    desc = entrada.nextLine();
                    if(desc.equals("")){
                        cont++;
                    } 
                    else{
                        cont=2;
                }
            if (cont==2){
                    System.out.println("Ha sobrepasado la cantidad maxima de intentos. ¡Adios!");
                    menu=false; 
                    return;
                }
            }
            }
            //Ingresar precio producto
            System.out.println("Ingrese precio: ");
            String pr = entrada.nextLine();
            if (pr.equals("")){
                while (cont<2){
                    System.out.println("Debe ingresar precio: ");
                    pr = entrada.nextLine();
                    if(pr.equals("")){
                        cont++;
                    } 
                    else{
                        cont=2;
                }
            if (cont==2){
                    System.out.println("Ha sobrepasado la cantidad maxima de intentos. ¡Adios!");
                    menu=false; 
                    return;
                }
            }
            }
            int precio=Integer.parseInt(pr);
            //Ingresar cantidad producto
            System.out.println("Ingrese cantidad: ");
            String ctd = entrada.nextLine();
            if (ctd.equals("")){
                while (cont<2){
                    System.out.println("Debe ingresar cantidad: ");
                    ctd = entrada.nextLine();
                    if(ctd.equals("")){
                        cont++;
                    } 
                    else{
                        cont=2;
                }
            if (cont==2){
                    System.out.println("Ha sobrepasado la cantidad maxima de intentos. ¡Adios!");
                    menu=false; 
                    return;
                }
            }
            }
            int cantidad=Integer.parseInt(ctd);
            /*System.out.println("Ingrese precio: ");
            int precio = entrada.nextInt();
            System.out.println("Ingrese cantidad: ");
            int cantidad = entrada.nextInt();*/

            Productos nuevo;
            nuevo = new Productos(codigo, desc,precio);

            System.out.println("--- Datos del producto ---");
            System.out.println("Codigo: " + nuevo.codigo);
            System.out.println("Descripcion: " + nuevo.descripcion);
            System.out.println("Precio: $" + nuevo.precio);
            System.out.println("Cantidad: " + cantidad);
            System.out.println("Total a pagar: $" + (nuevo.precio*cantidad));
            
            menu=false; 
            return;
        }
        
    }
    
}
