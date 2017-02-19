package sample;

import javafx.fxml.FXML;
import javafx.scene.control.*;

public class Controller {

    @FXML
    private Label first_label, second_label;
    @FXML
    private TextField first_field, second_field;
    @FXML
    private Button calculate_button, reverse_button;

    private boolean CtoF = true;
    private Alert alert = new Alert(Alert.AlertType.ERROR, "Invalid value", ButtonType.OK);

    public Controller() {

    }

    @FXML
    void initialize()
    {

    }

    @FXML
    void celsiusToFahrenheit()
    {
        if(!first_field.getText().matches("[-]?[0-9]+([.][0-9]+)?"))
            alert.show();
        else {
            double value;
            if (CtoF) {
                value = Double.parseDouble(first_field.getText()) * (9.0 / 5.0) + 32.0;
                second_field.setText(String.valueOf(value));
            } else {
                value = (Double.parseDouble(first_field.getText()) - 32.0) * (5.0 / 9.0);
                second_field.setText(String.valueOf(value));
            }
        }
    }

    @FXML
    void reverse()
    {
        if(CtoF)
        {
            CtoF = false;
            first_label.setText("Fahrenheit");
            second_label.setText("Celsius");
        }
        else {
            CtoF = true;
            first_label.setText("Celsius");
            second_label.setText("Fahrenheit");
        }

    }
}
