package br.com.unifacef.dc.ex1;

public abstract class Produto {
    protected int volume;
    protected int serial;
    protected float preco;

    public Produto() {
    }

    public Produto(int volume, int serial, float preco) {
        this.volume = volume;
        this.serial = serial;
        this.preco = preco;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getSerial() {
        return serial;
    }

    public void setSerial(int serial) {
        this.serial = serial;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Produto{" + "volume=" + volume + ", serial=" + serial + ", preco=" + preco + '}';
    }
    
}
