import javax.swing.*; 
import java.awt.*; 
import java.awt.event.*; 


public class GUI6 extends JFrame implements ActionListener{
    
   private Container c; 
   private JLabel title; 
   private JLabel brand;
   private JButton audi; 
   private JButton bmw;
   private JButton honda;
   private JButton mazda;
   private JButton exit;
   
   public static void main(String[]args){
       GUI6 gui6 = new GUI6();
   }
   public void close(){
       WindowEvent winClosingEvent = new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
       Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);
   }
   public GUI6(){
       setTitle("Information Center"); 
       setBounds(550, 100, 270, 385); 
       setDefaultCloseOperation(EXIT_ON_CLOSE); 
       setResizable(false); 

       c = getContentPane(); 
       c.setLayout(null); 

       title = new JLabel("Information Center"); 
       title.setFont(new Font("Aries", Font.PLAIN, 30)); 
       title.setSize(250, 40); 
       title.setLocation(10, 30); 
       c.add(title); 
       
       brand = new JLabel("Select Car Brand:"); 
       brand.setFont(new Font("Times New Roman", Font.PLAIN, 25)); 
       brand.setSize(200, 30); 
       brand.setLocation(40, 80); 
       c.add(brand); 
       
       audi = new JButton("Audi"); 
       audi.setFont(new Font("Times New Roman", Font.PLAIN, 25)); 
       audi.setSize(245, 30); 
       audi.setLocation(10, 120); 
       audi.addActionListener(this); 
       c.add(audi); 
      
       bmw = new JButton("BMW"); 
       bmw.setFont(new Font("Times New Roman", Font.PLAIN, 25)); 
       bmw.setSize(245, 30); 
       bmw.setLocation(10, 170); 
       bmw.addActionListener(this); 
       c.add(bmw); 
      
       honda = new JButton("Honda"); 
       honda.setFont(new Font("Times New Roman", Font.PLAIN, 25)); 
       honda.setSize(245, 30); 
       honda.setLocation(10, 220); 
       honda.addActionListener(this); 
       c.add(honda); 

       mazda = new JButton("Mazda"); 
       mazda.setFont(new Font("Times New Roman", Font.PLAIN, 25)); 
       mazda.setSize(245, 30); 
       mazda.setLocation(10, 270); 
       mazda.addActionListener(this); 
       c.add(mazda);      
       
       exit = new JButton("Exit"); 
       exit.setFont(new Font("Times New Roman", Font.PLAIN, 25)); 
       exit.setSize(80, 30); 
       exit.setLocation(175, 320); 
       exit.addActionListener(this); 
       c.add(exit); 
       
}

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == audi){
           Audi audi = new Audi();
        }
        else if(e.getSource() == bmw){
                Bmw bmw = new Bmw();
        }
        else if(e.getSource() == honda){
                Honda honda = new Honda();
        }
        else if(e.getSource() == mazda){
                Mazda mazda = new Mazda();
        }
        else if(e.getSource() == exit){
                System.exit(0);
        }
        
    }
}
