// get an array of elements from enum JavaRushQuest
// print out indexes of each element

import java.util.ArrayList;
import java.util.Collections;

public class SolutionLvl14L6v1 {
    public static void main(String[] args) {

        JavaRushQuest[] values = JavaRushQuest.values();
        for (JavaRushQuest value : values) {
            System.out.println(value.ordinal());
        }

        // using ArrayList type of enum Object
        ArrayList<JavaRushQuest> list = new ArrayList<>();
        Collections.addAll(list, JavaRushQuest.values());
        for (JavaRushQuest line : list) {
            System.out.println(line.ordinal() + " : " + line );
        }
    }
}

enum JavaRushQuest {
    JAVA_SYNTAX,
    JAVA_CORE,
    JAVA_MULTITHREADING,
    JAVA_COLLECTIONS,
    CS_50,
    ANDROID,
    GAMES
}
