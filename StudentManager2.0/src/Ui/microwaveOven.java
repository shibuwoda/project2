package Ui;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class microwaveOven {
    public static void main(String[] args) {
        Frame frame = new Frame("微波炉界面");
        frame.setLayout(null);
        frame.setBounds(200,200,800,400);
        frame.setBackground(Color.blue);
        Panel panel = new Panel();
        panel.setBounds(0,0,500,400);
        panel.setBackground(Color.red);
        Panel panel2 = new Panel();
        panel2.setBounds(500,0,300,400);
        panel2.setBackground(Color.green);
        frame.add(panel2);
        frame.add(panel);

        Panel panel3 = new Panel(new GridLayout(4,3));
        panel3.setBounds(10,100,300,350);
        Button button;
        for (int i = 0; i < 12; i++) {
            button =  new Button(""+i);
            button.setSize(20,20);
            button.setBackground(Color.pink);
            panel3.add(button);
        }
        panel2.add(panel3);
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        frame.setVisible(true);
    }
}
