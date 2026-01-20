package application.controller;

import java.awt.event.ActionEvent;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class DashboardAdminController implements Initializable {
	private Stage stage;
	private Scene scene;
	@FXML
    void logout(ActionEvent event) {
		Parent root = FXMLLoader.load(getClass().getResource("tst.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    @FXML
    void alerte(ActionEvent event) {
    	Parent root = FXMLLoader.load(getClass().getResource("Alerte.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    void chiffreAfaire(ActionEvent event) {	
    	Parent root = FXMLLoader.load(getClass().getResource("ChiffreAfaire.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    void openCommandes(ActionEvent event) {
    	Parent root = FXMLLoader.load(getClass().getResource("cmnd.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    void openHistorique(ActionEvent event) {
    	Parent root = FXMLLoader.load(getClass().getResource("historiqueVente.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    void openProduits(ActionEvent event) {
    	Parent root = FXMLLoader.load(getClass().getResource("produits.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    void openStock(ActionEvent event) {
    	Parent root = FXMLLoader.load(getClass().getResource("cmnd.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    void openUsers(ActionEvent event) {
    	Parent root = FXMLLoader.load(getClass().getResource("userview.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    void perfermance(ActionEvent event) {
    	Parent root = FXMLLoader.load(getClass().getResource("PerformanceFournisseurs.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
	}

}
}
