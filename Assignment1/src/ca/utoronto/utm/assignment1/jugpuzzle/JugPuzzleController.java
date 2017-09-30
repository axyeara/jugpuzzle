package ca.utoronto.utm.assignment1.jugpuzzle;
import java.io.*;
import java.util.*;
/**
 * @author csc207 student
 * 
 * This class allows a console user to play an instance of JugPuzzle.
 */
public class JugPuzzleController {
        private static final String INVALID_INPUT_MESSAGE="Invalid number, please enter 0,1 or 2";

        private Scanner scanner;
        private JugPuzzle jugPuzzle;

        /**
         * Constructs a new JugPuzzleController with a new JugPuzzle, 
         * ready to play with a user at the console.
         */
        public JugPuzzleController(){
                jugPuzzle=new JugPuzzle();
                scanner=new Scanner(System.in);
        }

        /**
         * Prints a specified message and proceeds to ask the user for the Jug number (puzzle move)
         * to which the specified message command is applied. If the Jug number inputted by
         * the user is not between and including the specified lower and upper bounds of the number of Jug objects
         * in the puzzle, then an error message will be printed.
         * 
         * @param message Message to be displayed to the user that asks for his/her move inputs
         * @param lower   Lower bound of the number of Jug objects
         * @param upper   Upper bound of the number of Jug objects
         * @return  Move that was inputted by the user
         */
        private int getMove(String message, int lower, int upper){
                int move;
                while(true){
                        try {
                                System.out.print(message);
                                String line=scanner.nextLine();
                                move=Integer.parseInt(line);
                                if(lower<=move && move<=upper){
                                        return move;
                                } else {
                                        System.out.println(INVALID_INPUT_MESSAGE);
                                }
                        }
                        catch(NumberFormatException e){
                                System.out.println(INVALID_INPUT_MESSAGE);
                        }
                }
        }
        /**
         * While the JugPuzzle is not solved, the method prints the current state of the JugPuzzle 
         * (Number of moves, amount of liquid in jug and its capacity) and proceeds on asking
         * for user input. If the JugPuzzle is solved in a certain number of moves,
         * a message is printed indicating the user has won.
         */
        public void play(){
                while(!jugPuzzle.isPuzzleSolved()){
                        System.out.println(jugPuzzle); // called the toString() method of jugPuzzle
                        int from, to;
                        from = getMove("spill from jug: ", 0,2);
                        to   = getMove("into jug: ",0,2);
                        jugPuzzle.move(from,to);
                }
                if(jugPuzzle.getMoves()==1) {
                    System.out.println("Congrats you solved it in "+jugPuzzle.getMoves()+" move!!");
                } 
                else {
                	System.out.println("Congrats you solved it in "+jugPuzzle.getMoves()+" moves!!");
                }
        }

        public static void main(String [] args){
                JugPuzzleController jpcc=new JugPuzzleController();
                jpcc.play();
        }
}
