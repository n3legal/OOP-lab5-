package com.company;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static java.lang.Math.sqrt;

public class Rabota extends JFrame {
    JTextField jta_1 = new JTextField(10);
    JTextField jta_2 = new JTextField(10);
    JButton button_1 = new JButton(" + ");
    JButton button_2 = new JButton(" - ");
    JButton button_3 = new JButton(" * ");
    JButton button_4 = new JButton(" / ");
    JButton button_5 = new JButton(" x2 ");
    JButton button_6 = new JButton(" SQR ");
    Font font = new Font("Times new roman", Font.BOLD, 100);

    Rabota(){
        super("Калькулятор");
        setLayout(new FlowLayout());
        setSize(400, 200);
        add(new Label("Число A"));
        add(jta_1);
        add(new Label("Число B"));
        add(jta_2);
        add(button_1);
        add(button_2);
        add(button_3);
        add(button_4);
        add(button_5);
        add(button_6);

        button_1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    double x1 = Double.parseDouble(jta_1.getText().trim());
                    double x2 = Double.parseDouble(jta_2.getText().trim());
                    JOptionPane.showMessageDialog(null, "Результат слодения = " + (x1+x2), "Результат", JOptionPane.INFORMATION_MESSAGE);
                }
                catch (Exception e1){
                    JOptionPane.showMessageDialog(null, "Ошибка в числе!\nПопробуйте еще раз", "Внимание!", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        button_2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    double x1 = Double.parseDouble(jta_1.getText().trim());
                    double x2 = Double.parseDouble(jta_2.getText().trim());
                    JOptionPane.showMessageDialog(null, "Результат вычитания = " + (x1-x2), "Результат", JOptionPane.INFORMATION_MESSAGE);
                }
                catch (Exception e1){
                    JOptionPane.showMessageDialog(null, "Ошибка в числе!\nПопробуйте еще раз", "Внимание!", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        button_3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    double x1 = Double.parseDouble(jta_1.getText().trim());
                    double x2 = Double.parseDouble(jta_2.getText().trim());
                    JOptionPane.showMessageDialog(null, "Результат умножения = " + (x1*x2), "Результат", JOptionPane.INFORMATION_MESSAGE);
                }
                catch (Exception e1){
                    JOptionPane.showMessageDialog(null, "Ошибка в числе!\nПопробуйте еще раз", "Внимание", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        button_4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    double x1 = Double.parseDouble(jta_1.getText().trim());
                    double x2 = Double.parseDouble(jta_2.getText().trim());
                    JOptionPane.showMessageDialog(null, "Результат деления = " + (x1/x2), "Результат", JOptionPane.INFORMATION_MESSAGE);
                }
                catch (Exception e1){
                    JOptionPane.showMessageDialog(null, "Ошибка в числе\nПопробуйте еще раз", "Внимание", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        button_5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    double x1 = Double.parseDouble(jta_1.getText().trim());
                    JOptionPane.showMessageDialog(null, "Результат возведения в квадрат = " + (x1*x1), "Результат", JOptionPane.INFORMATION_MESSAGE);
                }
                catch (Exception e1){
                    JOptionPane.showMessageDialog(null, "Ошибка в числе!\nПопробуйте еще раз", "Внимание", JOptionPane.ERROR_MESSAGE);
                }

            }
        });

        button_6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double x1 = Double.parseDouble(jta_1.getText().trim());
                    JOptionPane.showMessageDialog(null, "Результат выделения квадрата = " + sqrt(x1), "Результат", JOptionPane.INFORMATION_MESSAGE);
                }
                catch(Exception e1){
                    JOptionPane.showMessageDialog(null, "Ошибка в числе\nПопробуйте еще раз", "Внимание", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        setVisible(true);
    }
}