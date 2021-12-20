import java.applet.*;
import java.awt.*;
import java.awt.event.*;

/*<applet code="temperatureConversion.class" width=500 height=500></applet>*/
public class temperatureConversion extends Applet implements ActionListener{

    Font f1;
    TextField t1 = new TextField(10);
    TextField t2 = new TextField(10);
    Label l1 = new Label("Enter Fahrenheit Temperature : ");
    Label l2 = new Label("Enter Celcius Temperature : ");
    Button b1 = new Button("Convert");
    Button b2 = new Button("Convert");
    Button b3 = new Button("Clear All");
    Label l3 = new Label("Fahrenheit to Celcius is : ");
    Label l4 = new Label("Celcius to Fahrenheit is : ");
    TextField t3 = new TextField(10);
    TextField t4 = new TextField(10);


    public void init(){
        f1=new Font("Arial",Font.BOLD,20);
        add(l1);
        add(t1);
        add(b1);
        add(l3);
        add(t3);
        add(l2);
        add(t2);
        add(b2);
        add(l4);
        add(t4);
        add(b3);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
    }



    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == b1){
            int a1 = Integer.parseInt(t1.getText());
            int a2 = ((a1 - 32) * 5)/9;
            t3.setText(String.valueOf(a2));
        }
        if(e.getSource() == b2){
            int a3 = Integer.parseInt(t2.getText());
            int a4 = (((a3 * 9)/5)+32);
            t4.setText(String.valueOf(a4));
        }
        if(e.getSource() == b3){
            t1.setText(""+0);
            t2.setText(""+0);
            t3.setText(""+0);
            t4.setText(""+0);
        }
    }


}
