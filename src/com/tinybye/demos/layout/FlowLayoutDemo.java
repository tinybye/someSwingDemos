package com.tinybye.demos.layout;

import javax.swing.*;
import java.awt.*;

/**
 * ��ʽ���ֹ������� JPanel �� JApplet ��Ĭ�ϲ��ֹ�����
 * ��������ң����ϵ������У������λ�ø��ݴ��ڴ�С�ı仯���䶯
 *
 * @author tinybye
 * @date 2022/9/6
 */
public class FlowLayoutDemo {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame("��ʽ���ֳ�ɶ��");
        JPanel jPanel1 = getJPanel();
        JPanel jPanel2 = getJPanel();
        JPanel jPanel3 = getJPanel();
        // ���FlowLayout���ֹ�������LEADING�Ǹ�����������Ŀ�ʼ�߶��룬���Ǹ������������Ķ��룬�������Ϊ��Է���
        // �����������������������֮��ˮƽ����ֱ�ļ��
        jPanel1.setLayout(new FlowLayout(FlowLayout.LEADING, 20, 20));
        // ���FlowLayout���ֹ�������LEFT�Ǻ���������߶��룬���Ǹ��̶�����Ķ���
        jPanel2.setLayout(new FlowLayout(FlowLayout.LEFT, 20, 20));
        // ���FlowLayout���ֹ�������CENTER�Ǿ��ж���
        jPanel3.setLayout(new FlowLayout(FlowLayout.CENTER, 40, 40));
        jFrame.add(jPanel1, BorderLayout.NORTH);
        jFrame.add(jPanel2, BorderLayout.CENTER);
        jFrame.add(jPanel3, BorderLayout.SOUTH);
        jFrame.setBounds(300, 200, 300, 150);
        jFrame.setVisible(true);
    }

    public static JPanel getJPanel() {
        JPanel jPanel = new JPanel();
        JButton btn1 = new JButton("1");
        JButton btn2 = new JButton("2");
        JButton btn3 = new JButton("3");
        JButton btn4 = new JButton("4");
        JButton btn5 = new JButton("5");
        JButton btn6 = new JButton("6");
        // �������Ӱ�ť
        jPanel.add(btn1);
        jPanel.add(btn2);
        jPanel.add(btn3);
        jPanel.add(btn4);
        jPanel.add(btn5);
        jPanel.add(btn6);
        return jPanel;
    }
}
