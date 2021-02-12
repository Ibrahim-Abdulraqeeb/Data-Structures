public class Scores {

        public static final int maxEntries = 10;
        protected int numEntries;
        protected Pr[] entries;
        public Scores() {
            entries = new Pr[maxEntries];
            numEntries = 0;
        }
        public String toString() {
            String s = "[";
            for (int i = 0; i < numEntries; i++) {
                if (i > 0) s += ", ";
                s += entries[i];
            }
            return s + "]";
        }
    public void add(Pr e) {
        int newScore = e.getScore();
        if (numEntries == maxEntries) {
            if (newScore <= entries[numEntries-1].getScore())
                return;
        }
        else
            numEntries++;
        int i = numEntries-1;
        for ( ; (i >= 1) && (newScore > entries[i-1].getScore()); i--)
            entries[i] = entries[i - 1];

        entries[i] = e;
    }
    public Pr remove(int i) throws IndexOutOfBoundsException {
        if ((i < 0) || (i >= numEntries))
            throw new IndexOutOfBoundsException( "Invalid index: " + i);
        Pr temp = entries[i];
        for (int j = i; j < numEntries - 1; j++)
            entries[j] = entries[j+1];
        entries[numEntries -1 ] = null;
        numEntries--;
        return temp;
    }
    public static void insertionSort(char[] a) {
        int n = a.length;
        for (int i = 1; i < n; i++) {
            char cur = a[i];
            int j = i - 1;
            while ((j >= 0) && (a[j] > cur))
                a[j + 1] = a[j--];
            a[j + 1]=cur;
        }
    }
    }

