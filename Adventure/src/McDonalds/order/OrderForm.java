package McDonalds.order;

import javax.swing.*;

public class OrderForm extends JFrame {
    private JTabbedPane tabbedPane;
    private JPanel panel1;
    private JPanel hamburgers;
    private JPanel Sides;
    private JPanel Desserts;
    private JPanel Drinks;
    private JPanel finalOrder;
    private JButton addOrder1;
    private JLabel totalLabel1;
    private JLabel priceLabel1;
    private JButton addOrder2;
    private JLabel totalLabel2;
    private JLabel priceLabel2;
    private JButton addOrder3;
    private JLabel totalLabel3;
    private JLabel priceLabel3;
    private JButton addOrder4;
    private JLabel totalLabel4;
    private JLabel priceLabel4;
    private JButton orderButton5;
    private JLabel totalLabel5;
    private JLabel priceLabel5;


    public OrderForm(String title) {
        super(title);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(tabbedPane);
        this.pack();
    }


    public static void main(String[] args) {
        OrderForm form = new OrderForm("Welcome to McDonald's!");
        form.setVisible(true);
    }

}
