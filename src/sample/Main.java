package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import weka.core.converters.ConverterUtils.DataSource;


public class Main extends Application {

    private static DataSource dataSource;

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
    }


    public static void main(String[] args) throws Exception {
        Weka AI=new Weka("src/training_set.arff","src/testing_set.arff");
        AI.buildingModel();
        launch(args);



    }
}
