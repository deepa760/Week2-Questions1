import java.util.*;
public class Indexing {

            public static int indexOf(int array[], int t)
            {
                // if array is Null
                if (array == null) {
                    return -1;
                }
                int len = array.length;
                int i = 0;

                // traverse in the array
                while (i < len) {

                        if (array[i] == t) {
                        return i;
                    }
                    else {
                        i = i + 1;
                    }
                }
                return -1;
            }

            public static void main(String[] args)
            {
                int[] a = { 5, 4, 6, 1, 3, 2, 7, 8, 9 };

                // find the index of 5
                System.out.println("Index position of 2 is: "
                        + indexOf(a,2));


            }
        }





