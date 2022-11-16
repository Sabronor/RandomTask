package CelebritySearch;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CelebrityFind {
    public static void main(String[] args) {
        List<Person> personList = generatePersons();
        shufflePersons(personList);


    }

    public static List<Person> generatePersons(){
        List<Person> randomPersonList = new ArrayList<>();

        for(int i = 0; i < 10; i++){
            randomPersonList.add(new Person(String.format("Person%d", i)));
        }

        return randomPersonList;
    }
    public static void shufflePersons(List<Person> personList){
        Random random = new Random();
        for(Person i : personList){
            int familiars = random.nextInt(0, personList.size());

            for (int b = 0; b < familiars; b++){
                int index = random.nextInt(0, personList.size());
                if(index != personList.indexOf(i)){
                    i.addFamiliar(personList.get(index));
                }
            }
        }
    }
}
