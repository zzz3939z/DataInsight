public class ClassStatDemo {

    public static void main(String[] args) {
        String[] classNames = {"软件2301", "软件2302", "大数据2301"};
        int[][] classScores = {
                {88, 92, 76, 60, 55},
                {95, 83, 71, -1, 120, 66},
                {90, 90, 45, 100}
        };

        System.out.println("=== 各班统计与全年级最高分 ===");
        printClassStats(classNames, classScores);

        String[] emptyDemoNames = {"软件2301", "空班级2309"};
        int[][] emptyDemoScores = {
                {88, 92, 76, 60, 55},
                {-1, 120, 200}
        };
        System.out.println("=== 某班无有效成绩的处理示例 ===");
        printClassStats(emptyDemoNames, emptyDemoScores);
    }

    static void printClassStats(String[] classNames, int[][] classScores) {
        int overallMax = Integer.MIN_VALUE;
        boolean hasOverall = false;

        for (int i = 0; i < classNames.length; i++) {
            int valid = 0;
            int sum = 0;
            int[] scores = classScores[i];

            for (int j = 0; j < scores.length; j++) {
                int score = scores[j];
                if (score < 0 || score > 100) {
                    continue;
                }
                valid++;
                sum += score;
                if (!hasOverall || score > overallMax) {
                    overallMax = score;
                    hasOverall = true;
                }
            }

            System.out.printf("班级: %s, 有效人数: %d", classNames[i], valid);
            if (valid == 0) {
                System.out.println(", 无有效成绩，平均分无法计算。");
                continue;
            }
            System.out.printf(", 平均分: %.2f%n", (double) sum / valid);
        }

        if (hasOverall) {
            System.out.println("全年级最高分: " + overallMax);
        } else {
            System.out.println("全年级无有效成绩。");
        }
    }
}