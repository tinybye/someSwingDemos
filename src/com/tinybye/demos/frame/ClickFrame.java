package com.tinybye.demos.frame;

import javax.swing.*;
import java.awt.*;

/**
 * 一个有交互的窗口
 *
 * @author tinybye
 * @date 2022/9/6
 */
public class ClickFrame extends JFrame {

    int count = 0;

    public ClickFrame(String title) {
        super(title);
        JLabel label = new JLabel("点击次数：" + count);
        JButton button = new JButton("点我");
        // 按钮监听事件
        button.addActionListener(e -> {
            count++;
            // 弹出一个简易的dialog对话框
            JOptionPane.showMessageDialog(null, "别点了，别点了！");
            label.setText("点击次数：" + count);
        });
        // 设置布局，这里使用流式布局
        setLayout(new FlowLayout());
        // 标签和按钮都添加进窗口
        add(label);
        add(button);
        // 指定窗口位置与大小
        setBounds(300, 100, 200, 100);
        // 显示窗口
        setVisible(true);
    }

    public static void main(String[] args) {
        new ClickFrame("一个有交互的窗口");
    }
}
