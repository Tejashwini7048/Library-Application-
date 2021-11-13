   import java.io.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.event.*;
import java.util.Calendar;
import java.util.Date;
 public class confirm implements ActionListener
    {JFrame f1;
     JPanel P1;   
     Label name,clas,BNO,BNN,Sd,Bd,Sc;
     JButton con,back,na,na2,na3,na4,na5,na1;
      int Y1,Y2,Y3,M1,Z1,Z2,Z3,M2,q=0;static String Y,Y0;static String S1,S2,bno,bnn,S4,S5,S6,S7,S8,S10;
      static String wr,r,fi="",wr1,r1,fi1="",wr2,wr3,gh,mn,bp,jn,SN;
      
         void main1()throws IOException
           {
   
        
        
        
        
       //String S1,S2,Y;int Y1,Y2,Y3;
         BufferedReader f = new BufferedReader(new FileReader("Now.dat")); 
         String d=f.readLine();
         int h=d.indexOf(";");
         S1 = d.substring(0,h);int l=d.length();
       
         
         S2=d.substring((h+1),l);
         
         BufferedReader ff = new BufferedReader(new FileReader("N.dat"));
         String a=ff.readLine();
         int y = a.lastIndexOf(";");
         String k = a.substring(l,y);
         int w=k.lastIndexOf(";");
         int b=k.length();
          bno =k.substring(1,w);
          bnn = k.substring((w+1),b);
          S4=S1;
          S5=S2;
          S6=bno;
          S7=bnn;
              
          
         f.close();
         ff.close();
            

        }
          
  
             confirm()
         {
            f1 = new JFrame("CONFIRMATION");
           f1 . setSize(350,350);
           f1.setVisible(true);
           f1.setLocation(500,120);
           f1.setResizable(false);
            f1.setDefaultCloseOperation(0);
            
            P1 = new JPanel();
          
            f1.add(P1);
            
                     Calendar ca = Calendar.getInstance();
              Y1=ca.get(Calendar.YEAR);
              Y3=ca.get(Calendar.DATE);
              Y2=(Y1+1);
              M1=ca.get(Calendar.MONTH);
              
              
                  Calendar ca1 = Calendar.getInstance();
              Z1=ca1.get(Calendar.YEAR);
              Z3=ca1.get(Calendar.DATE);
              Z2=(Y1+1);
              M2=ca.get(Calendar.MONTH);
            
           
               Y=Y3+"/"+(M1+1)+"/"+Y1;
              if(Z3==30){
               q=03;
               M2++;
              Y0=q+"/"+(M2+1)+"/"+Z1;
            }
            else
            {
             Y0=(Z3+5)+"/"+(M2+1)+"/"+Z1;
            }
            if(Z3==31){
               q=04;
               M2++;
              Y0=q+"/"+(M2+1)+"/"+Z1;
            }
            else
            {
            Y0=(Z3+5)+"/"+(M2+1)+"/"+Z1;
            }
            if(Z3==28 && M2==1 ){
               q=04;
               M2++;
              Y0=q+"/"+(M2+1)+"/"+Z1;
            }
            
             else
             {
             Y0=(Z3+5)+"/"+(M2+1)+"/"+Z1;
            }
         
        
              try{
                main1();
            }catch(IOException a){}
             na = new JButton(S4);
           // na.addActionListener(this);
            //na.setBackground(Color.green);
            na1 = new JButton(S5);
            na2 = new JButton(S6);
            na3 = new JButton(S7);
            na4 = new JButton(Y);
            na5 = new JButton(Y0);
            //na1.addActionListener(this);
            try
            {
                SCN();
            }catch(IOException a){}
            Sc = new Label ("                        "+SN+"                     ");
            Sc.setBackground(Color.red); 
            name = new Label ("     NAME :-                          ");
            clas = new Label ("     SEM :-                         ");
            BNO = new Label  ("   BOOK NUMBER :-                   ");
            BNN = new Label  ("   BOOK NAME :-                     ");
            Bd  = new Label  ("   BORROWING DATE :-                ");
            Sd  = new Label  ("   SUBMITION DATE :-                ");
                        
            con = new JButton("> > CONFIRM > >");
            con.addActionListener(this);
            con.setBackground(Color.green);
            
            back = new JButton("< < BACK  < <");
            back.addActionListener(this);
            back.setBackground(Color.red);
            
            
            P1.add(Sc);
            P1.add(name);
            P1.add(na);
            P1.add(clas);
            P1.add(na1);
            P1.add(BNO);
            P1.add(na2);
            P1.add(BNN);
            P1.add(na3);
            P1.add(Bd);
            P1.add(na4);
            P1.add(Sd);
            P1.add(na5);
            P1.add(con);
            P1.add(back);
        
        
        }
        
             public void actionPerformed(ActionEvent e) 
             {
                 if(e.getSource()==con)
                 {
                  try{
                        
                        main();
                        }catch(IOException a){}
                
                        wr2=S4+";"+S5+";"+S7+";"+Y+";"+Y0;
                        try{   
                        main2();
                        }catch(IOException a){}
                       
                        try{
                        
                        main3();
                        }catch(IOException a){}
                      
                   P1.remove(Sc);
                   P1.remove(name);
                   P1.remove(clas);
                   P1.remove(BNO);
                   P1.remove(BNN);
                   P1.remove(Bd);
                   P1.remove(Sd);
                   P1.remove(con);
                   P1.remove(back);
                   f1.setVisible(false);
                }            
                if(e.getSource()==back)
                {
                  
                    
                    
                    P1.remove(Sc);
                    P1.remove(name);
                    P1.remove(clas);
                    P1.remove(BNO);
                    P1.remove(BNN);
                    P1.remove(Bd);
                    P1.remove(Sd);
                    P1.remove(con);
                    P1.remove(back);
                    f1.setVisible(false);
                      new Library_application();
                }
                
                
                
                
                
            }
            
            
             public void main() throws IOException
            {
                BufferedWriter op = new BufferedWriter(new FileWriter("recent.dat"));
                op.write(S4+";");
                op.close();
                 RandomAccessFile f4 = new RandomAccessFile("NAME.dat","rw");
                 int a4 = (int)f4.length();
                 f4.seek(a4);
                 String S8 = f4.readLine();
                 f4.writeBytes("\n"+S4);
                 f4.close();
            }
            public static void main2() throws IOException
            {
                 RandomAccessFile f = new RandomAccessFile("Booknumber.dat","rw");
                 int a = (int)f.length();
                 f.seek(a);
                 String S = f.readLine();
                 f.writeBytes("\n"+S6);
                 f.close();
            }
        
               
           public void main3() throws IOException
                {
                 RandomAccessFile f2 = new RandomAccessFile("Borrow_Details.dat","rw");
                 int a1 = (int)f2.length();
                 f2.seek(a1);
                 String S1 = f2.readLine();
                 f2.writeBytes("\n"+wr2);
                 f2.close();
                 f1.setVisible(false);
                     new Library_application();
                     
            }
           public void SCN() throws IOException
           {
            BufferedReader sn = new BufferedReader(new FileReader("School"));
            SN=sn.readLine();
            sn.close();
            }
             public static void main(String args[])
            {
            confirm o= new confirm();
           }
           public static void Confirmation()throws IOException 
           {
                BufferedReader cf = new BufferedReader(new FileReader("show.dat"));
              
                     S4 = cf.readLine();
                     S5 = cf.readLine();
                     S6 = cf.readLine();
                     S7 = cf.readLine();
                    }
                }