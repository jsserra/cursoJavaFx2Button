package application;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
	/*
	 * Uma aplicação JavaFx é uma classe que extends Application do pacote import javafx.application.Application;
	 * Essa classe (Application) tem um método abstrato que é o start, esse método somos obrigados a implementa-lo
	 * além do start, tem o init (coisas que devem acontecer antes da aplicação iniciar) e o stop (coisas que devem acontecer depois que aplicação encerrar)
	*/
	@Override
	public void start(Stage stage) {
		//stage é o palco
		//Hierarquia do JavaFX: https://docs.oracle.com/javase/8/javafx/api/overview-tree.html
		try {
			Parent parent = FXMLLoader.load(getClass().getResource("/gui/View.fxml")); //Pq instaciamos o Parente e não o Ancorpane? Pq parent é superclasse do AncorPanne "Upcasting"
			Scene scene = new Scene(parent); //scene é a cena
			stage.setScene(scene); // "Dentro do palco tem a cena scene"
			stage.show(); //Mostrando o conteúdo do palco.
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args); //Launch é uma método stático da classe Application que serve para iniciar uma aplicação JavaFx
	}
}
