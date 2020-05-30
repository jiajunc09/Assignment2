import javax.swing.*; 
import java.awt.*; 
import java.awt.event.*; 

public class Audi extends JFrame implements ActionListener{
    private Container c;
    private JLabel type;
    private JButton audia1;
    private JButton audia3;
    private JButton audiq2;
    private JButton audiq3;
    private JButton back;
    private JTextArea textout;
    
    public Audi(){
        setTitle("Information Centre"); 
        setBounds(415, 50, 535, 620); 
        setDefaultCloseOperation(EXIT_ON_CLOSE); 
        setResizable(false); 

        c = getContentPane(); 
        c.setLayout(null); 

        type = new JLabel("Select Car to Review The Specification"); 
        type.setFont(new Font("Aries", Font.PLAIN, 30)); 
        type.setSize(520, 40); 
        type.setLocation(10, 30); 
        c.add(type); 
        
        audia1 = new JButton("Audi A1"); 
        audia1.setFont(new Font("Aries", Font.PLAIN, 25)); 
        audia1.setSize(250, 50); 
        audia1.setLocation(10, 80); 
        audia1.addActionListener(this); 
        c.add(audia1); 
       
        audia3 = new JButton("Audi A3 Sedan"); 
        audia3.setFont(new Font("Aries", Font.PLAIN, 25)); 
        audia3.setSize(250, 50); 
        audia3.setLocation(270, 80); 
        audia3.addActionListener(this); 
        c.add(audia3); 
       
        audiq2 = new JButton("Audi Q2 sport"); 
        audiq2.setFont(new Font("Aries", Font.PLAIN, 25)); 
        audiq2.setSize(250, 50); 
        audiq2.setLocation(10, 140); 
        audiq2.addActionListener(this); 
        c.add(audiq2); 
       
        audiq3 = new JButton("Audi Q3"); 
        audiq3.setFont(new Font("Aries", Font.PLAIN, 25)); 
        audiq3.setSize(250, 50); 
        audiq3.setLocation(270, 140); 
        audiq3.addActionListener(this); 
        c.add(audiq3); 
        
        textout = new JTextArea(); 
        textout.setFont(new Font("Aries", Font.PLAIN, 25)); 
        textout.setSize(510, 350); 
        textout.setLocation(10, 200); 
        textout.setLineWrap(true); 
        textout.setEditable(false); 
        c.add(textout); 
        
        back = new JButton("Back"); 
        back.setFont(new Font("Aries", Font.PLAIN, 25)); 
        back.setSize(100, 30); 
        back.setLocation(420, 555); 
        back.addActionListener(this); 
        c.add(back); 
        
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String data1, data2, data3, data4, data5 = null;
        if(e.getSource()==audia1){
           data1 = "Audi A1 1.4 TFSI (2014)";
           data2 = "Engine Tech: 16-valve DOHC, direct fuel \ninjection, turbocharged with variable valve \ntiming";
           data3 = "Capacity: 1390 cc";
           data4 = "Power: 122 hp at 5,000 rpm";
           data5 = "Bore x Stroke: 76.5mm x 75.6mm";
           textout.setText(data1 + "\n" + data2 + "\n" + data3 + "\n" + data4 + "\n" + data5); 
        }
        else if(e.getSource()==audia3){
             data1 = "Audi A3 Sedan 1.4 TFSI (2017)";
             data2 = "Engine Tech: 16-valve DOHC, direct fuel \ninjection, turbocharged with variable valve \ntiming";
             data3 = "Capacity: 1395cc";
             data4 = "Power: 122 hp at 5,000 rpm";
             data5 = "Bore x Stroke: 76.5mm x 76.5mm";
             textout.setText(data1 + "\n" + data2 + "\n" + data3 + "\n" + data4 + "\n" + data5); 
        }
        else if(e.getSource()==audiq2){
                data1 = "Audi Q2 sport 1.4 TFSI (2019)";
                data2 = "Engine Tech: 16-valve DOHC, direct fuel \ninjection, turbocharged with variable valve \ntiming";
                data3 = "Capacity: 1395 cc";
                data4 = "Power: 150 hp at 5,000 rpm";
                data5 = "Bore x Stroke: 74.5mm x 80mm";
             textout.setText(data1 + "\n" + data2 + "\n" + data3 + "\n" + data4 + "\n" + data5); 
        }
        else if(e.getSource()==audiq3){
                data1 = "Audi Q3 1.4 TFSI (2019)";
                data2 = "Engine Tech: 16-valve DOHC, direct fuel \ninjection, turbocharged with variable valve \ntiming";
                data3 = "Capacity: 1395 cc";
                data4 = "Power: 147 hp at 5,000 rpm";
                data5 = "Bore x Stroke: 74.5mm x 80mm";
                textout.setText(data1 + "\n" + data2 + "\n" + data3 + "\n" + data4 + "\n" + data5); 
        }
        else if(e.getSource()==back){
                GUI6 gui6 = new GUI6();
                gui6.setVisible(true);
        }
        textout.setEditable(false);
    }
}
