/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

/**
 *
 * @author dipom
 */
public class SondaEspacial  extends NaveNoTripulada { 
    public String PlanetaAEstudiar;

    public SondaEspacial() {
    }

    public SondaEspacial(String PlanetaAEstudiar) {
        this.PlanetaAEstudiar = PlanetaAEstudiar;
    }

    //public SondaEspacial(String PlanetaAEstudiar, int PesoNaveNoTripulada, int NumeroPaneles, int DuracionBateria) {
      //  super(PesoNaveNoTripulada, NumeroPaneles, DuracionBateria);
        //this.PlanetaAEstudiar = PlanetaAEstudiar;
    //}

    public SondaEspacial(String PlanetaAEstudiar, int PesoNaveNoTripulada, int NumeroPaneles, int DuracionBateria, String NombreMisionNave, double Propulsion, int TipoDeCarga, int PesoRocket, String TipoCombustible, double VelocidadEscape, String TipoDeMision) {
     /*OJO AQUí*/   super(PesoNaveNoTripulada, NumeroPaneles, DuracionBateria, NombreMisionNave, Propulsion, TipoDeCarga, PesoRocket, TipoCombustible, VelocidadEscape, TipoDeMision = "Mi mision es sondear");
        this.PlanetaAEstudiar = PlanetaAEstudiar;
    }

    public String getPlanetaAEstudiar() {
        return PlanetaAEstudiar;
    }

    public void setPlanetaAEstudiar(String PlanetaAEstudiar) {
        this.PlanetaAEstudiar = PlanetaAEstudiar;
    }

    public int getPesoNaveNoTripulada() {
        return PesoNaveNoTripulada;
    }

    public void setPesoNaveNoTripulada(int PesoNaveNoTripulada) {
        this.PesoNaveNoTripulada = PesoNaveNoTripulada;
    }

    public int getNumeroPaneles() {
        return NumeroPaneles;
    }

    public void setNumeroPaneles(int NumeroPaneles) {
        this.NumeroPaneles = NumeroPaneles;
    }

    public int getDuracionBateria() {
        return DuracionBateria;
    }

    public void setDuracionBateria(int DuracionBateria) {
        this.DuracionBateria = DuracionBateria;
    }

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
    
    

    @Override
    public String DescripcionDeMision() {
        return "La mision es:  " + this.TipoDeMision ; //Retorna un mensaje con la misión que se va  a hacer.
    } 
    
     public String toString(){ 
         return "\n\nNombre de la mision o nave : " + NombreMisionNave +
                "\nPropulsion del cohete: " + Propulsion + 
                "\nTipo de carga del Cohete " + TipoDeCarga + 
                "\nPeso del Cohete: " + PesoRocket + 
                "\nTipo de combustible: " + TipoCombustible +
                "\nVelocidad de escape del cohete: " + VelocidadEscape +
                "\nTipo de mision: " + TipoDeMision + 
                "\nPeso de la nave: " + PesoNaveNoTripulada +
                "\nNúmero de paneles solares: " + NumeroPaneles + 
                "\nDuración estimada de la bateria " + DuracionBateria + 
                 "\n\nPlaneta a estudiar: " + PlanetaAEstudiar; 
                 
         
         
                
         
         
        //return "\n\nPlaneta a estudiar: " + PlanetaAEstudiar; 
    
    }
    
    
    
}
