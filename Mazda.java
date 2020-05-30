import javax.swing.*; 
import java.awt.*; 
import java.awt.event.*; 

public class Mazda extends JFrame implements ActionListener{
    private Container c;
    private JLabel type;
    private JButton mazdab;
    private JButton mazdac;
    private JButton mazdabt;
    private JButton mazdacx;
    private JButton back;
    private JTextArea textout;
    
    public Mazda(){
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
        
        mazdab = new JButton("Mazda Biante"); 
        mazdab.setFont(new Font("Aries", Font.PLAIN, 25)); 
        mazdab.setSize(250, 50); 
        mazdab.setLocation(10, 80); 
        mazdab.addActionListener(this); 
        c.add(mazdab); 
       
        mazdac = new JButton("Mazda CX-9"); 
        mazdac.setFont(new Font("Aries", Font.PLAIN, 25)); 
        mazdac.setSize(250, 50); 
        mazdac.setLocation(270, 80); 
        mazdac.addActionListener(this); 
        c.add(mazdac); 
       
        mazdabt = new JButton("Mazda BT-50"); 
        mazdabt.setFont(new Font("Aries", Font.PLAIN, 25)); 
        mazdabt.setSize(250, 50); 
        mazdabt.setLocation(10, 140); 
        mazdabt.addActionListener(this); 
        c.add(mazdabt); 
       
        mazdacx = new JButton("Mazda CX-30"); 
        mazdacx.setFont(new Font("Aries", Font.PLAIN, 25)); 
        mazdacx.setSize(250, 50); 
        mazdacx.setLocation(270, 140); 
        mazdacx.addActionListener(this); 
        c.add(mazdacx); 
        
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
        if(e.getSource()==mazdab){
           data1 = "Mazda Biante 2.0 SkyActiv-G (2014)";
           data2 = "Engine Tech: 16-valve DOHC, direct fuel \ninjection, naturally-aspirated with variable \nvalve timing";
           data3 = "Capacity: 1998 cc";
           data4 = "Power: 149 hp at 6,000 rpm";
           data5 = "Bore x Stroke: 83.5mm x 91.2mm";
           textout.setText(data1 + "\n" + data2 + "\n" + data3 + "\n" + data4 + "\n" + data5); 
        }
        else if(e.getSource()==mazdac){
             data1 = "Mazda CX-9 2.5 SkyActiv-G Turbo 2WD \n(2020)";
             data2 = "Engine Tech: 16-valve DOHC, naturally\n-aspirated, turbocharged";
             data3 = "Capacity: 2488 cc";
             data4 = "Power: 228 hp at 5,000rpm";
             data5 = "Bore x Stroke: 89mm x 100mm";
             textout.setText(data1 + "\n" + data2 + "\n" + data3 + "\n" + data4 + "\n" + data5); 
        }
        else if(e.getSource()==mazdabt){
                data1 = "Mazda BT-50 2.2 MT (2018)";
                data2 = "Engine Tech: 16-valve DOHC, naturally\n-aspirated, common-rail, turbocharged";
                data3 = "Capacity: 2198 cc";
                data4 = "Power: 150 hp at 3,700 rpm";
                data5 = "Bore x Stroke: 86mm x 94.6mm";
             textout.setText(data1 + "\n" + data2 + "\n" + data3 + "\n" + data4 + "\n" + data5); 
        }
        else if(e.getSource()==mazdacx){
                data1 = "Mazda CX-30 2.0 G SkyActiv-G 2WD (2020)";
                data2 = "Engine Tech: 16-valve DOHC, Naturally \nAspirated with Direct Injection and Variable \nValve Timing";
                data3 = "Capacity: 1998 cc";
                data4 = "Power: 162 hp at 6,000 rpm";
                data5 = "Bore x Stroke: 83.5mm x 91.2mm";
                textout.setText(data1 + "\n" + data2 + "\n" + data3 + "\n" + data4 + "\n" + data5); 
        }
        else if(e.getSource()==back){
                GUI6 gui6 = new GUI6();
                gui6.setVisible(true);
        }
        textout.setEditable(false);
    }
}
