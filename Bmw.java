import javax.swing.*; 
import java.awt.*; 
import java.awt.event.*; 

public class Bmw extends JFrame implements ActionListener{
    private Container c;
    private JLabel type;
    private JButton bmw740;
    private JButton bmwm850i;
    private JButton bmwx7;
    private JButton bmwz4;
    private JButton back;
    private JTextArea textout;
    
    public Bmw(){
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
        
        bmw740 = new JButton("BMW 740Le"); 
        bmw740.setFont(new Font("Aries", Font.PLAIN, 25)); 
        bmw740.setSize(250, 50); 
        bmw740.setLocation(10, 80); 
        bmw740.addActionListener(this); 
        c.add(bmw740); 
       
        bmwm850i = new JButton("BMW M850i"); 
        bmwm850i.setFont(new Font("Aries", Font.PLAIN, 25)); 
        bmwm850i.setSize(250, 50); 
        bmwm850i.setLocation(270, 80); 
        bmwm850i.addActionListener(this); 
        c.add(bmwm850i); 
       
        bmwx7 = new JButton("BMW X7"); 
        bmwx7.setFont(new Font("Aries", Font.PLAIN, 25)); 
        bmwx7.setSize(250, 50); 
        bmwx7.setLocation(10, 140); 
        bmwx7.addActionListener(this); 
        c.add(bmwx7); 
       
        bmwz4 = new JButton("BMW Z4"); 
        bmwz4.setFont(new Font("Aries", Font.PLAIN, 25)); 
        bmwz4.setSize(250, 50); 
        bmwz4.setLocation(270, 140); 
        bmwz4.addActionListener(this); 
        c.add(bmwz4); 
        
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
        if(e.getSource()==bmw740){
           data1 = "BMW 740Le xDrive Design Pure Excellence \n(2019)";
           data2 = "Engine Tech: 24-valve DOHC direct injection with twin-scroll turbocharger, variable valve \ntiming";
           data3 = "Capacity: 2998 cc";
           data4 = "Power: 282 hp at 5,000 rpm";
           data5 = "Bore x Stroke: 82mm x 94.6mm";
           textout.setText(data1 + "\n" + data2 + "\n" + data3 + "\n" + data4 + "\n" + data5); 
        }
        else if(e.getSource()==bmwm850i){
             data1 = "BMW M850i xDrive Coupe (2019)";
             data2 = "Engine Tech: 32-valve DOHC, direct fuel \ninjection, twin-turbo with variable valve \ntiming";
             data3 = "Capacity: 4395 cc";
             data4 = "Power: 530 hp at 5,500 rpm";
             data5 = "Bore x Stroke: 88.3mm x 89mm";
             textout.setText(data1 + "\n" + data2 + "\n" + data3 + "\n" + data4 + "\n" + data5); 
        }
        else if(e.getSource()==bmwx7){
                data1 = "BMW X7 xDrive40i Design Pure Excellence \n(2019)";
                data2 = "Engine Tech: 24-valve DOHC direct injection with twin-scroll turbocharger, variable valve \ntiming";
                data3 = "Capacity: 2998 cc";
                data4 = "Power: 335 hp at 5,500 rpm ";
                data5 = "Bore x Stroke: 82mm x 94.6mm";
             textout.setText(data1 + "\n" + data2 + "\n" + data3 + "\n" + data4 + "\n" + data5); 
        }
        else if(e.getSource()==bmwz4){
                data1 = "BMW Z4 sDrive30i M Sport (2019)";
                data2 = "Engine Tech: 16-valve DOHC, direct fuel \ninjection, twin-scroll turbo with variable valve \ntiming";
                data3 = "Capacity: 1998 cc";
                data4 = "Power: 255 hp at 5,000 rpm";
                data5 = "Bore x Stroke: 82mm x 94.6mm";
                textout.setText(data1 + "\n" + data2 + "\n" + data3 + "\n" + data4 + "\n" + data5); 
        }
        else if(e.getSource()==back){
                GUI6 gui6 = new GUI6();
                gui6.setVisible(true);
        }
        textout.setEditable(false);
    }
}
