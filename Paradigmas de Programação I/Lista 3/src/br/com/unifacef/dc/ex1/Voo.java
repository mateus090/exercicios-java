
package br.com.unifacef.dc.ex1;

public class Voo {
    private String destino;
    private String numero;

    public Voo(String destino, String numero) {
        this.destino = destino;
        this.numero = numero;
    }

    public Voo() {
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Voo{" + "destino=" + destino + ", numero=" + numero + '}';
    }
    
    
}
