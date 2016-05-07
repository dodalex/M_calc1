
package M_calc;
import java.util.Stack;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.beans.binding.Bindings;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import javafx.stage.StageStyle;


public class M_calc extends Application {


  private String ss="";
   TextField screen  = new TextField(); 
  public static void main(String[] args) { launch(args); }

  @Override public void start(Stage stage) {
	  stage.setWidth(500);
	  stage.setHeight(500);
	  createScreen();
    final GridPane  buttons = createButtons(screen);
    stage.setTitle("Calc");
    stage.initStyle(StageStyle.UTILITY);
   // stage.setResizable(false);
    stage.setScene(new Scene(createLayout(screen, buttons)));
    stage.show();
  }

  private BorderPane createLayout(TextField screen, GridPane buttons) {
    final BorderPane layout = new BorderPane();
    layout.setTop(screen);
    layout.setStyle("-fx-background-color:black; -fx-padding: 20; -fx-font-size: 20;");
    layout.setCenter(buttons);
    screen.prefWidthProperty().bind(layout.widthProperty());
    screen.prefHeightProperty().bind(layout.heightProperty().divide(4));
    return layout;
  }

  private TextField createScreen() {
    screen.setStyle("-fx-background-color:lightgray");
    screen.setAlignment(Pos.CENTER_LEFT);
    return screen;
  }

private GridPane createButtons(TextField screen){
	GridPane pane=new GridPane();
	pane.setAlignment(Pos.CENTER);
	pane.setPadding(new Insets(10, 10, 10, 10));
	 pane.setHgap(10);
	 pane.setVgap(10);
Button b1=new Button("1");b1.setStyle("-fx-base: lightgray;-fx-font-family: Times New Roman;-fx-font-weight: bold;");
Button b2=new Button("2");b2.setStyle("-fx-base: lightgray;-fx-font-family: Times New Roman;-fx-font-weight: bold;");
Button b3=new Button("3");b3.setStyle("-fx-base: lightgray;-fx-font-family: Times New Roman;-fx-font-weight: bold;");
Button b4=new Button("4");b4.setStyle("-fx-base: lightgray;-fx-font-family: Times New Roman;-fx-font-weight: bold;");
Button b5=new Button("5");b5.setStyle("-fx-base: lightgray;-fx-font-family: Times New Roman;-fx-font-weight: bold;");
Button b6=new Button("6");b6.setStyle("-fx-base: lightgray;-fx-font-family: Times New Roman;-fx-font-weight: bold;");
Button b7=new Button("7");b7.setStyle("-fx-base: lightgray;-fx-font-family: Times New Roman;-fx-font-weight: bold;");
Button b8=new Button("8");b8.setStyle("-fx-base: lightgray;-fx-font-family: Times New Roman;-fx-font-weight: bold;");
Button b9=new Button("9");b9.setStyle("-fx-base: lightgray;-fx-font-family: Times New Roman;-fx-font-weight: bold;");
Button b10=new Button("0");b10.setStyle("-fx-base: lightgray;-fx-font-family: Times New Roman;-fx-font-weight: bold;");

Button o1=new Button("C"); o1.setStyle("-fx-base: rgb(73, 70, 70)");
Button o8=new Button("<"); o8.setStyle("-fx-base: rgb(73, 70, 70)");

Button o2=new Button("-");o2.setStyle("-fx-base: rgb(169, 169, 167);-fx-font-family: Times New Roman;-fx-font-weight: bold;");
Button o3=new Button("*");o3.setStyle("-fx-base: rgb(169, 169, 167);-fx-font-family: Times New Roman;-fx-font-weight: bold;");
Button o4=new Button("/");o4.setStyle("-fx-base: rgb(169, 169, 167);-fx-font-family: Times New Roman;-fx-font-weight: bold;");
Button o5=new Button("Log");o5.setStyle("-fx-base: rgb(169, 169, 167); -fx-font-family: Times New Roman;-fx-font-weight: bold;");
Button o7=new Button("%");o7.setStyle("-fx-base: rgb(169, "
		+ "169, 167);-fx-font-family: Times New Roman;-fx-font-weight: bold;");
Button o10=new Button("(");o10.setStyle("-fx-base: rgb(169, 169, 167);-fx-font-family: Times New Roman;-fx-font-weight: bold;");
Button o11=new Button(")");o11.setStyle("-fx-base: rgb(169, 169, 167);-fx-font-family: Times New Roman;-fx-font-weight: bold;");
Button o12=new Button("+");o12.setStyle("-fx-base: rgb(169, 169, 167);-fx-font-family: Times New Roman;-fx-font-weight: bold;");
Button o13=new Button("^2");o13.setStyle("-fx-base: rgb(169, 169, 167);-fx-font-family: Times New Roman;-fx-font-weight: bold;");
Button o14=new Button("!");o14.setStyle("-fx-base: rgb(169, 169, 167);-fx-font-family: Times New Roman;-fx-font-weight: bold;");
Button o15=new Button("Sqrt");o15.setStyle("-fx-base: rgb(169, 169, 167);-fx-font-family: Times New Roman;-fx-font-weight: bold;");

Button o6=new Button("=");o6.setStyle("-fx-base: lightgray;-fx-font-family: Times New Roman;-fx-font-weight: bold;");
Button o9=new Button(".");o9.setStyle("-fx-base: lightgray;-fx-font-family: Times New Roman;-fx-font-weight: bold;");

b1.setOnAction(e-> {ss=ss+'1';screen.setText(ss);});
b2.setOnAction(e-> {ss=ss+'2';screen.setText(ss);});
b3.setOnAction(e-> {ss=ss+'3';screen.setText(ss);});
b4.setOnAction(e-> {ss=ss+'4';screen.setText(ss);});
b5.setOnAction(e-> {ss=ss+'5';screen.setText(ss);});
b6.setOnAction(e-> {ss=ss+'6';screen.setText(ss);});
b7.setOnAction(e-> {ss=ss+'7';screen.setText(ss);});
b8.setOnAction(e-> {ss=ss+'8';screen.setText(ss);});
b9.setOnAction(e-> {ss=ss+'9';screen.setText(ss);});
b10.setOnAction(e-> {ss=ss+"0";screen.setText(ss);});
o1.setOnAction(e-> {ss="";screen.setText(ss);});
o2.setOnAction(e-> {ss=ss+" - ";screen.setText(ss);});
o3.setOnAction(e-> {ss=ss+" * ";screen.setText(ss);});
o4.setOnAction(e-> {ss=ss+" / ";screen.setText(ss);});
o5.setOnAction(e-> {ss=ss+"Log( ";screen.setText(ss);});
o6.setOnAction(e->{ calculate(ss); });
o7.setOnAction(e-> {ss=ss+"%";screen.setText(ss);});
o8.setOnAction(e-> {

	if(ss.length()>=3&&ss.charAt(ss.length()-1)=='t')
	{ss=ss.substring(0,ss.length()-4);screen.setText(ss);}
	else if(ss.length()>=2&&ss.charAt(ss.length()-2)=='^')
	{ss=ss.substring(0,ss.length()-2);screen.setText(ss);}
	else if(ss.length()>=3&&ss.charAt(ss.length()-1)=='G')
	{ss=ss.substring(0,ss.length()-3);screen.setText(ss);}
	else if (ss.length()>=1&&ss.length()>0)
{
	ss=ss.substring(0,ss.length()-1);
	screen.setText(ss);
	
}}
);
o9.setOnAction(e-> {ss=ss+'.';screen.setText(ss);});
o10.setOnAction(e-> {ss=ss+" ( ";screen.setText(ss);});
o11.setOnAction(e-> {ss=ss+" ) " ;screen.setText(ss);});
o12.setOnAction(e-> {ss=ss+" + ";screen.setText(ss);});
o13.setOnAction(e-> {ss=ss+" )^2";screen.setText(ss);});
o14.setOnAction(e-> {ss=ss+" )!";screen.setText(ss);});
o15.setOnAction(e-> {ss=ss+"Sqrt( ";screen.setText(ss);});

b1.prefWidthProperty().bind(pane.widthProperty().divide(4));
b2.prefWidthProperty().bind(pane.widthProperty().divide(4));
b3.prefWidthProperty().bind(pane.widthProperty().divide(4));
b4.prefWidthProperty().bind(pane.widthProperty().divide(4));
b5.prefWidthProperty().bind(pane.widthProperty().divide(4));
b6.prefWidthProperty().bind(pane.widthProperty().divide(4));
b7.prefWidthProperty().bind(pane.widthProperty().divide(4));
b8.prefWidthProperty().bind(pane.widthProperty().divide(4));
b9.prefWidthProperty().bind(pane.widthProperty().divide(4));
b10.prefWidthProperty().bind(pane.widthProperty().divide(4));


o1.prefWidthProperty().bind(pane.widthProperty().divide(4));
o2.prefWidthProperty().bind(pane.widthProperty().divide(4));
o3.prefWidthProperty().bind(pane.widthProperty().divide(4));
o4.prefWidthProperty().bind(pane.widthProperty().divide(4));
o5.prefWidthProperty().bind(pane.widthProperty().divide(4));
o6.prefWidthProperty().bind(pane.widthProperty().divide(4));
o7.prefWidthProperty().bind(pane.widthProperty().divide(4));
o8.prefWidthProperty().bind(pane.widthProperty().divide(4));
o9.prefWidthProperty().bind(pane.widthProperty().divide(4));
o10.prefWidthProperty().bind(pane.widthProperty().divide(4));
o11.prefWidthProperty().bind(pane.widthProperty().divide(4));
o12.prefWidthProperty().bind(pane.widthProperty().divide(4));
o13.prefWidthProperty().bind(pane.widthProperty().divide(4));
o14.prefWidthProperty().bind(pane.widthProperty().divide(4));
o15.prefWidthProperty().bind(pane.widthProperty().divide(4));

b1.prefHeightProperty().bind(pane.heightProperty().divide(4));
b2.prefHeightProperty().bind(pane.heightProperty().divide(4));
b3.prefHeightProperty().bind(pane.heightProperty().divide(4));
b4.prefHeightProperty().bind(pane.heightProperty().divide(4));
b5.prefHeightProperty().bind(pane.heightProperty().divide(4));
b6.prefHeightProperty().bind(pane.heightProperty().divide(4));
b7.prefHeightProperty().bind(pane.heightProperty().divide(4));
b8.prefHeightProperty().bind(pane.heightProperty().divide(4));
b9.prefHeightProperty().bind(pane.heightProperty().divide(4));
b10.prefHeightProperty().bind(pane.heightProperty().divide(4));


o1.prefHeightProperty().bind(pane.heightProperty().divide(4));
o2.prefHeightProperty().bind(pane.heightProperty().divide(4));
o3.prefHeightProperty().bind(pane.heightProperty().divide(4));
o4.prefHeightProperty().bind(pane.heightProperty().divide(4));
o5.prefHeightProperty().bind(pane.heightProperty().divide(4));
o6.prefHeightProperty().bind(pane.heightProperty().divide(4));
o7.prefHeightProperty().bind(pane.heightProperty().divide(4));
o8.prefHeightProperty().bind(pane.heightProperty().divide(4));
o9.prefHeightProperty().bind(pane.heightProperty().divide(4));
o10.prefHeightProperty().bind(pane.heightProperty().divide(4));
o11.prefHeightProperty().bind(pane.heightProperty().divide(4));
o12.prefHeightProperty().bind(pane.heightProperty().divide(4));
o13.prefHeightProperty().bind(pane.heightProperty().divide(4));
o14.prefHeightProperty().bind(pane.heightProperty().divide(4));
o15.prefHeightProperty().bind(pane.heightProperty().divide(4));

pane.add(o1, 0, 0);pane.add(o8, 1, 0);pane.add(o10, 2, 0);pane.add(o11, 3, 0);
pane.add(b1, 0, 1);pane.add(b2, 1, 1);pane.add(b3, 2, 1);pane.add(o4, 3, 1);
pane.add(b4, 0, 2);pane.add(b5, 1, 2);pane.add(b6, 2, 2);pane.add(o3, 3, 2);
pane.add(b7, 0, 3);pane.add(b8, 1, 3);pane.add(b9, 2, 3);pane.add(o2, 3, 3);
pane.addColumn(0, o9);pane.addColumn(1, b10);pane.addColumn(2, o6);pane.addColumn(3, o12);
pane.addRow(0, o5);pane.addRow(1, o7);pane.addRow(2, o13);pane.addRow(3, o14);pane.addRow(4, o15);


return pane;
	
}

private void calculate(String exp)
{
	double cal = 0;
	Stack<Comparable> st = new Stack<Comparable>();
	st.push('(');
	st.push(' ');
	try
	{
		for(int i=0;i<exp.length();i++)
		{
			if(exp.charAt(i)==')') 
			{
				String s = ")";
				while(!st.peek().equals('('))
					s = st.pop() + s;
				s = st.pop() + s;
				if(st.peek().equals('t')) 			//sqrt()
				{
					while(!st.peek().equals('S')) 
						st.pop();st.pop();
					st.push(Math.sqrt(evaluateExp(s)));						
				}
				else if(st.peek().equals('g'))    //log() or lg()
				{
					st.pop();
					if(st.peek().equals('o'))    // log()
					{
						st.pop();st.pop();
						st.push(Math.log10(evaluateExp(s)));	
					}
					else    					//lg()
					{
						st.pop();
						st.push(Math.log10(evaluateExp(s))/Math.log10(2));
					}
				}
				else if(exp.charAt(i+1)=='^')    // ()^2
				{
					st.push(Math.pow(evaluateExp(s),2));
					i+=2;
				}
				else
					st.push(evaluateExp(s)); //( + * - / )
			}
			else
				st.push(exp.charAt(i));
		}
	String s = " ) ";
	while(!st.isEmpty())
		s = st.pop() + s;
    cal = evaluateExp(s);
	}
	catch(Exception e)
	{
		screen.setText(" Error ");return ;
	}
	if(new Double(cal).isInfinite())
		{screen.setText(" Infinity ");}
	else
		{screen.setText(" "+cal);}
}

private double evaluateExp(String exp)
{
	boolean contain_operand = true;
	exp = exp.replace("(", "");
   	exp = exp.replace(")", "");
	while(contain_operand)
	{
	 	char last;
	   	double op1=0,op2=0;
	   	exp = exp.replaceAll("  ", " ");
	   	contain_operand = exp.contains(" + ") || exp.contains(" - ") ||
			exp.contains(" * ") || exp.contains(" / ") ;
	   	if(contain_operand)
	   	{
		   	String[] op = exp.split(" ");
		   	//handle the first operation
		   	op1 = new Double(op[1]);
		   	last = op[2].charAt(0);
		   	op2 = new Double(op[3]);
		   	//handle and calculate the next operation
		   	for(int i = 4;i<op.length;i++)
		   	{
		   		if(op[i].charAt(0)=='+' || op[i].charAt(0)=='-')
		   		{
		 			switch(last)
		   			{
		   				case'+':op1 += op2; break;
		   				case'-':op1 -= op2; break;
		   				case'*':op1 *= op2; break;
		   				case'/':op1 /= op2; break;
		   			}
		   			op2 = new Double(op[i+1]);
		   			last = op[i].charAt(0);
		   		}
		   		else if(op[i].charAt(0)=='*' || op[i].charAt(0)=='/')
		   		{
		   			if(op[i].charAt(0) == '*')
		   				op2 *= new Double(op[i+1]);
		   			else
		   				op2 /= new Double(op[i+1]);
		   		}
		   	}		    	
		   	//calculate the last operation in priority
		   	switch(last)
			{
				case'+':op1 += op2; break;
				case'-':op1 -= op2; break;
				case'*':op1 *= op2; break;
				case'/':op1 /= op2; break;
			}		    	
		   	exp = ""+op1;	
		   	}
	     }
		return new Double(exp);
	}

}

