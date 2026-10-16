void outer(int i, int n, int m) {
    if (i == n) return;
    inner(i, 0, m);
    outer(i + 1, n, m);
}

void inner(int i, int j, int m) {
    if (j == m) return;
    System.out.println(i + ", " + j);
    inner(i, j + 1, m);
}
