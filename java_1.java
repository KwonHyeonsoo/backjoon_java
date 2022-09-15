import java.io.*;
import java.util.StringTokenizer;

public class lll {
    public static void main(String args[]) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); // 선언


        int count = Integer.parseInt(br.readLine());


        for (int i=0; i<count; i++){
            StringTokenizer st = new StringTokenizer((br.readLine()));
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = a+b;
            bw.write(c+"");
            bw.newLine(); // 줄바꿈
        }
        bw.flush();
        bw.close();
    }
}
