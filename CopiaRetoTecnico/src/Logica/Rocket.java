/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;
// https://www.youtube.com/watch?v=wqoyQ3BxK4A
/**
 *
 * @author dipom
 */
public abstract class Rocket { 
    protected String NombreMisionNave;  //SOlo será el nombre de la nave
    protected double Propulsion;
    protected int TipoDeCarga; //1 para tripulada, 0 para no tripulada
    protected int PesoRocket; 
    protected String TipoCombustible;  //Tipo de combustible del rocket 
    protected double VelocidadEscape; //Si la nave es tripulada o no, la velocidad de escape es diferente. //https://es.wikipedia.org/wiki/Propulsi%C3%B3n_espacial
    protected String TipoDeMision; //NOTA, el tipo de mision será un entero. Dependerá del tipo de carga y del tipo de nave
    //---Constructor por defecto y método constructor----//

    public Rocket() {
    }
    
   

    public Rocket(String NombreMisionNave, double Propulsion, int TipoDeCarga, int PesoRocket, String TipoCombustible, double VelocidadEscape, String TipoDeMision) {
        this.NombreMisionNave = NombreMisionNave;
        this.Propulsion = Propulsion;
        this.TipoDeCarga = TipoDeCarga;
        this.PesoRocket = PesoRocket;
        this.TipoCombustible = TipoCombustible;
        this.VelocidadEscape = VelocidadEscape;
        this.TipoDeMision = TipoDeMision; 
    }

      //----------Getters y setter---------// 

    public String getNombreMisionNave() {
        return NombreMisionNave;
    }

    public void setNombreMisionNave(String NombreMisionNave) {
        this.NombreMisionNave = NombreMisionNave;
    }

    public double getPropulsion() {
        return Propulsion;
    }

    public void setPropulsion(double Propulsion) {
        this.Propulsion = Propulsion;
    }

    public int getTipoDeCarga() {
        return TipoDeCarga;
    }

    public void setTipoDeCarga(int TipoDeCarga) {
        this.TipoDeCarga = TipoDeCarga;
    }

    public int getPesoRoc6ket() {
        return PesoRocket;
    }

    public void setPesoRoc6ket(int PesoRoc6ket) {
        this.PesoRocket = PesoRoc6ket;
    }

    public String getTipoCombustible() {
        return TipoCombustible;
    }

    public void setTipoCombustible(String TipoCombustible) {
        this.TipoCombustible = TipoCombustible;
    }

    public double getVelocidadEscape() {
        return VelocidadEscape;
    }

    public void setVelocidadEscape(double VelocidadEscape) {
        this.VelocidadEscape = VelocidadEscape;
    }

    public String getTipoDeMision() {
        return TipoDeMision;
    }

    public void setTipoDeMision(String TipoDeMision) {
        this.TipoDeMision = TipoDeMision;
    }
    
    
    
    
    
    //-----Métodos------//
    //public abstract boolean CrearNave(); //Método para crear una nave. Para construir una nave, varía del tipo de nave.
    public abstract String DescripcionDeMision(); //Dependiendo del tipo de nave (tripulada o no tripulada), la misión cambia
    
  
   public abstract String toString();
        
    
    

}
