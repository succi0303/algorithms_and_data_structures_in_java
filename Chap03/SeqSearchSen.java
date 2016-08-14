class SeqSearchSen {
    static int seqSearchSen(int[] a, int n, int key) {
        int i = 0;

        a[n] = key;

        while (true) {
            if (a[i] == key)
                break;
            i++;
        }

        return i == n ? -1 : i;
    }
}
