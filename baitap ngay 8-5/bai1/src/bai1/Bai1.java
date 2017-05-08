/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai1;

/**
 *
 * @author Administrator
 */
public class Bai1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    package tongab;

import java.awt.*;        
import java.awt.event.*;

public abstract class tongab extends Frame implements ActionListener{

  Button btnkq;
  TextField txtA,txtB,txtKQ;
  Label lblA,lblB,lblKQ;
  public tongab()
 {
setLayout(new FlowLayout());
lblA=new Label("Nhập số thứ nhất để tính tổng");
this.add(lblA);
txtA=new TextField(30);
this.add(txtA);

lblB=new Label("Nhập số thứ hai để tính tổng");
this.add(lblB);
txtB=new TextField(30);
this.add(txtB);
lblKQ=new Label("Kết quả :");
this.add(lblKQ);
txtKQ=new TextField(30);
this.add(txtKQ);
txtKQ.setEditable(false);
btnkq=new Button("Kết quả");
btnkq.addActionListener(new XLcong());
this.add(btnkq);
 }
   
class XLcong implements ActionListener {
           public void actionPerformed(ActionEvent e)
           {
            int a=Integer.parseInt(txtA.getText());
            int b=Integer.parseInt(txtB.getText());
            int c=a+b;
            txtKQ.setText(c+"");
            }
     
}     
public static void main(String[] args)
{
    tongab test=new tongab() {
        @Override
        public void actionPerformed(ActionEvent e) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    };
   test.setTitle("tính tổng hai số");
    test.setSize(480,200);
    test.setVisible(true);
}

import java.awt.*;
import java.awt.event.*;
public class tonghieutichthuong extends Frame implements ActionListener{
    Label lblA=new Label("A=");
    Label lblB=new Label("b=");
    Label lblKQ=new Label("KQ");
    TextField txtA=new TextField();
    TextField txtB=new TextField();
    TextField txtKQ=new TextField();
    Button btnTong=new Button("Tong");
    Button btnHieu=new Button("Hieu");
    Button btnTich=new Button("Tich");
    Button btnThuong=new Button("Thuong");
    public tonghieutichthuong()
    {
        this.add(lblA);
        this.add(txtA);
        this.add(lblB);
        this.add(txtB);
        this.add(btnTong);
        btnTong.addActionListener(this);
        this.add(btnHieu);
        btnHieu.addActionListener(this);
        this.add(btnTich);
        btnTich.addActionListener(this);
        this.add(btnThuong);
        btnThuong.addActionListener(this);
        this.add(lblKQ);
        this.add(txtKQ);
        txtKQ.setEditable(false);
        this.setLayout(new FlowLayout());
    }
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==btnTong)
        {
            int a=Integer.parseInt(txtA.getText());
            int b=Integer.parseInt(txtB.getText());
            int c=a+b;
            txtKQ.setText(c + ""); 
        }
         if(e.getSource()==btnHieu)
        {
            int a=Integer.parseInt(txtA.getText());
            int b=Integer.parseInt(txtB.getText());
            int c=a-b;
            txtKQ.setText(c + ""); 
            

        }
          if(e.getSource()==btnTich)
        {
            int a=Integer.parseInt(txtA.getText());
            int b=Integer.parseInt(txtB.getText());
            int c=a*b;
            txtKQ.setText(c + ""); 
            

        }
           if(e.getSource()==btnThuong)
        {
            int a=Integer.parseInt(txtA.getText());
            int b=Integer.parseInt(txtB.getText());
            float c=(float)a/b;
            txtKQ.setText(c + ""); 
            

        }
    }
    public static void main(String[] args) {
        tonghieutichthuong thtt=new tonghieutichthuong();
        thtt.setTitle("tonghieutichthuong");
        thtt.setSize(300,200);
        
        thtt.setVisible(true);
    }
}
}
