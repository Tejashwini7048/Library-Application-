import java.io.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.event.*;
import java. util.Calendar;
import java.util.Date;  

 class confirm2 extends JFrame implements ActionListener
{
         JFrame f1; 
         int jn,Y1,Y3,Y2,M1,Z1,Z2,Z3,M2,q=0;
         String Y,Y0;
         JPanel P1;
         Label Sc,name,clas,BNO,BNN,Bd,Sd,BNO1;//JButton con,back,ex;
         JTextField t;
         static String bp;
         
         int l,c=0,z=0,h2,p;
         static String N,C,BN1,BN2,BD,SD,SN;
        String m ,S2,DC,T2,DC1;
        int c0=0;      
         String m1,S1,S0,S4,S6,S8,S9,FGC;
         JButton con,back,na,na2,na3,na4,na5,na1;
         int len,sum;
         String cop,cop1;
        String plu;int cal2=0;int BP=0;
              int cal1=0; String bh;int cal=0;
      confirm2()
      {
           f1 = new JFrame("CONFIRMATION");
           f1 . setSize(350,350);
           f1.setVisible(true);
           f1.setLocation(500,120);
           f1.setResizable(false);
           f1.setDefaultCloseOperation(0);
            
           P1 = new JPanel();
           f1.add(P1); 
           
           try{
            Bhv1();
            }catch(Exception a){}
        
            na = new JButton(N);
            na1 = new JButton(C);
            na2 = new JButton(BN2);
            na3 = new JButton(BD);
            na4 = new JButton(SD);
            
            try
            {
                SCN();
            }catch(IOException a){}
           
           Sc = new Label ("                        "+SN+"                     ");
           Sc.setBackground(Color.red);   
            name = new Label ("     NAME :-                               ");
            clas = new Label ("     CLASS :-                                                ");
            //BNO = new Label  ("   BOOK NUMBER :-                   "+m);
            BNN = new Label  ("   BOOK NAME :-                                 ");
            Bd  = new Label  ("   BORROWING DATE :-                            ");
            Sd  = new Label  ("   SUBMITION DATE :-                            ");
        
            con = new JButton("> > RETURN > >");
            con.addActionListener(this);
            con.setBackground(Color.green);
            
            //back = new JButton("< < BACK  < <");
            //back.addActionListener(this);
            //back.setBackground(Color.red);
            
            P1.add(Sc);
            P1.add(name);
            P1.add(na);
            P1.add(clas);
            P1.add(na1);
              P1.add(BNN);
            P1.add(na2);
           P1.add(Bd);
            P1.add(na3);
           P1.add(Sd);
            P1.add(na4);
            
            P1.add(con);
     
        }
      public void actionPerformed(ActionEvent e) 
      {
          if(e.getSource()==con)
          {
              try{
            Bhv1();
           }catch(Exception a){}
           try
           {
            Bhv2();
            }catch(Exception a){}
          /*    try
           {
            Bhv3();
            }catch(Exception a){}
             try
           {
            Bhv4();
            }catch(Exception a){}*/
            
        
            new Library_application(); 
            f1.setVisible(false);
        }
             
                
                
      }
      public  void Bhv1() throws IOException
      {
                BufferedReader in = new BufferedReader(new FileReader("bno.dat"));
                m=in.readLine();
                in.close();
         
            RandomAccessFile ff = new RandomAccessFile("Booknumber.dat","rw");
             for(int i=1;i<ff.length();i++){
             S2=ff.readLine();
              if(S2.equals(m))
              {
                p=i;
                c0=1; 
                   RandomAccessFile f2 = new RandomAccessFile("Borrow_Details.dat","rw");
                 
                
                for(int j=1;j<=i;j++)
                {int a3 = (int)f2.length();
               
                 S1=f2.readLine();
            
                }
              //f2.write("");
             
               f2.close();
                
                
                
                
               int c=S1.indexOf(";");
               S0=S1.substring(0,c);//NAME
               int l=S1.length();
               String  S3=S1.substring((c+1),l);
               int c1=S3.indexOf(";");
               S4=S3.substring(0,c1);//class
               int  l1=S3.length();
               String S5=S3.substring((c1+1),l1);
               int c2=S5.indexOf(";");
               S6=S5.substring(0,c2);//bn
               int l3=S5.length();
               String  S7=S5.substring(c2+1,l3);
               int c3=S7.indexOf(";");
               S8=S7.substring(0,c3);//bd
               int l4=S7.length();
                S9=S7.substring(c3+1,l4);//rd
              
                  
             
                
                
                N=S0;
                C=S4;
                BN2=S6;
                BD=S8;
                SD=S9;
                
                break;
              }
             
            }
            if(c0!=1)
            {
            JOptionPane.showMessageDialog(null,"THE BOOK NUMBER NOT FOUND");
             new Return();    
            }
            ff.close();
            
      
          
              }
      public void Bhv2() throws IOException
     {
          BufferedReader in1 = new BufferedReader(new FileReader("bno.dat"));
          m1=in1.readLine();
         in1.close();
         int cal1=0;int check=0;int pa=0;
            RandomAccessFile ff1 = new RandomAccessFile("Booknumber.dat","rw");
             for(int i=1;i<ff1.length();i++)
             {
             S2=ff1.readLine();
             pa++;
              if(S2.equals(m))
              {
                p=i;
                c0=1; 
                   RandomAccessFile f21 = new RandomAccessFile("Borrow_Details.dat","rw");
                 
                
                for(int j=1;j<=pa;j++)
                {int a3 = (int)f21.length();
               
                 S1=f21.readLine();
            
                }
              //f2.write("");
             
               f21.close();
                
                
                
              
                   RandomAccessFile f01 = new RandomAccessFile("Borrow_Details.dat","rw");
                 
               
                for(int j=1;j<=pa;j++)
                {
                 bh=f01.readLine();
                 if(bh.equals(S1))
                 {
                 int a9 = (int)f01.length();
                 f01.seek(cal);
                 String S = f01.readLine();
                 int yak = S1.length();
                  for(int yo=1;yo<=yak;yo++)           
                  f01.writeBytes(" ");
                    }
                 cal=cal+bh.length();   
                 
                }
              //f2.write("");
             
               f01.close();
               
      
               
               
               String plu3;int cal3=0;
                RandomAccessFile ff21 = new RandomAccessFile("NAME.dat","rw");
            for(int qo=1;qo<=pa;qo++)
            {
                plu3=ff21.readLine();
                //System.out.println(plu3);
                
                if(plu3.equals(N))
                 { //System.out.println(
                     //"reach");
                   
                   int a903 = (int)ff21.length();
                   ff21.seek(cal3);
                   String ha1 = ff21.readLine();
                   int go3=plu3.length();
                  for(int yoo=1;yoo<=go3;yoo++)           
                  ff21.writeBytes(" ");
                
                }
                cal3=cal3+plu3.length();
            }
         
               ff21.close();
               
               
               
               
               
              
                  
             
                check=1;
                
            
                
                break;
              }
            
            }
          
            ff1.close();
            
             RandomAccessFile ff2 = new RandomAccessFile("Booknumber.dat","rw");
            for(int qo=1;qo<=pa;qo++)
            {
                plu=ff2.readLine();
                //System.out.println(plu);
                
                if(m1.equals(plu))
                 {// System.out.println(
                    // "reach");
                   
                   int a90 = (int)ff2.length();
                   ff2.seek(cal2);
                   String ha = ff2.readLine();
                   int go=m1.length();
                  for(int yoo=1;yoo<=go;yoo++)           
                  ff2.writeBytes(" ");
                
                }
                cal2=cal2+plu.length();
            }
         
               ff2.close();
          
      }
      public void SCN() throws IOException
      {
          BufferedReader sn = new BufferedReader(new FileReader("School"));
          SN=sn.readLine();
          sn.close();
          
        }

   public static void main(String args[])throws IOException
      {
        confirm2 n = new confirm2(); 
      }
    }