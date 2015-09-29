
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class fx_Lists extends Application {

	@Override
	public void start(Stage primaryStage) {
	BorderPane borderPane = new BorderPane();
	HBox hbox = new HBox();
	TextField input = new TextField();
	Button btn_good = new Button("GOOD");
	Button btn_bad = new Button("BAD");
	ListView<String> viewbad = new ListView();
	ListView<String> viewgood = new ListView();
	
	ObservableList<String> listgood = FXCollections.observableArrayList();
	ObservableList<String> listbad = FXCollections.observableArrayList();
	
	viewbad.itemsProperty().setValue(listbad);
	viewgood.itemsProperty().setValue(listgood);
	
	borderPane.setLeft(viewbad);
	borderPane.setRight(viewgood);
	hbox.getChildren().addAll(btn_bad,input,btn_good);
	borderPane.setBottom(hbox);
	Scene scene = new Scene(borderPane);
	primaryStage.setScene(scene);
	primaryStage.show();
	btn_good.setOnAction(e -> listgood.add(input.getText()));
	btn_bad.setOnAction(e -> listbad.add(input.getText()));
	}

	public static void main(String[] args) {
		launch(args);
	}
}
