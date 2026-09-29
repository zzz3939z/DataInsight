public class GradeDemo {

    public static String gradeByIfElse(int score) {
        if (score < 0 || score > 100) {
            return "非法分数";
        } else if (score >= 90) {
            return "A";
        } else if (score >= 80) {
            return "B";
        } else if (score >= 60) {
            return "C";
        } else {
            return "D";
        }
    }

    public static String gradeBySwitch(int score) {
        if (score < 0 || score > 100) {
            return "非法分数";
        }
        switch (score / 10) {
            case 10:
            case 9:
                return "A";
            case 8:
                return "B";
            case 7:
            case 6:
                return "C";
            default:
                return "D";
        }
    }

    public static void main(String[] args) {
        int[] boundaryScores = {59, 60, 79, 80, 89, 90, 100};
        System.out.println("=== 边界分数核对（if-else 与 switch）===");
        System.out.printf("%-8s%-14s%-10s%n", "分数", "if-else", "switch");
        for (int score : boundaryScores) {
            System.out.printf("%-8d%-14s%-10s%n",
                    score, gradeByIfElse(score), gradeBySwitch(score));
        }

        int[] illegalScores = {-1, 101, 150};
        System.out.println("=== 非法分数提示 ===");
        for (int score : illegalScores) {
            System.out.printf("分数 %d -> if-else: %s, switch: %s%n",
                    score, gradeByIfElse(score), gradeBySwitch(score));
        }
    }
}