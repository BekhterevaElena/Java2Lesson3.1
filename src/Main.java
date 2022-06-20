import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        //ArrayList<String> arrUnique = new ArrayList<>();
        NumberOfRepetitions numberOfRepetitions = new NumberOfRepetitions();
        String arr[] = {"cat", "dog", "red", "green", "house", "one", "two", "dog", "red", "umbrella"};
        //String arrUnique[] = {};
        int count =0;
        for (int i=0; i < arr.length; i++) {

            for (int g=0; g < arr.length; g++) {
                if (arr[i] == arr[g]) {
                    count++;
                }

            }
            if (count == 1) {
                numberOfRepetitions.push(arr[i],count);
                numberOfRepetitions.addUnique(arr[i]);
            }
            numberOfRepetitions.has(arr[i], count);
            count = 0;
        }
        numberOfRepetitions.countElements();
        numberOfRepetitions.get();
    }
}