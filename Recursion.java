public class Recursion{
    //Q1. Print numbers from n to 1 (Decreasing order)
    public static void PrintDec(int n){
        if(n == 1){
            System.out.println(n);
            return;
        }
        System.out.print(n+" ");
        PrintDec(n -1);
    }

    //Q2. Print numbers from 1 to n (Increasing order)
    public static void PrintInc(int n){
        if(n == 1){
            System.out.print(n+" ");
            return;
        }
        PrintInc(n-1);
        System.out.print(n+" ");
    }

    //Q3. Print factorial of a number n
    public static int Factorial(int n){
        if(n == 0 || n == 1){
            return 1;
        }
        return n * Factorial(n-1);
    }

    //Q4. Print sum of first n natural numbers
    public static int calcSum(int n){
        if(n == 1){
            return 1;
        }
        int snm1 = calcSum(n -1);
        int sn = n + snm1;
        return sn;
    }

    //Q5. Print Nth fibonacci number
    public static int Fibonacci(int n){
        if(n == 0 || n == 1){
            return n;
        }
        int fnm1 = Fibonacci(n - 1);
        int fnm2 = Fibonacci(n - 2);
        int fn = fnm2 + fnm1;
        return fn;
    }

    //Q6. Check if a given array is sorted or not
    public static boolean isSorted(int arr[], int i){
        if(i == arr.length - 1){
            return true;
        }
        if(arr[i] > arr[i + 1]){
            return false;
        }
        return isSorted(arr, i+1);
    }

    //Q7. WAF to find first occurence of an element in an array
    public static int firstOccurence(int arr[], int key, int i){
        if(i == arr.length){
            return -1;
        }
        if(arr[i] == key){
            return i;
        }
        return firstOccurence(arr, key, i+1);
    }

    //Q8. WAF to find the last occurence of an element in an array
    public static int lastOccurence(int arr[], int key, int i){
        if(i == arr.length){
            return -1;
        }
        int isFound = lastOccurence(arr, key, i+1);
        if(isFound == -1 && arr[i] == key){
            return i;
        }
        return isFound;
    }

    //Q9. Print x^n
    public static int power(int x, int n){
        if(n == 0){
            return 1;
        }
        return x * power(x, n-1);
    }

    //Q10. Print x^n in O(log n)
    public static int optimizedPower(int a, int n){
        if(n == 0){
            return 1;
        }

        int halfPower = optimizedPower(a, n/2);
        //int halfPowerSq = optimizedPower(a, n/2) * optimizedPower(a, n/2);
        int halfPowerSq = halfPower * halfPower;

        if(n%2 != 0){
            halfPowerSq = a * halfPowerSq;
        }
        return halfPowerSq;
    }

    //Q11. Tilling on a floor - Problem
    public static int tillingProblem(int n){
        //Base case
        if(n == 1 || n == 0){
            return 1;
        }

        int fnm1 = tillingProblem(n - 1);
        int fnm2 = tillingProblem(n - 2);
        return fnm1 + fnm2;
    }

    //Q12. Remove duplicates in a string
    public static void removeDuplicates(String str, int idx, StringBuilder newString, boolean map[]){
        //base case
        if(idx == str.length()){
            System.out.println(newString);
            return;
        }

        //kaam
        char currChar = str.charAt(idx);
        if(map[currChar - 'a'] == true){
            removeDuplicates(str, idx + 1, newString, map);
        }
        else{
            map[currChar - 'a'] = true;
            removeDuplicates(str, idx+1, newString.append(currChar), map);
        }
    }

    // public static StringBuilder removeDuplicates(String str, int idx, StringBuilder newString, boolean map[]){
    //     //base case
    //     if(idx == str.length()){
    //         return newString;
    //     }

    //     //kaam
    //     char currChar = str.charAt(idx);
    //     if(map[currChar - 'a'] == true){
    //         return removeDuplicates(str, idx + 1, newString, map);
    //     }
    //     else{
    //         map[currChar - 'a'] = true;
    //         return removeDuplicates(str, idx+1, newString.append(currChar), map);
    //     }
    // }

    //Q13. Friends pairing problem
    /* 
    Given n friends, each one can remain single or can be paired up with some other friend. Each friend can be paired only once. Find out the total number of ways in which friends can remain single or can be paired up.
    */
    public static int friendsPairing(int n){
        // if(n == 1 || n == 2){
        //     return n;
        // }
        // return friendsPairing(n - 1) + (friendsPairing(n - 2) * (n - 1));

        //base case
        if(n == 1 || n == 2){
            return n;
        }

        //choice - Single
        int fnm1 = friendsPairing(n - 1);

        //choice - Pair
        int fnm2 = friendsPairing(n -2);
        int pairways = (n - 1) * fnm2;

        //total ways
        int totalWays = fnm1 + pairways;
        return totalWays;

    }

    //Q14. Binary Strings Problem - Print all binary strings of size N without consecutive ones i.e. "1"
    public static void printBinaryStrings(int n, int lastPlace, String str){
        //Base case
        if(n == 0){
            System.out.println(str);
            return;
        }

        //Kaam
        printBinaryStrings(n - 1, 0, str+"0");
        if(lastPlace == 0){
            printBinaryStrings(n - 1, 1, str+"1");
        }
    }

    public static void main(String[] args) {
        //int n = 10;
        //PrintDec(n);
        //PrintInc(n);
        //System.out.println(Factorial(n));
        //System.out.println(calcSum(n));
        //System.out.println(Fibonacci(3));

        //int i = 0;
        //int arr1[] = {1,2,3,4,5,6,7};
        //int arr2[] = {1,2,3,4,5,7,6};
        // int key = 5;

        // System.out.println(isSorted(arr1, i));
        // System.out.println(isSorted(arr2, i));
        //System.out.println(firstOccurence(arr2, key,0));
        // int arr[] = {5,5,5,5,5};
        // System.out.println(lastOccurence(arr, key, 0));
        
        // int a = 5;
        // int n = 3;
        // System.out.println(power(a, n));

        //System.out.println(tillingProblem(8));

        // String str = "aapnacoollege";
        // int idx = 0;
        // StringBuilder newString = new StringBuilder("");
        // boolean map[] = new boolean[26];
        // removeDuplicates(str, idx, newString, map);

        // String str = "aapnacoollege";
        // int idx = 0;
        // StringBuilder newString = new StringBuilder("");
        // boolean map[] = new boolean[26];
        // System.out.println(removeDuplicates(str, idx, newString, map));

        // int n = 3;
        // System.out.println(friendsPairing(n));

        int n = 5;
        int lastPlace = 0;
        String str = "";
        printBinaryStrings(n, lastPlace, str);
    }
}