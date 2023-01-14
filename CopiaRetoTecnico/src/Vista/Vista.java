/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import javax.swing.JOptionPane;
import Logica.*;
import java.util.ArrayList;

/*
Links importantes: 
1) Clasificacion de las naves espaciales: https://moaramore.com/2016/05/14/clasificacion-de-las-naves-espaciales/
2) Propulsión espacial: https://es.wikipedia.org/wiki/Propulsi%C3%B3n_espacial 
3) Velocidad de escape: https://es.wikipedia.org/wiki/Velocidad_de_escape 
4) 
*/
/**
 *
 * @author dipom
 */
public class Vista {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //--Objetos---//
        ControlInventarioNaves CIN = new ControlInventarioNaves();
        NaveTripulada nt;
        NaveNoTripulada nNT;
        //SondaEspacial SE; //Objeto para crear sondas espaciales
        //Satelite sat;
        //-----------//
        
        //-----Inventario de naves------//
        ArrayList<Rocket> InventarioNaves = new ArrayList(); //Array donde se guardaran las naves espaciales
       
        //-----------//
        
        /*Variables del Rocket*/
        
        //String NombreMisionNave = "Mision Apolo";
        //double Propulsion = 3.14;
        //int TipoDeCarga = 0; // 1 para tripulada, 0 para no tripulada
        //int PesoRocket = 65;
        //String TipoCombustible = "Nitrogeno";
        //double VelocidadDeEscape = 9.1; 
        //String tipoDeMision = "Investigacion"; 
        
        
        String NombreMisionNave;
        double Propulsion ;
        int TipoDeCarga; // 1 para tripulada, 0 para no tripulada
        int PesoRocket;
        String TipoCombustible;
        double VelocidadDeEscape; 
        String tipoDeMision; //Esta será la descripción de la mision
        //--------------//
        
        
        //----Variables Nave no tripulada----//
        int pesoNaveNoTripulada; 
        int nPaneles; 
        int duracionBateria; 
        
        
        //int pesoNaveNoTripulada = 13; 
        //int nPaneles = 1; 
        //int duracionBateria = 43; 
        //-------//
        
        //----Variables nave tripulada --//
        int CapacidadMaxima; 
        boolean EsRecuperable; 
        int NumeroDeTripulantes;
        
        //---- Variables transbordador espacial -- //
        
        double altura;
        double diametro; 
        double masa1; 
        int etapas; 
        
        //--- Variables estacion espacial ---//
        
        double masa2;
        double longitud;
        double ancho; 
        
        
        //--Variables Sonda espacial --//
        String planetaAEstudiar = "marte";
        //---//
        //--------Variables Satelite-----------//
        //String NombreMisionNave1 = "Satelite claro";
        int numeroOrbitas = 2;
        //String tipoDeMision2 = "Cobertura Tv";
        //String tipoCombustible2 = "Oxigeno";
        //------------------//
        
        //---------Variables para el menu ---------//
        
        boolean salir = false;
        int opcion; //Variable para escoger entre crear una nave, filtro simple o filtro avanzado
        int seleccionNave;
        int seleccionNave2;
        int opcion2;
        //-----------------//
        
        
        do
        {
            opcion =Integer.parseInt(JOptionPane.showInputDialog(null, "Porfavor escoga una opcion: "
                    + "\n\n1) Crear nave espacial"
                    + "\n"
                    + "\n2) Filtro simple "
                    + "\n"
                    + "\n3)Filtro avanzado "
                    + "\n"
                    + "\n4) Salir ", "Bienvenido a Space exe", JOptionPane.INFORMATION_MESSAGE)); 
            
            switch(opcion){ 
                case 1: 
                    int tipoDeNave; //1 para nave tripulada, 2 para nave no tripulada
                    
                    
                    JOptionPane.showMessageDialog(null, "Para crear una Nave espacial, es necesario crear el cohete primero.\n"
                            + "\n NOTA: El tipo de carga del cohete definira si la nave espacial a crear es tripulada o no tripulada."
                            + "\n Si la nave que desea crear es tripulada, ingrese 1."
                            + "\n Si la nave que desea crear es no tripulada, ingrese 2"
                            + "\n\n Una vez escogido el tipo de carga, podras escoger las diferentes naves espaciales dependiendo de si son tripuladas o no"
                            + "\n\n Naves tripuladas: estación Espacial, transbordador espacial."
                            + "\n\n Naves no tripuladas: onda espacial, satelite ", "INSTRUCCIONES PARA CREAR UNA NAVE ESPACIAL", JOptionPane.WARNING_MESSAGE);
                    
                    
                    TipoDeCarga = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el tipo de carga de la nave: "
                            + "\n1) Nave tripulada."
                            + "\n2) Nave no tripulada", "Tipo de carga", JOptionPane.WARNING_MESSAGE)); // 1 para tripulada, 0 para no tripulada
                    
                    //La velocidad de escape debe estar dentro de un while
                    VelocidadDeEscape = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingresa la velocidad de escape de la nave: "
                            + "\n\n NOTA: La velocidad de escape de la nave debe ser mayor a 11.2 km/s, de lo contrario no podrá escapar de la fuerza gravitatoria de la tierra", "Velocidad de escape", JOptionPane.WARNING_MESSAGE)); 
                    
                    NombreMisionNave = JOptionPane.showInputDialog(null, "Ingresa el nombre que tendrá tu nave espacial", "Nombre de la nave", JOptionPane.QUESTION_MESSAGE);
                    
                    Propulsion  = Double.parseDouble(JOptionPane.showInputDialog(null, "Qué propulsión tendrá tu nave? "
                            + "\nNOTA: La propulsión de la nave es la veolocidad con la que se moverá la carga del cohete(Nave tripulada o no tripulada) una vez liberada en el espacio una", "Propulsión", JOptionPane.QUESTION_MESSAGE));
                    
                    PesoRocket = Integer.parseInt(JOptionPane.showInputDialog(null,"Cúal es el peso del cohete?", "Peso del cohete", JOptionPane.QUESTION_MESSAGE ));
                    TipoCombustible = JOptionPane.showInputDialog(null, "Ingresa el tipo de combustible", "Tipo de combustible", JOptionPane.QUESTION_MESSAGE);;
                    
                    tipoDeMision = JOptionPane.showInputDialog(null, "Descripción de la mision. NOTA: Tienes que cambiar esto, ya que el tipo de la mision depende del tipo de la nave", "TIPO DE MISION. CAMBIAR", JOptionPane.WARNING_MESSAGE);;
                    
                    //Condicion para el tipo de nave según la carga.
                    if(TipoDeCarga ==1)
                    {
                        JOptionPane.showMessageDialog(null, " Ingresa la información para tu nave tripulada", "Nave tripulada", JOptionPane.INFORMATION_MESSAGE);

                        
                        CapacidadMaxima = Integer.parseInt(JOptionPane.showInputDialog(null,"Cúal es la capacidad máxima de la nava?", "Capacidad maxima", JOptionPane.QUESTION_MESSAGE ));
                        EsRecuperable = true; //Cambiar esto
                        NumeroDeTripulantes = Integer.parseInt(JOptionPane.showInputDialog(null,"Cúal es el número de tripulantes?", "Numero de tripulantes", JOptionPane.QUESTION_MESSAGE ));
                        
                        JOptionPane.showMessageDialog(null, "Hora de seleccionar y finalizar de crear tu nave  tripulada!!!", "Ya casi terminamos!", JOptionPane.INFORMATION_MESSAGE);
                        
                        seleccionNave2 = Integer.parseInt(JOptionPane.showInputDialog(null,"A continuación escoge una de las dos naves  tripuladas para terminar el proceso de creación: "
                                + "\n1) Estacion espacial."
                                + "\n2) Transbordador espacial", "Selección Final", JOptionPane.QUESTION_MESSAGE ));
                        
                        if(seleccionNave2 == 1)
                        {
                            masa2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingresa la masa total de la nave", "Masa de la nave", 3));
                            longitud = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingresa lalongitud de la nave", "Longitud", 3));;
                            ancho = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingresa el ancho de la nave", "Ancho", 3));; 
                            EstacionEspacial ES = new EstacionEspacial(masa2, longitud, ancho, CapacidadMaxima, EsRecuperable, NumeroDeTripulantes, NombreMisionNave, Propulsion, TipoDeCarga, PesoRocket, TipoCombustible, VelocidadDeEscape, tipoDeMision);
                            
                            if(InventarioNaves.add(ES))
                            {
                                JOptionPane.showMessageDialog(null, "Felicidades, has creado una estacion Espacial", "Nave ensamblada!", JOptionPane.INFORMATION_MESSAGE);
                            } 
                            else
                            {
                                System.out.println("Error al crear la nave espacial");
                            }
                            
                            
                        }
                        
                        else if(seleccionNave2 ==2)
                        {
                            altura = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingresa la altura de la nave", "Altura", 3));
                            diametro = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingresa el diametro de la nave", "DIametro", 3)); 
                            masa1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingresa la masa total de la nave", "Masa de la nave", 3));; 
                            etapas = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el numero de etapas de la nave", "Etapas de la nave", 3));
                            TransbordadorEspacial TE = new TransbordadorEspacial(altura, diametro, masa1, etapas, CapacidadMaxima, EsRecuperable, NumeroDeTripulantes, NombreMisionNave, Propulsion, TipoDeCarga, PesoRocket, TipoCombustible, VelocidadDeEscape, tipoDeMision);
                            
                            if(InventarioNaves.add(TE))
                           {
                                JOptionPane.showMessageDialog(null, "Felicidades, has creado un transbordador espacial", "Nave ensamblada!", JOptionPane.INFORMATION_MESSAGE);
                           } 
                           else
                           {
                               System.out.println("Error al crear la nave espacial");
                           }
                            
                            System.out.println("Transbordador espacial");
                        }
                        
                    }
                    else if(TipoDeCarga == 2) //Nave no tripulada
                    {
                        JOptionPane.showMessageDialog(null, " Ingresa la información para tu nave no tripulada", "Nave no tripulada", JOptionPane.INFORMATION_MESSAGE);
                        
                        pesoNaveNoTripulada = Integer.parseInt(JOptionPane.showInputDialog(null,"Cúal es el peso de la nave no tripulada?", "Peso de la nave", JOptionPane.QUESTION_MESSAGE ));
                        nPaneles = Integer.parseInt(JOptionPane.showInputDialog(null,"¿Cúantos paneles solares tiene la nave no tripulada?", "Número de paneles", JOptionPane.QUESTION_MESSAGE ));
                        duracionBateria = Integer.parseInt(JOptionPane.showInputDialog(null,"Cúal es la duración de la bateria?", "Duración de la bateria", JOptionPane.QUESTION_MESSAGE ));
                    
                        JOptionPane.showMessageDialog(null, "Hora de seleccionar y finalizar de crear tu nave no tripulada!!!", "Ya casi terminamos!", JOptionPane.INFORMATION_MESSAGE);
                        
                        seleccionNave = Integer.parseInt(JOptionPane.showInputDialog(null,"A continuación escoge una de las dos naves no tripuladas para terminar el proceso de creación: "
                                + "\n1) Satelite."
                                + "\n2) Sonda espacial", "Selección Final", JOptionPane.QUESTION_MESSAGE ));
                        
                        if(seleccionNave == 1)
                        {
                           
                           Satelite sat = new Satelite(numeroOrbitas, pesoNaveNoTripulada, nPaneles, duracionBateria, NombreMisionNave, Propulsion, TipoDeCarga, PesoRocket, TipoCombustible, VelocidadDeEscape, tipoDeMision);
                           //InventarioNaves.add(sat);
                           
                           if(InventarioNaves.add(sat))
                           {
                                JOptionPane.showMessageDialog(null, "Felicidades, has creado un satelite", "Nave ensamblada!", JOptionPane.INFORMATION_MESSAGE);
                           } 
                           else
                           {
                               System.out.println("Error al crear la nave espacial");
                           }
                           
                           
                        } 
                        else if(seleccionNave == 2)
                        {
                           SondaEspacial SE = new SondaEspacial(planetaAEstudiar, pesoNaveNoTripulada, nPaneles, duracionBateria, NombreMisionNave, Propulsion, TipoDeCarga, PesoRocket, TipoCombustible, VelocidadDeEscape, tipoDeMision);
                           //InventarioNaves.add(SE);
                           if(InventarioNaves.add(SE))
                           {
                                JOptionPane.showMessageDialog(null, "Felicidades, has creado una sonda espacial", "Nave ensamblada!", JOptionPane.INFORMATION_MESSAGE);
                           } 
                           else
                           {
                               System.out.println("Error al crear la nave espacial");
                           }
                        }
                    }
                    
                    break; 
                     
                case 2: //FiltroSimple
                   
                    opcion2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Selecciona el tipo de nave para filtrar: "
                            + "\n1) Nave tripulada."
                            + "\n2) Nave no tripulada", "Filtro simple", JOptionPane.INFORMATION_MESSAGE));
                    
                    for(int i=0; i< InventarioNaves.size(); i++)
                    {
                        if(InventarioNaves.get(i).getTipoDeCarga()==opcion2){
                             JOptionPane.showMessageDialog(null, InventarioNaves.get(i).toString(), InventarioNaves.get(i).getNombreMisionNave(), JOptionPane.INFORMATION_MESSAGE);
                               
                            //JOptionPane.showMessageDialog(null, CIN.filtroSimple(opcion2), "Filtro Simple", JOptionPane.INFORMATION_MESSAGE);
                            //CIN.filtroSimple(opcion2);
                            //nNT = CIN.filtroSimple(opcion2);
                              
                               
                        } 
                        else if(InventarioNaves.get(i).getTipoDeCarga()==opcion2){
                            JOptionPane.showMessageDialog(null, InventarioNaves.get(i).toString(), InventarioNaves.get(i).getNombreMisionNave(), JOptionPane.INFORMATION_MESSAGE);
                            
                        }
                    }

                    
                    break; 
                
                case 3: 
                    break; 
                    
                case 4: 
                    salir = true;
                    break;
            
            }
            
        }while(!salir);
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        /**
         SondaEspacial SE = new SondaEspacial(planetaAEstudiar, pesoNaveNoTripulada, nPaneles, duracionBateria, NombreMisionNave, Propulsion, TipoDeCarga, PesoRocket, TipoCombustible, VelocidadDeEscape, tipoDeMision);
        Satelite S = new Satelite(numeroOrbitas, pesoNaveNoTripulada, nPaneles, duracionBateria, NombreMisionNave1, Propulsion, TipoDeCarga, PesoRocket, tipoCombustible2, VelocidadDeEscape, tipoDeMision2);
        InventarioNaves.add(SE);
        InventarioNaves.add(S);
        
       TipoDeNave = Integer.parseInt(JOptionPane.showInputDialog("Escoge un tipo de nave"));
        
       
       
        if (TipoDeNave == 1) //Para nave tripulada
        {
        
        }
        
        else if (TipoDeNave == 2)
        {
            if(InventarioNaves.add(SE))
            {
                System.out.println("Nave espacial guardada");
                JOptionPane.showMessageDialog(null, "NaveEspacial" + InventarioNaves.get(0).toString() );

            }
            else
                System.out.println("Error, Nave no espacial guardada");
        }
        
        
    }
         */
    
    }
    
}