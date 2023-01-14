/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;
//https://es.wikipedia.org/wiki/Estaci%C3%B3n_Espacial_Internacional
/**
 *
 * @author dipom
 */
public class EstacionEspacial extends NaveTripulada{ 
    private double masa;
    private double longitud;
    private double ancho; 

    public EstacionEspacial() {
    }

    public EstacionEspacial(double masa, double longitud, double ancho) {
        this.masa = masa;
        this.longitud = longitud;
        this.ancho = ancho;
    }

    public EstacionEspacial(double masa, double longitud, double ancho, int CapacidadMaxima, boolean EsRecuperable, int NumeroDeTripulantes) {
        super(CapacidadMaxima, EsRecuperable, NumeroDeTripulantes);
        this.masa = masa;
        this.longitud = longitud;
        this.ancho = ancho;
    }

    public EstacionEspacial(double masa, double longitud, double ancho, int CapacidadMaxima, boolean EsRecuperable, int NumeroDeTripulantes, String NombreMisionNave, double Propulsion, int TipoDeCarga, int PesoRoc6ket, String TipoCombustible, double VelocidadEscape, String TipoDeMision) {
        super(CapacidadMaxima, EsRecuperable, NumeroDeTripulantes, NombreMisionNave, Propulsion, TipoDeCarga, PesoRoc6ket, TipoCombustible, VelocidadEscape, TipoDeMision);
        this.masa = masa;
        this.longitud = longitud;
        this.ancho = ancho;
    }

    public double getMasa() {
        return masa;
    }

    public void setMasa(double masa) {
        this.masa = masa;
    }

    public double getLongitud() {
        return longitud;
    }

    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
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

    public void setPesoRocket(int PesoRocket) {
        this.PesoRocket = PesoRocket;
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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String TipoDeMision() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
         return "\n\nNombre de la mision o nave : " + NombreMisionNave +
                "\nPropulsion del cohete: " + Propulsion + 
                "\nTipo de carga del Cohete " + TipoDeCarga + 
                "\nPeso del Cohete: " + PesoRocket + 
                "\nTipo de combustible: " + TipoCombustible +
                "\nVelocidad de escape del cohete: " + VelocidadEscape +
                "\nTipo de mision: " + TipoDeMision + 
                "\nCapacidad Maxima: " + CapacidadMaxima +
                "\nNúmero de Tripulantes: " + NumeroDeTripulantes + 
                "\nMasa " + masa + 
                 "\nLongitud: " + longitud +
                 "\n\nAncho" + ancho; 
    }
    
}
