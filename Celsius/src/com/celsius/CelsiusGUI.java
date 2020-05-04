package com.celsius;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CelsiusGUI extends JFrame {


    private JPanel mainPanel;
    private JTextField celsisuTextField;
    private JLabel celsiusLabel;
    private JButton convertButton;
    private JLabel fahrenheitLabel;

    public CelsiusGUI(String title) {
        super(title);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(mainPanel);
        this.pack();

        convertButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // grab the text from the Celsius text field
                int tempFahr = (int) ((Double.parseDouble((celsisuTextField.getText()))) * 1.8 + 32);
                // convert to a double

                // update Fahrenheit label
                fahrenheitLabel.setText(tempFahr + " Fahrenheit");
            }
        });
    }


    public static void main(String[] args) {
        JFrame frame = new CelsiusGUI("My Celsius Converter");
        frame.setVisible(true);

    }


}
