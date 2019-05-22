
package br.com.unifacef.dc.Jokenpo;

public class Pedra extends Mao {

    @Override
    public String quemSouEu(){
        return "Pedra";
    }
    
    @Override
    public String compara(Mao mao) {
        //quem está sendo passado como parametro?
        String quem = mao.quemSouEu();
        switch(quem){
            case "Pedra": return "Pedra empata Pedra";
            case "Tesoura": return "Pedra ganha Tesoura";
            case "Papel": return "Pedra perde Papel";
            default: return "Não sabemos responder";
        }
    }
    
    
        
}
