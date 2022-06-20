import java.util.ArrayList;

public class NumberOfRepetitions {
    ArrayList<String> arrUnique = new ArrayList<>();
    ArrayList<Integer> arrCount = new ArrayList<>();
    ArrayList<String> arrUnique2 = new ArrayList<>();


    public void countElements() {
        for (int i = 0; i < arrCount.toArray().length; i++) {
            System.out.println(arrUnique.toArray()[i] + " " + arrCount.toArray()[i].toString() + " раз(а)");
        }
    }
    public void push(String str, int count) {
        arrUnique.add(str);
        arrCount.add(count);
    }
    public void has(String str, int count) {
        if(!arrUnique.contains(str)){
            this.push(str, count);

        }

    }
    public void addUnique(String str) {
        arrUnique2.add(str);

    }
    public void get() {
        System.out.println("Список уникальных слов: " + arrUnique2);
    }
}
