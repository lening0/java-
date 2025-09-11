package come.home.ui;

import javax.swing.*;
import javax.swing.event.AncestorEvent;
import javax.swing.event.AncestorListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;

public class LoginJFrame extends javax.swing.JFrame implements  ActionListener, AncestorListener {


    //把需要绑定按键的对象都提出来
    private JTextField userTextField;
    private JPasswordField passwordTextField;
    private JTextField codeTextField;
    private JButton codesButton;
    private JButton loginJButton;
    private JButton registerButton;
    //创建列表
    static ArrayList<User> list = new ArrayList<>();
    static {
        list.add(new User("lxn","000000"));
        list.add(new User("zzh","000000"));
    }




    //登录主界面（控制左右方法）
    public LoginJFrame() {
        //界面设置
        initJFrame();

        //加载所有图片
        initPhoto();

        //加载按钮
        myButton();

        //显示登录界面
        this.setVisible(true);
    }
    //界面设置
    public void initJFrame() {
        //设置界面大小
        this.setSize(488,430);
        //关闭界面则关闭终端
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        //界面标题
        this.setTitle("拼图游戏单机版v1 登录");
        //设置登录界面居中
        this.setLocationRelativeTo(null);
        //设置登录界面在上方显示
        this.setAlwaysOnTop(true);
        //取消默认
        this.setLayout(null);


    }



    //加载所有图片
    public void initPhoto(){

        //加载验证码图片
        JLabel codeJLabel = new JLabel(new ImageIcon("D:\\java\\Puzzle-project\\image\\login\\验证码.png"));
        codeJLabel.setBounds(133,256,50,30);
        this.getContentPane().add(codeJLabel);
        //加载验证码框
        codeTextField = new JTextField();
        codeTextField.setBounds(195,256,100,30);
        this.getContentPane().add(codeTextField);


        //加载验证号码
        codesButton = new JButton(madeCode());
        codesButton.setBounds(300,256,50,30);
        this.getContentPane().add(codesButton);
        codesButton.addAncestorListener(this);
        codesButton.setOpaque(false);

        //加载密码图片
        JLabel passwordJLabel = new JLabel(new ImageIcon("D:\\java\\Puzzle-project\\image\\login\\密码.png"));
        passwordJLabel.setBounds(130,195,32,16);
        this.getContentPane().add(passwordJLabel);
        //加载密码框password
        passwordTextField = new JPasswordField();
        passwordTextField.setBounds(195,195,200,30);
        this.getContentPane().add(passwordTextField);



        //加载用户名图片
        JLabel userJLabel = new JLabel(new ImageIcon("D:\\java\\Puzzle-project\\image\\login\\用户名.png"));
        userJLabel.setBounds(116,135,47,17);
        this.getContentPane().add(userJLabel);

        //加载用户名框
        userTextField = new JTextField();
        userTextField.setBounds(195,134,200,30);
        this.getContentPane().add(userTextField);


        //加载注册按钮
        registerButton = new JButton(new ImageIcon("D:\\java\\Puzzle-project\\image\\login\\注册按钮.png"));
        registerButton.setBounds(123, 310, 128, 47);
        this.getContentPane().add(registerButton);
        //绑定注册按键
        registerButton.addActionListener(this);




        //加载登录按钮
        loginJButton = new JButton(new ImageIcon("D:\\java\\Puzzle-project\\image\\login\\登录按钮.png"));
        loginJButton.setBounds(256,310,128,47);
        this.getContentPane().add(loginJButton);
        loginJButton.addActionListener(this);



        //加载背景图片
        JLabel backGroundJLabel = new JLabel(new ImageIcon("D:\\java\\Puzzle-project\\image\\login\\background.png"));
        backGroundJLabel.setBounds(0, 0, 470, 390);
        this.getContentPane().add(backGroundJLabel);


    }




    //生成验证码
    public String madeCode(){
        String letters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        char [] code = new char[5];
        while (true) {
            for (int j = 0; j < 5; j++) {
                Random random = new Random();
                int index = random.nextInt(letters.length());
                code[j] = letters.charAt(index);
            }
            Random random = new Random();
            int num = random.nextInt(48, 58);
            char num1 = (char) num;
            int sui = random.nextInt(5);
            code[sui] = num1;
            String letter = new String(code);
            return letter;
        }
    }

    //添加登录注册，切换验证码的按钮
    public void myButton(){
        //登录按键
        Button  loginButton = new Button();
        loginButton.setBounds(256,310,128,47);
        loginButton.addActionListener(this);
        //注册按键
        Button  registerButton = new Button();
        registerButton.setBounds(123, 310, 128, 47);
        registerButton.addActionListener(this);
    }


    //绑定鼠标监视




    @Override
    public void actionPerformed(ActionEvent e) {
        Object obj = e.getSource();
        if (obj == loginJButton) {
            User newUser = new User(userTextField.getText(),new String(passwordTextField.getPassword()));
            for (User user : list)
                if (newUser.getUserName().equals(user.getUserName())&&newUser.userPassword.equals(user.getUserPassword())) {
                    new GameJFrame();
                    this.dispose();
                }else {
                    System.out.println("输入错误");
                }
        }else if (obj == registerButton) {
            new RegisterJFrame();
            this.dispose();
        }
    }


    @Override
    public void ancestorAdded(AncestorEvent event) {

    }

    @Override
    public void ancestorRemoved(AncestorEvent event) {

    }

    @Override
    public void ancestorMoved(AncestorEvent event) {

    }
}
