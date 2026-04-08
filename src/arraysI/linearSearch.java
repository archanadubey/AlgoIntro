package arraysI;

public class linearSearch{

    public static int searchItem(int items[],int  tem) {

        for (int i = 0; i < items.length; i++) {
            if (items[i] == tem) {
               return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        int items [] = {1,5,10,15,20};
        int item = 5;
     int index =    searchItem(items, item);

        if(index == -1){
            System.out.println("Not Found "+ index);
        }else
            System.out.println("Found Item at : "+ index);
    }
}



