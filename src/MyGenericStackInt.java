import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MyGenericStack<T> {
    Scanner sc = new Scanner(System.in);
    public List<Integer> Istack;
    public List<String> Sstack;



    public MyGenericStack() {
        Istack = new ArrayList<>();
    }

    public void addElementInt(){
        System.out.println("nhập số lượng phần tử");
        int num = sc.nextInt();
        for(int i =0;i<num;i++){
            System.out.println("nhập giá trị cho phần tử thứ "+(i+1));
            Istack.add(sc.nextInt());
        }
    }
    public void addElementStr(){
        System.out.println("nhập số lượng phần tử");
        String str = sc.nextLine();
        for(int i =0;i<str.length();i++){
            System.out.println("nhập giá trị cho phần tử thứ "+(i+1));
            Sstack.add(sc.nextLine());
        }
    }
    public void reverseList(){
        List<Integer> temp= new ArrayList<>();
        for(int i=0;i<Istack.size();i++){
            temp.add(Istack.get(Istack.size()-1-i));
        }
        Istack = temp;
    }
    public void printList(List<T> obj) {
        for(List<T> element: obj){
            System.out.println(element);
        }
    }
}