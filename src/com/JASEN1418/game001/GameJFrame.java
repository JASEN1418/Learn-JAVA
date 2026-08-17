package com.JASEN1418.game001;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

public class GameJFrame extends JFrame implements KeyListener , ActionListener {

    int[][] data=new int[4][4];

    int x=0;
    int y=0;

    String path="image\\girl\\girl1\\";

    int[][] win=new int[][]{
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,0}
    };

    int step=0;

    Random random=new Random();

    JMenu replaceJMenu=new JMenu("更换图片");

    JMenuItem girlItem=new JMenuItem("美女");
    JMenuItem animalItem=new JMenuItem("动物");
    JMenuItem sportItem=new JMenuItem("运动");

    JMenuItem replayItem=new JMenuItem("重新游戏");
    JMenuItem reloginItem=new JMenuItem("重新登录");
    JMenuItem closeItem=new JMenuItem("关闭游戏");


    JMenuItem accountItem=new JMenuItem("公众号");

    public GameJFrame(){
        //初始化界面
        InitJFrame();

        //初始化菜单
        InitJMenuBar();

        //初始化数据
        InitData();

        //初始化图片
        InitImage();

        this.setVisible(true);
    }

    private void InitData() {
        int[] temparr={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,0};

        for(int i=0;i< temparr.length;i++){
            int r=random.nextInt(16);
            int temp=temparr[i];
            temparr[i]=temparr[r];
            temparr[r]=temp;
        }

        for(int i=0;i< temparr.length;i++){
            if(temparr[i]==0){
                x=i/4;
                y=i%4;
            }
            data[i / 4][i % 4] = temparr[i];
        }
    }

    private void InitImage() {

        this.getContentPane().removeAll();

        if(IsVictory()){
            JLabel win=new JLabel(new ImageIcon("D:\\develop\\Java\\001\\image\\win.png"));
            win.setBounds(203,283,197,73);
            this.getContentPane().add(win);
        }

        JLabel stepCount=new JLabel("步数："+step);
        stepCount.setBounds(50,30,100,20);
        this.getContentPane().add(stepCount);

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                int num=data[i][j];

                JLabel jLabel=new JLabel(new ImageIcon(path+num+".jpg"));

                jLabel.setBounds(105*j+83,105*i+134,105,105);

                jLabel.setBorder(new BevelBorder(BevelBorder.LOWERED));

                this.getContentPane().add(jLabel);
            }
        }

        JLabel background=new JLabel(new ImageIcon("image\\background.png"));
        background.setBounds(40,40,508,560);
        this.getContentPane().add(background);

        this.getContentPane().repaint();
    }

    private void InitJFrame() {
        this.setSize(603,680);

        this.setTitle("拼图单机版 v1.0");

        this.setLocationRelativeTo(null);

        this.setDefaultCloseOperation(3);

        this.setLayout(null);

        this.addKeyListener(this);
    }

    public void InitJMenuBar(){
        JMenuBar jMenuBar=new JMenuBar();

        JMenu functionJMenu=new JMenu("功能");
        JMenu aboutJMenu=new JMenu("关于我们");

        replayItem.addActionListener(this);
        reloginItem.addActionListener(this);
        closeItem.addActionListener(this);
        accountItem.addActionListener(this);

        girlItem.addActionListener(this);
        animalItem.addActionListener(this);
        sportItem.addActionListener(this);

        replaceJMenu.add(girlItem);
        replaceJMenu.add(animalItem);
        replaceJMenu.add(sportItem);

        functionJMenu.add(replaceJMenu);
        functionJMenu.add(replayItem);
        functionJMenu.add(reloginItem);
        functionJMenu.add(closeItem);

        aboutJMenu.add(accountItem);

        jMenuBar.add(functionJMenu);
        jMenuBar.add(aboutJMenu);

        this.setJMenuBar(jMenuBar);
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        int code=e.getKeyCode();
        if(code==65){
            this.getContentPane().removeAll();
            JLabel all=new JLabel(new ImageIcon(path+"all.jpg"));
            all.setBounds(83,134,420,420);
            this.getContentPane().add(all);

            JLabel background=new JLabel(new ImageIcon("image\\background.png"));
            background.setBounds(40,40,508,560);
            this.getContentPane().add(background);

            this.getContentPane().repaint();
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        if(IsVictory())return;
        int code=e.getKeyCode();
        if(code==37){
            if(y==3)return;
            data[x][y]=data[x][y+1];
            data[x][y+1]=0;
            y++;
            step++;

            InitImage();
        }else if(code==38){
            if(x==3)return;
            data[x][y]=data[x+1][y];
            data[x+1][y]=0;
            x++;
            step++;

            InitImage();
        }else if(code==39){
            if(y==0)return;
            data[x][y]=data[x][y-1];
            data[x][y-1]=0;
            y--;
            step++;

            InitImage();
        }else if(code==40){
            if(x==0)return;
            data[x][y]=data[x-1][y];
            data[x-1][y]=0;
            x--;
            step++;

            InitImage();
        }else if(code==65){
            InitImage();
        }else if(code==87){
            data=new int[][]{
                    {1,2,3,4},
                    {5,6,7,8},
                    {9,10,11,12},
                    {13,14,15,0}
            };
            InitImage();
        }
    }

    public boolean IsVictory(){
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                if(win[i][j]!=data[i][j])return false;
            }
        }
        return true;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object obj=e.getSource();
        if(obj==replayItem){
            InitData();

            step=0;

            InitImage();

        }else if(obj==reloginItem){
            this.setVisible(false);

            new LoginJFrame();
        }else if(obj==closeItem){
            System.exit(0);
        }else if(obj==accountItem){
            JDialog jDialog=new JDialog();

            JLabel jLabel=new JLabel(new ImageIcon("D:\\develop\\Java\\001\\image\\damie.png"));

            jLabel.setBounds(0,0,258,258);

            jDialog.getContentPane().add(jLabel);

            jDialog.setSize(344,344);
            jDialog.setAlwaysOnTop(true);
            jDialog.setLocationRelativeTo(null);
            jDialog.setModal(true);
            jDialog.setVisible(true);
        }else if(obj==girlItem){
            int p=random.nextInt(1,14);
            path="image\\girl\\girl"+p+"\\";
            InitData();
            step=0;
            InitImage();
        }else if(obj==animalItem){
            int p=random.nextInt(1,9);
            path="image\\animal\\animal"+p+"\\";
            InitData();
            step=0;
            InitImage();
        }else if(obj==sportItem){
            int p=random.nextInt(1,11);
            path="image\\sport\\sport"+p+"\\";
            InitData();
            step=0;
            InitImage();
        }
    }
}
