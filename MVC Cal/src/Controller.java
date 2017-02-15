import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;


/** dfgdfg  **/
public class Controller  extends JFrame  {

	View v =new View();
	Model m =new Model();
	
	public  Controller (Model a,View b)
	{
		this.v=b;
		this.m=a;
		 v.setCalcButtonListener(new CalcButtonListener());
	}
	class CalcButtonListener implements ActionListener{
	public void actionPerformed(ActionEvent e)
	{
		
		if (e.getSource()== v.jButton1)
		{
			m.set_Fnum(Double.parseDouble(v.jTextField1.getText()));
			m.set_Snum(Double.parseDouble(v.jTextField2.getText()));
			m.Add();
			v.jTextField3.setText(Double.toString(m.get_Result()));
		}
		if (e.getSource()== v.jButton2)
		{
			m.set_Fnum(Double.parseDouble(v.jTextField1.getText()));
			m.set_Snum(Double.parseDouble(v.jTextField2.getText()));
			m.Sub();
			v.jTextField3.setText(Double.toString(m.get_Result()));
		}
		
		if (e.getSource()== v.jButton3)
		{
			m.set_Fnum(Double.parseDouble(v.jTextField1.getText()));
			m.set_Snum(Double.parseDouble(v.jTextField2.getText()));
			m.Mul();
			v.jTextField3.setText(Double.toString(m.get_Result()));
		}
		
		if (e.getSource()== v.jButton4)
		{
			m.set_Fnum(Double.parseDouble(v.jTextField1.getText()));
			m.set_Snum(Double.parseDouble(v.jTextField2.getText()));
			m.Div();
			v.jTextField3.setText(Double.toString(m.get_Result()));
		}
		
	}
	}
	public static void main (String args[])
	{
		Model m = new Model();
        View v = new View();
        Controller controller = new Controller(m, v);
        v.setDefaultCloseOperation(EXIT_ON_CLOSE);
		v.setVisible(true);
		System.out.println(" ");
		
	}
}