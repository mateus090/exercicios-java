
package br.com.unifacef.dc.ex0;

import java.util.Date;

public class Futebol extends Esporte {
    private String modalidade;
    private String penalti;

    public Futebol() {
    }

    public Futebol(String modalidade, String penalti, String historia, Date inicio, String local) {
        super(historia, inicio, local);
        this.modalidade = modalidade;
        this.penalti = penalti;
    }

    public String getModalidade() {
        return modalidade;
    }

    public void setModalidade(String modalidade) {
        this.modalidade = modalidade;
    }

    public String getPenalti() {
        return penalti;
    }

    public void setPenalti(String penalti) {
        this.penalti = penalti;
        
    }

    @Override
    public String toString() {
        return "Futebol{" + "modalidade=" + modalidade + ", penalti=" + penalti + super.toString() + '}';
    }
    
    
}
