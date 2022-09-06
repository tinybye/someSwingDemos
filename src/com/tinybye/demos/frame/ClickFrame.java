package com.tinybye.demos.frame;

import javax.swing.*;
import java.awt.*;

/**
 * һ���н����Ĵ���
 *
 * @author tinybye
 * @date 2022/9/6
 */
public class ClickFrame extends JFrame {

    int count = 0;

    public ClickFrame(String title) {
        super(title);
        JLabel label = new JLabel("���������" + count);
        JButton button = new JButton("����");
        // ��ť�����¼�
        button.addActionListener(e -> {
            count++;
            // ����һ�����׵�dialog�Ի���
            JOptionPane.showMessageDialog(null, "����ˣ�����ˣ�");
            label.setText("���������" + count);
        });
        // ���ò��֣�����ʹ����ʽ����
        setLayout(new FlowLayout());
        // ��ǩ�Ͱ�ť����ӽ�����
        add(label);
        add(button);
        // ָ������λ�����С
        setBounds(300, 100, 200, 100);
        // ��ʾ����
        setVisible(true);
    }

    public static void main(String[] args) {
        new ClickFrame("һ���н����Ĵ���");
    }
}
