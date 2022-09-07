package com.tinybye.demos.layout;

import javax.swing.*;
import java.awt.*;

/**
 * ��Ƭ���ֹ�����
 * �������Ϊ�������������Ƭһ���ѵ���һ�𣬲����Կ�����ʾĳ�����
 * �ʺ����ڵ�ǰҳ���л����߼�ʱʹ��
 *
 * @author tinybye
 * @date 2022/9/7
 */
public class CardLayoutDemo {
    public static void main(String[] agrs) {
        JFrame frame = new JFrame("��Ƭ���ֳ�ɶ��");
        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        // ��Ƭʽ���ֵ����
        CardLayout cardLayout = new CardLayout();
        frame.setLayout(cardLayout);

        JButton loginButton = new JButton("ȥ��¼");
        loginButton.addActionListener(e -> {
            // �ÿ�Ƭ���ֹ�����չʾ��Ϊcard2�����
            cardLayout.show(frame.getContentPane(), "card2");
        });
        panel1.add(loginButton);
        panel1.add(new JButton("ȥע��"));
        panel2.add(new JTextField("�û���", 20));
        panel2.add(new JTextField("����", 20));
        JButton returnButton = new JButton("������ҳ");
        returnButton.addActionListener(e -> {
            // �ÿ�Ƭ���ֹ�����չʾ��Ϊcard1�����
            cardLayout.show(frame.getContentPane(), "card1");
        });
        panel2.add(returnButton);
        // ������1�������������Ϊcard1
        frame.add(panel1, "card1");
        // ������2�������������Ϊcard2
        frame.add(panel2, "card2");
        frame.setBounds(300, 200, 300, 200);
        frame.setVisible(true);
    }
}
