/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author csnd2342
 */
public class Piece {
    private char nom;
    private boolean couleur;
    
    public Piece(){
        nom='-';
    }
    
    public Piece(char Nom, boolean Couleur){
        nom=Nom;
        couleur=Couleur;
    }

    public char getNom() {
        return nom;
    }

    public void setNom(char nom) {
        this.nom = nom;
    }

    public boolean isCouleur() {
        return couleur;
    }

    public void setCouleur(boolean couleur) {
        this.couleur = couleur;
    }
    
    @Override
    public String toString() {
        return nom+"";
    }
    
    
}
