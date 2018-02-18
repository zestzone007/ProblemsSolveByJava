/*
 *有一对兔子，从出生后第3个月起每个月都生一对兔子，
 * 小兔子长到第四个月后每个月又生一对兔子，
 * 假如兔子都不死，问每个月的兔子总数为多少？
 */
public class P01 {
    public static void main(String[] args) {
        for (int i = 1; i < 11; i++) {
            System.out.printf("第 "+i+" 个月，兔子有 "+getNum(i)+" 对\r\n");
        }
    }

    public static int getNum(int n) {
        if (n == 1 || n == 2) {
            return 1;
        } else {
            return getNum(n - 1) + getNum(n - 2);
        }
    }
}
// 斐波那契儿数列，用函数递归实现,
// 递归函数有两个要素：
// 一是递归的结束条件是确定的，
// 二是递归值一直往结束条件靠拢，并最终能达到结束条件。
