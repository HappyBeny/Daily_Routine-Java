package October;

public class GetMiddleCharacter {
    public String solution(String s) {
        String answer = "";
        if(s.length()%2 == 0){
            answer = s.substring(s.length()/2-1, s.length()/2+1);
        } else {
            answer = s.substring((s.length()+1)/2-1, (s.length()+1)/2);
        }
        return answer;
    }
}