/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Boletin19_4;

import javax.swing.JOptionPane;

/**
 *
 * @author slorenzorodriguez
 */
//Realiza un programa que calcule a letra do NIF. Para eso fai o seguinte :
//    • Divide o nº do DNI entre 23, sen sacar decimais, e anota o resto da división.
//    • Mira na táboa asociada o resto.( exemplo: nº 1  R )
//A ->3	B 11	C 20	D 9   E 22	F 7	G 4	H 18	J 13	K 21	L 19
//M 5	N 12	P 8	Q 16	R 1	S 15	T 0	V 17	W 2	X 10	Y 6
//Z 14.

public class Dni {
    
    public void dni (int [] array, String [] arrayx){
        int dni = Integer.parseInt(JOptionPane.showInputDialog("Introduzca dni: "));
        int resto = dni%23;
        for (int i=0;i<array.length;i++){
            if (resto == array[i]){
                System.out.println("\nnº: " + array[i] + "--> " + arrayx[i]);
            }
        }
    }
}
                
                
         
