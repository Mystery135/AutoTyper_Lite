package com.websiteofgames.AutoTyperLite;

import javax.swing.*;
import java.awt.*;

public class Frame {
    public static javax.swing.JFrame frame = new javax.swing.JFrame();
    public static JPanel panel = new JPanel();
    public static JCheckBox alreadyInClipboard;

    public Frame(){
        alreadyInClipboard = new JCheckBox();
        alreadyInClipboard.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        alreadyInClipboard.setBounds(100,100,20,20);



        frame.setSize(800,600);
        frame.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setVisible(true);
        frame.add(panel);
        panel.add(alreadyInClipboard);
        panel.setLayout(null);
    }




}
