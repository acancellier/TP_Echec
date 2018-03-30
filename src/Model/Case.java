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
public class Case {
    private int x;
    private int y;
    private Piece piece;
    
    public Case(){
        x=0;
        y=0;
    }
    public Case(int X, int Y){
        x=X;
        y=Y;
    }
    public Case(int X, int Y, Piece lapiece){
        x=X;
        y=Y;
        piece=lapiece;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public boolean getCouleur(){
        return (this.x+this.y)%2 == 1;  
    }

    public Piece getPiece() {
        return piece;
    }

    public void setPiece(Piece piece) {
        this.piece = piece;
    }
    
    
    public boolean estVide()
    {
        return (piece == null);    
    }

    @Override
    public String toString() {
        return "Case{" + "x=" + x + ", y=" + y + ", piece=" + piece + '}';
    }
        
    
    
    
}
