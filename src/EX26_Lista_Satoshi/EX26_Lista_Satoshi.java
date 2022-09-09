package EX26_Lista_Satoshi;

import javax.swing.JOptionPane;
	
	public class EX26_Lista_Satoshi {
	public static void main(String[] args) {
		
		int valor1, valor2;
		double div1,div2;
		
		valor1=Integer.parseInt(JOptionPane.showInputDialog("Insira o primeiro valor"));
		valor2=Integer.parseInt(JOptionPane.showInputDialog("Insira o segundo valor"));
		
		div1 = (valor1%valor2);
		div2 = (valor2 % valor1);
		
		if (div1 == 0 && div2 == 0);
		{
			JOptionPane.showMessageDialog(null,"O maior valor é divisivel pelo menor valor " + div1);
		
		}
		if (div2 == 0 && div1 == 0); 
	
		{
		JOptionPane.showMessageDialog(null,"O maior valor é divisivel pelo menor valor " + div2);
		}
		
	}

}
