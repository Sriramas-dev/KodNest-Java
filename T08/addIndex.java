
public class addIndex {
    public static void main(String[] args) {
        int arr[] = { 10, 20, 40, 50 };
        int newarr[] = new int[arr.length - 1];
        int index = 2;
        for (int i = 0; i < index; i++) {
            newarr[i] = arr[i];
        }
        for (int i = 0; i < newarr.length; i++) {
            newarr[i] = arr[i + 1];
        }
        for (int i = 0; i < newarr.length; i++) {
            System.out.print(newarr[i] + " ");
        }

    }

}