/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestForLoop;

/**
 *
 * @author kayleighdoherty
 */
public class TestForLoop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] studentName = {"John","Mary", "Stephen","James", "Amy", "Fiona"};
   		int[] studentMarks = {90,56,70,66,81,96};
   		
   		for(int i = 0; i < studentName.length; i++){
   			
   			System.out.println("Student = " + studentName[i] + ", his/her mark = " + studentMarks[i]);
        }
    
    }
}  