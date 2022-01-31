public class ex36 {
    public static int search(Integer n, Integer[] list){
        int index =-1;
        for (int i = 0; i < list.length; i++){
            if (list[i].equals(n)){
                index = i;
                break;
            }
        }
        return index;
    }
    public static void main(String[] args){
        Integer find = 10;
        Integer[] vector = {2, 3, 4, 5, 6, 7, 8, 9, 10, 10};
        int found = search(find, vector);
        System.out.println(found);
    }
    
}