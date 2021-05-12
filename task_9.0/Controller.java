package sample;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class Controller {

    Socket socket;
    DataOutputStream out;
    Thread thread;
    @FXML
    TextArea textArea;
    @FXML
    TextField textField;

    @FXML
    private void onSubmit() {
        String text = textField.getText();
        textArea.appendText(text+"\n");
        textField.clear();
        try {
            out.writeUTF(text);
        } catch (IOException e) {
            textArea.appendText("Произошла ошибка\n");
            e.printStackTrace();
        }
    }

    @FXML
    private void connect() {
        try {
            Socket socket = new Socket("localhost",8188);
            DataInputStream  in =new DataInputStream(socket.getInputStream());
            out = new DataOutputStream(socket.getOutputStream());
            String response = in.readUTF(); // Ждём сообщение от сервера
            textArea.appendText(response+"\n"); //Добро пожаловать на сервер!
            thread = new Thread(new Runnable() {
                @Override
                public void run() {
                    while(true){
                        try {
                            String response = in.readUTF(); // ждем сообщение от сервера
                            textArea.appendText(response+"\n");
                        } catch (IOException exception) {
                            exception.printStackTrace();
                        }
                    }
                }
            });
            thread.start();
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }
}
