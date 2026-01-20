package application.controller;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.stage.Stage;

public class ProduitsListController {
    private Stage stage;
    private Scene scene;
    @FXML
    private TableColumn<?, ?> colEtat;

    @FXML
    private TableColumn<?, ?> colId;

    @FXML
    private TableColumn<?, ?> colNom;

    @FXML
    private TableColumn<?, ?> colStock;

    @FXML
    private TableView<?> tableProduits;
    

    @FXML
    void addProduit(ActionEvent event) {
           
    }

    @FXML
    void back(ActionEvent event) throws IOException {
    	Parent root = FXMLLoader.load(getClass().getResource("Home.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    void deleteProduit(ActionEvent event) {
         
    }

    @FXML
    void editProduit(ActionEvent event) {
         
    }

}
