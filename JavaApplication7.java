/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication7;

/**
 *
 * @author Student
 */
public class JavaApplication7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      int i,j;
      int x[][]={{3,4,5},{3,2,7}};
      int y[][]={{2,4,7},{1,2,2}};
      int l= x.length;
        System.out.println("first matrix is ");
        for( i=0;i<l;i++){
            for( j=0;j<i;j++){
            System.out.println(""+x[i][j]); }
        }
           System.out.println();
    
           int m=y.length;
           System.out.println("second matrix is"+"");
           for(i=0;i<m;i++){ 
               for(j=0;j<3;j++){
                   System.out.println(""+y[i][j]);
            }
               System.out.println();
  }
        System.out.println("summation of two matreix is:");
        for( i=0;i<m;i++){
            for(j=0;j<m;j++){
                System.out.println(""+x[i][j]+y[i][j]);
            } System.out.println();
        }
    }
}
