package About;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.image.ImageView;

public class UsController {

    @FXML
    private Button aboutButton;

    @FXML
    private ImageView aboutImage;

    @FXML
    private TextArea crditsText;

    @FXML
    private Button creditsButton;

    @FXML
    private TextArea versionText;

    @FXML
    void aboutClicked(ActionEvent event) {
        aboutImage.setVisible(true);
        versionText.setVisible(true);
        crditsText.setVisible(false);
        versionText.setText("Version 0.0.1");

    }

    @FXML
    void creditClicked(ActionEvent event) {
        aboutImage.setVisible(false);
        versionText.setVisible(false);
        crditsText.setVisible(true);
        String credits = "\t\tCreated By\nMd Asif Karim Chayon \n\tID : 011201366\nShojib Talukder \n\tID : 011201345\nRedoy Kumar Shaha \n\tID : 011201355";
        crditsText.setText(credits);

    }


}


