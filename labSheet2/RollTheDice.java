package labSheet2;

import javax.swing.*;

public class RollTheDice {
    public static void main(String[] args) {
        String input;
        int gamesCount=0,playerWin=0,CompWin=0,draw=0;
        char result;

        while(JOptionPane.showInputDialog("Would you like to play? (yes or no").equals("yes")){
            result = rollTheDice();
            switch (result){
                default:
                    draw++;
                    break;
                case ('p'):
                    playerWin++;
                    break;
                case('c'):
                    CompWin++;
                    break;
            }
            gamesCount++;
            JOptionPane.showMessageDialog(null,"Games played "+
                    gamesCount + "\nComputer wins " + CompWin + "\nPlayer Wins "+
                    playerWin + "\nDraws " + draw);
        }
        JOptionPane.showMessageDialog(null,"Thanks for playing!");
        System.exit(0);

    }
    static char rollTheDice(){
        int comp,player;
        comp = (int)(Math.random()*10 + 2);
        JOptionPane.showMessageDialog(null,"The computer rolled " + comp);
        player = (int)(Math.random()*10 + 2);
        JOptionPane.showMessageDialog(null,"The player rolled " + player);
        if(comp == player) return 'd';
        else if(comp > player) return 'c';
        else return 'p';
    }
}
