package application.controller;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import application.User;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class LoginController implements Initializable {
    private Scene scene;
    private Stage stage;
    @FXML private TextField usernameField;
    @FXML private PasswordField passwordField;
    @FXML private Label errorLabel;
    void loadDashboardUSER(User user,ActionEvent event) {
        try {
        	Parent root = FXMLLoader.load(getClass().getResource("Dashboarduser.fxml"));
            stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    private void loadDashboardADMIN(User user,ActionEvent event) {
        try {
        	Parent root = FXMLLoader.load(getClass().getResource("Dashboradadmin.fxml"));
            stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    @FXML
    	public void login(ActionEvent event)throws IOException {
    	    String username = usernameField.getText();
    	    String password = passwordField.getText();

    	    User u = UserDAO.login(username, password);

    	    if (u == null) {
    	        errorLabel.setVisible(true);
    	    } else {
    	    	if (u.getRole().equalsIgnoreCase("user")) {
    	            loadDashboardUSER(u,event);
    	            Setuser(u);}
    	    	else {
    	    		loadDashboardADMIN(u,event);
    	    		Setuser(u);
    	    }
    	}

    }

    @FXML
    public void back (ActionEvent event ) throws IOException{
    	   Parent root = FXMLLoader.load(getClass().getResource("Home.fxml"));
           stage = (Stage)((Node)event.getSource()).getScene().getWindow();
           scene = new Scene(root);
           stage.setScene(scene);
           stage.show();
       }
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
	}}
