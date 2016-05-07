package M_calc;

import java.util.Stack;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import javafx.stage.StageStyle;


public class M_calc extends Application {

	public  Button bb=new Button("Scientific");
	public  Button bbb=new Button("Normal");
	public int i=0;
  private String ss="";
  double cal = 0;
   TextField screen  = new TextField();
   
  public static void main(String[] args) { launch(args); }

  @Override public void start(Stage stage) {
	  stage.setWidth(500);
	  stage.setHeight(500);
	  createScreen();
    final GridPane  buttons = createButtons(screen);
    final GridPane  buttons1 = createButtons2(screen);
    stage.setTitle("Calc");
    stage.initStyle(StageStyle.UTILITY);
   // stage.setResizable(false);
  
   stage.setScene(new Scene(createLayout(screen, buttons)));
   stage.show();
   bb.setOnAction(e-> { 
		   stage.setScene(new Scene(createLayout(screen, buttons)));
           stage.show();
	   });
   bbb.setOnAction(e-> { 
	   stage.setScene(new Scene(createLayout(screen, buttons1)));
       stage.show();
   });
  
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

Button o1=new Button("C"); o1.setStyle("-fx-base: rgb(73, 70, 70);-fx-font-family: Times New Roman;-fx-font-weight: bold;");
Button o8=new Button("<"); o8.setStyle("-fx-base: rgb(73, 70, 70);-fx-font-family: Times New Roman;-fx-font-weight: bold;");

Button o2=new Button("-");o2.setStyle("-fx-base: rgb(169, 169, 167);-fx-font-family: Times New Roman;-fx-font-weight: bold;");
Button o3=new Button("*");o3.setStyle("-fx-base: rgb(169, 169, 167);-fx-font-family: Times New Roman;-fx-font-weight: bold;");
Button o4=new Button("/");o4.setStyle("-fx-base: rgb(169, 169, 167);-fx-font-family: Times New Roman;-fx-font-weight: bold;");
Button o5=new Button("Log");o5.setStyle("-fx-base: rgb(169, 169, 167); -fx-font-family: Times New Roman;-fx-font-weight: bold;");
Button o7=new Button("Ans");o7.setStyle("-fx-base: rgb(169, 169, 167);-fx-font-family: Times New Roman;-fx-font-weight: bold;");
Button o10=new Button("(");o10.setStyle("-fx-base: rgb(169, 169, 167);-fx-font-family: Times New Roman;-fx-font-weight: bold;");
Button o11=new Button(")");o11.setStyle("-fx-base: rgb(169, 169, 167);-fx-font-family: Times New Roman;-fx-font-weight: bold;");
Button o12=new Button("+");o12.setStyle("-fx-base: rgb(169, 169, 167);-fx-font-family: Times New Roman;-fx-font-weight: bold;");
Button o13=new Button("^2");o13.setStyle("-fx-base: rgb(169, 169, 167);-fx-font-family: Times New Roman;-fx-font-weight: bold;");
Button o14=new Button("!");o14.setStyle("-fx-base: rgb(169, 169, 167);-fx-font-family: Times New Roman;-fx-font-weight: bold;");
Button o15=new Button("pi");o15.setStyle("-fx-base: lightgray;-fx-font-family: Times New Roman;-fx-font-weight: bold;");

Button o6=new Button("=");o6.setStyle("-fx-base: rgb(169, 169, 167);-fx-font-family: Times New Roman;-fx-font-weight: bold;");
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
o1.setOnAction(e-> {ss="";screen.setText("0");});
o2.setOnAction(e-> {ss=ss+" - ";screen.setText(ss);});
o3.setOnAction(e-> {ss=ss+" * ";screen.setText(ss);});
o4.setOnAction(e-> {ss=ss+" / ";screen.setText(ss);});
o5.setOnAction(e-> {ss=ss+"Log( ";screen.setText(ss);});
o6.setOnAction(e->
{
	 new Thread(new Runnable() {
		 @Override
		 public void run() {
		 try {
			 calculate(ss); 
			 ss="";
		 /*Platform.runLater(new Runnable() { // Run from JavaFX GUI
		 @Override
         public void run() { }
		 
		 });*/
		
		 Thread.sleep(200);
		 }
		 
		 catch (InterruptedException ex) { }
		 }
		 }).start();
	});
o7.setOnAction(e-> {ss=ss+cal;screen.setText(ss);});
o8.setOnAction(e-> {

	if(ss.length()>=3&&ss.charAt(ss.length()-3)=='t')
	{ss=ss.substring(0,ss.length()-6);screen.setText(ss);}
	if(ss.length()>=4&&ss.charAt(ss.length()-4)=='t'&&ss.charAt(ss.length()-3)=='3')
	{ss=ss.substring(0,ss.length()-7);screen.setText(ss);}
	else if(ss.length()>=2&&ss.charAt(ss.length()-2)=='^')
	{ss=ss.substring(0,ss.length()-3);screen.setText(ss);}
	else if(ss.length()>=3&&ss.charAt(ss.length()-3)=='g')
	{ss=ss.substring(0,ss.length()-5);screen.setText(ss);}
	else if(ss.length()>=3&&ss.charAt(ss.length()-3)=='n')
	{ss=ss.substring(0,ss.length()-4);screen.setText(ss);}
	else if(ss.length()>=4&&ss.charAt(ss.length()-3)=='h')
	{ss=ss.substring(0,ss.length()-6);screen.setText(ss);}
	else if(ss.length()>=3&&ss.charAt(ss.length()-3)==' '&&ss.charAt(ss.length()-2)==')'&&ss.charAt(ss.length()-1)==' ')
	{ss=ss.substring(0,ss.length()-3);screen.setText(ss);}
	else if(ss.length()>=3&&ss.charAt(ss.length()-3)==' '&&ss.charAt(ss.length()-2)=='('&&ss.charAt(ss.length()-1)==' ')
	{ss=ss.substring(0,ss.length()-3);screen.setText(ss);}
	
	else if (ss.length()>=1&&ss.length()>0)
{
	ss=ss.substring(0,ss.length()-1);
	screen.setText(ss);
	
}
	});
o9.setOnAction(e-> {ss=ss+'.';screen.setText(ss);});
o10.setOnAction(e-> {ss=ss+" ( ";screen.setText(ss);});
o11.setOnAction(e-> {ss=ss+" ) " ;screen.setText(ss);});
o12.setOnAction(e-> {ss=ss+" + ";screen.setText(ss);});
o13.setOnAction(e-> {ss=ss+" )^2";screen.setText(ss);});
o14.setOnAction(e-> {ss=ss+" )!";screen.setText(ss);});
o15.setOnAction(e-> {ss=ss+"2.718";screen.setText(ss);});

b1.prefWidthProperty().bind(pane.widthProperty().divide(5));
b2.prefWidthProperty().bind(pane.widthProperty().divide(5));
b3.prefWidthProperty().bind(pane.widthProperty().divide(5));
b4.prefWidthProperty().bind(pane.widthProperty().divide(5));
b5.prefWidthProperty().bind(pane.widthProperty().divide(5));
b6.prefWidthProperty().bind(pane.widthProperty().divide(5));
b7.prefWidthProperty().bind(pane.widthProperty().divide(5));
b8.prefWidthProperty().bind(pane.widthProperty().divide(5));
b9.prefWidthProperty().bind(pane.widthProperty().divide(5));
b10.prefWidthProperty().bind(pane.widthProperty().divide(5));


o1.prefWidthProperty().bind(pane.widthProperty().divide(5));
o2.prefWidthProperty().bind(pane.widthProperty().divide(5));
o3.prefWidthProperty().bind(pane.widthProperty().divide(5));
o4.prefWidthProperty().bind(pane.widthProperty().divide(5));
o5.prefWidthProperty().bind(pane.widthProperty().divide(5));
o6.prefWidthProperty().bind(pane.widthProperty().divide(5/2));
o7.prefWidthProperty().bind(pane.widthProperty().divide(5));
o8.prefWidthProperty().bind(pane.widthProperty().divide(5));
o9.prefWidthProperty().bind(pane.widthProperty().divide(5));
o10.prefWidthProperty().bind(pane.widthProperty().divide(5));
o11.prefWidthProperty().bind(pane.widthProperty().divide(5));
o12.prefWidthProperty().bind(pane.widthProperty().divide(5));
o13.prefWidthProperty().bind(pane.widthProperty().divide(5));
o14.prefWidthProperty().bind(pane.widthProperty().divide(5));
o15.prefWidthProperty().bind(pane.widthProperty().divide(5));
b1.prefHeightProperty().bind(pane.heightProperty().divide(5));
b2.prefHeightProperty().bind(pane.heightProperty().divide(5));
b3.prefHeightProperty().bind(pane.heightProperty().divide(5));
b4.prefHeightProperty().bind(pane.heightProperty().divide(5));
b5.prefHeightProperty().bind(pane.heightProperty().divide(5));
b6.prefHeightProperty().bind(pane.heightProperty().divide(5));
b7.prefHeightProperty().bind(pane.heightProperty().divide(5));
b8.prefHeightProperty().bind(pane.heightProperty().divide(5));
b9.prefHeightProperty().bind(pane.heightProperty().divide(5));
b10.prefHeightProperty().bind(pane.heightProperty().divide(5));
o1.prefHeightProperty().bind(pane.heightProperty().divide(5));
o2.prefHeightProperty().bind(pane.heightProperty().divide(5));
o3.prefHeightProperty().bind(pane.heightProperty().divide(5));
o4.prefHeightProperty().bind(pane.heightProperty().divide(5));
o5.prefHeightProperty().bind(pane.heightProperty().divide(5));
o6.prefHeightProperty().bind(pane.heightProperty().divide(5));
o7.prefHeightProperty().bind(pane.heightProperty().divide(5));
o8.prefHeightProperty().bind(pane.heightProperty().divide(5));
o9.prefHeightProperty().bind(pane.heightProperty().divide(5));
o10.prefHeightProperty().bind(pane.heightProperty().divide(5));
o11.prefHeightProperty().bind(pane.heightProperty().divide(5));
o12.prefHeightProperty().bind(pane.heightProperty().divide(5));
o13.prefHeightProperty().bind(pane.heightProperty().divide(5));
o14.prefHeightProperty().bind(pane.heightProperty().divide(5));
o15.prefHeightProperty().bind(pane.heightProperty().divide(5));
bbb.prefWidthProperty().bind(pane.widthProperty().divide(5/4));
pane.add(o1, 0, 0);pane.add(o8, 1, 0);pane.add(o10, 2, 0);pane.add(o11, 3, 0);pane.add(o5, 4, 0);
pane.add(b1, 0, 1);pane.add(b2, 1, 1);pane.add(b3, 2, 1);pane.add(o4, 3, 1);pane.add(o7, 4, 1);
pane.add(b4, 0, 2);pane.add(b5, 1, 2);pane.add(b6, 2, 2);pane.add(o3, 3, 2);pane.add(o13, 4, 2);
pane.add(b7, 0, 3);pane.add(b8, 1, 3);pane.add(b9, 2, 3);pane.add(o2, 3, 3);pane.add(o12, 4, 3);
pane.add(o9, 0, 4);pane.add(b10, 1, 4);pane.add(o15, 2, 4);pane.add(o6, 3, 4,2,1);
pane.add(bbb, 0, 5,4,1);
//pane.addRow(0, o5);pane.addRow(1, o7);pane.addRow(2, o13);pane.addRow(3, o12);pane.addColumn(4, o6,2,1);
return pane;

}






private GridPane createButtons2(TextField screen){
	GridPane pane=new GridPane();
	pane.setAlignment(Pos.CENTER);
	pane.setPadding(new Insets(10, 10, 10, 10));
	 pane.setHgap(10);
	 pane.setVgap(10);
Button d1=new Button("C");d1.setStyle("-fx-base: rgb(73, 70, 70);-fx-font-family: Times New Roman;-fx-font-weight: bold;");
Button d2=new Button("<");d2.setStyle("-fx-base: rgb(73, 70, 70);-fx-font-family: Times New Roman;-fx-font-weight: bold;");
Button d3=new Button("sin");d3.setStyle("-fx-base: rgb(169, 169, 167);-fx-font-family: Times New Roman;-fx-font-weight: bold;");
Button d4=new Button("cos");d4.setStyle("-fx-base: rgb(169, 169, 167);-fx-font-family: Times New Roman;-fx-font-weight: bold;");
Button d5=new Button("tan");d5.setStyle("-fx-base: rgb(169, 169, 167);-fx-font-family: Times New Roman;-fx-font-weight: bold;");
Button d6=new Button("sinh");d6.setStyle("-fx-base: rgb(169, 169, 167);-fx-font-family: Times New Roman;-fx-font-weight: bold;");
Button d7=new Button("cosh");d7.setStyle("-fx-base: rgb(169, 169, 167);-fx-font-family: Times New Roman;-fx-font-weight: bold;");
Button d8=new Button("tanh");d8.setStyle("-fx-base: rgb(169, 169, 167);-fx-font-family: Times New Roman;-fx-font-weight: bold;");
Button d9=new Button("^2");d9.setStyle("-fx-base: rgb(169, 169, 167);-fx-font-family: Times New Roman;-fx-font-weight: bold;");
Button d10=new Button("X!");d10.setStyle("-fx-base: rgb(169, 169, 167);-fx-font-family: Times New Roman;-fx-font-weight: bold;");
Button d11=new Button("SQ3"); d11.setStyle("-fx-base: rgb(169, 169, 167);-fx-font-family: Times New Roman;-fx-font-weight: bold;");
Button d12=new Button("pi"); d12.setStyle("-fx-base: rgb(169, 169, 167);-fx-font-family: Times New Roman;-fx-font-weight: bold;");
Button d13=new Button("ran");d13.setStyle("-fx-base: rgb(169, 169, 167);-fx-font-family: Times New Roman;-fx-font-weight: bold;");
Button d14=new Button("e");d14.setStyle("-fx-base: rgb(169, 169, 167);-fx-font-family: Times New Roman;-fx-font-weight: bold;");
Button d15=new Button("min");d15.setStyle("-fx-base: rgb(169, 169, 167);-fx-font-family: Times New Roman;-fx-font-weight: bold;");
Button d16=new Button("Log");d16.setStyle("-fx-base: rgb(169, 169, 167); -fx-font-family: Times New Roman;-fx-font-weight: bold;");
Button d17=new Button("Ln");d17.setStyle("-fx-base: rgb(169, 169, 167);-fx-font-family: Times New Roman;-fx-font-weight: bold;");
Button d18=new Button("(");d18.setStyle("-fx-base: rgb(169, 169, 167);-fx-font-family: Times New Roman;-fx-font-weight: bold;");
Button d19=new Button(")");d19.setStyle("-fx-base: rgb(169, 169, 167);-fx-font-family: Times New Roman;-fx-font-weight: bold;");
Button d20=new Button("Sqrt");d20.setStyle("-fx-base: rgb(169, 169, 167);-fx-font-family: Times New Roman;-fx-font-weight: bold;");
Button d21=new Button("^3");d21.setStyle("-fx-base: rgb(169, 169, 167);-fx-font-family: Times New Roman;-fx-font-weight: bold;");
Button d22=new Button("e^x");d22.setStyle("-fx-base: rgb(169, 169, 167);-fx-font-family: Times New Roman;-fx-font-weight: bold;");
Button d23=new Button("%");d23.setStyle("-fx-base: rgb(169, 169, 167);-fx-font-family: Times New Roman;-fx-font-weight: bold;");
Button d24=new Button("=");d24.setStyle("-fx-base: rgb(169, 169, 167);-fx-font-family: Times New Roman;-fx-font-weight: bold;");
Button d25=new Button(".");d25.setStyle("-fx-base: rgb(169, 169, 167);-fx-font-family: Times New Roman;-fx-font-weight: bold;");

d1.setOnAction(e->{ss="";screen.setText("0");});
d2.setOnAction(e-> {

	if(ss.length()>=3&&ss.charAt(ss.length()-3)=='t')
	{ss=ss.substring(0,ss.length()-6);screen.setText(ss);}
	if(ss.length()>=4&&ss.charAt(ss.length()-4)=='t'&&ss.charAt(ss.length()-3)=='3')
	{ss=ss.substring(0,ss.length()-7);screen.setText(ss);}
	else if(ss.length()>=2&&ss.charAt(ss.length()-2)=='^')
	{ss=ss.substring(0,ss.length()-3);screen.setText(ss);}
	else if(ss.length()>=3&&ss.charAt(ss.length()-3)=='g')
	{ss=ss.substring(0,ss.length()-5);screen.setText(ss);}
	else if(ss.length()>=3&&ss.charAt(ss.length()-3)=='n')
	{ss=ss.substring(0,ss.length()-4);screen.setText(ss);}
	else if(ss.length()>=4&&ss.charAt(ss.length()-3)=='h')
	{ss=ss.substring(0,ss.length()-6);screen.setText(ss);}
	else if(ss.length()>=3&&ss.charAt(ss.length()-3)==' '&&ss.charAt(ss.length()-2)==')'&&ss.charAt(ss.length()-1)==' ')
	{ss=ss.substring(0,ss.length()-3);screen.setText(ss);}
	else if(ss.length()>=3&&ss.charAt(ss.length()-3)==' '&&ss.charAt(ss.length()-2)=='('&&ss.charAt(ss.length()-1)==' ')
	{ss=ss.substring(0,ss.length()-3);screen.setText(ss);}
	
	else if (ss.length()>=1&&ss.length()>0)
{
	ss=ss.substring(0,ss.length()-1);
	screen.setText(ss);
	
}
	});
d3.setOnAction(e-> {ss=ss+"Sin( ";screen.setText(ss);});
d4.setOnAction(e-> {ss=ss+"Cos( ";screen.setText(ss);});
d5.setOnAction(e-> {ss=ss+"Tan( ";screen.setText(ss);});
d6.setOnAction(e-> {ss=ss+"Sinh( ";screen.setText(ss);});
d7.setOnAction(e-> {ss=ss+"Cosh( ";screen.setText(ss);});
d8.setOnAction(e-> {ss=ss+"Tanh( ";screen.setText(ss);});
d9.setOnAction(e-> {ss=ss+" )^2";screen.setText(ss);});
d10.setOnAction(e-> {ss=ss+" )!";screen.setText(ss);});
d11.setOnAction(e-> {ss=ss+"Sqrt3( ";screen.setText(ss);});
d12.setOnAction(e-> {ss=ss+"3.14";screen.setText(ss);});
d13.setOnAction(e-> {ss=ss+"";screen.setText(ss);});
d14.setOnAction(e-> {ss=ss+"2.718";screen.setText(ss);});
d15.setOnAction(e-> {});
d24.setOnAction(e->
{
	 new Thread(new Runnable() {
		 @Override
		 public void run() {
		 try {
			 calculate(ss); 
			 ss="";
		 /*Platform.runLater(new Runnable() { // Run from JavaFX GUI
		 @Override
         public void run() { }
		 
		 });*/
		
		 Thread.sleep(200);
		 }
		 
		 catch (InterruptedException ex) { }
		 }
		 }).start();
	});
d16.setOnAction(e->{ ss=ss+"Log( ";screen.setText(ss);});
d17.setOnAction(e->{ ss=ss+"Ln( ";screen.setText(ss);});
d18.setOnAction(e->{ ss=ss+" ( ";screen.setText(ss);});
d19.setOnAction(e-> {ss=ss+" ) ";screen.setText(ss);});
d20.setOnAction(e-> {ss=ss+"Sqrt( ";screen.setText(ss);});
d21.setOnAction(e-> {ss=ss+" )^3" ;screen.setText(ss);});
d22.setOnAction(e-> {ss=ss+"";screen.setText(ss);});
d23.setOnAction(e-> {ss=ss+" % ";screen.setText(ss);});
d25.setOnAction(e-> {ss=ss+".";screen.setText(ss);});

d1.prefWidthProperty().bind(pane.widthProperty().divide(5));
d2.prefWidthProperty().bind(pane.widthProperty().divide(5));
d3.prefWidthProperty().bind(pane.widthProperty().divide(5));
d4.prefWidthProperty().bind(pane.widthProperty().divide(5));
d5.prefWidthProperty().bind(pane.widthProperty().divide(5));
d6.prefWidthProperty().bind(pane.widthProperty().divide(5));
d7.prefWidthProperty().bind(pane.widthProperty().divide(5));
d8.prefWidthProperty().bind(pane.widthProperty().divide(5));
d9.prefWidthProperty().bind(pane.widthProperty().divide(5));
d10.prefWidthProperty().bind(pane.widthProperty().divide(5));

d11.prefWidthProperty().bind(pane.widthProperty().divide(5));
d12.prefWidthProperty().bind(pane.widthProperty().divide(5));
d13.prefWidthProperty().bind(pane.widthProperty().divide(5));
d14.prefWidthProperty().bind(pane.widthProperty().divide(5));
d15.prefWidthProperty().bind(pane.widthProperty().divide(5));
d16.prefWidthProperty().bind(pane.widthProperty().divide(5));
d17.prefWidthProperty().bind(pane.widthProperty().divide(5));
d18.prefWidthProperty().bind(pane.widthProperty().divide(5));
d19.prefWidthProperty().bind(pane.widthProperty().divide(5));
d20.prefWidthProperty().bind(pane.widthProperty().divide(5));
d21.prefWidthProperty().bind(pane.widthProperty().divide(5));
d22.prefWidthProperty().bind(pane.widthProperty().divide(5));
d23.prefWidthProperty().bind(pane.widthProperty().divide(5));
d24.prefWidthProperty().bind(pane.widthProperty().divide(5/2));
d25.prefWidthProperty().bind(pane.widthProperty().divide(5));
d1.prefHeightProperty().bind(pane.heightProperty().divide(5));
d2.prefHeightProperty().bind(pane.heightProperty().divide(5));
d3.prefHeightProperty().bind(pane.heightProperty().divide(5));
d4.prefHeightProperty().bind(pane.heightProperty().divide(5));
d5.prefHeightProperty().bind(pane.heightProperty().divide(5));
d6.prefHeightProperty().bind(pane.heightProperty().divide(5));
d7.prefHeightProperty().bind(pane.heightProperty().divide(5));
d8.prefHeightProperty().bind(pane.heightProperty().divide(5));
d9.prefHeightProperty().bind(pane.heightProperty().divide(5));
d10.prefHeightProperty().bind(pane.heightProperty().divide(5));


d11.prefHeightProperty().bind(pane.heightProperty().divide(5));
d12.prefHeightProperty().bind(pane.heightProperty().divide(5));
d13.prefHeightProperty().bind(pane.heightProperty().divide(5));
d14.prefHeightProperty().bind(pane.heightProperty().divide(5));
d15.prefHeightProperty().bind(pane.heightProperty().divide(5));
d16.prefHeightProperty().bind(pane.heightProperty().divide(5));
d17.prefHeightProperty().bind(pane.heightProperty().divide(5));
d18.prefHeightProperty().bind(pane.heightProperty().divide(5));
d19.prefHeightProperty().bind(pane.heightProperty().divide(5));
d20.prefHeightProperty().bind(pane.heightProperty().divide(5));
d21.prefHeightProperty().bind(pane.heightProperty().divide(5));
d22.prefHeightProperty().bind(pane.heightProperty().divide(5));
d23.prefHeightProperty().bind(pane.heightProperty().divide(5));
d24.prefHeightProperty().bind(pane.heightProperty().divide(5));
d25.prefHeightProperty().bind(pane.heightProperty().divide(5));
bb.prefWidthProperty().bind(pane.widthProperty().divide(5/4));
pane.add(d1, 0, 0);pane.add(d2, 1, 0);pane.add(d3, 2, 0);pane.add(d4, 3, 0);pane.add(d5, 4, 0);
pane.add(d6, 0, 1);pane.add(d7, 1, 1);pane.add(d8, 2, 1);pane.add(d9, 3, 1);pane.add(d10, 4, 1);
pane.add(d11, 0, 2);pane.add(d12, 1, 2);pane.add(d13, 2, 2);pane.add(d14, 3, 2);pane.add(d15, 4, 2);
pane.add(d16, 0, 3);pane.add(d17, 1, 3);pane.add(d18, 2, 3);pane.add(d19, 3, 3);pane.add(d20, 4, 3);
pane.add(d21, 0, 4);pane.add(d22, 1, 4);pane.add(d23, 2, 4);pane.add(d24, 3, 4,2,1);
pane.add(bb, 0, 5,4,1);
//pane.addRow(0, o5);pane.addRow(1, o7);pane.addRow(2, o13);pane.addRow(3, o12);pane.addColumn(4, o6,2,1);
return pane;

}






private void calculate(String exp)
{
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

