import javax.swing.*;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.text.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

public class Game extends JPanel implements ActionListener {
    protected JButton button1, button2, button3;
    private JTextField celsisuTextField;
    private JLabel label;
    /**
     * Create the GUI and show it.  For thread safety,
     * this method should be invoked from the
     * event-dispatching thread.
     */

    public Game() {
        //Add the ubiquitous "Hello World" label.
        label = new JLabel("Hello World");
        label.setForeground(Color.BLUE);
        label.setBackground(Color.DARK_GRAY);
        label.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 5));
        label.setFont(Font.getFont(Font.SANS_SERIF));

        // Button 1
        button1 = new JButton("Disable middle button");
        button1.setVerticalTextPosition(AbstractButton.CENTER);
        button1.setHorizontalTextPosition(AbstractButton.LEADING); //aka LEFT, for left-to-right locales
        button1.setMnemonic(KeyEvent.VK_D);
        button1.setActionCommand("disable");

        button2 = new JButton("Middle button");
        button2.setVerticalTextPosition(AbstractButton.BOTTOM);
        button2.setHorizontalTextPosition(AbstractButton.CENTER);
        button2.setMnemonic(KeyEvent.VK_M);

        button3 = new JButton("Enable middle button");
        //Use the default text position of CENTER, TRAILING (RIGHT).
        button3.setMnemonic(KeyEvent.VK_E);
        button3.setActionCommand("enable");
        button3.setEnabled(false);

        // add the items to the component
        add(label);
        add(button1);
        add(button2);
        add(button3);
    }


    private static void createAndShowGUI() {
        //Create and set up the window.
        JFrame frame = new JFrame("HelloWorldSwing");
        frame.setBackground(Color.GREEN);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // create and set up the content pane
        Game newGame = new Game();
        newGame.setOpaque(true);
        frame.setContentPane(newGame);

        //Display the window.
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        //Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if ("disable".equals(e.getActionCommand())) {
            button2.setEnabled(false);
            button1.setEnabled(false);
            button3.setEnabled(true);
        } else {
            button2.setEnabled(true);
            button1.setEnabled(true);
            button3.setEnabled(false);
        }
    }
}
