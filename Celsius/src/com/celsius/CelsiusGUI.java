package com.celsius;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CelsiusGUI extends JFrame {

    int theNumber;
    private JPanel mainPanel;
    private JTextField celsisuTextField;
    private JLabel celsiusLabel;
    private JButton convertButton;
    private JLabel fahrenheitLabel;
    private JTextField textField1;
    private JTextArea textArea1;
    private JTextField textField2;
    private JLabel orderLabel;
    private JButton newGame;

    public CelsiusGUI(String title) {
        super(title);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(mainPanel);
        this.pack();

        convertButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // grab the text from the Celsius text field
                checkGuess();
            }
        });
    }


    public static void main(String[] args) {
        // JFrame frame = new CelsiusGUI("Neill's Guessing Game");
        // frame.setVisible(true);
        CelsiusGUI game = new CelsiusGUI("Neill's Guessing Game");
        game.setVisible(true);
        game.newGame();


    }

    public void checkGuess() {
        String guessText = celsisuTextField.getText();
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

        fahrenheitLabel.setText(message);
    }


    public void newGame() {
        theNumber = (int)(Math.random() * 100 + 1);
    }


    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
