
package myatmproject;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
 import javafx.scene.Scene;
 import javafx.scene.control.Button;
 import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
 import javafx.scene.control.TextField;
import javafx.scene.effect.DropShadow;
 import javafx.scene.layout.GridPane;
 import javafx.stage.Stage;
import javafx.css.Stylesheet;

 public class MyAtmProject extends Application {
view screen=new view(5683/*,123*/);
myatm atm=new myatm(0);
Stage window;
Scene scene,scene1,scene2,scene3,scene4;
Button b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,bb0,bb1,bb2,bb3,bb4,bb5,bb6,bb7,bb8,bb9,b00,b11,b22,b33,b44,b55,b66,b77,b88,b99;
String methods[]=atm.HISTORY();
 DropShadow shadow=new DropShadow();
     public static void main(String[] args) {
         launch(args);
   }
    
   

   
 

 @Override
    public void start(Stage primaryStage) throws Exception {
    	
        window = primaryStage;
        window.setTitle("ATM MACHINE");
        window.setOnCloseRequest(e ->{
      	  e.consume();
          closeprogram();} );
       
        //GridPane with 10px padding around edge
        GridPane grid0 = new GridPane();
 
       
        GridPane grid = new GridPane();
        GridPane grid2 = new GridPane();
        GridPane grid3 = new GridPane();
        GridPane grid33 = new GridPane();
        GridPane grid44 = new GridPane();
        GridPane grid4 = new GridPane();
        GridPane grid5 = new GridPane();
       
        grid0.setPadding(new Insets(10, 10,10,10));
       
        grid.setPadding(new Insets(10, 10,10,10));
        grid2.setPadding(new Insets(10, 10,10,10));
        grid3.setPadding(new Insets(10, 10,10,10));
        grid33.setPadding(new Insets(10, 10,10,10));
        grid44.setPadding(new Insets(10, 10,10,10));
        grid4.setPadding(new Insets(10, 10,10,10));
        grid5.setPadding(new Insets(10, 10,10,10));
        
        grid0.setVgap(8);
        grid0.setHgap(10);
        
        grid.setVgap(8);
        grid.setHgap(10);
        
        grid2.setVgap(8);
        grid2.setHgap(10);
        
        grid3.setVgap(8);
         grid3.setHgap(10);
         
         grid33.setVgap(8);
         grid33.setHgap(10);
         
         grid44.setVgap(8);
         grid44.setHgap(10);
         
       
        grid4.setVgap(8);
        grid4.setHgap(10);
        
        grid5.setVgap(8);
        grid5.setHgap(10);
  
        Label title = new Label("*****wellcome to ATM machine*****");
       GridPane.setConstraints( title,1,0);
       
        //Name Label
 
    Label creditLabel = new Label("credit number:");
      GridPane.setConstraints(creditLabel, 1,1);

        //Name Input
         PasswordField creditInput = new    PasswordField ();
        creditInput.setPromptText("credit number:");
        GridPane.setConstraints(creditInput, 1,3);

       //Password Label
      
       
      /*Label passLabel = new Label("Password:");
       GridPane.setConstraints(passLabel,2,0);

        //Password Input
      PasswordField passInput = new PasswordField();
       passInput.setPromptText("password");
       GridPane.setConstraints(passInput, 2,1);*/
       
        //error
       Label error=new Label("");
         GridPane.setConstraints(error,3,3);
         
        //Login
      Button loginButton = new Button("Log In");
        loginButton.setOnAction(e->{
   
        	int x=Integer.parseInt( creditInput.getText());
        	/*int y= Integer.parseInt(  passInput.getText());*/
        	  boolean result= screen.check(x/*,y*/);
           
        	  if(result)
        	  {
        		  window.setScene(scene1);
                          
        	  } 
                  
                  else 
                      error.setText("your creditNumber is wrong");
                      });
        GridPane.setConstraints(loginButton,3, 1);
       
          loginButton.setEffect(shadow);
          
         //clear button 
      Button clear0=new Button("clear");
           GridPane.setConstraints(clear0,4,4);
         clear0.setOnAction(e->{
             
             creditInput.clear();
             error.setText("");
              //passInput.clear();
         });
       
         clear0.setEffect(shadow);
          
   //log out
      Button logoutButton=new Button("log out");
      GridPane.setConstraints(logoutButton,4,1);
      logoutButton.setOnAction(e -> closeprogram());
    logoutButton.setEffect(shadow);
      // keyboard 
        
         
  
        
        b0=new Button ("0");
        b0.setOnAction(e->{creditInput.setText(creditInput.getText()+"0");});
       // passInput.setText(passInput.getText()+"0"   );
        GridPane.setConstraints(b0,2,7);
        b0.setEffect(shadow);

   
        b1=new Button ("1");
        b1.setOnAction(e-> {creditInput.setText(creditInput.getText()+"1");} );
        //passInput.setText(passInput.getText()+"1"   );
      GridPane.setConstraints(b1,1,4);
        b1.setEffect(shadow);
            
     
        
        b2=new Button ("2");
        b2.setOnAction(e->{
        creditInput.setText(creditInput.getText()+"2");} );
       // passInput.setText(passInput.getText()+"2"   );
        GridPane.setConstraints(b2,2,4);
        b2.setEffect(shadow);
        
         b3=new Button ("3");
        b3.setOnAction(e->{
            creditInput.setText(creditInput.getText()+"3");;} );
           // passInput.setText(passInput.getText()+"3"   )
        GridPane.setConstraints(b3,3,4);
         b3.setEffect(shadow);
       
        
        b4=new Button ("4");
        b4.setOnAction(e->{
            creditInput.setText(creditInput.getText()+"4");} );
            //passInput.setText(passInput.getText()+"4"   );
              GridPane.setConstraints(b4,1,5);
         b4.setEffect(shadow);
         
        b5=new Button ("5");
        b5.setOnAction(e->{
            creditInput.setText(creditInput.getText()+"5");} );
        //   passInput.setText(passInput.getText()+"5"   );
        GridPane.setConstraints(b5,2,5);
         b5.setEffect(shadow);
         
         
        b6=new Button ("6");
        b6.setOnAction(e->{
            creditInput.setText(creditInput.getText()+"6");} );
         //   passInput.setText(passInput.getText()+"6"   );
        GridPane.setConstraints(b6,3,5);
         b6.setEffect(shadow);
         
         
        b7=new Button ("7");
        b7.setOnAction(e->{
            creditInput.setText(creditInput.getText()+"7");} );
           // passInput.setText(passInput.getText()+"7"   );
        GridPane.setConstraints(b7,1,6);
         b7.setEffect(shadow);
         
         
        b8=new Button ("8");
        b8.setOnAction(e->{
            creditInput.setText(creditInput.getText()+"8");} );
            //passInput.setText(passInput.getText()+"8"   );
        GridPane.setConstraints(b8,2,6);
         b8.setEffect(shadow);
         
         
        b9=new Button ("9");
        b9.setOnAction(e->{
            creditInput.setText(creditInput.getText()+"9");} );
         //   passInput.setText(passInput.getText()+"9" );
        GridPane.setConstraints(b9,3,6);
          b9.setEffect(shadow);
          
          
     
    
        
        //clear Button
        Button clear=new Button("clear");
           GridPane.setConstraints(clear,6,4);
         clear.setOnAction(e->window.setScene(scene2));
         clear.setEffect(shadow);
        // deposit functions
        
        
        Button deposit=new Button("deposit");
       GridPane.setConstraints(deposit,0,0);
       deposit.setOnAction(e->window.setScene(scene2));
       deposit.setEffect(shadow); 
        
        Label depositlable = new Label("enter the amount:");
        GridPane.setConstraints(depositlable, 1, 0);
        
        TextField depositInput = new TextField();
      depositInput.setPromptText("amoumt deposit");
        GridPane.setConstraints( depositInput , 2, 0);
        
  	
      Label messagetAmount=new Label("");
         GridPane.setConstraints(messagetAmount,3,1);
     
       
     Button Ok=new Button("Ok");
       GridPane.setConstraints(Ok,2,3);
      Ok.setOnAction ((ActionEvent e)->
      {
     int amount = Integer.parseInt(depositInput.getText());
     atm.deposit(amount);
     messagetAmount.setText("you added"+amount);
               
      });  
      Ok.setEffect(shadow);
        // button menu
     Button menu =new Button("menu");
      GridPane.setConstraints( menu,5,1);
     menu.setOnAction(e->window.setScene(scene1));
        menu.setEffect(shadow);
       
        //clear Button
        Button clear1=new Button("clear");
           GridPane.setConstraints(clear1,5,4);
         clear1.setOnAction(e->depositInput.clear());
         clear1.setEffect(shadow);
       
    //keyboard2
    bb0 = new Button ("0");
    bb0.setOnAction(e->{depositInput.setText(depositInput.getText()+"0");});
        GridPane.setConstraints(bb0,2,7);
       bb0.setEffect(shadow);
    
        bb1=new Button ("1");
        bb1.setOnAction(e->{depositInput.setText(depositInput.getText()+"1");});
        GridPane.setConstraints(bb1,1,4);
         bb1.setEffect(shadow);
        
        bb2=new Button ("2");
        bb2.setOnAction(e->{    depositInput.setText(depositInput.getText()+"2");});
        GridPane.setConstraints(bb2,2,4);
         bb2.setEffect(shadow);
         
        bb3=new Button ("3");
        bb3.setOnAction(e->{ depositInput.setText(depositInput.getText()+"3");});
           GridPane.setConstraints(bb3,3,4);
          bb3.setEffect(shadow);
            
        bb4=new Button ("4");
        bb4.setOnAction(e->{depositInput.setText(depositInput.getText()+"4");});
          GridPane.setConstraints(bb4,1,5);
          bb4.setEffect(shadow);
      
        bb5=new Button ("5");
        bb5.setOnAction(e->{ depositInput.setText(depositInput.getText()+"5");});
         GridPane.setConstraints(bb5,2,5);
           bb5.setEffect(shadow);
  
        bb6=new Button ("6");
        bb6.setOnAction(e->{ depositInput.setText(depositInput.getText()+"6");});
           GridPane.setConstraints(bb6,3,5);
            bb6.setEffect(shadow);
            
          bb7=new Button ("7");
        bb7.setOnAction(e->{  depositInput.setText(depositInput.getText()+"7");});
            GridPane.setConstraints(bb7,1,6);
          bb7.setEffect(shadow);
        
     
        bb8=new Button ("8");
        bb8.setOnAction(e->{ depositInput.setText(depositInput.getText()+"8");});
          GridPane.setConstraints(bb8,2,6);
            bb8.setEffect(shadow);
     
           bb9=new Button ("9");
        bb9.setOnAction(e->{  depositInput.setText(depositInput.getText()+"9");});
          GridPane.setConstraints(bb9,3,6);
       bb9.setEffect(shadow);
      
  
          //withdraw functions
        
        Button withdraw=new Button("withdraw");
       
           GridPane.setConstraints(withdraw,1,0);
        withdraw .setOnAction(e->window.setScene(scene3));
        withdraw.setEffect(shadow);
        
       Label withdrawlable = new Label("enter the amount:");
        GridPane.setConstraints(withdrawlable, 1, 0);
        
        TextField withdrawInput = new TextField();
        withdrawInput.setPromptText("amoumt deposit");
        GridPane.setConstraints( withdrawInput , 2, 0);
     withdrawInput.setPromptText("amoumt withdraw");
  	
      Label messagetAmount1=new Label("");
         GridPane.setConstraints(messagetAmount1,3,1);
   
      Label messageterror=new Label("");
         GridPane.setConstraints(messageterror,3,1);
    
       
        Button Ok1=new Button("Ok");
       GridPane.setConstraints(Ok1,2,3);
 
      Ok1.setOnAction (e->
      {
       
      int Amount=Integer.parseInt(withdrawInput.getText());
     
     if (Amount>10000)
          messageterror.setText("sorry you can’t wihdraw maxium withdraw daily is 10000");

        else  if (Amount >atm.getBalance()||atm.getBalance()==0)
          messageterror.setText("no enough money to withdraw");
        
            else if (Amount<=atm.getBalance() && Amount<=10000)
             { 
          messagetAmount1.setText("you withdraw:"+Amount);
        atm.withdrawal(Amount);
       
             } 
               
      });  
      Ok1.setEffect(shadow);
      //button menu 
      Button menu1 =new Button("menu");
      GridPane.setConstraints( menu1,5,1);
     menu1.setOnAction(e->window.setScene(scene1));
       menu1.setEffect(shadow);
        
     
        //clear Button
        Button clear2=new Button("clear");
           GridPane.setConstraints(clear2,5,4);
         clear2.setOnAction(e->{withdrawInput.clear();
          messageterror.setText("");
          messagetAmount1.setText("");
       
         }) ;
         clear2.setEffect(shadow);
         
     //keyboard3
     
      b00 = new Button ("0");
        b00.setOnAction(e->{withdrawInput.setText(withdrawInput.getText()+"0");});
        GridPane.setConstraints(b00,2,7);
       b00.setEffect(shadow);
      
        
        b11=new Button ("1");
        b11.setOnAction(e->{withdrawInput.setText(withdrawInput.getText()+"1");});
           GridPane.setConstraints(b11,1,4);
            b11.setEffect(shadow);
    
        
        b22=new Button ("2");
        b22.setOnAction(e->{  withdrawInput.setText(withdrawInput.getText()+"2");});
        GridPane.setConstraints(b22,2,4);
        b22.setEffect(shadow);
        
        b33=new Button ("3");
        b33.setOnAction(e->{ withdrawInput.setText(withdrawInput.getText()+"3");});
        GridPane.setConstraints(b33,3,4);
        b33.setEffect(shadow);
       
        
        b44=new Button ("4");
        b44.setOnAction(e->{
        withdrawInput.setText(withdrawInput.getText()+"4");});
        GridPane.setConstraints(b44,1,5);
        b44.setEffect(shadow);
        
         b55=new Button ("5");
         b55.setOnAction(e->{
         withdrawInput.setText(withdrawInput.getText()+"5");});
         GridPane.setConstraints(b55,2,5);  
         b55.setEffect(shadow);
        
        b66=new Button ("6");
        b66.setOnAction(e->{ withdrawInput.setText(withdrawInput.getText()+"6");});
          GridPane.setConstraints( b66,3,5);
            b66.setEffect(shadow);
        
        
        b77=new Button ("7");
        b77.setOnAction(e->{  withdrawInput.setText(withdrawInput.getText()+"7");});
         GridPane.setConstraints(b77,1,6);
           b77.setEffect(shadow);
        
        
        b88=new Button ("8");
        b88.setOnAction(e->{ withdrawInput.setText(withdrawInput.getText()+"8");});
        GridPane.setConstraints(b88,2,6);
        b88.setEffect(shadow);
     
        
        b99=new Button ("9");
        b99.setOnAction(e->{ withdrawInput.setText(withdrawInput.getText()+"9");});
        GridPane.setConstraints(b99,3,6);
        b99.setEffect(shadow);
        
      //checkBalance functions
        Label massagecheckBalance=new Label("");
         GridPane.setConstraints(massagecheckBalance,4,1);
                 
        Button checkBalance=new Button("checkBalance");
          GridPane.setConstraints(checkBalance,2,0);
         checkBalance.setOnAction(e->{
          window.setScene(scene4);
         massagecheckBalance.setText(" your   balance    now    is    :  "+atm.getBalance()+" \n thanks !");
          });          
           checkBalance.setEffect(shadow);      
         
         
         // button menu
     Button menu2 =new Button("menu");
      GridPane.setConstraints( menu2,7,1);
     menu2.setOnAction(e->window.setScene(scene1));
     menu2.setEffect(shadow);
        //next Button 
        	
      Label history =new Label("");
         GridPane.setConstraints(history,3,1);
     
        
         
    // there ia an problem in history ican’t solve it  
         
        Button next=new Button("next");
           GridPane.setConstraints(next,1,2);
           next.setOnAction(e->{
           
           int up=atm.upcount(); 
       if (up<5)
           history.setText( methods[up]);
           
          
               });
          next.setEffect(shadow);
           
          
        Button pervious =new Button("pervious");
        GridPane.setConstraints(pervious,2,2);
           
        pervious.setOnAction((ActionEvent e)->{
           
         int prev=atm.downcount();
         
           if(prev<5){
          if(atm.get()<0)
            history.setText("No pervious History");
           else
           history.setText( methods[prev]);
           }
              
      /*  else 
               {  
                   while (prev>5){ 
                  
                   for (int i=prev-1;i<=0;i--)
          {
           
              methods[i]= methods[i+1];
               history.setText( methods[i]);
            
           }  
            
            } }*/
            });
           pervious.setEffect(shadow);
           

           
           
        scene = new Scene(grid,585,370);
        scene. getStylesheets().add(getClass().getResource("color.css").toExternalForm());
        scene1 = new Scene(grid2,400,300);
        scene1. getStylesheets().add(getClass().getResource("color.css").toExternalForm());
        scene2 = new Scene(grid3,600,300);
        scene2. getStylesheets().add(getClass().getResource("color.css").toExternalForm());
        scene3 = new Scene(grid4,600,300);
        scene3. getStylesheets().add(getClass().getResource("color.css").toExternalForm());
        scene4 = new Scene(grid5,400,300);
     scene4. getStylesheets().add(getClass().getResource("color.css").toExternalForm());
     
     
        grid0.getChildren().addAll(creditLabel, creditInput/*,passLabel, passInput*/, title);
        grid.getChildren().addAll(grid0,loginButton,logoutButton,error,clear0,b0,b1,b2,b3,b4,b5,b6,b7,b8,b9);
        grid2.getChildren().addAll(deposit,withdraw, checkBalance, next,pervious, history );
        grid33.getChildren().addAll(depositlable,depositInput);
        grid3.getChildren().addAll( grid33,messagetAmount,Ok, menu,clear1,bb0,bb1,bb2,bb3,bb4,bb5,bb6,bb7,bb8,bb9);
        grid44.getChildren().addAll(withdrawlable,withdrawInput);
        grid4.getChildren().addAll( grid44,Ok1,messagetAmount1 ,messageterror, menu1,clear2,b00,b11,b22,b33,b44,b55,b66,b77,b88,b99);
        grid5.getChildren().addAll( massagecheckBalance, menu2);
   
        window.setScene(scene);
        window.show();
}
  private void closeprogram() {
    	Boolean answer=  CONFIRIM.display("log out", "sure you want to exit?");
    	if(answer)
    		window.close();
    }
 }
        
     
        
      
    
      