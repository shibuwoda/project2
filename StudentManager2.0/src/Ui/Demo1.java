package Ui;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Demo1 {
    public static void main(String[] args) {
        Frame frame = new Frame("实验窗口");
        frame.setBounds(200,200,400,400);
        frame.setBackground(Color.pink);
        frame.setLayout(null);
        Panel panel = new Panel();
        panel.setBounds(50,50,100,100);
        panel.setBackground(Color.BLUE);
        frame.add(panel);
        frame.setVisible(true);
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
}
