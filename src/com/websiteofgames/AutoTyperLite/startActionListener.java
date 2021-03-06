package com.websiteofgames.AutoTyperLite;

import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.util.Timer;
import java.util.TimerTask;

public class startActionListener implements ActionListener {



    @Override
    public void actionPerformed(ActionEvent e) {



        if (useJTextArea.useJTextArea == true){




            String stringToPaste =  Frame.wordstoPaste.getText();
            System.out.println("Pasting: " + stringToPaste);



            StringSelection stringSelection = new StringSelection(stringToPaste);
            Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
            clipboard.setContents(stringSelection, null);
        }




        try {



            Robot robot = new Robot();
            String timesToPasteString = Frame.timesToPaste.getText();
            int timesToPasteInt = Integer.parseInt(timesToPasteString);
            String timeBetweenPastesString = Frame.timeBetweenPastes.getText();
            int timeBetweenPastesInt = Integer.parseInt(timeBetweenPastesString);




            Timer timer = new Timer();
            TimerTask timerTask = new TimerTask() {
                int timerNumber = 3;
                @Override
                public void run() {
                    Frame.start.setText("Starting in " + timerNumber);
                    System.out.println(timerNumber);

                    timerNumber--;




                if (timerNumber<=0){


                    timer.cancel();
                    robot.delay(1000);
                    Frame.start.setText("Started!");




                    for (int i = 0; i<timesToPasteInt; i++){

                        robot.keyPress(KeyEvent.VK_CONTROL);
                        robot.keyPress(KeyEvent.VK_V);
                        robot.keyRelease(KeyEvent.VK_CONTROL);
                        robot.keyRelease(KeyEvent.VK_V);

                        robot.keyPress(KeyEvent.VK_ENTER);
                        robot.keyRelease(KeyEvent.VK_ENTER);

                        robot.delay(timeBetweenPastesInt);


                    }


                    Frame.start.setText("Start!");



                }


                }
            };
            timer.scheduleAtFixedRate(timerTask,0,1000);




















        } catch (AWTException ex) {
            ex.printStackTrace();
        }










    }
}
