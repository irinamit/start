package homewlesson11;

public class Queue2 {
    private char q[];
    private int putloc, getloc;

    Queue2(int size) {
        q = new char[size + 1];
        putloc = getloc = 0;
    }

    Queue2(Queue2 ob) {
        putloc = ob.putloc;
        getloc = ob.getloc;
        q = new char[ob.q.length];

        for (int i = getloc + 1; i <= putloc; i++)
            q[i] = ob.q[i];
    }

    Queue2(char a[]) {
        putloc = 0;
        getloc = 0;
        q = new char[a.length + 1];

        for (int i = 0; i < a.length; i++) put(a[i]);
    }

    void put(char ch) {
        if (putloc == q.length - 1) {
            System.out.println(" - the queue is filled in");
            return;
        }
        putloc++;
        q[putloc] = ch;

    }
    char get() {
        if (getloc == putloc) {
            System.out.println(" = the queue is empty");
            return (char) 0;

        }
        getloc++;
        return q[getloc];
    }

}

