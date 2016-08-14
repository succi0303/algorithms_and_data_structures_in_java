class Partition {
    static void swap(int[] a, int idx1, int idx2) {
        int t = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = t;
    }

    static void partition(int[] a, int n) {
        int pl = 0;
        int pr = n - 1;
        int x = a[n / 2];

        do {
            while (a[pl] < x) pl++;
            while (a[pr] > x) pr--;
            if (pl <= pr)
                swap(a, pl++, pr--);
        } while (pl <= pr);

        System.out.println("pivotの値は" + x + "です。");

        System.out.println("pivot以下のグループ");
        for (int i = 0; i <= pl - 1; i++)
            System.out.print(a[i] + " ");
        System.out.println();

        if (pl > pr + 1) {
            System.out.println("pivotと一致するグループ");
            for (int i = pr + 1; i <= pl - 1; i++)
                System.out.print(a[i] + " ");
            System.out.println();
        }

        System.out.println("pivot以上のグループ");
        for (int i = pr + 1; i < n; i++)
            System.out.print(a[i] + " ");
        System.out.println();
    }
}
