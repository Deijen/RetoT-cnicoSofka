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
public class TransbordadorEspacial extends NaveTripulada{
    
    private double altura;
    private double diametro; 
    private double masa; 
    private int etapas; 

    public TransbordadorEspacial() {
    }

    public TransbordadorEspacial(double altura, double diametro, double masa, int etapas) {
        this.altura = altura;
        this.diametro = diametro;
        this.masa = masa;
        this.etapas = etapas;
    }

    public TransbordadorEspacial(double altura, double diametro, double masa, int etapas, int CapacidadMaxima, boolean EsRecuperable, int NumeroDeTripulantes) {
        super(CapacidadMaxima, EsRecuperable, NumeroDeTripulantes);
        this.altura = altura;
        this.diametro = diametro;
        this.masa = masa;
        this.etapas = etapas;
    }

    public TransbordadorEspacial(double altura, double diametro, double masa, int etapas, int CapacidadMaxima, boolean EsRecuperable, int NumeroDeTripulantes, String NombreMisionNave, double Propulsion, int TipoDeCarga, int PesoRoc6ket, String TipoCombustible, double VelocidadEscape, String TipoDeMision) {
        super(CapacidadMaxima, EsRecuperable, NumeroDeTripulantes, NombreMisionNave, Propulsion, TipoDeCarga, PesoRoc6ket, TipoCombustible, VelocidadEscape, TipoDeMision);
        this.altura = altura;
        this.diametro = diametro;
        this.masa = masa;
        this.etapas = etapas;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getDiametro() {
        return diametro;
    }

    public void setDiametro(double diametro) {
        this.diametro = diametro;
    }

    public double getMasa() {
        return masa;
    }

    public void setMasa(double masa) {
        this.masa = masa;
    }

    public int getEtapas() {
        return etapas;
    }

    public void setEtapas(int etapas) {
        this.etapas = etapas;
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
    public String TipoDeMision() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String DescripcionDeMision() {
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
                 "\nAltura: " + altura+
                 "\nDiametro" + diametro +
                 "\n\nEtapas" + etapas; 
        
    }
    
}
