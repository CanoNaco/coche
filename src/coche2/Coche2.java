package coche2;


import java.io.File;
import javafx.animation.AnimationTimer;
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
        int cocheX = 0;
        int cocheY = 440;
        int speedX = 3;
        int speedY = -1;
        int angulo = 0;
    
    @Override
    public void start(Stage primaryStage) {
        


        Pane root = new Pane();

        Scene ventana = new Scene(root, 1200, 650);
        //carretera
        primaryStage.setTitle("Carretera");
        primaryStage.setScene(ventana);
        primaryStage.show();
        
        File carretera = new File("carretera.png");
        Image img2 = new Image(carretera.toURI().toString()) {};
        ImageView carreteraImg = new ImageView(img2);
        carreteraImg.setY(100);

        //coche
        primaryStage.setTitle("Coche");
        primaryStage.setScene(ventana);
        primaryStage.show();
        
        File coche = new File("coche.png");
        Image img = new Image(coche.toURI().toString()) {};
        ImageView cocheImg = new ImageView(img);
        cocheImg.setX(cocheX);
        cocheImg.setY(cocheY);
        cocheImg.setRotate(angulo);
        //velocidad y rotacion
        AnimationTimer animationBall;
        animationBall = new AnimationTimer() {
            @Override
            public void handle(long now) {
                
                cocheImg.setX(cocheX);
                cocheX += speedX;
                if(cocheX >= 1200){
                    speedX = -3;
                    speedY = 1;
                }
                if(cocheX <= 0 ){
                    speedX = 3;
                    speedY = -1;
                }
                
                cocheImg.setY(cocheY);
                cocheY += speedY;
                if(cocheY >= 570){
                    speedY = -1;
                }
                if(cocheY <= 350){
                    speedY = 1;
                }
              
                
            };
        };
        
        
        root.getChildren().add(carreteraImg);
        root.getChildren().add(cocheImg);
        animationBall.start();
        
        
    }    
}
