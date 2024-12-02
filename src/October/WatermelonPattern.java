package October;

public class WatermelonPattern {
    public String solution(int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                sb.append("수");
            } else {
                sb.append("박");
            }
        }
        String answer = sb.toString();
        return answer;
    }
}