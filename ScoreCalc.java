/**
 * Demonstrates student score calculation, Java conversions, byte overflow,
 * and an AI-assisted average-score grade suggestion.
 */
public class ScoreCalc {
    /** Grade boundaries are inclusive: 60 is passing and 90 is excellent. */
    static String suggestedGrade(double average) {
        if (average >= 90.0) {
            return "优秀";
        }
        if (average >= 60.0) {
            return "及格";
        }
        return "未及格";
    }

    public static void main(String[] args) {
        System.out.println("欢迎使用 ScoreCalc 成绩计算项目！");

        // Public sample identity and scores; replace locally for your own report.
        long studentId = 202400000001L;
        String studentName = "示例学生";
        int javaScore = 88;
        int mathScore = 76;
        int programmingScore = 92;

        int total = javaScore + mathScore + programmingScore;

        // Automatic widening conversion: int becomes double before division.
        double totalAsDouble = total;
        double average = total / 3.0;
        // Forced narrowing conversion truncates the decimal part.
        int averageAsInt = (int) average;

        boolean allPassed = javaScore >= 60
                && mathScore >= 60
                && programmingScore >= 60;

        System.out.println("学号（long）: " + studentId);
        System.out.println("姓名（String）: " + studentName);
        System.out.println("Java 成绩（int）: " + javaScore);
        System.out.println("数学成绩（int）: " + mathScore);
        System.out.println("程序设计成绩（int）: " + programmingScore);
        System.out.println("总分（int）: " + total);
        System.out.println("总分自动转换为 double: " + totalAsDouble);
        System.out.printf("平均分（double）: %.2f%n", average);
        System.out.println("平均分强制转换为 int 后: " + averageAsInt);
        System.out.println("三门课程是否全部及格（每门 >= 60）: " + (allPassed ? "是" : "否"));
        System.out.println("AI 辅助添加的平均分等级建议: " + suggestedGrade(average));

        // byte ranges from -128 to 127; narrowing 128 to byte wraps to -128.
        byte maxByte = 127;
        byte overflowResult = (byte) (maxByte + 1);
        System.out.println("byte 最大值: " + maxByte);
        System.out.println("byte 最大值加 1 后（强制转换）: " + overflowResult);

        // Show the exact classification at the required grade boundaries.
        System.out.println("等级边界验证（59.99 / 60 / 89.99 / 90）: "
                + suggestedGrade(59.99) + " / " + suggestedGrade(60.0) + " / "
                + suggestedGrade(89.99) + " / " + suggestedGrade(90.0));
    }
}
