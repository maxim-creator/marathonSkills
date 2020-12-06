package ru.marathonSkills.DAO;

import org.springframework.stereotype.Component;
import ru.marathonSkills.Models.Runner;

import java.util.*;

@Component
public class RunnerDAO {

    private int id=1;
    List<Runner> runners;
    {
      runners = new ArrayList<>();
      Calendar calendar = new GregorianCalendar(2000,11,11);
      runners.add(new Runner(0,"ivan", "ivanovich", "mail@mail.ru",
              "12.12.2001", "1"));
    }

    public void addRunner(Runner runner){
        runner.setId(id++);
        runners.add(runner);
    }

    public Runner getRunner(int id){
        return runners.get(id);
    }

}
