package com.tinybye.demos.layout;

import javax.swing.*;
import java.awt.*;

/**
 * BorderLayout是默认布局
 * 该布局可以管理最多5个组件，位置是东西南北中五个方位
 * 可以去掉某个方位，来改变布局样式
 * 适合页面简单的布局
 *
 * @author tinybye
 * @date 2022/9/7
 */
public class BorderLayoutDemo {
    public static void main(String[] args) {
        JFrame frame = new JFrame("BorderLayout布局长啥样");
        // 构造方法可以指定组件的水平和垂直间距，当然无参构造方法则默认间距为0了
        BorderLayout layout = new BorderLayout(10,10);
        frame.setLayout(layout);
        JButton up = new JButton("上");
        JButton left = new JButton("左");
        JButton center = new JButton("中");
        JButton right = new JButton("右");
        JButton down = new JButton("下");
        frame.add(up, BorderLayout.NORTH);
        frame.add(left, BorderLayout.WEST);
        frame.add(center, BorderLayout.CENTER);
        frame.add(right, BorderLayout.EAST);
        frame.add(down, BorderLayout.SOUTH);
        frame.setBounds(300, 200, 600, 300);
        frame.setVisible(true);
    }
}
