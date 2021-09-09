package view;

import controller.ButtonListener;

import javax.swing.*;

import java.awt.*;
import java.util.concurrent.Flow;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class View {

    private JButton button = new JButton("button");

    public View(){
        initFrame();
    }

    public void initFrame(){
        JFrame frame = new JFrame();
        frame.setSize(200,75);
        frame.setContentPane(new JPanel());
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.getContentPane().add(button);
        button.setLocation(0, 0);

        frame.setVisible(true);
    }

    public void addButtonListener(ButtonListener buttonListener){
        button.addActionListener(buttonListener);
    }


}
