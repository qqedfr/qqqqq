package com.hy.shengcheng;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.UUID;
public class MainGUI {
    private static JTextField adbPathText;
    private static JTextField imagePathText;  
    public static void main(String[] args) {
        // 创建 JFrame 实例
        JFrame frame = new JFrame("二维码生成");
        frame.setSize(500, 400);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        // 创建面板
        JPanel panel = new JPanel();
        frame.add(panel);
        panel.setLayout(null);
        addAdbPath(panel);
        addImagePath(panel);
        addRunButton(panel);
        // 设置界面可见
        frame.setVisible(true);
    }
     //    创建文本域用于用户输入要生成的内容
    private static void addAdbPath(JPanel panel) {
        JLabel adbPathLabel = new JLabel("生成内容：");
        adbPathLabel.setBounds(10, 20, 100, 25);
        panel.add(adbPathLabel);
        adbPathText = new JTextField("C:\\Users\\ert\\Desktop\\millionHero\\adb", 50);
        adbPathText.setBounds(100, 20, 165, 25);
        panel.add(adbPathText);
    }
    //         创建图片存放路径
    private static void addImagePath(JPanel panel) {
        JLabel imagePathLabel = new JLabel("二维码存放路径：");
        imagePathLabel.setBounds(10, 40, 100, 25);
        panel.add(imagePathLabel);
        imagePathText = new JTextField("F:\\Photo", 50);
        imagePathText.setBounds(100, 40, 165, 25);
        panel.add(imagePathText);
    }   
    private static void addRunButton(JPanel panel){
        final JButton runButton=new JButton("一键生成");
        runButton.setBounds(160, 90, 100, 25);
        panel.add(runButton);
        ActionListener listener=new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	   String content = adbPathText.getText();
                   String path = imagePathText.getText()+"\\" + UUID.randomUUID()+".png";
                   System.out.println(path);
                   QRCodeDecoderHandler handler = new QRCodeDecoderHandler();  
                  // 生成二维码
                   handler.encoderQRCode(content, path);  
                 try {  
                     OutputStream output = new FileOutputStream(path);  
                     handler.encoderQRCode(content, output);  
                 } catch (Exception e1) {  
                     e1.printStackTrace();  
                 }  
               }
        };
        runButton.addActionListener(listener);
    }
}