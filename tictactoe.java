/home/wmgreen/repos/Java Projects
import java.util.Scanner;
import java.util.Random;
import java.util.*;
import java.util.ArrayList;
public class Main {
    
    
    
    public static void main(String[] args){
        char[][] test = {{'-','-','-',},{'-','-','-',},{'-','-','-',}};
        boolean GameWin = false;
    
        
        System.out.println("Original array: ");
        board(test);
    
        
        while(GameWin == false){
         playerturn(test);
        System.out.println("Updated Array:");
        board(test);
        getNextMove(test);
        System.out.println("Updated Array:");
        board(test);
        
        if(test[0][0]=='x' &&test[0][1]=='x' &&test[0][2]=='x'){
            GameWin = true;
        }else if(test[1][0]=='x'&&test[1][1]=='x'&&test[1][2]=='x'){
            GameWin = true;
        }else if(test[2][0]=='x'&&test[2][1]=='x'&&test[2][2]=='x'){
            GameWin = true;
        }else if(test[2][0]=='x'&&test[2][1]=='x'&&test[2][2]=='x'){
            GameWin = true;
        }else if(test[0][0]=='x'&&test[1][0]=='x'&&test[2][0]=='x'){
            GameWin = true;
        }else if(test[0][1]=='x'&&test[1][1]=='x'&&test[2][2]=='x'){
            GameWin = true;
        }else if(test[0][2]=='x'&&test[1][2]=='x'&&test[2][3]=='x'){
            GameWin = true;
        }else if(test[0][0]=='x'&&test[1][1]=='x'&&test[2][2]=='x'){
            GameWin = true;
        }else if(test[2][1]=='x'&&test[1][1]=='x'&&test[0][2]=='x'){
            GameWin = true;
        }

    }
    }
    
   
  

 
public static void board(char[][] arr) {
        
        
    for (char[] row : arr) {
        for (char val : row) {
            System.out.print(val + " ");
        }
        System.out.println();
    }

}
public static void playerturn(char[][] arr){
    char x = 'x';
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter Row and Column to edit: ");
    int ro= scan.nextInt();
    int co= scan.nextInt();
    arr[ro][co] = x;
}
    


public static int[] getNextMove(char[][] arr){
    Random random;
    random = new Random();
    int row = random.nextInt(3);
    int col = random.nextInt(3);
    char o = 'o';

    while (arr[row][col] != '-') {
        row = random.nextInt(3);
        col = random.nextInt(3);
    }
    int[] move ={row,col};
    arr[row][col] = o;
    return move;
}
}
