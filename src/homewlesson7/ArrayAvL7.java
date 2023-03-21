package homewlesson7;

public class ArrayAvL7 {
    public static void main(String[] args) {
        int[] ranArray = new int[3];
        System.out.println("The array is: ");
        for (int i = 0; i < ranArray.length; i++) {
            ranArray[i] = (int) (Math.random() * 99 + 1);
        }
        for (int i = 0; i < ranArray.length; i++) {

            System.out.print(" " + ranArray[i]);
        }
        System.out.println();
        int sum = 0;
        int i;
        for (i = 0; i < ranArray.length; i++) sum += ranArray[i];
        int avg = sum / 3;
//
        int index=0;
        int distance = Math.abs(ranArray[0] -avg);
        for (i=0; i < ranArray.length; i++){
            int idistance = Math.abs(ranArray[i] - avg);
            if (idistance < distance) {
                index =i;
                distance = idistance;

            }
        }
        System.out.println("The element closest to average is: ");
        System.out.println(ranArray[index]);


        }



    }




