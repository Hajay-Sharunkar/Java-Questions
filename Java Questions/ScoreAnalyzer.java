public class ScoreAnalyzer {
    public static void main(String[] args) {
        int[] scores = {45, 78, 12, 89, 34, 67};
        int maxScore = scores[0];
        int minScore = scores[0];
        for (int score : scores) {
            if (score > maxScore) {
                maxScore = score;
            }
            if (score < minScore) {
                minScore = score;
            }
        }
        System.out.println("Maximum Score = " + maxScore);
        System.out.println("Minimum Score = " + minScore);
    }
}
