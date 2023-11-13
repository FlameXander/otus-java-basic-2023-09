package ru.otus.java.basic.lesson13.oop4;

import javax.swing.*;
import java.awt.*;
import java.io.Serializable;

public class MainApp {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Demo");
        jFrame.setSize(400, 400);
        jFrame.setLocation(400, 400);
        jFrame.setLayout(new FlowLayout());

//        JButton jb1  = new JButton("1");
//        jFrame.add(jb1);
//        jb1.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                System.out.println(1);
//            }
//        });
        // public class MainApp$1 implements ActionListener {
        //   @Override
        //   public void actionPerformed(ActionEvent e) {
        //     System.out.println(1);
        //   }
        // }
        // jb1.addActionListener(new MainApp$1());

        for (int i = 0; i < 10; i++) {
            JButton button = new JButton(String.valueOf(i));
            int w = i;
            button.addActionListener(e -> System.out.println(w));
            jFrame.add(button);
        }

        jFrame.setVisible(true);
    }
}
