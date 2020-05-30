import javax.swing.*; 
import java.awt.*; 
import java.awt.event.*; 

public class GUI5 extends JFrame implements ActionListener {

   private Container w; 
   private JLabel title; 
   private JLabel name; 
   private JTextField textname; 
   private JLabel gender; 
   private JRadioButton male; 
   private JRadioButton female; 
   private JLabel noic;
   private JTextField textnoic;
   private ButtonGroup button; 
   private JLabel bd; 
   private JComboBox date; 
   private JComboBox month; 
   private JComboBox year; 
   private JLabel address; 
   private JTextArea textadd; 
   private JButton reg; 
   private JButton reset; 
   private JTextArea textout; 
   private JLabel res; 

   private String dates[] 
      = { "1", "2", "3", "4", "5", 
         "6", "7", "8", "9", "10", 
         "11", "12", "13", "14", "15", 
         "16", "17", "18", "19", "20", 
         "21", "22", "23", "24", "25", 
         "26", "27", "28", "29", "30", 
         "31" }; 
   private String months[] 
      = { "January", "February", "March", "April", 
         "May", "June", "July", "August", 
         "September", "October", "November", "December" }; 
   private String years[] 
      = { "1990", "1991", "1992", "1993",
          "1994", "1995", "1996", "1997", 
          "1998", "1999", "2000", "2001", 
          "2002", "2003", "2004", "2005", 
          "2006", "2007", "2008", "2009", 
          "2010", "2011", "2012", "2013", 
          "2014", "2015", "2016", "2017", 
          "2018", "2019" }; 

   public static void main(String[] args){
       GUI5 gui5 = new GUI5();
   }
   
   public GUI5() 
   { 
      setTitle("Registration Form"); 
      setBounds(0, 0, 1370, 730); 
      setDefaultCloseOperation(EXIT_ON_CLOSE); 
      setResizable(false); 

      w = getContentPane(); 
      w.setLayout(null); 

      title = new JLabel("Customer Registration Form"); 
      title.setFont(new Font("Times New Roman", Font.PLAIN, 30)); 
      title.setSize(500, 40); 
      title.setLocation(90, 30); 
      w.add(title); 

      name = new JLabel("Name"); 
      name.setFont(new Font("Times New Roman", Font.PLAIN, 25)); 
      name.setSize(100, 20); 
      name.setLocation(100, 100); 
      w.add(name); 

      textname = new JTextField(); 
      textname.setFont(new Font("Times New Roman", Font.PLAIN, 25)); 
      textname.setSize(300, 30); 
      textname.setLocation(400, 100); 
      w.add(textname); 

      gender = new JLabel("Gender"); 
      gender.setFont(new Font("Times New Roman", Font.PLAIN, 25)); 
      gender.setSize(100, 20); 
      gender.setLocation(100, 150); 
      w.add(gender); 

      male = new JRadioButton("Male"); 
      male.setFont(new Font("Times New Roman", Font.PLAIN, 25)); 
      male.setSelected(true); 
      male.setSize(75, 20); 
      male.setLocation(400, 150); 
      w.add(male); 

      female = new JRadioButton("Female"); 
      female.setFont(new Font("Times New Roman", Font.PLAIN, 25)); 
      female.setSelected(false); 
      female.setSize(120, 20); 
      female.setLocation(475, 150); 
      w.add(female); 

      button = new ButtonGroup(); 
      button.add(male); 
      button.add(female); 

      noic = new JLabel("Identity Card Number"); 
      noic.setFont(new Font("Times New Roman", Font.PLAIN, 25)); 
      noic.setSize(300, 25); 
      noic.setLocation(100, 200); 
      w.add(noic); 

      textnoic = new JTextField(); 
      textnoic.setFont(new Font("Times New Roman", Font.PLAIN, 25)); 
      textnoic.setSize(300, 30); 
      textnoic.setLocation(400, 200); 
      w.add(textnoic); 
      
      bd = new JLabel("Birth Date"); 
      bd.setFont(new Font("Times New Roman", Font.PLAIN, 25)); 
      bd.setSize(200, 20); 
      bd.setLocation(100, 250); 
      w.add(bd); 

      date = new JComboBox(dates); 
      date.setFont(new Font("Times New Roman", Font.PLAIN, 25)); 
      date.setSize(50, 35); 
      date.setLocation(400, 250); 
      w.add(date); 

      month = new JComboBox(months); 
      month.setFont(new Font("Times New Roman", Font.PLAIN, 25)); 
      month.setSize(150, 35); 
      month.setLocation(450, 250); 
      w.add(month); 

      year = new JComboBox(years); 
      year.setFont(new Font("Times New Roman", Font.PLAIN, 25)); 
      year.setSize(80, 35); 
      year.setLocation(600, 250); 
      w.add(year); 

      address = new JLabel("Address"); 
      address.setFont(new Font("Times New Roman", Font.PLAIN, 25)); 
      address.setSize(100, 20); 
      address.setLocation(100, 300); 
      w.add(address); 

      textadd = new JTextArea(); 
      textadd.setFont(new Font("Times New Roman", Font.PLAIN, 25)); 
      textadd.setSize(300, 200); 
      textadd.setLocation(400, 300); 
      textadd.setLineWrap(true); 
      w.add(textadd); 
 
      reg = new JButton("Register"); 
      reg.setFont(new Font("Times New Roman", Font.PLAIN, 25)); 
      reg.setSize(290, 30); 
      reg.setLocation(100, 550); 
      reg.addActionListener(this); 
      w.add(reg); 


      reset = new JButton("Reset"); 
      reset.setFont(new Font("Times New Roman", Font.PLAIN, 25)); 
      reset.setSize(300, 30); 
      reset.setLocation(400, 550); 
      reset.addActionListener(this); 
      w.add(reset); 

      textout = new JTextArea(); 
      textout.setFont(new Font("Times New Roman", Font.PLAIN, 25)); 
      textout.setSize(530, 650); 
      textout.setLocation(800, 30); 
      textout.setLineWrap(true); 
      textout.setEditable(false); 
      w.add(textout); 

      res = new JLabel(""); 
      res.setFont(new Font("Times New Roman", Font.PLAIN, 25)); 
      res.setSize(500, 30); 
      res.setLocation(100, 590); 
      w.add(res); 

      setVisible(true); 
   } 

   public void actionPerformed(ActionEvent e) 
   { 
      if (e.getSource() == reg) {  
            String data1; 
            String data 
               = "Name : "
               + textname.getText() + "\n"; 
            if (male.isSelected()) 
               data1 = "Gender : Male"
                     + "\n"; 
            else
               data1 = "Gender : Female"
                     + "\n"; 
            
            String data2 = "Identity Card Number : " + textnoic.getText() + "\n"; 
            
            String data3 
               = "Birth Date : "
               + (String)date.getSelectedItem() 
               + "/" + (String)month.getSelectedItem() 
               + "/" + (String)year.getSelectedItem() 
               + "\n"; 

            String data4 = "Home Address : " + textadd.getText(); 
            textout.setText(data + data1 + data2 + data3 + data4); 
            textout.setEditable(false); 
            res.setText("Your Registration is Success!"); 
                GUI6 gui6 = new GUI6();
                gui6.setVisible(true);
         } 
      else if (e.getSource() == reset) { 
         String def = ""; 
         textname.setText(def); 
         textadd.setText(def); 
         textnoic.setText(def);
         res.setText(def); 
         textout.setText(def); 
         date.setSelectedIndex(0); 
         month.setSelectedIndex(0); 
         year.setSelectedIndex(0);  
      } 
   } 
} 

