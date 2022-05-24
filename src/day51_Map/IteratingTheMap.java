package day51_Map;

import java.util.*;

public class IteratingTheMap {

    public static void main(String[] args) {

        Map<String, Integer> students = new HashMap<>();
        students.put("Aygun", 95);
        students.put("Maria", 90);
        students.put("Ali",85);
        students.put("Alex",80);
        students.put("Ozan",99);
        students.put("Serkan",70);
        students.put("Andriy",98);

/*
        Set<String> keys = students.keySet();
        for (String eachKey : keys) {
            System.out.println(eachKey +" : " + students.get(eachKey));//we can get keys values through get method
            students.replace(eachKey, students.get(eachKey) + 5);
        }

 */

        System.out.println(students);

        Map<String, Integer> earlyBirds = new HashMap<>(); // score >= 90
        Map<String, Integer> angryBirds = new HashMap<>(); // score < 90

        for (String key : students.keySet()) {//keySet() returns all the keys of the map return type is Set
            Integer value = students.get(key);//get() method returns the values
            if(value >= 90){
                earlyBirds.put(key, value);
            }else{
                angryBirds.put(key, value);
            }
        }


        System.out.println("earlyBirds = " + earlyBirds);
        System.out.println("angryBirds = " + angryBirds);


        Set<String> names = students.keySet();

        System.out.println(names);//[Alex, Andriy, Aygun, Maria, Ozan, Serkan, Ali]

        System.out.println("--------------------------------------------------------");

       // Collection<Integer> scores = students.values();//values() returns all the values of the map, return type is Collection

        List<Integer> scores = new ArrayList<>(students.values());

        System.out.println(scores);//[80, 98, 95, 90, 99, 70, 85]

        for (Integer value : students.values()) {

            System.out.println(value);//80, 98, 95, 90, 99, 70, 85
            
        }
        System.out.println("--------------------------------------------------------");

        int maxScore = Integer.MIN_VALUE;
        int minScore = Integer.MAX_VALUE;

        for (Integer score : students.values()) {

            if(score>maxScore){

                maxScore=score;
            }

            if(score<minScore){

                minScore = score;
            }
            
        }

        System.out.println("maxScore = " + maxScore);
        System.out.println("minScore = " + minScore);

        System.out.println("--------------------------------------------------------");

        //another way

        int max = Collections.max(students.values());
        int min = Collections.min(students.values());

        System.out.println("max = " + max);//99
        System.out.println("min = " + min);//70

        System.out.println("--------------------------------------------------------");

        // how many students has the score of 95 or greater

        int count = 0;


        for (Integer eachScore : students.values()) {
            if(eachScore >= 95){
                count++;
            }
        }

    /*
        for (String eachKey : students.keySet()) {
            Integer eachScore = students.get(eachKey);
            if(eachScore >= 95){
                count++;
            }
        }
*/
        System.out.println(count);


        System.out.println("--------------------------------------------------------");

        for (Map.Entry<String, Integer> entry : students.entrySet()) {
            //System.out.println(entry);
            System.out.println(entry.getKey() +" : " +entry.getValue());//We can get the key and value seperately
        }

















    }
}
