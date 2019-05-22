
package br.com.unifacef.dc.Jokenpo;

public class Papel extends Mao {

    @Override
    public String quemSouEu(){
        return "Papel";
    }

    @Override
    public String compara(Mao mao) {
        //quem está sendo passado como parametro?
        String quem = mao.quemSouEu();
        switch(quem){
            case "Papel": return "Papel empata Papel";
            case "Pedra": return "Papel ganha Pedra";
            case "Tesoura": return "Papel perde Tesoura";
            default: return "Não sabemos responder";
        }
        
    }
        
}

