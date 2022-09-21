import java.util.Scanner;
import java.lang.String;
public class Main {
    //정수 배열
    static char array[];
    //배열의 개수
    static int size;

    //생성자
    public Main(int x){
        array = new char[x];
        size = 0;
    }
    public static void push(char x){
        array[size] = x;
        size++;
    }
    public static char pop(){
        if(size!=0){
            char a = array[size-1];
            array[size] = 0;//null이 안돼
            size--;
            return a;
        }else return '!';
    }
    public static boolean isEmpty(){
        return size==0;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int N = sc.nextInt();//횟수

        String r="";//산출할 결과
        int count = 0;
        for (int i=0; i<N;i++){
            size = 0;
            array = new char[50];//괄호 넣을 배열
            boolean abc = true;//해당 괄호

            String str = sc.next();//괄호 입력
            char arr [] = new char[str.length()];
            str.getChars(0,str.length(),arr,0);//str을 배열 분할

            for (int j=0;j<str.length();j++){
                count++;
                if (arr[j] == '(' || arr[j] == '{' ||arr[j] == '[' ){
                    push(arr[j]);
                }
                else if (arr[j] == ')' || arr[j] == '}' ||arr[j] == ']'){
                    int prev = pop();
                    if ((arr[j] == ']' && prev != '[') || (arr[j] == ')' && prev != '(') || (arr[j] == '}' && prev != '{')||prev == '!')
                    {
                        abc = false;
                        break;
                    }
                }
            }
            if (!isEmpty()) abc = false;
            if (abc == true) sb.append("YES").append("\n");
            else sb.append("NO").append("\n");
                    }
        System.out.println(sb);
        sc.close();
    }
}

