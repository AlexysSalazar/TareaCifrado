
package javaapplication9;

public class PruebaEjemplo {


    public static void main(String[] args) {
        
        
        Cuentahabiente[] lista = new Cuentahabiente[5];
        lista[0]=new Cuentahabiente(319227442, "Alexys Salazar", 250000f); 
        lista[1]=new Cuentahabiente(552468985, "Nallely Guzman ", 50000.5f);
        lista[2]=new Cuentahabiente(321268999, "Hugo Salazar", 20000f);
        lista[3]=new Cuentahabiente(321268999, "Miguel Vazquez ", 1000000f);
        lista[4]=new Cuentahabiente(321268999, "Eduardo Saucedo", 3000f);
        

            for (Cuentahabiente cuenta : lista) {
                System.out.println(cuenta.getNombre() +" es "+cuenta.evaluarCliente());
            }
            
        System.out.println("------RETIRAR DINERO------");    
        lista[4].retirarDinero(299.5f);
            
    }
    


    }

