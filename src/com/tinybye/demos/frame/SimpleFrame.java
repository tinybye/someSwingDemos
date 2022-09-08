package com.tinybye.demos.frame;

import javax.swing.*;

/**
 * 只有hello world的窗口
 *
 * @author tinybye
 * @date 2022/9/6
 */
public class SimpleFrame extends JFrame {
    public SimpleFrame(String title) {
        super(title);
        JLabel label = new JLabel("Hello world!");
        add(label);
        // 指定窗口位置与大小
        setBounds(300, 100, 400, 200);
        // 显示窗口
        setVisible(true);

    }

    public static void main(String[] args) {
        new SimpleFrame("我是一个窗口");
    }
}
