package com.example.demo;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;

import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {
    @FXML
    private TreeView treeView;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        TreeItem<String> rootItem = new TreeItem<>("Ciencia da Computacao");
        TreeItem<String> branchItem1 = new TreeItem<>("Primeiro Semestre");
        TreeItem<String> branchItem2 = new TreeItem<>("Segundo Semestre");
        TreeItem<String> branchItem3 = new TreeItem<>("Terceiro Semestre");

        TreeItem<String> leafItem1 = new TreeItem<>("Calculo A");
        TreeItem<String> leafItem2 = new TreeItem<>("Circuitos Digitais");
        TreeItem<String> leafItem3 = new TreeItem<>("Geometria Analitica");
        TreeItem<String> leafItem4 = new TreeItem<>("Introducao a Computacao A");
        TreeItem<String> leafItem5 = new TreeItem<>("Laboratorio de Programacao 1");
        TreeItem<String> leafItem6 = new TreeItem<>("Logica e Algoritmo");

        TreeItem<String> leafItem7 = new TreeItem<>("Algebra Linear");
        TreeItem<String> leafItem8 = new TreeItem<>("Estrutura de Dados A");
        TreeItem<String> leafItem9 = new TreeItem<>("Laboratorio de Programacao 2");
        TreeItem<String> leafItem10 = new TreeItem<>("Lingua Inglesa Instrumental 1");
        TreeItem<String> leafItem11 = new TreeItem<>("Matematica Discreta A");
        TreeItem<String> leafItem12 = new TreeItem<>("Organizacao de Computadores");

        TreeItem<String> leafItem13 = new TreeItem<>("Arquitetura de Computadores A");
        TreeItem<String> leafItem14 = new TreeItem<>("Calculo B");
        TreeItem<String> leafItem15 = new TreeItem<>("Estatistica");
        TreeItem<String> leafItem16 = new TreeItem<>("Lingua Inglesa Instrumental 2");
        TreeItem<String> leafItem17 = new TreeItem<>("Paradigmas de Programacao");
        TreeItem<String> leafItem18 = new TreeItem<>("Pesquisa e Ordenacao de Dados A");

        

        branchItem1.getChildren().addAll(leafItem1,leafItem2,leafItem3,leafItem4,leafItem5,leafItem6);
        branchItem2.getChildren().addAll(leafItem7,leafItem8,leafItem9,leafItem10,leafItem11,leafItem12);
        branchItem3.getChildren().addAll(leafItem13,leafItem14,leafItem15,leafItem16,leafItem17,leafItem18);

        rootItem.getChildren().addAll(branchItem1,branchItem2,branchItem3);

        treeView.setRoot(rootItem);
    }

    public void selectItem(){
        TreeItem<String> item = (TreeItem<String>) treeView.getSelectionModel().getSelectedItem();
        if(item != null){
            System.out.println(item.getValue());
        }
    }





}