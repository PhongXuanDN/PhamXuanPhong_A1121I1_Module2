package Ss11.StackQueue.BaiTap;

public class DaoNguocStackClient {
    public static void main(String[] args) {
        int[] array ={1,2,3,4,5,6};
        DaoNguocStack<Integer> stack = new DaoNguocStack<>();
        for(int i = 0;i<array.length;i++){
            stack.push(array[i]);
        }
        for (int i =0;i<array.length;i++){
            array[i] = stack.pop();
        }
        for (int i =0;i<array.length;i++){
            System.out.println("array["+i+"]= "+array[i]);
        }

        String chuoi = "Day la chuoi";
        String[] s1 = chuoi.split("\\s");
        DaoNguocStack<String> stack1 = new DaoNguocStack<>();
        for (int i =0; i<s1.length;i++){
            stack1.push(s1[i]);
        }
        for (int i =0;i<s1.length;i++){
            s1[i] = stack1.pop();
        }
        for (int i =0;i<s1.length;i++){
            System.out.print(s1[i]+" ");
        }

    }
}
