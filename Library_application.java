       import java.io.*;
import java.awt.*;
import javax.swing.*; 
import java.awt.event.*;
import javax.swing.event.*;
import java. util.Calendar;
import java.util.Date;

     public class Library_application implements ActionListener
    {
        JFrame f;
        JTextField Name,Class,Section,BoN,BN,SubmitionDate,Enterthedate;
        JButton sub,ex,dev,bor,ret,sl,up,bor1;
        Label s,ed,n,c,sec,bn,bno,sd,sl1,thank,dev1,sp1,sp2,bnn;
        JPanel P;
        String sj,su,exl,cl3,cl,Y="",A,B,C,S="",Re="",Write="",fi="";
        static String n1,n2,n3,n4;JLabel IL,IL1;
        int refresh,finished,n0=0;       String S2,S3;           int Css,Cs,OP;
        char Pro='Y',zx;char dc;int alt=0,alt1=0;
        int Y1,Y2,M1;JComboBox Cb,Sec;int go=5,m,ip;static String SN;
        Library_application()
        {
            f = new JFrame("HT SOFTWARES Ltd");
            f . setSize(300,350);
            f.setVisible(true);
            f.setLocation(500,120);
            f.setResizable(false);
            f.setDefaultCloseOperation(0);
            
            P = new JPanel();
          
            f.add(P);
            P.setBackground(Color.cyan);
            Name = new JTextField(20);
           // Class = new JTextField(20);
           // Section = new JTextField(20);
            BoN = new JTextField(20);
            BN = new JTextField(05);
            //SubmitionDate = new JTextField(20);
            //Enterthedate = new JTextField(20);
            try
            {
                SCN();
            }catch(IOException a){}
             
            s = new Label ("                        "+SN+"                     ");
            s.setBackground(Color.red);
          
            ed = new Label("ENTER DETAILS:-   ");
            n = new Label ("                          NAME                                ");
            c = new Label (" SELECT SEM :-         ");
           // sec =new Label(" SELECT SECTION :-       ");
            sp2= new Label ("                                                                                                                                                                                                                                                                                                                                                                                                ");
            bno=new Label ("BOOK NUMBER        ");
            bnn=new Label("       BOOK NAME ");
            sp1=new Label  ("                                                                                                                                                                                                                                                                                                                                                                                                ");
           // ed=new Label  ("ENTER THE DATE                      ");  
            sl1= new Label ("SUBMITION LIST                      ");
          
        
               ImageIcon I = new ImageIcon("G:\\Library Application\\mes.jpg");
                    IL = new JLabel(I);
                
               ImageIcon I1 = new ImageIcon("G:\\Library Application\\IMG.jpg");
                    IL1 = new JLabel(I1);
               //    f.setLayout(new BorderLayout());
                 //  f.setContentPane(IL);
                   //f.setLayout(new FlowLayout());//
           
            
            
                 
                String[] Cla = {"1st","2nd","3rd","4th","5th","6th"};
                 Cb = new JComboBox(Cla);
                 Cb.setSelectedIndex(0);
               /* String[] Sect = {"A","B"};
                 Sec = new JComboBox(Sect);
                 Sec.setSelectedIndex(0);*/
            
                 
                 
                 
            ex = new JButton("EXIT");
            ex.addActionListener(this);
            ex.setBackground(Color.red);
            
            sub = new JButton("SUBMIT");
            sub.addActionListener(this);
            sub.setBackground(Color.magenta);
            
            sl = new JButton("  INSTALL TO NEW Institution   ");
            sl.addActionListener(this);
            sl.setBackground(Color.green);
            
            dev = new JButton("DEVELOPER");
            dev.addActionListener(this);
            dev.setBackground(Color.yellow);
            
            bor = new JButton("BORROW BOOK");
            bor.addActionListener(this);
            bor.setBackground(Color.pink);
            
            bor1 = new JButton("Pending List");
            bor1.addActionListener(this);
            bor1.setBackground(Color.orange);
            
              Calendar ca = Calendar.getInstance();
              Y1=ca.get(Calendar.YEAR)+1;
              Y2=(Y1+1);
              M1=ca.get(Calendar.MONTH);
            
           
              Y=(Y1)+" - "+Y2;
            up = new JButton(" CHANGE LOGIN DETAILS ");
            up.addActionListener(this);
            up.setBackground(Color.green);
            ret = new JButton("RETURN BOOK");
            ret.addActionListener(this);
            ret.setBackground(Color.orange);
            
            P.add(sp1);  
            P.add(s);
            P.add(sp1);
           // P.add(sp1);
            P.add(bor);
            P.add(sp1);
            //P.add(sp1);
            P.add(ret);
             P.add(sp1);
            //P.add(sp1);
            P.add(up);
            P.add(sp1);
            //P.add(sp1);
            P.add(sl);
            P.add(sp1);
            //P.add(sp1);
            P.add(dev);
            P.add(sp1);
           // P.add(bor1);
            //P.add(sp1);
            P.add(ex);
             f.setVisible(false);
                    f.setVisible(true);
            
        }
      
        public void actionPerformed(ActionEvent e)
        {
          if(e.getSource()==ex)
          {
              System.exit(0);
            }
              if(e.getSource()==bor1)
          {

              f.setVisible(false);
            }
            
             if(e.getSource()==sl)
             {
                new NEW_SCHOOL();
                f.setVisible(false);
                }
            if(e.getSource()==bor)
            {
             // P.remove(sp1);
              P.remove(s);
              P.remove(sp1);
              P.remove(bor);
              P.remove(sp1);
              P.remove(ret);
              P.remove(sp1);
              P.remove(up);
              P.remove(sp1);
              P.remove(sl);
              P.remove(sp1);
              P.remove(dev);
              P.remove(sp1);
              //P.remove(bor1);
              P.remove(ex);
                       
                    f.setVisible(false);
                    f.setVisible(true);
              P.add(s);      
              P.add(ed);     
              P.add(n);
              P.add(Name);
              P.add(c);
              P.add(Cb);
             // P.add(sec);
             // P.add(Sec);
              P.add(bno);
              P.add(BN);
              P.add(bnn);
              P.add(BoN);
              P.add(sub);
              P.add(ex);
                      
                    f.setVisible(false);
                    f.setVisible(true);
            
            
            
            }
            if(e.getSource()==sub)
            {
              go=1;
                A=Name.getText();
                B=BN.getText();
                C=BoN.getText();
                int qp=A.length();
                if(qp==0)
                {
                    ip++;
                JOptionPane.showMessageDialog(null," â–º ENTER  NAME â—„ ");
            Name.setText("");
            BN.setText("");
            BoN.setText("");

            go=0;
            }
            for(int qz=1;qz<qp;qz++)
            {
                dc=A.charAt(qz);
            if(Character.isDigit(dc))
            {
            JOptionPane.showMessageDialog(null," â–º ENTER A VALID NAME  NAME â—„ ");
            Name.setText("");
            BN.setText("");
            BoN.setText("");
            go=0;
            break;
            }
            }
            
                int qw=B.length();
                for(int i=0;i<qw;i++)
                {
                    zx=B.charAt(i);
                    if(Character.isLetter(zx))
                     {
                       m++; 
                       JOptionPane.showMessageDialog(null," â–º BOOK NUMBER YOU HAVE ENTERED CONTAINS APLPHABETS â—„ ");
                        Name.setText("");
                        BN.setText("");
                        BoN.setText("");
                       break;
                    }
                }
                int as=C.length();
                if(as==0)
                {
                JOptionPane.showMessageDialog(null," â–º YOU HAVE NOT ENTERED THE BOOK NAME â—„ ");
                go=0; 
                 Name.setText("");
                BN.setText("");
                 BoN.setText("");
             
               }
                if(ip>0 || m>0)
                {
                    Name.setText("");
                    BN.setText("");
                    BoN.setText("");
                    go=0;
                }
                
            
                  Cs=Cb.getSelectedIndex();
                if(Cs==0)
                Css=5;
                  if(Cs==1)
                Css=6; 
                 if(Cs==2)
                Css=7;
                 if(Cs==3)
                Css=8;
                 if(Cs==4)
                Css=9;
                 if(Cs==5)
                Css=10;
                
                
                Write=A+";"+Css;
                Re=A+";"+Css+";"+B+";"+C+";";
                 try 
                {
                  main3();
                }
                 catch (Exception a){}
                 try
                 {
                  main5();
                }
                 catch (Exception a){}
                
               
               if(go!=0 && alt!=1 && alt1!=1)
             {
               try 
                {
                   wri();
                }
                 catch (Exception a){}
                 P.remove(s);
                 P.remove(ed);     
              P.remove(n);
              P.remove(Name);
              P.remove(c);
              P.remove(Cb);
             // P.remove(sec);
             // P.remove(Sec);
              P.remove(bno);
              P.remove(BN);
              P.remove(bnn);
              P.remove(BoN);
              P.remove(sub);
              P.remove(ex);   
            }
              else 
                 {
                   
                    f.setVisible(false);
                   new Library_application();
                    //go=0;
                    }
           }
         
           if(e.getSource()==ret)
           {
               new Return();
               f.setVisible(false);
            }
              if(e.getSource()==up)
           {
               new NEW_LOGIN();
               f.setVisible(false);
            }
            if(e.getSource()==dev)
            {
            JOptionPane.showMessageDialog(null,IL);
            JOptionPane.showMessageDialog(null,"DEVELOPER DETAILS :- "+"\n"+"NAME :-  Tejashwini NT0 "+"\n"+"PHONE NUMBER :- 9686157048"+"\n"+"EMAIL:- tej8147@gmail.com"+"\n"+"Name : Harshitha GL"+"\n"+"Phone Number : 8088216163"+"\n"+"Email : harshi@gmail.com");            
          
            }
            
            
            
            
            
            
    }
     public void main3() throws IOException
            {
              RandomAccessFile f = new RandomAccessFile("Booknumber.dat","rw");
              for(int i=0;i<f.length();i++)
              {
                S2=f.readLine();
                if(S2.equals(B))
                {
                   JOptionPane.showMessageDialog(null,"THE BOOK IS ALREADY BEING BORROWED");
                   alt=1;
                   break;
                }
                }
                
                f.close();
            }
         public void main5() throws IOException
            {
              RandomAccessFile f2 = new RandomAccessFile("NAME.dat","rw");
              for(int i=0;i<f2.length();i++)
              {
                S3=f2.readLine();
                if(S3.equals(A))
                {
                   JOptionPane.showMessageDialog(null,"THE PERSON HAS ALREADY A BOOK REGISTERED BUT NOT RETURNED");
                   alt1=1;
                   break;
                }
                }
                
                f2.close();
            }    
            
    public void SCN()throws IOException
    {  BufferedReader scn = new BufferedReader(new FileReader("School"));
       SN=scn.readLine();
       scn.close();
    
    }
    public void wri()throws IOException
    {
        BufferedWriter ff = new BufferedWriter(new FileWriter("Now.dat"));
        ff.write(Write);
       BufferedWriter fff = new BufferedWriter(new FileWriter("N.dat"));        
         fff.write(Re);
        BufferedWriter f1 = new BufferedWriter(new FileWriter("ch.dat"));        
         f1.write(A);
         fff.close();
         ff.close();
        f1.close();
        new confirm();
               
         
         f.setVisible(false); 
                
    }     
       
        public static void main(String args[])
        {
            Library_application o= new Library_application();
        }         
}      
                
                
                
                
                
                
                
                
                
            
              
            
                
                   
            
            
            
            
            
            
             
                 
             
                
      
        
            
            
            
            
            
            
            
            
        