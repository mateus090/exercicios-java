
package br.com.unifacef.dc.ex0;

import java.util.Date;

public class Volei extends Esporte {
    private String libero;
    private String saque;

    public Volei() {
    }

    public Volei(String libero, String saque, String historia, Date inicio, String local) {
        super(historia, inicio, local);
        this.libero = libero;
        this.saque = saque;
    }

    public String getLibero() {
        return libero;
    }

    public void setLibero(String libero) {
        this.libero = libero;
    }

    public String getSaque() {
        return saque;
    }

    public void setSaque(String saque) {
        this.saque = saque;
    }

    @Override
    public String toString() {
        return "Volei{" + "libero=" + libero + ", saque=" + saque + super.toString() + '}';
    }
    
    
}
