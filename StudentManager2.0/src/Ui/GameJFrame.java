package Ui;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

public class GameJFrame extends JFrame implements KeyListener, ActionListener {
//    初始数组
    int[][] arr = new int[4][4];
//    初始坐标
    int x;
    int y;
//    拼图地址
    private String path = "D:\\aaa\\image\\animal\\animal3\\";
//    完成拼图数组
    int[][] win = new int[][]{
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
    };
//    计步器
    private int step;
//    提升变量
    //        条目
    JMenuItem replayItem = new JMenuItem("重新游戏");
    JMenuItem reLoginItem = new JMenuItem("重新登录");
    JMenuItem closeItem = new JMenuItem("关闭游戏");
    JMenuItem accountItem = new JMenuItem("公众号");    
    public GameJFrame(){

//        初始化界面
        initJFrame();
//        初始化菜单
        initJMenubar();
//        初始化数据
        initData();
//        初始化图片
        initImage();
//        展示
        this.setVisible(true);

    }
    private void initData(){
        int[] tempArr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        Random random = new Random();
        for (int i = 0; i < tempArr.length; i++) {
            int index = random.nextInt(tempArr.length);
            int temp = tempArr[i];
            tempArr[i] = tempArr[index];
            tempArr[index] = temp;
        }
        for (int i = 0; i < tempArr.length; i++) {
            if(tempArr[i]==0){
                x = i/4;
                y = i%4;
            }
            arr[i/4][i%4] = tempArr[i];
        }
    }


    private void initImage() {
//        清空
        this.getContentPane().removeAll();
//        判断胜利
        if(victory()){
            JLabel winLabel = new JLabel(new ImageIcon("D:\\aaa\\image\\win.png"));
            winLabel.setBounds(203,283,197,73);
            this.getContentPane().add(winLabel);
        }
//        计步器
        JLabel stepLabel = new JLabel("步数"+step);
        stepLabel.setBounds(50,30,100,20);
        this.getContentPane().add(stepLabel);

        for (int i = 0;i<4;i++){
            for (int j =0 ;j<4;j++){
                int number = arr[i][j];
                JLabel jLabel = new JLabel(new ImageIcon(path+number+".jpg"));
                jLabel.setBounds(105 * j+83,105 * i+134,105,105);
                jLabel.setBorder(new BevelBorder(0));
                this.getContentPane().add(jLabel);
            }
        }
//        背景
        JLabel backGround = new JLabel(new ImageIcon("D:\\aaa\\image\\background.png"));
        backGround.setBounds(40,40,508,560);
        this.getContentPane().add(backGround);
//        刷新
        this.getContentPane().repaint();
    }

    private void initJFrame(){
        this.setSize(603,680);
//        页面标题
        this.setTitle("拼图单机版v1.0");
//        界面顶置在最前面
        this.setAlwaysOnTop(true);
//        页面居中
        this.setLocationRelativeTo(null);
//        全部关闭
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
//        取消默认居中
        this.setLayout(null);

    }
    private void initJMenubar(){
        //        菜单
        JMenuBar jMenuBar = new JMenuBar();
//        选项
        JMenu functionJmenu = new JMenu("功能");
        JMenu aboutJmenu = new JMenu("关于我们");

//      条目加入到选项
        functionJmenu.add(replayItem);
        functionJmenu.add(reLoginItem);
        functionJmenu.add(closeItem);
        aboutJmenu.add(accountItem);
//        选项加入到菜单
        jMenuBar.add(functionJmenu);
        jMenuBar.add(aboutJmenu);
//        给界面设置菜单
        this.setJMenuBar(jMenuBar);
//        给界面添加键盘事件
        this.addKeyListener(this);
//        给条目增加点击监听
        replayItem.addActionListener(this);
        reLoginItem.addActionListener(this);
        closeItem.addActionListener(this);
        accountItem.addActionListener(this);


    }


    @Override
    public void keyTyped(KeyEvent e) {

    }
//           按下a显示全部图片
    @Override
    public void keyPressed(KeyEvent e) {
        int code = e.getKeyCode();
        if(code == 65){
//            清除之前图片
            this.getContentPane().removeAll();
            JLabel all = new JLabel(new ImageIcon(path+"all.jpg"));
            all.setBounds(83,134,420,420);
            this.getContentPane().add(all);
//            加入去除的背景图片
            JLabel backGround = new JLabel(new ImageIcon("D:\\aaa\\image\\background.png"));
            backGround.setBounds(40,40,508,560);
            this.getContentPane().add(backGround);
//        刷新
            this.getContentPane().repaint();
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        if(victory()){
            return;
        }
//        上下左右
        int code = e.getKeyCode();
        if(code==37){
            if(y==3){
                return;
            }
            arr[x][y]=arr[x][y+1];
            arr[x][y+1]=0;
            y++;
            step++;
            initImage();
        }else if(code==38){
            if(x==3){
                return;
            }
            arr[x][y]=arr[x+1][y];
            arr[x+1][y]=0;
            x++;
            step++;
            initImage();
        }else if(code==39){
            if(y==0){
                return;
            }
            arr[x][y]=arr[x][y-1];
            arr[x][y-1]=0;
            y--;
            step++;
            initImage();
        }else if(code==40){
            if(x==0){
                return;
            }
            arr[x][y]=arr[x-1][y];
            arr[x-1][y]=0;
            x--;
            step++;
            initImage();
        }else if (code == 65) {
            initImage();
        }else if (code == 87) {
            arr= new int[][]{{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
            initImage();
        }
    }
    public boolean victory(){
        for (int i =0 ; i<arr.length;i++){
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j] != win[i][j]){
                    return false;
                }
            }
        }
        return true;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object obj = e.getSource();
        if(obj == replayItem){
//            步数归零
            step = 0;
//            数组打乱
            initData();
//            图片刷新
            initImage();

        }else if(obj == reLoginItem){
            this.setVisible(false);
            new LoginJFrame();
        } else if (obj == closeItem) {
//            退出
            System.exit(0);
        } else if (obj ==accountItem) {
            JDialog jDialog = new JDialog();
            JLabel jLabel = new JLabel(new ImageIcon("D:\\aaa\\image\\about.png"));
            jLabel.setBounds(0,0,258,258);
            jDialog.getContentPane().add(jLabel);
            jDialog.setSize(344,344);
            jDialog.setAlwaysOnTop(true);
            jDialog.setLocationRelativeTo(null);
//            不关闭不允许执行其他操作
            jDialog.setModal(true);
            jDialog.setVisible(true);
        }
    }
}
