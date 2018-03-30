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
public class Echiquier {
    private Case[][] lechiquier;
    
    public Echiquier(){
        lechiquier=new Case[8][8];
        
        for(int ii=0;ii<8;ii++){
            for(int jj=0;jj<8;jj++){
                
                lechiquier[ii][jj]=new Case(ii,jj);
                if(ii==1||ii==6){
                    if(ii==1)
                        lechiquier[ii][jj].setPiece(new Piece('p',true)); 
                    else if (ii==6)
                        lechiquier[ii][jj].setPiece(new Piece('P',false)); 
                }        
                else if((ii==0||ii==7)&&(jj==0||jj==7)){
                    if(ii==0)
                        lechiquier[ii][jj].setPiece(new Piece('t',true)); 
                    else if (ii==7)
                        lechiquier[ii][jj].setPiece(new Piece('T',false)); 
                }    
                else if((ii==0||ii==7)&&(jj==1||jj==6)){
                    if(ii==0)
                    lechiquier[ii][jj].setPiece(new Piece('c',true)); 
                    else if (ii==7)
                        lechiquier[ii][jj].setPiece(new Piece('C',false)); 
                }    
                else if((ii==0||ii==7)&&(jj==2||jj==5)){
                    if(ii==0)
                        lechiquier[ii][jj].setPiece(new Piece('f',true)); 
                    else if (ii==7)
                        lechiquier[ii][jj].setPiece(new Piece('F',false)); 
                }    
                else if((ii==0||ii==7)&&(jj==3)){
                    if(ii==0)
                        lechiquier[ii][jj].setPiece(new Piece('d',true)); 
                    else if (ii==7)
                        lechiquier[ii][jj].setPiece(new Piece('D',false)); 
                }    
                else if((ii==0||ii==7)&&(jj==4)){
                    if(ii==0)
                        lechiquier[ii][jj].setPiece(new Piece('r',true)); 
                    else if (ii==7)
                        lechiquier[ii][jj].setPiece(new Piece('R',false));
                }
        
            }
           
        }
    }
    
    public void deplacement(int xdepart,int ydepart, int xarrive, int yarrive){
      
      if(lechiquier[xdepart][ydepart].getPiece()!=null){
          
          char nomDepart=lechiquier[xdepart][ydepart].getPiece().getNom();
          boolean couleurDepart=lechiquier[xdepart][ydepart].getPiece().isCouleur();
          
          Piece pieceDepart=new Piece(nomDepart,couleurDepart);
          
          if(lechiquier[xarrive][yarrive].getPiece()==null){
              lechiquier[xarrive][yarrive].setPiece(pieceDepart);
              lechiquier[xdepart][ydepart].setPiece(null);
          }
          else{
              char nomArrive=lechiquier[xarrive][yarrive].getPiece().getNom();
              boolean couleurArrive=lechiquier[xarrive][yarrive].getPiece().isCouleur();
              
              if(couleurDepart!=couleurArrive){
                  lechiquier[xarrive][yarrive].setPiece(pieceDepart);
                  lechiquier[xdepart][ydepart].setPiece(null);
              }
              else{
                  System.out.println("Vous ne pouvez pas aller sur une case occupée par une de vos pièces");
              }
          }
      }
      
      else{
          System.out.println("Cette case n'est pas occupée par une pièce");
      }
    }
        
    @Override
    public String toString() {
        String resultat="";
        for(int ii=0;ii<8;ii++){
            for(int jj=0;jj<8;jj++){
                Piece test=lechiquier[ii][jj].getPiece();
                if(test!=null)
                    resultat+=lechiquier[ii][jj].getPiece().toString()+" ";
                else
                    resultat+="- ";
            }
            resultat+="\n";
        }
        return resultat;
    }
    
}
