/*CODED WITH IRON HANDS <BIGFIRE>
 * Copyright (c) 4th March 2013 11:57 AM
 * OPEN SOUCRED IDEA BORROWED FROM Raindolf Owusu
 * Runtime .0051 sec
 * Since i hate commenting my Codes(Real programmers dnt comment >"<)
 * Do the maths
 */

import javax.swing.*;
public class cedis2dollar {
  
  public static void main(String args[]){
		double dollar=0.51;
		double cedis=1.94;
		double pound=0.50;
		String option;
		double convertedValue=0;
		int op;
	option=	JOptionPane.showInputDialog(null," THIS IS A SIMPLE CURRENCY CONVERTER\n"+
				"INPUT (1) TO CONVERT FROM CEDIS TO DOLLARS\n INPUT (2) TO CONVERT FROM DOLLARS TO CEDIS\n INPUT (3) TO CONVERT CEDIS TO POUNDS \n INPUT(4) TO CONVERT FROM POUNDS TO CEDIS  ","Currency Converter",JOptionPane.PLAIN_MESSAGE
				);
	 op = Integer.parseInt(option);
	
	do{
		switch(op){
		
		case 1: 
		
			String var = JOptionPane.showInputDialog(null, "Please Enter Value in Cedis :", "Cedis to Dollars", JOptionPane.PLAIN_MESSAGE);
			int va = Integer.parseInt(var);
			
			convertedValue=va*dollar;
			
			JOptionPane.showMessageDialog(null,"GH "+va+"\t\t Equals : "+"$"+convertedValue,"Currency converter", JOptionPane.PLAIN_MESSAGE);
			break;
			
		case 2:
			String var1 = JOptionPane.showInputDialog(null, "Please Enter Value in Dollars :", "Dollars to Cedis", JOptionPane.PLAIN_MESSAGE);
			int va1 = Integer.parseInt(var1);
			
			convertedValue=va1*cedis;
			
			JOptionPane.showMessageDialog(null,"$"+va1+"\t\t Equals : "+"GH "+convertedValue,"Currency converter", JOptionPane.PLAIN_MESSAGE);
			
			break;
		case 3:
			String var2 = JOptionPane.showInputDialog(null, "Please Enter Value in Pounds :", "Pounds to Cedis", JOptionPane.PLAIN_MESSAGE);
			int va2 = Integer.parseInt(var2);
			
			convertedValue=va2*cedis;
			
			JOptionPane.showMessageDialog(null,"£"+va2+"\t\t Equals : "+"GH "+convertedValue,"Currency converter", JOptionPane.PLAIN_MESSAGE);
			
			break;
		case 4:
			String var3 = JOptionPane.showInputDialog(null, "Please Enter Value in cedis :", "Cedis to Pounds", JOptionPane.PLAIN_MESSAGE);
			int va3 = Integer.parseInt(var3);
			
			convertedValue=va3*pound;
			
			JOptionPane.showMessageDialog(null,"GH "+va3+"\t\t Equals : "+"£"+convertedValue,"Currency converter", JOptionPane.PLAIN_MESSAGE);
			
			break;
		}
	
		option=	JOptionPane.showInputDialog(null," THIS IS A SIMPLE CURRENCY CONVERTER\n"+
				"INPUT (1) TO CONVERT FROM CEDIS TO DOLLARS\n INPUT (2) TO CONVERT FROM DOLLARS TO CEDIS\n INPUT (3) TO CONVERT CEDIS TO POUNDS \n INPUT(4) TO CONVERT FROM POUNDS TO CEDIS  ","Currency Converter",JOptionPane.PLAIN_MESSAGE
				);
		
	 op = Integer.parseInt(option);
	} while(op!=JOptionPane.CANCEL_OPTION);
	 
	 System.exit(0);
	 
 }
		

	}
	




