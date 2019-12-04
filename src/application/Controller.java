package application;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Tooltip;
import javafx.stage.Stage;

public class Controller {
	
	@FXML
	private Button btnDie;
	private Button btnLive;
	private Tooltip tooltipDie;
	private Tooltip tooltipLive;
	
//	@FXML
//	public Controller() {
//		btnDie.setTooltip(tooltipDie);
//		btnLive.setTooltip(tooltipLive);
//	}
	
	@FXML
	public void die() {
		//		System.exit(0);
		Stage thisStage = (Stage) btnDie.getScene().getWindow();
		thisStage.close();
	}
	
	@FXML	
	public void live() {
		VentanaImg vImg = new VentanaImg();
		
		vImg.start(new Stage());
	}

}
