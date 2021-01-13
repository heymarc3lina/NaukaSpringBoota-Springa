package com.example.rectangleapplication;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FigureApi {
    @GetMapping("/calculate")
    public int calculate(@RequestParam String figure, @RequestParam int sizeA, @RequestParam int sizeB,@RequestParam(required = false) Integer sizeC){
        if(figure.equalsIgnoreCase("RECTANGLE")){
            return 2*sizeA+2*sizeB;
        }
        else if(figure.equalsIgnoreCase("TRiANGLE")){
            return sizeA +sizeB +sizeC;
        }

        return -1;
    }

}
