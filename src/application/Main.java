package application;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;

/**
 * 
 * @author javi
 * @version 1.0
 * 
 * Programa que mediante un botón genera una ventana con una imagen
 *
 */
public class Main extends Application {
		@Override
		public void start(Stage primaryStage) {
			try {
				
				FXMLLoader loader = new FXMLLoader(getClass().getResource("index.fxml"));
				AnchorPane root = (AnchorPane) loader.load();
				Scene scene = new Scene(root, 800, 600);
				primaryStage.setScene(scene);
				primaryStage.show();
				
				
	//			BorderPane root = new BorderPane();
	//			Scene scene = new Scene(root,400,400);
	//			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
	//			primaryStage.setScene(scene);
	//			primaryStage.show();
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
	
	public static void main(String[] args) {
		launch(args);
	}
}
