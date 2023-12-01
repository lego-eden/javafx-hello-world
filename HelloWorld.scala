package helloworld

import javafx.application.Application
import javafx.stage.Stage
import javafx.scene.control.Button
import javafx.event.EventHandler
import javafx.event.ActionEvent
import javafx.scene.Scene
import javafx.scene.layout.StackPane

/**
  * The main container for the hello world program
  * and window.
  */
class HelloWorld extends Application:
  /**
    * Setup the window and show it.
    *
    * @param primaryStage the main area hosting various widgets.
    */
  def start(primaryStage: Stage): Unit = 
    val btn = new Button:
      setText("Say 'Hello World!'")

      setOnAction(new EventHandler[ActionEvent]:
        def handle(event: ActionEvent): Unit =
          println("Hello World!")
      )

    val root = new StackPane:
      getChildren.add(btn)
      
    val scene = new Scene(root, 300, 250)
    
    primaryStage.setTitle("Hello World!")
    primaryStage.setScene(scene)
    primaryStage.show()

/**
  * Companion object for launching the application.
  */
object HelloWorld:
  def launch(args: String*): Unit =
    Application.launch(classOf[HelloWorld], args*)