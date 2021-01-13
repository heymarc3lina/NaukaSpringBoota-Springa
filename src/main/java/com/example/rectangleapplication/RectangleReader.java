package com.example.rectangleapplication;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

@Service
public class RectangleReader {

    private RectangleRepo rectangleRepo;

    @Autowired
    public RectangleReader(RectangleRepo rectangleRepo){
        this.rectangleRepo = rectangleRepo;
    }


    @Value("${sizeA1}")
    private int sizeA1;
    @Value("${sizeB1}")
    private int sizeB1;
    @Value("${sizeA2}")
    private int sizeA2;
    @Value("${sizeB2}")
    private int sizeB2;
    @Value("${sizeA3}")
    private int sizeA3;
    @Value("${sizeB3}")
    private int sizeB3;
    @Value("${sizeA4}")
    private int sizeA4;
    @Value("${sizeB4}")
    private int sizeB4;


    @EventListener(ApplicationReadyEvent.class)
    public void addRectangle(){
        Rectangle rectangle1 = new Rectangle(sizeA1,sizeB1 );
        Rectangle rectangle2 = new Rectangle(sizeA2,sizeB2 );
        Rectangle rectangle3 = new Rectangle(sizeA3,sizeB3 );
        Rectangle rectangle4 = new Rectangle(sizeA4,sizeB4 );
        rectangleRepo.save(rectangle1);
        rectangleRepo.save(rectangle2);
        rectangleRepo.save(rectangle3);
        rectangleRepo.save(rectangle4);
    }

}
