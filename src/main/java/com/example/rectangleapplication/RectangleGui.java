package com.example.rectangleapplication;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.component.textfield.TextField;
import org.springframework.beans.factory.annotation.Autowired;


@Route
public class RectangleGui extends VerticalLayout {

    private RectangleRepo rectangleRepo;
    private com.vaadin.flow.component.textfield.TextField heightTextField;
    private TextField widthTextField;
    private Button button;

    @Autowired
    public RectangleGui(RectangleRepo rectangleRepo){
        this.rectangleRepo = rectangleRepo;
        heightTextField = new TextField("Podaj wysokosc");
        widthTextField = new TextField("Podaj szerokosc");
        button = new Button(" Dodaj" );

        button.addClickListener(clickEvent -> addRectangle());
        add(heightTextField);
        add(widthTextField);
        add(button);

    }

public void addRectangle(){
        Rectangle rectangle = new Rectangle();
       rectangle.setHeight(Integer.parseInt(heightTextField.getValue()));
       rectangle.setWidth(Integer.parseInt(widthTextField.getValue()));
        rectangleRepo.save(rectangle);
}


}
