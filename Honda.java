import javax.swing.*; 
import java.awt.*; 
import java.awt.event.*; 

public class Honda extends JFrame implements ActionListener{
    private Container c;
    private JLabel type;
    private JButton hondahrv;
    private JButton hondac;
    private JButton hondacrz;
    private JButton hondact;
    private JButton back;
    private JTextArea textout;
    
    public Honda(){
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
        
        hondahrv = new JButton("Honda HR-V"); 
        hondahrv.setFont(new Font("Aries", Font.PLAIN, 25)); 
        hondahrv.setSize(250, 50); 
        hondahrv.setLocation(10, 80); 
        hondahrv.addActionListener(this); 
        c.add(hondahrv); 
       
        hondac = new JButton("Honda Civic"); 
        hondac.setFont(new Font("Aries", Font.PLAIN, 25)); 
        hondac.setSize(250, 50); 
        hondac.setLocation(270, 80); 
        hondac.addActionListener(this); 
        c.add(hondac); 
       
        hondacrz = new JButton("Honda CR-Z"); 
        hondacrz.setFont(new Font("Aries", Font.PLAIN, 25)); 
        hondacrz.setSize(250, 50); 
        hondacrz.setLocation(10, 140); 
        hondacrz.addActionListener(this); 
        c.add(hondacrz); 
       
        hondact = new JButton("Honda City"); 
        hondact.setFont(new Font("Aries", Font.PLAIN, 25)); 
        hondact.setSize(250, 50); 
        hondact.setLocation(270, 140); 
        hondact.addActionListener(this); 
        c.add(hondact); 
        
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
        if(e.getSource()==hondahrv){
           data1 = "Honda HR-V 1.8 CVT S (2018)";
           data2 = "Engine Tech: 16-valve SOHC, naturally\n-aspirated with variable valve timing";
           data3 = "Capacity: 1799 cc";
           data4 = "Power: 140 hp at 6,500 rpm";
           data5 = "Bore x Stroke: 81mm x 87.3mm";
           textout.setText(data1 + "\n" + data2 + "\n" + data3 + "\n" + data4 + "\n" + data5); 
        }
        else if(e.getSource()==hondac){
             data1 = "Honda Civic Type R (2018)";
             data2 = "Engine Tech: 16-valve DOHC, turbocharged with variable valve timing";
             data3 = "Capacity: 1996 cc";
             data4 = "Power: 306 hp at 6,500 rpm";
             data5 = "Bore x Stroke: 86mm x 85.9mm";
             textout.setText(data1 + "\n" + data2 + "\n" + data3 + "\n" + data4 + "\n" + data5); 
        }
        else if(e.getSource()==hondacrz){
                data1 = "Honda CR-Z Hybrid 1.5 MT (2015)";
                data2 = "Engine Tech: 16 valve SOHC, naturally\n-aspirated with variable valve timing and \nelectric motor assist";
                data3 = "Capacity: 1496 cc";
                data4 = "Power: 118 hp at 6,600 rpm";
                data5 = "Bore x Stroke: 73mm x 89.4mm";
             textout.setText(data1 + "\n" + data2 + "\n" + data3 + "\n" + data4 + "\n" + data5); 
        }
        else if(e.getSource()==hondact){
                data1 = "Honda City 1.5 S (2020)";
                data2 = "Engine Tech: 16 valve SOHC, naturally\n-aspirated with variable valve timing";
                data3 = "Capacity: 1497 cc";
                data4 = "Power: 118 hp at 6,600 rpm";
                data5 = "Bore x Stroke: 73mm x 89.4mm";
                textout.setText(data1 + "\n" + data2 + "\n" + data3 + "\n" + data4 + "\n" + data5); 
        }
        else if(e.getSource()==back){
                GUI6 gui6 = new GUI6();
                gui6.setVisible(true);
        }
        textout.setEditable(false);
    }
}
