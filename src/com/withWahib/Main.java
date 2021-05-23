package com.withWahib;
import java.util.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class Main extends JFrame {
    JTable jtbl;
    JScrollPane js;

    Main(){
        super("Girdiğiniz sekanslar bu yerlerde birbirlerini benzer ..");

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        DefaultTableModel model = new DefaultTableModel(125+1, 123+1);
        jtbl = new JTable(model);
        jtbl.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);

        js=new JScrollPane(jtbl);
        js.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        js.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        js.setBounds(0, 20, 1350 , 680);
        js.setVisible(true);
        this.add(js);

        doldur(model);
        this.setSize(1920,1080);
        this.setVisible(true);
    }
    void doldur(DefaultTableModel model){
        model.setValueAt("I",1,0);
        model.setValueAt("J",0,1);

        model.setValueAt("T",2,1);//I = TTGGAATACCATC
        model.setValueAt("T",3,1);
        model.setValueAt("G",4,1);
        model.setValueAt("G",5,1);
        model.setValueAt("A",6,1);
        model.setValueAt("A",7,1);
        model.setValueAt("T",8,1);
        model.setValueAt("A",9,1);
        model.setValueAt("C",10,1);
        model.setValueAt("C",11,1);
        model.setValueAt("A",12,1);
        model.setValueAt("T",13,1);
        model.setValueAt("C",14,1);

        model.setValueAt("G",1,2);//I = J = GGCATAATGCACCCC
        model.setValueAt("G",1,3);
        model.setValueAt("C",1,4);
        model.setValueAt("A",1,5);
        model.setValueAt("T",1,6);
        model.setValueAt("A",1,7);
        model.setValueAt("A",1,8);
        model.setValueAt("T",1,9);
        model.setValueAt("G",1,10);
        model.setValueAt("C",1,11);
        model.setValueAt("A",1,12);
        model.setValueAt("C",1,13);
        model.setValueAt("C",1,14);
        model.setValueAt("C",1,15);
        model.setValueAt("C",1,16);

        for(int i=0 ; i<13; i++){
            model.setValueAt(i+1,i+2,0);
        }
        for(int i=0 ; i<15; i++){
            model.setValueAt(i+1,0,i+2);
        }
        int j =1;
        for(int i=0; i<16; i++){
            if(model.getValueAt(i+2,i+1) == model.getValueAt(i+1,i+2)){
                model.setValueAt(j,2,i+1);
                j++;
            }
            else{
                model.setValueAt(" ",2,i+1);
            }

        }
        //model.setValueAt("*",0,0);
    }
    public static void main(String args[]){
        Main d=new Main();
    }
}
/*Scanner input =new Scanner(System.in);

        System.out.println("Enter the row number : ");
        int row = input.nextInt();

        System.out.println("Enter the column number : ");
        int column = input.nextInt();

        char [][] sekans = new char[row][column]
                ;
        for(int i=0; i< 16; i++){
            for(int j=0; j<=14; j++){
                sekans =input.nextLine(); char[i];

            }
        }*/