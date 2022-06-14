
package org.humbertodelacruz.system;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

/**
 * Programador: Humberto Alexander de la Cruz Chanchavac
 * IN5AM
 * 2017473
 *      Fecha Creación:
 *          15-04-2021
 *      Modificaciones:
 *          21-05-2021
 *          22-05-2021
 *          23-05-2021
 */

public class Principal extends Application {
    
    @Override
    public void start(Stage escenarioPrincipal) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        
        Scene scene = new Scene(root);
        
        escenarioPrincipal.setScene(scene);
        escenarioPrincipal.setTitle("CALCULADORA CIENTÍFICA");
        escenarioPrincipal.getIcons().add(new Image("/org/humbertodelacruz/image/icono2.png"));
        escenarioPrincipal.setResizable(false);
        escenarioPrincipal.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
