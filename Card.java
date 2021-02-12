/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamesZone1;

/**
 *
 * @author Azucena
 */
public class Card {
    private Suit suit;
    private Integer numero;
    
    public Card(Suit suit, Integer numero){
        this.suit = suit;
        this.numero = numero;
    }

    public String toString(){
        return String.format("%s %d", suit, numero);
    }
    /**
     * @return the suit
     */
    public Suit getSuit() {
        return suit;
    }

    /**
     * @param suit the suit to set
     */
    public void setSuit(Suit suit) {
        this.suit = suit;
    }

    /**
     * @return the numero
     */
    public Integer getNumero() {
        return numero;
    }

    /**
     * @param numero the numero to set
     */
    public void setNumero(Integer numero) {
        this.numero = numero;
    }
    
}
