package com.tinybye.demos.layout;

import javax.swing.*;
import java.awt.*;

/**
 * BorderLayout��Ĭ�ϲ���
 * �ò��ֿ��Թ������5�������λ���Ƕ����ϱ��������λ
 * ����ȥ��ĳ����λ�����ı䲼����ʽ
 * �ʺ�ҳ��򵥵Ĳ���
 *
 * @author tinybye
 * @date 2022/9/7
 */
public class BorderLayoutDemo {
    public static void main(String[] args) {
        JFrame frame = new JFrame("BorderLayout���ֳ�ɶ��");
        // ���췽������ָ�������ˮƽ�ʹ�ֱ��࣬��Ȼ�޲ι��췽����Ĭ�ϼ��Ϊ0��
        BorderLayout layout = new BorderLayout(10,10);
        frame.setLayout(layout);
        JButton up = new JButton("��");
        JButton left = new JButton("��");
        JButton center = new JButton("��");
        JButton right = new JButton("��");
        JButton down = new JButton("��");
        frame.add(up, BorderLayout.NORTH);
        frame.add(left, BorderLayout.WEST);
        frame.add(center, BorderLayout.CENTER);
        frame.add(right, BorderLayout.EAST);
        frame.add(down, BorderLayout.SOUTH);
        frame.setBounds(300, 200, 600, 300);
        frame.setVisible(true);
    }
}
