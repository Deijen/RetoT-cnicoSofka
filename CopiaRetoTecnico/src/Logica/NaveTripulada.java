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
public abstract class NaveTripulada extends Rocket{  //La clase es abstract porque no sé como se crea una estación espacial, modulo, o transbordador espacial. Los tres se crean de manera distitna
    
   protected int CapacidadMaxima; 
   protected boolean EsRecuperable; 
   protected int NumeroDeTripulantes;

    public NaveTripulada() {
    }

    public NaveTripulada(int CapacidadMaxima, boolean EsRecuperable, int NumeroDeTripulantes) {
        this.CapacidadMaxima = CapacidadMaxima;
        this.EsRecuperable = EsRecuperable;
        this.NumeroDeTripulantes = NumeroDeTripulantes;
    }

    public NaveTripulada(int CapacidadMaxima, boolean EsRecuperable,int NumeroDeTripulantes, String NombreMisionNave, double Propulsion, int TipoDeCarga, int PesoRoc6ket, String TipoCombustible, double VelocidadEscape, String TipoDeMision) {
        super(NombreMisionNave, Propulsion, TipoDeCarga, PesoRoc6ket, TipoCombustible, VelocidadEscape, TipoDeMision);
        this.CapacidadMaxima = CapacidadMaxima;
        this.EsRecuperable = EsRecuperable;
        this.NumeroDeTripulantes = NumeroDeTripulantes;
    }

    public int getCapacidadMaxima() {
        return CapacidadMaxima;
    }

    public void setCapacidadMaxima(int CapacidadMaxima) {
        this.CapacidadMaxima = CapacidadMaxima;
    }

    public boolean isEsRecuperable() {
        return EsRecuperable;
    }

    public void setEsRecuperable(boolean EsRecuperable) {
        this.EsRecuperable = EsRecuperable;
    }

    public int getNumeroDeTripulantes() {
        return NumeroDeTripulantes;
    }

    public void setNumeroDeTripulantes(int NumeroDeTripulantes) {
        this.NumeroDeTripulantes = NumeroDeTripulantes;
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

    
   
   
   
    
    //---Metodos--// 
    
    
   
    public abstract String TipoDeMision(); 
     public abstract String toString();
    
    
    
}
