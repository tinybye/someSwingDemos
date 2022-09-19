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
    /**
     * 网格包布局，这个应该是比较常用的。最灵活最复杂的布局方式。
     */
    public static void main(String[] args) {
        // 搞一个拨号盘的窗口
        JFrame frame = new JFrame("拨号盘");
        // 创建GridBagLayout布局管理器
        GridBagLayout gridBagLayout = new GridBagLayout();
        // 我们需要一个GridBagConstraints来指定每个组件在布局中的位置、大小、间距等信息
        GridBagConstraints constraints = new GridBagConstraints();
        // 将frame配置成GridBagLayout布局管理器
        frame.setLayout(gridBagLayout);
        // 组件填充显示区域
        constraints.fill = GridBagConstraints.BOTH;
        // 恢复默认值
        constraints.weightx = 0.0;
        // 结束行
        constraints.gridwidth = GridBagConstraints.REMAINDER;
        JTextField tf = new JTextField("");
        //
        gridBagLayout.setConstraints(tf, constraints);
        frame.add(tf);
        // 指定组件的分配区域 到底是干啥的呢？
        constraints.weightx = 0.5;
        constraints.weighty = 0.2;
        constraints.gridwidth = 1;
        makeNumberButton("7", frame, gridBagLayout, constraints, tf);    //调用方法，添加按钮组件
        makeNumberButton("8", frame, gridBagLayout, constraints, tf);
        constraints.gridwidth = GridBagConstraints.REMAINDER;    //结束行
        makeNumberButton("9", frame, gridBagLayout, constraints, tf);
        constraints.gridwidth = 1;    //重新设置gridwidth的值

        makeNumberButton("4", frame, gridBagLayout, constraints, tf);
        makeNumberButton("5", frame, gridBagLayout, constraints, tf);
        constraints.gridwidth = GridBagConstraints.REMAINDER;
        makeNumberButton("6", frame, gridBagLayout, constraints, tf);
        constraints.gridwidth = 1;

        makeNumberButton("1", frame, gridBagLayout, constraints, tf);
        makeNumberButton("2", frame, gridBagLayout, constraints, tf);
        constraints.gridwidth = GridBagConstraints.REMAINDER;
        makeNumberButton("3", frame, gridBagLayout, constraints, tf);
        constraints.gridwidth = 1;

        makeClearButton("清空", frame, gridBagLayout, constraints, tf);
        constraints.gridwidth = GridBagConstraints.REMAINDER;
        makeCallButton("拨号", frame, gridBagLayout, constraints, tf);
        constraints.gridwidth = 1;
        frame.setBounds(400, 400, 400, 400);    //设置容器大小
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public static void makeNumberButton(String title, JFrame frame, GridBagLayout gridBagLayout, GridBagConstraints constraints, JTextField tf) {
        JButton button = new JButton(title);    //创建Button对象
        // 给button增加事件
        button.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tf.setText(tf.getText() + title);
            }
        });
        // 这个方法和gridBagLayout.setConstraints效果一样，本质上也是走到了这里
        frame.add(button, constraints);
    }

    public static void makeClearButton(String title, JFrame frame, GridBagLayout gridBagLayout, GridBagConstraints constraints, JTextField tf) {
        JButton button = new JButton(title);    //创建Button对象
        gridBagLayout.setConstraints(button, constraints);
        // 给button增加事件
        button.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tf.setText("");
            }
        });
        frame.add(button);
    }

    public static void makeCallButton(String title, JFrame frame, GridBagLayout gridBagLayout, GridBagConstraints constraints, JTextField tf) {
        JButton button = new JButton(title);    //创建Button对象
        gridBagLayout.setConstraints(button, constraints);
        // 给button增加事件
        button.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new CallDialog(tf.getText());
            }
        });
        frame.add(button);
    }

    static class CallDialog extends JDialog {
        public CallDialog(String text) {
            this.setVisible(true);
            this.setBounds(400, 400, 100, 100);
            this.getContentPane().add(new Label("给" + text + "拨号中……"));
        }
    }
}
