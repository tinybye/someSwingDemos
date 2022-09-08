package com.tinybye.demos.layout;

import javax.swing.*;
import java.awt.*;

/**
 * 网格布局管理器
 * 画一个网格，将组件放到格子里。所有各自的宽度和高度都相等，无视组件的最佳大小。
 * 其实就很丑
 * 画个五子棋盘倒是可以
 *
 * @author tinybye
 * @date 2022/9/8
 */
public class GridLayoutDemo {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame("网格布局长啥样");
        // 两行三列的网格，水平和竖直间隙为10
        jFrame.setLayout(new GridLayout(2, 3, 10, 10));
        jFrame.add(new Button("1"));
        jFrame.add(new Button("2"));
        jFrame.add(new Button("3"));
        jFrame.add(new JLabel("你好"));
        jFrame.add(new TextField());
        jFrame.setBounds(300, 200, 300, 300);
        jFrame.setVisible(true);
    }
}
