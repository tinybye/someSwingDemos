package com.tinybye.demos.layout;

import javax.swing.*;
import java.awt.*;

/**
 * 流式布局管理器是 JPanel 和 JApplet 的默认布局管理器
 * 组件从左到右，从上到下排列，组件的位置根据窗口大小的变化而变动
 *
 * @author tinybye
 * @date 2022/9/6
 */
public class FlowLayoutDemo {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame("流式布局长啥样");
        JPanel jPanel1 = getJPanel();
        JPanel jPanel2 = getJPanel();
        JPanel jPanel3 = getJPanel();
        // 添加FlowLayout布局管理器，LEADING是跟随容器方向的开始边对齐，这是个依赖父容器的对齐，可以理解为相对方向。
        // 后面两个参数是容器内组件之间水平和竖直的间距
        jPanel1.setLayout(new FlowLayout(FlowLayout.LEADING, 20, 20));
        // 如果不指定ComponentOrientation，则LEADING会让组件从左对齐。如果指定为ComponentOrientation.RIGHT_TO_LEFT，则组件会跟随者从右对齐。
        jPanel1.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        // 添加FlowLayout布局管理器，LEFT是和容器的左边对齐，这是个固定方向的对齐
        jPanel2.setLayout(new FlowLayout(FlowLayout.LEFT, 20, 20));
        // 添加FlowLayout布局管理器，CENTER是居中对齐
        jPanel3.setLayout(new FlowLayout(FlowLayout.CENTER, 60, 20));
        jFrame.add(jPanel1, BorderLayout.NORTH);
        jFrame.add(jPanel2, BorderLayout.CENTER);
        jFrame.add(jPanel3, BorderLayout.SOUTH);
        jFrame.setBounds(300, 200, 800, 300);
        jFrame.setVisible(true);
    }

    public static JPanel getJPanel() {
        JPanel jPanel = new JPanel();
        // 面板中添加按钮
        jPanel.add(new JButton("1"));
        jPanel.add(new JButton("2"));
        jPanel.add(new JButton("3"));
        jPanel.add(new JButton("4"));
        jPanel.add(new JButton("5"));
        jPanel.add(new JButton("6"));
        return jPanel;
    }
}
