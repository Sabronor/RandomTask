package CelebritySearch;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
/*
Task
In a party of N people, only one person is known to everyone. Such a person may be present in the party, if yes,
(s)he doesn’t know anyone in the party. We can only ask questions like “does A know B? “.
Find the celebrity.
 */
public class CelebrityFind {
    public static void main(String[] args) {
        Person celeb = null;
        int i;

        for (i = 0; celeb == null; i++){
            List<Person> personList = generatePersons(10);
            shufflePersons(personList);

            celeb = findCeleb(personList);
        }

        System.out.printf("iteration %d : %s", i, celeb.getName());
    }

    public static Person findCeleb(List<Person> personList){
        int firstPersonIndex = 0;
        int lastPersonIndex = personList.size() - 1;

        while (firstPersonIndex != lastPersonIndex){

            Person first = personList.get(firstPersonIndex);
            Person last = personList.get(lastPersonIndex);

            if(first.doYouKnowHim(last)) firstPersonIndex++;
            else lastPersonIndex--;
        }

        Person celeb = personList.get(firstPersonIndex);


        for(Person i : personList){
            if(celeb != i){
                if(!i.doYouKnowHim(celeb)) return null;
                if(celeb.doYouKnowHim(i)) return null;
            }
        }

        return celeb;
    }
    public static List<Person> generatePersons(int n){
        List<Person> randomPersonList = new ArrayList<>();

        for(int i = 0; i < n; i++){
            randomPersonList.add(new Person(String.format("Person%d", i)));
        }

        return randomPersonList;
    }
    public static void shufflePersons(List<Person> personList){
        Random random = new Random();
        for(Person i : personList){
            int familiars = random.nextInt(0, personList.size());

            for (int index, b = 0; b < familiars; b++){
                index = random.nextInt(0, personList.size());

                if(index != personList.indexOf(i)){
                    i.addFamiliar(personList.get(index));
                }
            }
        }
    }
}
