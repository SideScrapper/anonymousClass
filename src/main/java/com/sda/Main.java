package com.sda;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;

public class Main {
    public interface ButtonT{
        void click();
    }


    public static void action() {
        ButtonT button = new ButtonT(){
        public void click () {
            System.out.println("przycisk kliknięty");
        }
    };
        button.click();

    }

    public static void main(String[] args) {
        ButtonT button = () -> System.out.println("Przycisk kliknięty");
        button.click();
        Runnable t1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("Jestem w nowym wątku");
            }
        };
        t1.run();

        Runnable r1 = () -> System.out.println("lambda wątek");
        r1.run();

        Button btn = new Button();
        btn.setText("Test");
        btn.setOnAction(event -> System.out.println("Przycisk został kliknięty"));
    }
}