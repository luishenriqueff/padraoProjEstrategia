package padraoestrategia;

import core.ArmaMetralhadora;
import core.ArmaPistola;
import modelo.Nave;

public class AplicacaoNave {

    public static void main(String[] args) {
        
        Nave nave = new Nave();
        
        nave.setArma(new ArmaPistola());
        nave.getArma().atirar();
        
        nave.setArma(new ArmaMetralhadora());
        nave.getArma().atirar();
    }
    
}
