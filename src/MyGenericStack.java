import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MyGenericStack<T> {
    Scanner sc = new Scanner(System.in);
    public List<Integer> stack;



    public MyGenericStack() {
        stack = new ArrayList<>();
    }

    public void addElement(){
        System.out.println("nhập số lượng phần tử");
        int num = sc.nextInt();
        for(int i =0;i<num;i++){
            System.out.println("nhập giá trị cho phần tử thứ "+(i+1));
            stack.add(sc.nextInt());
        }
    }
    public void reverseList(){
        List<Integer> temp= new ArrayList<>();
        for(int i=0;i<stack.size();i++){
            temp.add(stack.get(stack.size()-1-i));
        }
        stack = temp;
    }
    public void printList() {
        for(int e: stack){
            System.out.println(e);
        }
    }
}