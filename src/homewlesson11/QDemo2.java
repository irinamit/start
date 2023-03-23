package homewlesson11;

public class QDemo2 {
    public static void main(String[] args) {
        Queue2 q1 = new Queue2(10);

        char name[] = {'T', 'o', 'm'};
        Queue2 q2 = new Queue2(name);

        char ch;
        int i;

        for (i = 0; i < 10; i++)
            q1.put((char) ('A' + i));

        Queue2 q3 = new Queue2 (q1);
        System.out.print("Content of q1: ");
        for (i = 0; i < 10; i++) {
            ch = q1.get();
            System.out.print(ch);

        }
        System.out.print("\n");
        System.out.print("Content of q2: ");
        for (i = 0; i < 3; i++) {
            ch = q2.get();
            System.out.print(ch);
        }
        System.out.println("\n");
        System.out.print("Content of q3: ");
        for (i = 0; i < 10; i++) {
            ch = q3.get();
            System.out.print(ch);
        }
    }

    }

//        Queue bigQ = new Queue(100);
//        Queue smallQ = new Queue(4);
//        char ch;
//        int i;
//        System.out.println("Использование очереди bigQ для сохранения алфавита");
//        for (i=0; i<26; i++)
//            bigQ.put((char) ('A' + i));
//        System.out.print("Содержимое очереди bigQ:");
//        for (i=0; i<26; i++) {
//            ch = bigQ.get();
//            if (ch!=(char)0) System.out.print(ch);
//        }
//        System.out.println("\n");
//        System.out.println("Исполдьзование очереди smallQ для генерации ошибок");
//        for (i=0; i<5; i++){
//            System.out.println("попытка сохранения " + (char) ('Z'-i));
//            smallQ.put((char) ('Z' - i));
//            System.out.println();
//        }
//        System.out.println();

//        System.out.print("содержимое smallQ: ");
//        for (i=0; i<5; i++) {
//            ch = smallQ.get();
//            if (ch!=(char)0) System.out.print(ch);
//        }
//
//
//    }
//}
