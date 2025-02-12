class Main {
    static void modify(int num, int[] arr) {
        num = num + 2;
        arr[0] = arr[0] + 2;
        System.out.println("Number: "+num);
        System.out.println("Array: ");
        for (int i:arr){
            System.out.println(i+" ");
        }
    }

    public static void main(String[] args) {
        int number = 20;
        int[] array = {30, 40, 50};

        System.out.println("Before modification:");
        System.out.println("Number: " + number);
        System.out.print("Array: ");
        for (int j : array) {
            System.out.print(j + " ");
        }
        System.out.println();

        modify(number, array);

    }
}
