package application;
	
import javafx.application.Application;
import javafx.scene.Group;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Polygon;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		Rectangle ground = new Rectangle(0, 400, 800, 350);
		ground.setFill(Color.LIMEGREEN);
		Rectangle house = new Rectangle(130, 250, 490, 420);
		house.setStroke(Color.BLACK);
		house.setFill(Color.BROWN);
		Rectangle top = new Rectangle(130, 250, 490, 30);
		top.setStroke(Color.BLACK);
		top.setFill(Color.WHITE);
		Polygon roof = new Polygon();
		roof.getPoints().addAll(new Double[]{
			375.0, 50.0,
		    670.0, 250.0,
		    80.0, 250.0 });
		roof.setStroke(Color.BLACK);
		roof.setFill(Color.WHITE);
		Rectangle window = new Rectangle(337.5, 310, 75, 50);
		window.setStroke(Color.BLACK);
		window.setFill(Color.LIGHTGREY);
		Rectangle[] strs = new Rectangle[12];
		Group gp = new Group();
		gp.getChildren().add(ground);
		gp.getChildren().add(house);
		gp.getChildren().add(top);
		gp.getChildren().add(roof);
		gp.getChildren().add(window);
		for(int i = 1; i < 12; i++) {
			strs[i] = new Rectangle(200 - (i * 10), 550 + (i * 10), 350 + 2 * (i * 10), 10);
			strs[i].setStroke(Color.BLACK);
			strs[i].setFill(Color.LIGHTGREY);
			gp.getChildren().add(strs[i]);
		}
		for(int i = 1; i < 3; i++) {
			Rectangle step = new Rectangle(130 + ((i - 1) * 430), 560, 60, 5);
			step.setStroke(Color.BLACK);
			step.setFill(Color.LIGHTGREY);
			Rectangle door = new Rectangle(195 + ((i - 1) * 285), 430, 75, 130);
			door.setStroke(Color.BLACK);
			door.setFill(Color.WHITE);
			gp.getChildren().add(step);
			gp.getChildren().add(door);
		}
		Rectangle door = new Rectangle(337.5, 400, 75, 160);
		door.setStroke(Color.BLACK);
		door.setFill(Color.WHITE);
		gp.getChildren().add(door);
		Rectangle[] windows1 = new Rectangle[16];
		Rectangle[] windows2 = new Rectangle[16];
		for(int i = 1; i < 4; i++) {
			for(int j = 1; j < 6; j++){
				windows1[i] = new Rectangle(210 + ((i - 1) * 142.5), 410 + (j * 25), 15, 20);
				windows1[i].setFill(Color.BLACK);
				windows2[i] = new Rectangle(240 + ((i - 1) * 142.5), 410 + (j * 25), 15, 20);
				windows2[i].setFill(Color.BLACK);
				gp.getChildren().add(windows1[i]);
				gp.getChildren().add(windows2[i]);
			}
		}
		Scene sn = new Scene(gp, 800, 1000, Color.SKYBLUE);
		primaryStage.setScene(sn);
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
