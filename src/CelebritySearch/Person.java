package CelebritySearch;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private final String name;
    private final List<Person> familiar;

    public Person(String name){
        this.name = name;
        this.familiar = new ArrayList<>();
    }

    public void addFamiliar(Person person){
        if(!familiar.contains(person)){
            familiar.add(person);
        }
    }

    public String getName(){return name;}

    public boolean doYouKnowHim(Person person){
        return familiar.contains(person);
    }
}
