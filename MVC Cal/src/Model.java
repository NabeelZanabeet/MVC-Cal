import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class Model{

	private double Fnum;
	private double Snum;
	private double Result;
	
	
	Model(){
		
	}

	Model(double a,double b){
		 Fnum=a;
		 Snum=b;
	}


	public void set_Fnum (double a){
		Fnum=a;
	}
	public double get_Fnum (){
	    return Fnum;
	}
	
	public void set_Snum (double a){
		Snum=a;
	}
	public double get_Snum (){
	    return Snum;
	}
	
	public void Add (){
		Result = Fnum+Snum;
	}
	public void Sub (){
		Result = Fnum-Snum;
	}
	public void Mul (){
		Result = Fnum*Snum;
	}
	public void Div (){
		if (Snum==0)
		{
			JOptionPane.showMessageDialog(null,"Error ..Cant divide on zero");
		}
		else 
		Result = Fnum/Snum;
	}
	public double get_Result (){
	    return Result;
	}
	


	
	
	
}

