/*
* File: MainController.java
* Author: Ónodi András Péter
* Copyright: 2025, Ónodi András Péter
* Group: Szoft II-2-N
* Date: 2025-04-15
* Github: https://github.com/AndrasOnodi/
* Licenc: MIT
*/


package com.example;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

public class MainController {

    @FXML
    private TextField areaField;

    @FXML
    private TextField hegihtField;

    @FXML
    private TextField radiusField;

    @FXML
    private ListView<String> resultList;

    @FXML
    void onClickCalcButton(ActionEvent event) {
        startCalc();
    }

    void startCalc() {
        Double height = Double.parseDouble(hegihtField.getText());
        Double radius = Double.parseDouble(radiusField.getText());
        Double area = 2.0*Math.PI*radius*(radius+height);
        areaField.setText(area.toString());

        resultList.getItems().add("Terület: " + area.toString());
    }

    @FXML
    void initialize() {
        System.out.println("Indítás...");
        App._stage.setOnCloseRequest(e -> {
            System.out.println("Ablak bezárása.");
            Store.SaveResults(resultList.getItems().toString());
        });
    }


}
