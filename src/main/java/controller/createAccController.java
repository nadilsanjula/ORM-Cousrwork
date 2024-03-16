package controller;

import bo.BOFactory;
import bo.custom.AdminBo;
import com.jfoenix.controls.JFXTextField;
import dto.AdminDto;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class createAccController {
    public Text txtId;
    @FXML
    private JFXTextField txtName;

    @FXML
    private JFXTextField txtPassword;

    private AdminBo adminBo = (AdminBo) BOFactory.getBoFactory().getBO(BOFactory.BOTypes.ADMIN);

    public void initialize(){

        genarateNextAdminId();
    }

    private void genarateNextAdminId() {

        try{

            String id = adminBo.genarateNextAdminId();
            txtId.setText(id);

        }catch (Exception e){

        }
    }

    @FXML
    void loginOnAction(ActionEvent event) {
        String name = txtName.getText();
        String password = txtPassword.getText();
        String id = txtId.getText();

        System.out.println(name);

        if(name.equals("") || password.equals("")){
            new Alert(Alert.AlertType.ERROR,"fields are empty").show();
            return;
        }

        try{

            boolean isSaved = adminBo.saveCustomer(new AdminDto(id,name,password));

            if (isSaved) {
                new Alert(Alert.AlertType.CONFIRMATION,"Saved successfully").show();
                initialize();
            }else{
                new Alert(Alert.AlertType.ERROR,"Saved failed").show();
            }

        }catch (Exception e){

        }


    }

    @FXML
    void nameOnAction(ActionEvent event) {
        txtPassword.requestFocus();

    }

    @FXML
    void passwordOnAction(ActionEvent event) {
        loginOnAction(event);
    }

    public void closeOnAction(MouseEvent mouseEvent) {
        Stage stage = (Stage) txtName.getScene().getWindow();
        stage.close();
    }
}
