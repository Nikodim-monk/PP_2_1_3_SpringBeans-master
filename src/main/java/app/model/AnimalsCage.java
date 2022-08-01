package app.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class AnimalsCage {

    @Autowired
    @Qualifier("dog")
    private Animal animal;
    @Autowired
    private Timer timer;

    public void whatAnimalSay() {
        System.out.print("Say:");
        System.out.print(animal.toString());
        System.out.print("At:");
        System.out.print(timer.getTime());
//        System.out.println("________________________");
    }

    public Timer getTimer() {
        return timer;
    }

}
