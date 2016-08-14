class Hanoi {
    static void move(int no, int x, int y) {
        if (no > 1)
            move(no - 1, x, 6 - x - y);

        if (no > 1)
            move(no - 1, 6 - x -y, y);
    }
}
