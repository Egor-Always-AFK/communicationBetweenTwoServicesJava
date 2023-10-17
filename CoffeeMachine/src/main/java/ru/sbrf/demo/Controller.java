package ru.sbrf.demo;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
@RequestMapping("/coffeemachine")
public class Controller {
    @PostMapping("/getCoffee")
    public CoffeeMachineRs getCoffee(@RequestBody CoffeeMachineRq coffeeMachineRq) {
        System.out.println(coffeeMachineRq);
        CoffeeMachineRs coffeeCup = new CoffeeMachineRs();
        coffeeCup.setTypeOfCoffee(coffeeMachineRq.getAdditionalProperties().get("typeOfCoffee").toString());
        coffeeCup.setVolume(coffeeMachineRq.getAdditionalProperties().get("volume").toString());
        coffeeCup.setDegreeOfGrinding(coffeeMachineRq.getAdditionalProperties().get("degreeOfGrinding").toString());
        coffeeCup.setHasMilkBeenAdded(new Random().nextBoolean());
        return coffeeCup;
    }
}
