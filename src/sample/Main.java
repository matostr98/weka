package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class Main extends Application {


    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
    }


    public static void main(String[] args) throws Exception {
        Weka prediction_credits=new Weka("src/training_set.arff","src/testing_set.arff");
        prediction_credits.buildingModelPredicted();

        Weka glass=new Weka("src/glass.arff");
        glass.buildingModel();
        launch(args);



    }
}
