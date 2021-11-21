package Utilities;

public class Trigonometria {
    double hipotenusa, cateto_oposto, cateto_adjacente, seno, cosseno, tangente = 0.0;


    public double getHipotenusa() {
        return hipotenusa;
    }

    public void setHipotenusa(double hipotenusa) {
        this.hipotenusa = hipotenusa;
    }

    public double getCateto_oposto() {
        return cateto_oposto;
    }

    public void setCateto_oposto(double cateto_oposto) {
        this.cateto_oposto = cateto_oposto;
    }

    public double getCateto_adjacente() {
        return cateto_adjacente;
    }

    public void setCateto_adjacente(double cateto_adjacente) {
        this.cateto_adjacente = cateto_adjacente;
    }

    public double getSeno() {
        return seno;
    }

    public void setSeno(double seno) {
        this.seno = seno;
    }

    public double getCosseno() {
        return cosseno;
    }

    public void setCosseno(double cosseno) {
        this.cosseno = cosseno;
    }

    public double getTangente() {
        return tangente;
    }

    public void setTangente(double tangente) {
        this.tangente = tangente;
    }

    public Trigonometria(double hipotenusa, double cateto_oposto, double cateto_adjacente, double seno, double cosseno, double tangente) {
        this.hipotenusa = hipotenusa;
        this.cateto_oposto = cateto_oposto;
        this.cateto_adjacente = cateto_adjacente;
        this.seno = seno;
        this.cosseno = cosseno;
        this.tangente = tangente;
    }

    public double calcular_Trigonometria(double retorno){
        seno = cateto_oposto/hipotenusa;
        cosseno = cateto_adjacente/hipotenusa;
        tangente = cateto_oposto/cateto_adjacente;
        return retorno;
    }
}
