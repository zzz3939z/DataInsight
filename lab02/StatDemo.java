public class StatDemo {

    public static void main(String[] args) {
        int[] scores = {88, 92, 76, -1, 59, 120, 95, 63, 100, 45};
        System.out.println("=== 正常数组统计 ===");
        analyze(scores);

        int[] allIllegal = {-5, 120, -1, 200};
        System.out.println("=== 全非法数组统计（避免除零）===");
        analyze(allIllegal);
    }

    static void analyze(int[] scores) {
        int valid = 0;
        int sum = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int pass = 0;
        int a = 0, b = 0, c = 0, d = 0;

        for (int score : scores) {
            if (score < 0 || score > 100) {
                continue;
            }
            valid++;
            sum += score;
            if (score > max) {
                max = score;
            }
            if (score < min) {
                min = score;
            }
            if (score >= 60) {
                pass++;
            }
            if (score >= 90) {
                a++;
            } else if (score >= 80) {
                b++;
            } else if (score >= 60) {
                c++;
            } else {
                d++;
            }
        }

        System.out.println("有效人数: " + valid);
        if (valid == 0) {
            System.out.println("无有效成绩，无法计算总分/平均分/最高/最低/及格率。");
            return;
        }

        double average = (double) sum / valid;
        System.out.println("总分: " + sum);
        System.out.printf("平均分: %.2f%n", average);
        System.out.println("最高分: " + max);
        System.out.println("最低分: " + min);
        System.out.printf("及格率: %.1f%%%n", pass * 100.0 / valid);
        System.out.printf("A/B/C/D 人数: %d/%d/%d/%d%n", a, b, c, d);
    }
}