/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin19;

/**
 *
 * @author slorenzorodriguez
 */
public class BOLETIN19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
            // 1- Realiza un programa que cree un array chamado “numeros” con 
        //6 numeros aleatorios dun rango de 1 a 50 .
        // Seguidamente visualiza o array o revés 
        //( 0 primeiro elemento visualizaráse  o último e asi sucesivamente )
        
        RandomNumbers random = new RandomNumbers();
        random.Random();
        random.RandomUpsideDown();
    
}}

  
