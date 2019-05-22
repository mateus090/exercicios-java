
package br.com.unifacef.dc.ex0;

import java.util.Date;

public class Basquete extends Esporte{
    private String linha3,lanceLivre;

    public Basquete() {
    }

    public Basquete(String linhaDosTres, String lanceLivre, String historia, Date inicio, String local) {
        super(historia,inicio,local);
        this.linha3 = linhaDosTres;
        this.lanceLivre = lanceLivre;
        
    }

    public String getLinhaDosTres() {
        return linha3;
    }

    public void setLinhaDosTres(String linhaDosTres) {
        this.linha3 = linhaDosTres;
    }

    public String getLanceLivre() {
        return lanceLivre;
    }

    public void setLanceLivre(String lanceLivre) {
        this.lanceLivre = lanceLivre;
    }

    @Override
    public String toString() {
        return "Basquete{" + "linha3=" + linha3 + ", lanceLivre=" + lanceLivre + super.toString() + '}';
    }
    
    
}

