package com.tinybye.demos.frame;

import javax.swing.*;

/**
 * ֻ��hello world�Ĵ���
 *
 * @author tinybye
 * @date 2022/9/6
 */
public class SimpleFrame extends JFrame {
    public SimpleFrame(String title) {
        super(title);
        JLabel label = new JLabel("Hello world!");
        add(label);
        // ָ������λ�����С
        setBounds(300, 100, 400, 200);
        // ��ʾ����
        setVisible(true);

    }

    public static void main(String[] args) {
        new SimpleFrame("����һ������");
    }
}
