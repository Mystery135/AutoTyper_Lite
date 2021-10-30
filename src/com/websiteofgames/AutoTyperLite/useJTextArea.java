package com.websiteofgames.AutoTyperLite;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class useJTextArea implements ItemListener {
    public static boolean useJTextArea = true;
    @Override
    public void itemStateChanged(ItemEvent e) {
        if (Frame.alreadyInClipboard.isSelected()){
            useJTextArea = false;



        }else {
            useJTextArea = true;



        }

    }
}
