import java.awt.*;
import java.awt.event.*;
class MyCalculator extends Frame implements ActionListener
{
Frame frame = new Frame("MyCalculator");
TextField textfield = new TextField();
int firstNumber,secondNumber,result;
char option;
Button button1 = new Button("1");
Button button2 = new Button("2");
Button button3 = new Button("3");
Button button4 = new Button("4");
Button button5 = new Button("5");
Button button6 = new Button("6");
Button button7 = new Button("7");
Button button8 = new Button("8");
Button button9 = new Button("9");
Button button0 = new Button("0");
Button clearButton = new Button("C");
Button addButton = new Button("+");
Button minusButton = new Button("-");
Button mulitplyButton = new Button("*");
Button divideButton = new Button("/");
Button equalButton = new Button("=");
Panel panel = new Panel();
MyCalculator()
{
frame.add(textfield,"North");
frame.add(panel, "Center");
frame.addWindowListener(new WindowAdapter(){
   public void windowClosing(WindowEvent we) {
System.exit(0);
   }
  });
button1.addActionListener(this);
button2.addActionListener(this);
button3.addActionListener(this);
button4.addActionListener(this);
button5.addActionListener(this);
button6.addActionListener(this);
button7.addActionListener(this);
button8.addActionListener(this);
button9.addActionListener(this);
button0.addActionListener(this);
clearButton.addActionListener(this);
addButton.addActionListener(this);
minusButton.addActionListener(this);
mulitplyButton.addActionListener(this);
divideButton.addActionListener(this);
equalButton.addActionListener(this);
panel.add(button7);
panel.add(button8);
panel.add(button9);
panel.add(addButton);
panel.add(button6);
panel.add(button5);
panel.add(button4);
panel.add(minusButton);
panel.add(button1);
panel.add(button2);
panel.add(button3);
panel.add(mulitplyButton);
panel.add(clearButton);
panel.add(button0);
panel.add(equalButton);
panel.add(divideButton);
panel.setLayout(new GridLayout(4,4));
frame.setVisible(true);
frame.setSize(350,450);
}
public void windowClosing(WindowEvent e) 
{
           dispose();
}
public void actionPerformed(ActionEvent ae)
{
String str = ae.getActionCommand();
if(str.equals("+"))
{
option=str.charAt(0);
firstNumber=Integer.parseInt(textfield.getText());
System.out.println(firstNumber);
textfield.setText("");
}
else if(str.equals("-"))
{
option=str.charAt(0);
firstNumber=Integer.parseInt(textfield.getText());
System.out.println(firstNumber);
textfield.setText("");
}
else if(str.equals("*"))
{
option=str.charAt(0);
firstNumber=Integer.parseInt(textfield.getText());
System.out.println(firstNumber);
textfield.setText("");
}
else if(str.equals("/"))
{
option=str.charAt(0);
firstNumber=Integer.parseInt(textfield.getText());
System.out.println(firstNumber);
textfield.setText("");
}
else if(str.equals("="))
{
String exp="";
secondNumber=Integer.parseInt(textfield.getText());
System.out.println(secondNumber);
switch(option)
{
case '+': result=firstNumber+secondNumber;
		textfield.setText(result+"");
          break;
case '-': result=firstNumber-secondNumber;
	    textfield.setText(result+"");
          break;
case '*': result=firstNumber*secondNumber;
        textfield.setText(result+"");
          break;
case '/': 
 try
	{
	  result = firstNumber / secondNumber;
      textfield.setText(result+"");
                    }
	        catch(ArithmeticException aex)
                                    {
			result=0;
			exp=exp.concat(aex.getMessage());
			textfield.setText(result+exp);
		       	       }
	        catch(NumberFormatException nfe)
                                    {
		result=0;
		exp=exp.concat(nfe.getMessage());
        textfield.setText(result+exp);
                                   }
          break;
}
}
else if(str.equals("C"))
{
firstNumber=secondNumber=result=0;
textfield.setText("");
}
else
{
textfield.setText(textfield.getText()+str);
}
}
public static void main(String arg[])
{
new MyCalculator();
}
}

