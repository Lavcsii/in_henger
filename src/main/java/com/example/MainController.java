/*
* File: MainController.java
* Author: Fazekas Laura
* Copyright: 2025, Fazekas Laura
* Group: Szoft I-N
* Date: 2025-05-25
* Github: https://github.com/Lavcsii/
* Licenc: MIT
 */
package com.example;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class MainController {

    @FXML
    private TextField heightField;

    @FXML
    private TextField radiusField;

    @FXML
    private Label surfaceLabel;

    @FXML
    void onClickAboutButton(ActionEvent event) {
        startAbout();
    }

    private void startAbout() {
        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle("Névjegy");
        alert.setHeaderText("A henger felszín névjegye");
        alert.setContentText(
            "Henger felszín\n" +
            "Szerző: Fazekas Laura\n" +
            "Verzió: 1.0\n" +
            "Csoport: Szoft I-N\n" +
            "2025-05-25\n"
        );
        alert.initOwner(App._stage);
        alert.show();
    }

    @FXML
    void onClickCalcButton(ActionEvent event) {
        startCalc();
    }

    private void startCalc() {
        try {
            double radius = Double.parseDouble(radiusField.getText());
            double height = Double.parseDouble(heightField.getText());
            double surfaceArea = 2 * Math.PI * radius * (radius + height);
            surfaceLabel.setText(String.format("A henger felszíne: %.2f cm²", surfaceArea));
        } catch (NumberFormatException e) {
            showError("Érvénytelen bemenet", "Kérlek, érvényes számokat adj meg.");
        }
    }

    private void showError(String title, String message) {
        Alert alert = new Alert(AlertType.ERROR);
        alert.setTitle(title);
        alert.setContentText(message);
        alert.showAndWait();
    }

    @FXML
    void onClickExitButton(ActionEvent event) {
        startExit();
    }

    private void startExit() {
        Platform.exit();
    }
}
