package com.websiteofgames.AutoTyperLite;

import javax.swing.*;
import java.awt.*;

public class Frame {

    public static javax.swing.JFrame frame = new javax.swing.JFrame();
    public static JPanel panel = new JPanel();
    public static JCheckBox alreadyInClipboard;
    public static JTextArea wordstoPaste;
    public static JLabel alreadyInClipboardLabel;
    public static JLabel title;
    public static JButton start;
    public static JTextField timesToPaste;
    public static JLabel timesToPasteLabel;
    public static JTextField timeBetweenPastes;
    public static JLabel timeBetweenPastesLabel;


    public Frame(){
        title = new JLabel("AutoTyper Lite v0.1.2");


        title.setFont(new Font(null,Font.BOLD,30));
        title.setBounds(255, 40,1000,50);

        wordstoPaste = new JTextArea();
        wordstoPaste.setBounds(150, 140,500,275);

        alreadyInClipboardLabel = new JLabel("Already Copied? (If Checked Program Will Ignore TextArea Above)");
        alreadyInClipboardLabel.setBounds(150,422,387,25);

        alreadyInClipboard = new JCheckBox("");
        alreadyInClipboard.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        alreadyInClipboard.setBounds(650,425,20,20);
        alreadyInClipboard.addItemListener(new useJTextArea());

        timesToPaste = new JTextField();
        timesToPasteLabel = new JLabel("Times To Paste:");
        timesToPaste.setBounds(350,452,100,25);
        timesToPasteLabel.setBounds(150,452,100,25);


        timeBetweenPastes = new JTextField();
        timeBetweenPastesLabel = new JLabel("Time Between Pastes (ms):");
        timeBetweenPastes.setBounds(350,482,100,25);
        timeBetweenPastesLabel.setBounds(152,480,170,25);






        start = new JButton("Start!");
        start.setBounds(325, 510,150,50);
        start.addActionListener(new startActionListener());
        start.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));




        frame.setSize(800,600);
        frame.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setVisible(true);
        frame.add(panel);
        panel.add(timeBetweenPastes);
        panel.add(timeBetweenPastesLabel);
        panel.add(timesToPasteLabel);
        panel.add(timesToPaste);
        panel.add(start);
        panel.add(title);
        panel.add(alreadyInClipboard);
        panel.add(wordstoPaste);
        panel.add(alreadyInClipboardLabel);
        panel.setLayout(null);
    }




}
