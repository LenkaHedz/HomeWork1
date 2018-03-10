package com.gmail.lenkahedz;

import java.util.Scanner;

public class Controller {
    private Model model;
    private View view;

    public Controller() {
    }

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void setModel(Model model) {
        this.model = model;
    }

    public void setView(View view) {
        this.view = view;
    }

    public Model getModel() {
        return model;
    }

    public View getView() {
        return view;
    }

    public void processUser(){
        Scanner scan = new Scanner(System.in);
        inputHello(scan);
        inputWorld(scan);
        view.printHelloWorld(model);
    }

    void inputHello(Scanner scan){
        view.printInput("Hello");
        String nameHello = scan.nextLine();
        if(nameHello.equals("Hello")){
            model.setNameHello(nameHello);
        }
    }

    void inputWorld(Scanner scan){
        view.printInput("world!");
        String nameWorld = scan.nextLine();
        if(nameWorld.equals("world!")){
            model.setNameWorld(nameWorld);
        }
    }

}
