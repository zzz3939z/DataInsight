# DataInsight：Java 实验代码

这是 Java 应用程序开发课程的公开示例代码。仓库不包含实验报告、个人截图或 MaaS 令牌；代码中的成绩均为演示数据。

## 实验一：开发环境与数据类型

- DataInsight.java：输出项目欢迎信息。
- ScoreCalc.java：演示 long、String、int、总分、浮点平均分、及格判断、类型转换、byte 溢出及平均分等级边界。

在仓库目录使用 JDK 17 编译、运行：

使用 JDK 17，在仓库目录执行以下三条命令：

    javac -encoding UTF-8 DataInsight.java ScoreCalc.java
    java DataInsight
    java ScoreCalc

## 实验二：流程控制实践

`lab02/` 包含四个独立的默认包 Java 程序：

- `GradeDemo.java`：用 `if-else` 和 `switch` 两种方式判断成绩等级，并检查边界及非法分数。
- `LoopDemo.java`：打印 9×9 乘法表，读取行数并打印星号三角形。
- `StatDemo.java`：跳过无效成绩，统计总分、平均分、及格率和等级人数。
- `ClassStatDemo.java`：用二维数组统计各班平均分与全年级最高分。

在 `lab02` 目录使用 JDK 17：

    javac -encoding UTF-8 GradeDemo.java LoopDemo.java StatDemo.java ClassStatDemo.java
    java GradeDemo
    java LoopDemo
    java StatDemo
    java ClassStatDemo

`LoopDemo` 会提示输入正整数行数。报告所用的姓名、学号和截图仅保存在课程在线 LaTeX 项目，不提交到本仓库。
