package com.tinybye.demos.layout;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

/**
 * 网格包布局管理器
 * 相对于网格布局管理器来说，非常灵活了
 *
 * @author tinybye
 * @date 2022/9/8
 */
public class GridBagLayoutDemo {

    public static void main(String[] args) {
        // 搞一个拨号盘的窗口
        JFrame frame = new JFrame("用网格包布局搞个拨号盘");
        // 指定GridBagLayout布局管理器
        frame.setLayout(new GridBagLayout());
        // 我们需要一个GridBagConstraints来指定每个组件在布局中的位置、大小、间距等信息
        GridBagConstraints constraints = new GridBagConstraints();
        // 组件填充显示区域，both为横向纵向都填充满单元格
        constraints.fill = GridBagConstraints.BOTH;
        // 指定组件间距
        constraints.insets = new Insets(5, 5, 5, 5);

        // gridwidth指定为到本行结束，即第一行文本框直接绘制到行位
        constraints.gridwidth = GridBagConstraints.REMAINDER;
        JLabel tf = new JLabel(" ");
        tf.setHorizontalAlignment(JLabel.CENTER);
        frame.add(tf, constraints);

        // 指定组件横纵的拉伸比例
        constraints.weightx = 1;
        constraints.weighty = 1;
        // gridwidth置为1，即每个按钮占据一个单元格，下面的相似操作不再重复注释
        constraints.gridwidth = 1;
        //调用方法，添加按钮组件
        makeNumberButton("7", frame, constraints, tf);
        makeNumberButton("8", frame, constraints, tf);
        // gridwidth指定为到本行结束，即按钮9为当前行末尾，下面的相似操作不再重复注释
        constraints.gridwidth = GridBagConstraints.REMAINDER;
        makeNumberButton("9", frame, constraints, tf);

        // 重新设置gridwidth的值
        constraints.gridwidth = 1;
        makeNumberButton("4", frame, constraints, tf);
        makeNumberButton("5", frame, constraints, tf);
        constraints.gridwidth = GridBagConstraints.REMAINDER;
        makeNumberButton("6", frame, constraints, tf);

        constraints.gridwidth = 1;
        makeNumberButton("1", frame, constraints, tf);
        makeNumberButton("2", frame, constraints, tf);
        constraints.gridwidth = GridBagConstraints.REMAINDER;
        makeNumberButton("3", frame, constraints, tf);
        constraints.gridwidth = 1;

        makeClearButton("清空", frame, constraints, tf);
        constraints.gridwidth = GridBagConstraints.REMAINDER;
        makeCallButton("拨号", frame, constraints, tf);
        //设置容器大小
        frame.setBounds(400, 400, 400, 400);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void makeNumberButton(String title, JFrame frame, GridBagConstraints constraints, JLabel tf) {
        JButton button = new JButton(title);
        // 给button增加事件
        button.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tf.setText(tf.getText() + title);
            }
        });
        // frame.add最终也是走到了gridBagLayout.setConstraints方法
        frame.add(button, constraints);
    }

    public static void makeClearButton(String title, JFrame frame, GridBagConstraints constraints, JLabel tf) {
        JButton button = new JButton(title);
        // 给button增加事件
        button.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tf.setText(" ");
            }
        });
        frame.add(button, constraints);
    }

    public static void makeCallButton(String title, JFrame frame, GridBagConstraints constraints, JLabel tf) {
        JButton button = new JButton(title);
        // 给button增加事件
        button.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new CallDialog(tf.getText());
            }
        });
        frame.add(button, constraints);
    }

    static class CallDialog extends JDialog {
        public CallDialog(String text) {
            this.setVisible(true);
            this.setBounds(400, 400, 100, 100);
            this.getContentPane().add(new Label("给" + text.trim() + "拨号中……"));
        }
    }
}
