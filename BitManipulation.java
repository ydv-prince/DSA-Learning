public class BitManipulation {

    //Even or Odd = First bit is 1 or 0
    public static void EvenOrOdd(int num){
        int bitMask = 1;
        if((bitMask & num) == 1){
            System.out.println("Odd");;
        }
        else{
            System.out.println("Even");
        }
    }

    //Get ith bit of a number
    public static int getIthBit(int num, int i){
        int bitMask = 1 << i;
        if((bitMask & num) == 0){
            return 0;
        }else{
            return 1;
        }
    }

    //Set ith bit of a number
    public static int setIthBit(int num, int i){
        int bitMask = 1 << i;
        return num | bitMask;
    }

    //Clear ith bit of a number
    public static int clearIthBit(int num, int i){
        int bitMask = ~(1 << i);
        return bitMask & num;
    }

    //Update ith bit of a number
    public static int updateIthBit(int num, int i, int newBit){
        if(newBit == 0){
            return clearIthBit(num, i);
        }
        else{
            return setIthBit(num, i);
        }
    }

    //Clear i number of bits
    public static int clearIBit(int num, int i){
        int bitMask = -1 << i;
        return bitMask & num;
    }

    //Clear bits in range of i to j
    public static int clearBitsInRange(int num, int i, int j){
        int a = ((~0) << (j + 1));
        int b = (1 << i) - 1;
        int bitMask = a | b;
        return bitMask & num;
    }

    //Q2. Check is power of 2
    public static boolean isPowerOfTwo(int n){
        return (n & (n-1)) == 0;
    }

    //Q3. Count set bits in a number
    public static int countSetBits(int num){
        int count = 0;
        while(num > 0){
            if((num & 1) != 0){
                count++;
            }
            num = num >> 1;
        }
        return count;
    }

    //Fast Exponentation
    public static int fastExpo(int a, int n){
    int ans = 1;
    while(n > 0){
        if((n & 1) != 0){
            ans = ans * a;
        }
        a = a * a;
        n = n >> 1;
        }
        return ans;
    }

    public static void main(String[] args) {
        // System.out.println(10 & 6); //AND - Search for 0
        // System.out.println(5 | 7);  //OR - Search for 1
        // System.out.println(5 ^ 6);  //XOR - different = 1, Same = 0
        // System.out.println(~5);     //NOT - 0 = 1, 1 = 0
        // System.out.println(5 << 2); //Left-Shift = a*2^b
        // System.out.println(2 >> 5); //Right-Shift = a/2^b

        // int num = 45;
        // EvenOrOdd(num);

        // System.out.println(getIthBit(10, 3));

        // System.out.println(setIthBit(10, 2));

        // System.out.println(clearIthBit(10, 3));

        //System.out.println(updateIthBit(10, 3, 1));

        // System.out.println(clearIBit(15, 2));

        // System.out.println(clearBitsInRange(10, 2, 4));

        // System.out.println(isPowerOfTwo(15));

        // System.out.println(countSetBits(15));

        // System.out.println(fastExpo(3, 3));
    }
}
