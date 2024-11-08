/*
* File: MainController.java
* Author: Varas-Tóth Gergő
* Copyright: 2024, Varas-Tóth Gergő
* Group: Szoft II/I/N
* Date: 2024-11-07(-8)
* Github: https://github.com/Valaki2004/
* Licenc: GNU GPL
*/
package hu.vtg;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
public class MainController {

    @FXML
    private TextField areaside;

    @FXML
    private TextField aside;

    @FXML
    private TextField bside;

    @FXML
    private TextField cside;

    @FXML
    private TextField dside;

    @FXML
    void CalcBTN(ActionEvent event) {
        try{
            Calculate();
        }
        catch(Exception e){
            areaside.setText("Szar");
            System.out.println(e);
            System.err.println(e.getMessage());
        }
    }
    @FXML
    private void ENVOK(ActionEvent event) {
        Alert alert = new Alert(Alert.AlertType.NONE);
        alert.setTitle("Adatok");
        alert.setHeaderText("Trapter nevű project.");
        alert.setGraphic(new ImageView(this.getClass().getResource("images.png").toString()));
        alert.setContentText("Készitette: Varas-Tóth Gergő avagy VTG, 2024-11-07(-8) , Szoft I/2/N");
        alert.getDialogPane().getButtonTypes().add(ButtonType.CLOSE);
        alert.showAndWait();
    }

    @FXML
    void ExitBTN(ActionEvent event) {
        System.exit(0);
    }
    public void Calculate(){

    String asideString = aside.getText();
    String bsideString = bside.getText();
    String csideString = cside.getText();
    String dsideString = dside.getText();
    double a = Double.parseDouble(asideString); 
    double b = Double.parseDouble(bsideString);
    double c = Double.parseDouble(csideString);
    double d = Double.parseDouble(dsideString);
    double firstpart = a + c;
    double secondpart = 4 * (a-c);
    double division = firstpart/secondpart;
    double longcalc = (a+b-c+d)*(a-b-c+d)*(a+b-c-d)*(-a+b+c+d);
    double sqrtstuff = Math.sqrt(longcalc);
    Double Area = division * sqrtstuff;
    System.out.println(Area);   
    areaside.setText(String.valueOf(Area));
    }
}
