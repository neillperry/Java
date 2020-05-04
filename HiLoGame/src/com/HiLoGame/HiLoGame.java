package com.HiLoGame;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HiLoGame extends JFrame {
    private JPanel mainPanel;
    private JLabel titleLabel;
    private JLabel instructLabel;
    private JTextField txtGuess;
    private JButton guessButton;
    private JLabel lblOutput;
    private int theNumber;


    public HiLoGame() {
        // defined the frame
        JFrame frame = new JFrame("HiLoGame");
        // called the panel inside the frame
        frame.setContentPane(new HiLoGame().mainPanel);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(mainPanel);
        this.pack();
        createUIComponents();
        frame.setVisible(true);

        guessButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                checkGuess();
            }
        });
    }

    public void createUIComponents() {
        lblOutput = new JLabel("Enter a number above and click Guess!");
    }

    public static void main(String[] args) {
       HiLoGame theGame = new HiLoGame();
       theGame.newGame();
    }



    public void checkGuess() {
        String guessText = txtGuess.getText();
        String message = " ";
        int guess = Integer.parseInt(guessText);

        // check to see if guess is too high, too low, or just right
        if (guess < theNumber ) {
            message = guess + " is too low. Try again.";
        } else if (guess > theNumber) {
            message = guess + " is too high. Try again.";
        } else {
            message = guess + " is correct! You win!";
        }

        lblOutput.setText(message);
    }


    public void newGame() {
        theNumber = (int)(Math.random() * 100 + 1);
    }


}
