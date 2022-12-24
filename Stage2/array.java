package Stage2;

import java.util.Arrays;

class array {
    public static void main(String[] args) {
        int [] setNumber = new int[20];
        for (int i = 0; i < 20; i++) {
            setNumber[i] = i;
        }
        System.out.println(Arrays.toString(setNumber));

        String [] animals = {"Cat" , "Dog" , "Fish"};
        System.out.println(Arrays.toString(animals));
        

        int [][] array2d = {{0,1} , {0,1}};

        System.out.println(Arrays.deepToString(array2d));
    }
    
    
}
