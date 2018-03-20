import java.util.regex.Pattern;
import java.io.*;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.geometry.Pos;         
import javafx.scene.control.*;
import javafx.scene.Scene;

/*
 **************************************
  Phillip Thames
  Assignment 4   Cindy's Catering
  4-12-2017
  ************************************
 */
public class Catering extends Application{
	
	@Override // Override the start method in the Application class
    public void start(Stage primaryStage){
		
		GridPane  mainPane = new GridPane();
		 mainPane.setAlignment(Pos.CENTER);
		 mainPane.setVgap(10);;
		 mainPane.setHgap(5);;
		
		TextField tfCustomerName = new TextField();
		TextField tfPhoneNumber = new TextField();
		TextField tfTotalGuests = new TextField();
		TextField tfPrice = new TextField();
		tfPrice.setEditable(false);
		Label lbCustomerName = new Label("Customer Name");
		Label lbPhoneNumber = new Label("Customer Phone Number");
		Label lbTotalGuests = new Label("Number of Guests");		
		Button btPrice = new Button("Price");
		
		mainPane.add(lbCustomerName, 0, 0);
		mainPane.add(tfCustomerName, 1, 0);
		mainPane.add(lbPhoneNumber, 0, 1);
		mainPane.add(tfPhoneNumber, 1, 1);
		mainPane.add(lbTotalGuests, 0, 2);
		mainPane.add(tfTotalGuests, 1, 2);
		mainPane.add(btPrice, 0, 3);
		mainPane.add(tfPrice, 1, 3);	
		
		Font ckFont = Font.font("Arial", FontWeight.MEDIUM, 12);
		
		btPrice.setOnAction(e->{
			boolean isInt = Pattern.matches("[0-9]+", tfTotalGuests.getText());
			if(isInt == true){
				int price = Integer.parseInt(tfTotalGuests.getText());
				price = price * 35;
				tfPrice.setText(Integer.toString(price));
			}
			else if(isInt == false){
				int price = 0;
				tfPrice.setText(Integer.toString(price));
			}
		});
		
		ComboBox <String> cbEntree = new ComboBox <> ();
		cbEntree.setEditable(false);  
		cbEntree.setPromptText("Choose an Entree");
		cbEntree.getItems().addAll("Beef Wellington w/ Au Jus", 
				"Lamb Chop w/ Balsamic Reduction", "Salmon w/ Lemon Caper Sauce",
	              "REVENGE served Cold");
		cbEntree.setVisibleRowCount(4);
        TextField tfEntree = new TextField();
        tfEntree.setPrefWidth(400);
        tfEntree.setFont(ckFont);
        mainPane.add(cbEntree, 0, 4); 
        mainPane.add(tfEntree, 1, 4);
        
        cbEntree.setOnAction(e -> { 
            tfEntree.setText("Chosen Entree: " + cbEntree.getValue());     
        });
        
        Button btSides = new Button("Choose Sides");
        TextField tfSides = new TextField();
        tfSides.setPrefWidth(400);
        tfSides.setFont(ckFont);
        
        CheckBox ckSide1 = new CheckBox("Salad");
        ckSide1.setFont(ckFont);
        CheckBox ckSide2 = new CheckBox("Haricot Verts");
        ckSide2.setFont(ckFont);
        CheckBox ckSide3 = new CheckBox("Korn on Dakob");
        ckSide3.setFont(ckFont);
        CheckBox ckSide4 = new CheckBox("Beanee Weenees");
        ckSide4.setFont(ckFont);
        
        mainPane.add(tfSides, 1, 5);
        mainPane.add(btSides, 0, 5);
        mainPane.add(ckSide1, 0, 6);
        mainPane.add(ckSide2, 1, 6);
        mainPane.add(ckSide3, 0, 7);
        mainPane.add(ckSide4, 1, 7);      
     
       
        
       
   		 btSides.setOnAction(e -> {
   				int i = 0;
   			    String ckResult = "Two Sides: ";
   				if (ckSide1.isSelected()){
   					ckResult = ckResult + "Salad ";
   				    i++;
   				}   					
   				if (ckSide2.isSelected()){
   					ckResult = ckResult + "Haricot Verts ";
   				    i++;
   				}   					
   				if (ckSide3.isSelected()){
   					ckResult = ckResult + "Korn on Dakob ";
   				    i++;
   				}   					
   				if (ckSide4.isSelected()){
   					ckResult = ckResult + "Beenee Weenees ";
   					i++;
   				} 
   				if(i==0){
   					ckResult = ckResult + "None ";
   				}
   				if(i>2){
   					ckSide1.setSelected(false);
   					ckSide2.setSelected(false);
   					ckSide3.setSelected(false);
   					ckSide4.setSelected(false);  
   					ckResult = "Two Sides: ";
   				}				
   				
   				
   				tfSides.setText(ckResult); 
   			});
   		 
   		ComboBox <String> cbDessert = new ComboBox <> ();
   		cbDessert.setEditable(false);  
   		cbDessert.setPromptText("Choose an Dessert");
   		cbDessert.getItems().addAll("Ice Cream", 
				"Oreos", "Carrot Cake");
   		cbDessert.setVisibleRowCount(3);
        TextField tfDessert = new TextField();
        tfDessert.setPrefWidth(400);
        tfDessert.setFont(ckFont);
        mainPane.add(cbDessert, 0, 8); 
        mainPane.add(tfDessert, 1, 8);
        
        cbDessert.setOnAction(e -> {         	
        		tfDessert.setText("Chosen Dessert: " + cbDessert.getValue());     
            });
        
         Button btDone = new Button("Finish Order");
         mainPane.add(btDone, 1, 10);
         
         btDone.setOnAction(e->{
        	PrintWriter pw;
        	 
			try {
				//File file = new File("Event.txt");
				pw = new PrintWriter(
			"C:\\Users\\Pthames\\Desktop\\ITCS 3112 Object Oriented Systems\\Assignment_4_Catering\\src\\Event.txt");
				if(tfCustomerName.getText().isEmpty()){
					pw.println("Customer Name: None " );
				} else {
					pw.println("Customer Name: " + tfCustomerName.getText());
				}
				if(tfPhoneNumber.getText().isEmpty()){
					pw.println("Phone Number: None");				
				} else {
					pw.println("Phone Number: " + tfPhoneNumber.getText());
				}
				if(cbEntree.getValue() == null){
					pw.println("Entree Chosen: None");
				} else {
					pw.println("Entree Chosen: " + cbEntree.getValue());
				}
				if(tfSides.getText().isEmpty()){
					pw.println("Sides Chosen: None");
				} else {
					pw.println(tfSides.getText());
				}
				if(cbDessert.getValue() == null){
					pw.println("Dessert Chosen: None");
				} else {
					pw.println("Dessert Chosen: " + cbDessert.getValue());
				}
				if(tfTotalGuests.getText() == null || Pattern.matches("[0-9]+", tfTotalGuests.getText()) == false){
					pw.println("Total Guests: None");
					pw.println("Price: $0");
				} else {
					pw.println("Total Guests: "+ tfTotalGuests.getText());
					int price = Integer.parseInt(tfTotalGuests.getText());
					price = price * 35;
					pw.println("Total Price: $" + price);	
				}
							
				pw.close();			
				
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();				
			}
			
			System.exit(0);
        	 
         });
   		 
        
        Scene mainScene = new Scene(mainPane, 900, 600);
        
        primaryStage.setTitle("Cindy's Catering");
        primaryStage.setScene(mainScene);
        primaryStage.show();
        
	}
	
	
	
	public static void main(String[] args) {
		launch(args);
	}
}
