package Ui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginJFrame extends JFrame {
    public LoginJFrame(){
        this.setSize(488,430);

        //        页面标题
        this.setTitle("拼图单机版v1.0");
//        界面顶置在最前面
        this.setAlwaysOnTop(true);
//        页面居中
        this.setLocationRelativeTo(null);
//        全部关闭
        this.setDefaultCloseOperation(3);
        this.setLayout(null);
        JButton jButton = new JButton("点我");
        jButton.setBounds(0,0,100,50);
        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("点击");
            }
        });
        this.getContentPane().add(jButton);
        this.setVisible(true);
    }
}
