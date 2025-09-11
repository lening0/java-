package come.home.ui;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;


public class GameJFrame extends javax.swing.JFrame implements KeyListener , ActionListener {
    //创建二位数组data
    int[][] data = new int[4][4];
    //创建空白方块坐标x,y
    int x = 0;
    int y = 0;
    //创建胜利数组
    int[][] winData = new int[][]{
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
    };
    //步数设置为step
    int step = 0;
    //功能下选项
    JMenu changePhoto = new JMenu("更换图片");
    JMenuItem replayItem = new JMenuItem("重新游戏");
    JMenuItem reLoginItem = new JMenuItem("重新登录");
    JMenuItem exitGameItem = new JMenuItem("关闭游戏");
    JMenuItem PublicAccount = new JMenuItem("公众号");
    JMenuItem beauty = new JMenuItem("女明星");
    JMenuItem animal = new JMenuItem("动物");
    JMenuItem sport = new JMenuItem("运动");
    JMenuItem hao = new JMenuItem("性转豪哥");





    //游戏图片地址
    String path = "D:\\java\\Puzzle-project\\image\\animal\\animal3\\";

    //设置总随机数
    int num;




    //游戏主界面功能集合
    public GameJFrame() {
        //初始化界面
        initJFrame();

        //初始化游戏菜单
        initJMenuBar();


        //打乱图片
        initData();

        //初始化图片页面
        initImage();


        //显示游戏界面
        this.setVisible(true);
    }

    //打乱图片
    private void initData() {
        int[] tempArr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        Random random = new Random();
        //打乱数组
        for (int i = 0; i < tempArr.length; i++) {
            int index = random.nextInt(tempArr.length);
            int tmp = tempArr[i];
            tempArr[i] = tempArr[index];
            tempArr[index] = tmp;
        }
        for (int i = 0; i < tempArr.length; i++) {
            //输出空白位置的x，y坐标
            if (tempArr[i] == 0) {
                x = i / 4;
                y = i % 4;
            }
            data[i / 4][i % 4] = tempArr[i];
        }
    }

    //初始化图片
    private void initImage() {
        //清空图片
        this.getContentPane().removeAll();
        //进行胜利判断
        if (Win()) {
            JLabel winJLabel = new JLabel(new ImageIcon("D:\\java\\Puzzle-project\\image\\win.png"));
            winJLabel.setBounds(203, 283, 197, 73);
            this.getContentPane().add(winJLabel);
        }
        //显示步数记录
        JLabel stepJLabel = new JLabel("步数：" + step);
        stepJLabel.setBounds(50, 30, 100, 20);
        this.getContentPane().add(stepJLabel);

        //加载16张图片
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                //创建data序号
                int num = data[i][j];
                //创造ImageIcon的对象
                ImageIcon Icon = new ImageIcon(path + num + ".jpg");
                //创造JLabel对象
                JLabel jLabel = new JLabel(Icon);
                //指定图片位置
                jLabel.setBounds((j * 105) + 83, (i * 105) + 134, 105, 105);
                //添加拼图边框
                jLabel.setBorder(new BevelBorder(BevelBorder.RAISED));
                //添加
                this.getContentPane().add(jLabel);
            }
        }
        //刷新图片
        this.getContentPane().repaint();
        //加载背景图片
        JLabel background = new JLabel(new ImageIcon("D:\\java\\Puzzle-project\\image\\background.png"));
        background.setBounds(40, 40, 508, 560);
        this.getContentPane().add(background);

    }

    //上方功能和关于的初始化
    private void initJMenuBar() {
        //菜单框架
        JMenuBar jMenuBar = new JMenuBar();
        //菜单选项
        JMenu functionjMenu = new JMenu("功能");
        JMenu aboutjMenu = new JMenu("关于我们");


        //绑定选项
        changePhoto.addActionListener(this);
        replayItem.addActionListener(this);
        reLoginItem.addActionListener(this);
        exitGameItem.addActionListener(this);
        PublicAccount.addActionListener(this);
        beauty.addActionListener(this);
        animal.addActionListener(this);
        sport.addActionListener(this);
        hao.addActionListener(this);

        //把选项都加入到上一层
        jMenuBar.add(functionjMenu);
        jMenuBar.add(aboutjMenu);
        functionjMenu.add(replayItem);
        functionjMenu.add(reLoginItem);
        functionjMenu.add(exitGameItem);
        functionjMenu.add(changePhoto);
        aboutjMenu.add(PublicAccount);
        changePhoto.add(beauty);
        changePhoto.add(animal);
        changePhoto.add(sport);
        changePhoto.add(hao);

        //将菜单框架设置
        this.setJMenuBar(jMenuBar);
    }

    //游戏基础设置
    private void initJFrame() {
        //设置游戏边框大小
        this.setSize(603, 680);
        //游戏关闭方式
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        //设置游戏标题
        this.setTitle("xjb豪的拼图游戏");
        //设置游戏始终在前
        this.setAlwaysOnTop(true);
        //设置游戏打开时为居中位置
        this.setLocationRelativeTo(null);
        //取消默认正中间
        this.setLayout(null);

        //实现键盘监视操作
        this.addKeyListener(this);
    }

    //判断胜利函数
    private boolean Win() {
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                if (data[i][j] != winData[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    //a长按
    @Override
    public void keyPressed(KeyEvent e) {
        int code = e.getKeyChar();
        if (code == 65) {
            //加载完整图片
            this.getContentPane().removeAll();
            JLabel all = new JLabel(new ImageIcon(path+"all"));
            all.setBounds(83, 134, 420, 420);
            this.getContentPane().add(all);
            //加载背景图片
            JLabel background = new JLabel(new ImageIcon("D:\\java\\Puzzle-project\\image\\background.png"));
            background.setBounds(40, 40, 508, 560);
            this.getContentPane().add(background);
            //刷新一下图片
            this.getContentPane().repaint();
        }
    }

    //上下左右
    @Override
    public void keyReleased(KeyEvent e) {
        if (Win()) {
            return;
        }
        int code = e.getKeyCode();
        if (code == 37) {
            if (y == 0) {
                return;
            }
            System.out.println("向左移动");

            data[x][y] = data[x][y - 1];
            data[x][y - 1] = 0;
            y--;
            step++;
            initImage();
        } else if (code == 38) {
            if (x == 0) {
                return;
            }
            System.out.println("向上移动");
            data[x][y] = data[x - 1][y];
            data[x - 1][y] = 0;
            x--;
            step++;
            initImage();

        } else if (code == 39) {
            if (y == 3) {
                return;
            }
            System.out.println("向右移动");

            data[x][y] = data[x][y + 1];
            data[x][y + 1] = 0;
            y++;
            step++;
            initImage();
        } else if (code == 40) {
            if (x == 3) {
                return;
            }
            System.out.println("向下移动");
            data[x][y] = data[x + 1][y];
            data[x + 1][y] = 0;
            x++;
            step++;
            initImage();
        } else if (code == 65) {
            initImage();
        } else if (code == 87) {
            data = winData;
            initImage();
        }
    }

    //功能
    @Override
    public void actionPerformed(ActionEvent e) {
        Object obj = e.getSource();
        if (obj == replayItem) {
            //清空步数
            step = 0;
            //重新打乱顺序
            initData();
            //重新加载图片
            initImage();
        } else if (obj == reLoginItem) {
            //关闭当前页面
            this.setVisible(false);
            LoginJFrame loginJFrame = new LoginJFrame();
            loginJFrame.setVisible(true);
        } else if (obj == exitGameItem) {
            //关闭游戏
            System.exit(0);
        } else if (obj == PublicAccount) {
            //创建一个弹窗
            JDialog jDialog = new JDialog();
            //创建一个JLabel
            JLabel jLabel = new JLabel(new ImageIcon("D:\\java\\Puzzle-project\\image\\about.png"));
            //设置图片像素和图片在JLabel中的位置
            jLabel.setBounds(0, 0, 258, 258);
            //添加JLabel中的图片上传到系统的弹窗当中
            jDialog.getContentPane().add(jLabel);
            //设置弹窗的大小
            jDialog.setSize(344, 344);
            //设置弹窗在上方
            jDialog.setAlwaysOnTop(true);
            //设置弹窗在居中位置
            jDialog.setLocationRelativeTo(null);
            //设置弹窗不关闭则无法继续游戏
            jDialog.setModal(true);
            //将这个弹窗显示出来
            jDialog.setVisible(true);
        } else if (obj == beauty) {
            Random random = new Random();
            num = random.nextInt(1, 14);
            //更换路径
            path = "D:\\java\\Puzzle-project\\image\\girl\\girl"+num+"\\";
            //清空步数
            step = 0;
            //重新打乱顺序
            initData();
            //重新加载图片
            initImage();
        } else if (obj == animal) {
            Random random = new Random();
            num = random.nextInt(1, 9);
            //更换路径
            path = "D:\\java\\Puzzle-project\\image\\animal\\animal"+num+"\\";
            //清空步数
            step = 0;
            //重新打乱顺序
            initData();
            //重新加载图片
            initImage();
        } else if (obj == sport) {
            Random random = new Random();
            num = random.nextInt(1, 11);
            //更换路径
            path = "D:\\java\\Puzzle-project\\image\\sport\\sport"+num+"\\";
            //清空步数
            step = 0;
            //重新打乱顺序
            initData();
            //重新加载图片
            initImage();
        }else if(obj == hao){
            //更换路径
            path = "D:\\java\\Puzzle-project\\image\\hao\\";
            //清空步数
            step = 0;
            //重新打乱顺序
            initData();
            //重新加载图片
            initImage();
        }
    }
}
