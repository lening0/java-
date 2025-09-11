package come.home.ui;

import javax.swing.*;

public class RegisterJFrame extends javax.swing.JFrame {
    //注册界面
    public RegisterJFrame() {
        this.setSize(488,500);

        //关闭界面则关闭终端
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        //永远在表层
        this.setAlwaysOnTop(true);
        //开启后居中
        this.setLocationRelativeTo(null);
        //设置标题
        this.setTitle("拼图游戏单机版v1：注册");



        //显示注册界面
        this.setVisible(true);
    }
}
