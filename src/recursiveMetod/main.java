package recursiveMetod;

class Main {

    public static void main(String[] args) {
        // Senaryo 1
        System.out.println("Senaryo 1:");
        operateRecursive(16, 5);
        System.out.println();

        // Senaryo 2
        System.out.println("Senaryo 2:");
        operateRecursive(10, 5);
        System.out.println();

        // Senaryo 3
        System.out.println("Senaryo 3:");
        operateRecursive(25, 5);
        System.out.println();

        // Senaryo 4
        System.out.println("Senaryo 4:");
        operateRecursive(5, 5);
        System.out.println();
    }

    public static void operateRecursive(int n, int step) {
        if (n <= 0) {
            System.out.print("0 ");
            return;
        }

        System.out.print(n + " ");
        operateRecursive(n - step, step);
        System.out.print(n + " ");
    }
}

