/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamesZone1;

import java.util.Random;

/**
 *
 * @author Azucena
 */
public class PickTwoCards {

    public static void main(String[] args) {
       // Card card = new Card(Suit.PICAS,1);
        //System.out.println(card);
        
        Random random = new Random();
        
        for (int i=0;i<10;i++){
            Card card = new Card(Suit.PICAS, random.nextInt(13)+1);
            System.out.println(card);        
        }
    }
    
}
