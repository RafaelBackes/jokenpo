/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jokenpo.Controller;

import java.util.Random;

/**
 *
 * @author 632120013
 */
public class Jogada {
    public int gerarnumero(){
        Random random = new Random();
        return random.nextInt(3) + 1;
    }
    
    public String resultado(int jogador,int computador){
        if(jogador == computador){
            return "Empate";
        }else if ((jogador == 1 && computador == 3) ||
                 (jogador == 2 && computador == 1) ||
                 (jogador == 3 && computador == 2)){
            return "Jogador Venceu";
        } else{
            return "Você é um perdedor";
        }
                  
    }
    
    
    
}
