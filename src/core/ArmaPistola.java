package core;

import api.Arma;

public class ArmaPistola implements Arma{

    @Override
    public void atirar() {   
        System.out.println("Tiros de Pistola");
        for(int i=0; i<1; i++){
            System.out.println("==>");
        }
    }
    
}
