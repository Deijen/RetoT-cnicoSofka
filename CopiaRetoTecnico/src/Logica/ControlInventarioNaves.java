/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import java.util.ArrayList;




public class ControlInventarioNaves { //Clase encargada de la lógica
    private ArrayList<Rocket> InventarioDeNaves;  

    public ControlInventarioNaves() {
    }

    public ControlInventarioNaves(ArrayList<Rocket> InventarioDeNaves) {
        this.InventarioDeNaves = InventarioDeNaves;
    }

    public ArrayList<Rocket> getInventarioDeNaves() {
        return InventarioDeNaves;
    }

    public void setInventarioDeNaves(ArrayList<Rocket> InventarioDeNaves) {
        this.InventarioDeNaves = InventarioDeNaves;
    }
    
    
    //public boolean GuardarNave(Rocket r)
    //{
        //if(InventarioDeNaves.add(r)){
           // return true;
        //}
        //else
          //  return false;
    //}
    
    /**
     Método para el filtro simple
    */
    public String filtroSimple(int tipoCargaOP){
        Rocket rocketEncontrado = null; 
        //ArrayList<Rocket> FiltroSimple = lista;
        //String respuesta ="";
        
        for(Rocket r : InventarioDeNaves)
        {
            if(r.getTipoDeCarga() == tipoCargaOP){
                rocketEncontrado = r;
                System.out.println(r.toString());
                //respuesta = "Está entrando";
            }
        }
        return "";
    }
    
    
}
