class ShellSort2 {
    static void shellSort(int[] a, int n) {
        int h;
        for (h = 1; h < n / 9; h = h * 3 + 1)
            ;
        for ( ; h > 0; h /= 3)
            for (int i = h; i < n; i++) {
                int j;
                int tmp = a[i];
                for (j = i -h; j >= 0 && a[j] > tmp; j -= h)
                    a[j + h] = a[j];
                a[j + h] = tmp;
            }
    }
}
