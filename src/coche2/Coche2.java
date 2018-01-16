package coche2;


import java.io.File;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Coche2 extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        
        int cocheX = 10;
        int cocheY = 500;
        int speedX = 1;
        int speedY = 1;

        Pane root = new Pane();

        Scene ventana = new Scene(root, 300, 250);
        //coche
        primaryStage.setTitle("Coche");
        primaryStage.setScene(ventana);
        primaryStage.show();
        
        File coche = new File("coche.png");
        Image img = new Image(coche.toURI().toString()) {};
        ImageView cocheImg = new ImageView(img);
        cocheImg.setX(cocheX);
        cocheImg.setY(cocheY);
        
        //carretera
        primaryStage.setTitle("Carretera");
        primaryStage.setScene(ventana);
        primaryStage.show();
        
        File carretera = new File("carretera.png");
        Image img2 = new Image(carretera.toURI().toString()) {};
        ImageView carreteraImg = new ImageView(img2);
        carreteraImg.setY(150);
        
        root.getChildren().add(carreteraImg);
        root.getChildren().add(cocheImg);
        
        
    }    
}
