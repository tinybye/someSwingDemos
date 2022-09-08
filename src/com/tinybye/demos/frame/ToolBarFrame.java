package com.tinybye.demos.frame;

import javax.swing.*;
import java.awt.*;

/**
 * @author tinybye
 * @date 2022/9/6
 */
public class ToolBarFrame extends JFrame {
    public ToolBarFrame() throws HeadlessException {
        JButton button = new JButton("OK");
        JToolBar toolbar = new JToolBar();
        toolbar.add(button);
        setLayout(new BorderLayout());
        add(BorderLayout.NORTH, toolbar);
        setVisible(true);
    }

    public static void main(String[] args) {
        new ToolBarFrame();
    }
}
