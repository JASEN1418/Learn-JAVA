package com.JASEN1418.game001;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

public class GameJFrame extends JFrame implements KeyListener {

    int[][] data=new int[4][4];

    int x=0;
    int y=0;

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

        Random random=new Random();
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

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                int num=data[i][j];

                JLabel jLabel=new JLabel(new ImageIcon("image\\girl\\girl1\\"+num+".jpg"));

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

        JMenuItem replayItem=new JMenuItem("重新游戏");
        JMenuItem loginItem=new JMenuItem("重新登录");
        JMenuItem closeItem=new JMenuItem("关闭游戏");

        JMenuItem accountItem=new JMenuItem("公众号");

        functionJMenu.add(replayItem);
        functionJMenu.add(loginItem);
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

    }

    @Override
    public void keyReleased(KeyEvent e) {
        int code=e.getKeyCode();
        if(code==37){
            if(y==3)return;
            System.out.println("left");
            data[x][y]=data[x][y+1];
            data[x][y+1]=0;
            y++;

            InitImage();
        }else if(code==38){
            if(x==3)return;
            System.out.println("up");
            data[x][y]=data[x+1][y];
            data[x+1][y]=0;
            x++;

            InitImage();
        }else if(code==39){
            if(y==0)return;
            System.out.println("right");
            data[x][y]=data[x][y-1];
            data[x][y-1]=0;
            y--;

            InitImage();
        }else if(code==40){
            if(x==0)return;
            System.out.println("down");
            data[x][y]=data[x-1][y];
            data[x-1][y]=0;
            x--;

            InitImage();
        }
    }
}
