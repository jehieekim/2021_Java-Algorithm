import java.util.*;

public class Main {
    public String solution(String str){
        String answer = "";
        for(char x : str.toCharArray()){
         if(Character.isLowerCase(x)) answer += Character.toUpperCase(x);
         else answer += Character.toLowerCase(x);

        }
        return answer;

    }

    public static void main(String[] args) {
      Main T = new Main();
      Scanner in = new Scanner(System.in);
            System.out.println("문자를 입력하세요");
      String input = in.nextLine();
            System.out.print(T.solution(input));

    }
}
