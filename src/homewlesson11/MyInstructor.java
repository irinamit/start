package homewlesson11;

public class MyInstructor {
    String[] instructorName = {
            "Tom Hanks",
            "Joe Dale",
            "Ann Laws",
            "Bob Lane",
            "Mary Fitz"
    };
    String[] sports = {
            "tennis",
            "swimming",
            "wrestling",
            "soccer",
            "table tennis"
    };


    void instructorSports (){
        for (int i=0; i <instructorName.length; i++) {
            System.out.println(instructorName[i] + " is instructor of " + sports[i]);
        }

    }

}
