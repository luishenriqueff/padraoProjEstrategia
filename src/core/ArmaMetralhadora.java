package core;

import api.Arma;

public class ArmaMetralhadora implements Arma {

    @Override
    public void atirar() {
        System.out.println("Tiros de Metralhadora");
        for(int i=0; i<5; i++){
            System.out.println("==>");
        }
    }

}
