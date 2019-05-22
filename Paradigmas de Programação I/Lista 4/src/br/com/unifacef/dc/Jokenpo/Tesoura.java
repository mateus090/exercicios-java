
package br.com.unifacef.dc.Jokenpo;

public class Tesoura extends Mao {
    
    @Override
    public String quemSouEu(){
        return "Tesoura";
    }

    @Override
    public String compara(Mao mao) {
        //quem está sendo passado como parametro?
        String quem = mao.quemSouEu();
        switch(quem){
            case "Tesoura": return "Tesoura empata Tesoura";
            case "Papel": return "Tesoura ganha Papel";
            case "Pedra": return "Tesoura perde Pedra"; 
            default: return "Não sabemos responder";
        }
    }
    
}
