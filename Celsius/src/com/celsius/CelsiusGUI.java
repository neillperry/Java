package com.celsius;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;

public class CelsiusGUI extends JFrame {

    private int count = 100;
    private JPanel mainPanel;
    private JTextField friesField;
    private JLabel mcdonaldLabel;
    private JButton orderButton;
    private JLabel bottomLabel;
    private JTextField drinkField;
    private JTextArea textArea1;
    private JTextField burgerField;
    private JLabel orderLabel;
    private JLabel hamburgerLabel;
    private JLabel friesLabel;
    private JLabel drinkLabel;
    private JButton newGame;
    private Timer timer;

    public CelsiusGUI(String title) {
        super(title);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(mainPanel);
        this.pack();


        timer = new Timer(500, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                count--;
                if (count > 1) {
                    orderLabel.setText(Integer.toString(count));
                } else {
                    ((Timer) (e.getSource())).stop();
                }
            }
        });



        orderButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea1.setText(burgerField.getText() + " hamburgers " +
                        "\n " + friesField.getText() + " fries" +
                        "\n " + drinkField.getText() + " drinks");
                orderButton.setText("Confirm Order");

                timer.setInitialDelay(0);
                timer.start();
                // grab the text from the Celsius text field
                //checkGuess();
            }
        });
    }


    public static void main(String[] args) {
        // JFrame frame = new CelsiusGUI("Neill's Guessing Game");
        // frame.setVisible(true);
        CelsiusGUI game = new CelsiusGUI("Welcome to McDonald's");
        game.setVisible(true);
        game.newGame();


    }

    public void checkGuess() {
        String guessText = friesField.getText();
        String message = " ";
        int guess = Integer.parseInt(guessText);

        // check to see if guess is too high, too low, or just right
        if (guess < count ) {
            message = guess + " is too low. Try again.";
        } else if (guess > count) {
            message = guess + " is too high. Try again.";
        } else {
            message = guess + " is correct! You win!";
        }

        bottomLabel.setText(message);
    }


    public void newGame() {
        count = (int)(Math.random() * 100 + 1);
    }


    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
