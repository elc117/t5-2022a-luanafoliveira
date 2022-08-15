package com.example.demo2;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class HelloController {

    @FXML
    ImageView myImageView;

    Image imagePao = new Image(getClass().getResourceAsStream("pao.jpg"));
    Image imageHamburguer = new Image(getClass().getResourceAsStream("hamburguer.jpg"));
    Image imageSalada = new Image(getClass().getResourceAsStream("salada.jpg"));
    Image imagePizza = new Image(getClass().getResourceAsStream("pizza.jpg"));
    Image imageBrigadeiro = new Image(getClass().getResourceAsStream("brigadeiro.jpg"));
    Image imageGelatina = new Image(getClass().getResourceAsStream("gelatina.jpg"));
    Image imageBolo = new Image(getClass().getResourceAsStream("bolo.jpg"));
    Image imageCoca = new Image(getClass().getResourceAsStream("coca.jpg"));
    Image imageSuco = new Image(getClass().getResourceAsStream("suco.jpg"));


    public void displayImagePao(){
        myImageView.setImage(imagePao);
    }
    public void displayImageSalada(){
        myImageView.setImage(imageHamburguer);

    }
    public void displayImageHamburguer(){
        myImageView.setImage(imageSalada);

    }
    public void displayImagePizza(){
        myImageView.setImage(imagePizza);

    }
    public void displayImageBrigadeiro(){
        myImageView.setImage(imageBrigadeiro);

    }
    public void displayImageGelatina(){
        myImageView.setImage(imageGelatina);

    }
    public void displayImageBolo(){
        myImageView.setImage(imageBolo);

    }
    public void displayImageCoca(){
        myImageView.setImage(imageCoca);

    }
    public void displayImageSuco(){
        myImageView.setImage(imageSuco);

    }

}