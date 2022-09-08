package com.tinybye.demos.layout;

import javax.swing.*;
import java.awt.*;

/**
 * 卡片布局管理器
 * 可以理解为，把组件当做卡片一样堆叠在一起，并可以控制显示某个组件
 * 适合有在当前页面切换的逻辑时使用
 *
 * @author tinybye
 * @date 2022/9/7
 */
public class CardLayoutDemo {
    public static void main(String[] agrs) {
        JFrame frame = new JFrame("卡片布局长啥样");
        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        // 卡片式布局的面板
        CardLayout cardLayout = new CardLayout();
        frame.setLayout(cardLayout);

        JButton loginButton = new JButton("去登录");
        loginButton.addActionListener(e -> {
            // 让卡片布局管理器展示名为card2的面板
            cardLayout.show(frame.getContentPane(), "card2");
        });
        panel1.add(loginButton);
        panel1.add(new JButton("去注册"));
        panel2.add(new JTextField("用户名", 20));
        panel2.add(new JTextField("密码", 20));
        JButton returnButton = new JButton("返回首页");
        returnButton.addActionListener(e -> {
            // 让卡片布局管理器展示名为card1的面板
            cardLayout.show(frame.getContentPane(), "card1");
        });
        panel2.add(returnButton);
        // 添加面板1，将该面板命名为card1
        frame.add(panel1, "card1");
        // 添加面板2，将该面板命名为card2
        frame.add(panel2, "card2");
        frame.setBounds(300, 200, 300, 200);
        frame.setVisible(true);
    }
}
