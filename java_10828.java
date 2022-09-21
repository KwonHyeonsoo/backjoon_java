import java.util.Scanner;
public class Main {
    //정수 배열
    static int array[];
    //배열의 개수
    static int size;

    //생성자
    public Main(int x){
        array = new int[x];
        size = 0;
    }
    public static void push(int x){
        array[size] = x;
        size++;
    }
    public static int pop(){
        if(size!=0){
            int a = array[size-1];
            array[size] = 0;//null이 안돼
            size--;
            return a;
        }else return -1;
    }
    public static int size(){return size;}
    public static int empty(){if (size ==0) return 1; else return 0;}
    public static int top() {
        if (size != 0) {
            return array[size-1];
        }
        else return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int N = sc.nextInt();

        Main s = new Main(N);
        String r="";

        for (int i=0; i<N;i++){
            String str = sc.next();
            if(str.equals("push")){
                int a = sc.nextInt();
                s.push(a);
            }
            else if(str.equals("pop")){
                sb.append(pop()).append('\n');
            }
            else if(str.equals("size")){
                sb.append(size()).append('\n');
            }
            else if(str.equals("empty")){
                sb.append(empty()).append('\n');
            }
            else if(str.equals("top")){
                sb.append(top()).append('\n');
            }
        }
        System.out.println(sb);
        sc.close();
    }
}

