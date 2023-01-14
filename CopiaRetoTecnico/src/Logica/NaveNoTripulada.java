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
public  abstract  class NaveNoTripulada extends Rocket{
    protected int PesoNaveNoTripulada; 
    protected int NumeroPaneles; 
    protected int DuracionBateria;

    public NaveNoTripulada() {
    }

    public NaveNoTripulada(int PesoNaveNoTripulada, int NumeroPaneles, int DuracionBateria) {
        this.PesoNaveNoTripulada = PesoNaveNoTripulada;
        this.NumeroPaneles = NumeroPaneles;
        this.DuracionBateria = DuracionBateria;
    }

    public NaveNoTripulada(int PesoNaveNoTripulada, int NumeroPaneles, int DuracionBateria, String NombreMisionNave, double Propulsion, int TipoDeCarga, int PesoRocket, String TipoCombustible, double VelocidadEscape, String TipoDeMision) {
        super(NombreMisionNave, Propulsion, TipoDeCarga, PesoRocket, TipoCombustible, VelocidadEscape, TipoDeMision);
        this.PesoNaveNoTripulada = PesoNaveNoTripulada;
        this.NumeroPaneles = NumeroPaneles;
        this.DuracionBateria = DuracionBateria;
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

    public int getPesoRocket() {
        return PesoRocket;
    }

    public void setPesoRocket(int PesoRoc6ket) {
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

    

    
    
    
    
   
    public  abstract String DescripcionDeMision(); 
    
    
    public abstract String toString();
  
    
    
    
}
