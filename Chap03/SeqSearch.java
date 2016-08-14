class SeqSearch {
    static int seqSearch(int[] a, int n, int key) {
        int i = 0;

        while (true) {
            if (i == n)
                return -1;
            if (a[i] == key)
                return i;
            i++;
        }
    }
}
