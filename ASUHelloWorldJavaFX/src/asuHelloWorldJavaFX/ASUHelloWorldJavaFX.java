package asuHelloWorldJavaFX;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
 
public class ASUHelloWorldJavaFX extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    
    public void start(Stage primaryStage) {
    	System.out.println("ASU Hello World!");
    	System.out.println("It started!");
        primaryStage.setTitle("Nathan Joseph Svoboda Hello World Spring 2024");
        Button btn = new Button();
        btn.setText("Display: 'Nathan Joseph Svoboda says: Hello World!'");
        btn.setOnAction(new EventHandler<>() {
            public void handle(ActionEvent event) {
                System.out.println("Nathan Joseph Svoboda says: Hello World!");
            }
        });
        
        StackPane root = new StackPane();
        root.getChildren().add(btn);
        primaryStage.setScene(new Scene(root, 300, 250));
        primaryStage.show();
    }
}