import java.util.ArrayList;

public class Day_6_exercise {
    public static void main(String[] args){

        /*1.Write a Java program to test if the first and the last element of an array of
        integers are same. The length of the array must be greater than or equal to 2*/
        ArrayList <Integer> list_1 = new ArrayList <>();
        list_1.add(50);
        list_1.add(-20);
        list_1.add(0);
        list_1.add(30);
        list_1.add(40);
        list_1.add(60);
        list_1.add(50);
        boolean is_equals = false;
        if (list_1.get(0) == list_1.get(list_1.size()-1)){
            is_equals = true;
        }
        System.out.println(is_equals);
        System.out.println("******************************************************");


        /*2.Write a Java program to find the numbers greater than the average of the
        numbers of a given array.*/
        ArrayList <Integer> list_2 = new ArrayList <>();
        ArrayList <Integer> list_3 = new ArrayList <>();
        list_2.add(1);
        list_2.add(4);
        list_2.add(17);
        list_2.add(7);
        list_2.add(25);
        list_2.add(3);
        list_2.add(100);
        int sum = 0;
        int average = 0 ;
        for (Integer i : list_2) {
            sum += i;
        }
        average = sum / list_2.size();
        for (Integer i : list_2) {
            if (i>average){
                list_3.add(i);
            }
        }
        System.out.println("The average is: " + average);
        System.out.println("numbers greater than average : " + list_3);
        System.out.println("******************************************************");


        /*3.Write a Java program to get the larger value between first and last
        element of an array of integers.*/
        ArrayList <Integer> list_4 = new ArrayList <>();
        list_4.add(1);
        list_4.add(4);
        list_4.add(17);
        list_4.add(7);
        list_4.add(25);
        int larger = 0 ;
        for (int i = 1 ; i < list_4.size()-1 ; i++) {
            if (list_4.get(i)>larger){
                larger = list_4.get(i);
            }
        }
        System.out.println("The larger number is: " + larger);
        System.out.println("******************************************************");

        /*4.Write a Java program to swap the first and last elements of an array and
        create a new array.*/
        ArrayList <Integer> list_5 = new ArrayList <>();
        ArrayList <Integer> list_6 = new ArrayList <>();
        list_5.add(18);
        list_5.add(42);
        list_5.add(55);
        list_5.add(9);
        int temp = list_5.get(list_5.size()-1);
        list_5.set(list_5.size()-1 , list_5.get(0));
        list_5.set(0 , temp);
        list_6.addAll(list_5);
        System.out.println(list_6);
        System.out.println("******************************************************");

        /*5. Write a program that places the odd elements of an array before the
        even elements.*/
        ArrayList<Integer> list_7 = new ArrayList <>();
        list_7.add(1);
        list_7.add(4);
        list_7.add(17);
        list_7.add(7);
        list_7.add(20);
        int temp_2 = 0 ;
        for (int i = 0 ; i < list_7.size() ; i++) {
            if (list_7.get(i) % 2 != 0 ){
                for (int j = 0 ; j < list_7.size() ; j++) {
                    if (list_7.get(j) % 2 == 0){
                        temp_2 = list_7.get(j);
                        list_7.set(j, list_7.get(i));
                        list_7.set(i , temp_2);
                    }
                }
            }
        }
        System.out.println(list_7);
        System.out.println("******************************************************");

        //6. Write a program that test the equality of two arrays.
        ArrayList <Integer> list_8 = new ArrayList <>();
        ArrayList <Integer> list_9 = new ArrayList <>();
        list_8.add(25);
        list_8.add(3);
        list_8.add(100);
        list_8.add(8);
        list_9.add(25);
        list_9.add(3);
        list_9.add(100);
        list_9.add(8);
        boolean is_equals_2 = true ;
        if (list_8.size()==list_9.size()){
            for (int i = 0 ; i<list_8.size() ; i++){
                if (list_8.get(i)!=list_9.get(i)){
                    is_equals_2 = false;
                    break;
                }
            }
        }else {
            is_equals_2 = false;
        }
        System.out.println(is_equals_2);








    }
}
