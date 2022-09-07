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
        // �����ָ��ComponentOrientation����LEADING�������������롣���ָ��ΪComponentOrientation.RIGHT_TO_LEFT�������������ߴ��Ҷ��롣
        jPanel1.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        // ���FlowLayout���ֹ�������LEFT�Ǻ���������߶��룬���Ǹ��̶�����Ķ���
        jPanel2.setLayout(new FlowLayout(FlowLayout.LEFT, 20, 20));
        // ���FlowLayout���ֹ�������CENTER�Ǿ��ж���
        jPanel3.setLayout(new FlowLayout(FlowLayout.CENTER, 60, 20));
        jFrame.add(jPanel1, BorderLayout.NORTH);
        jFrame.add(jPanel2, BorderLayout.CENTER);
        jFrame.add(jPanel3, BorderLayout.SOUTH);
        jFrame.setBounds(300, 200, 800, 300);
        jFrame.setVisible(true);
    }

    public static JPanel getJPanel() {
        JPanel jPanel = new JPanel();
        // �������Ӱ�ť
        jPanel.add(new JButton("1"));
        jPanel.add(new JButton("2"));
        jPanel.add(new JButton("3"));
        jPanel.add(new JButton("4"));
        jPanel.add(new JButton("5"));
        jPanel.add(new JButton("6"));
        return jPanel;
    }
}
