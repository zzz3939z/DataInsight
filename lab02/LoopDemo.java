import java.util.Scanner;

public class LoopDemo {

    public static void main(String[] args) {
        printMultiplicationTable();
        printTriangleFromKeyboard();
    }

    private static void printMultiplicationTable() {
        System.out.println("=== 9×9 乘法表（嵌套 for 循环）===");
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.printf("%d×%d=%-3d", j, i, i * j);
            }
            System.out.println();
        }
    }

    private static void printTriangleFromKeyboard() {
        Scanner scanner = new Scanner(System.in);
        int rows = readPositiveInt(scanner);
        scanner.close();

        if (rows <= 0) {
            System.out.println("未获得有效行数，使用默认行数 5。");
            rows = 5;
        }

        System.out.println("=== 打印 " + rows + " 行直角星号三角形 ===");
        for (int i = 1; i <= rows; i++) {
            int j = 1;
            while (j <= i) {
                System.out.print("*");
                j++;
            }
            System.out.println();
        }
    }

    private static int readPositiveInt(Scanner scanner) {
        int rows = -1;
        boolean eof = false;
        do {
            System.out.print("请输入直角星号三角形的行数（正整数）：");
            if (!scanner.hasNextLine()) {
                eof = true;
                break;
            }
            String line = scanner.nextLine().trim();
            if (line.isEmpty()) {
                System.out.println("输入为空，请输入正整数。");
                continue;
            }
            try {
                rows = Integer.parseInt(line);
            } catch (NumberFormatException e) {
                System.out.println("非法输入：\"" + line + "\" 不是整数，请重新输入。");
                rows = -1;
                continue;
            }
            if (rows <= 0) {
                System.out.println("行数必须为正整数，请重新输入。");
                rows = -1;
            }
        } while (rows <= 0);

        if (eof) {
            System.out.println();
            System.out.println("检测到输入结束（EOF），退出读取。");
        }
        return rows;
    }
}