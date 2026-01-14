class First {
    String name;

    public First() {
        name = "Prince";
    }
    public static void print(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // First first = new First();
        // System.out.println("Hello, " + first.name);

        int letterFrequency[] = new int[26];
        print(letterFrequency);
        int currentIndex = 's' - 'a';
        letterFrequency[currentIndex]++;
        print(letterFrequency);
    }
}
