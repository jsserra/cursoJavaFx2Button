package application;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
	/*
	 * Uma aplica��o JavaFx � uma classe que extends Application do pacote import javafx.application.Application;
	 * Essa classe (Application) tem um m�todo abstrato que � o start, esse m�todo somos obrigados a implementa-lo
	 * al�m do start, tem o init (coisas que devem acontecer antes da aplica��o iniciar) e o stop (coisas que devem acontecer depois que aplica��o encerrar)
	*/
	@Override
	public void start(Stage stage) {
		//stage � o palco
		//Hierarquia do JavaFX: https://docs.oracle.com/javase/8/javafx/api/overview-tree.html
		try {
			Parent parent = FXMLLoader.load(getClass().getResource("/gui/View.fxml")); //Pq instaciamos o Parente e n�o o Ancorpane? Pq parent � superclasse do AncorPanne "Upcasting"
			Scene scene = new Scene(parent); //scene � a cena
			stage.setScene(scene); // "Dentro do palco tem a cena scene"
			stage.show(); //Mostrando o conte�do do palco.
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args); //Launch � uma m�todo st�tico da classe Application que serve para iniciar uma aplica��o JavaFx
	}
}
