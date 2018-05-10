package aula4;

public class Programa31 {
   public static void main( String args[] ){
      int array[]; 
      array = new int[ 10 ]; 
      System.out.printf( "%s%8s\n", "Índice", "Valor" );   
    
      for (int contador = 0; contador < array.length; contador++)    
         System.out.printf("%5d%8d\n", contador, array[ contador ]);
   } 
}
