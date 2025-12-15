package org.example;

//TIP 要<b>运行</b>代码，请按 <shortcut actionId="Run"/> 或
// 点击装订区域中的 <icon src="AllIcons.Actions.Execute"/> 图标。
public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
            System.out.println("冲突怎么还不出来");
            System.out.println("太伤我心了");
            //TIP 按 <shortcut actionId="Debug"/> 开始调试代码。我们已经设置了一个 <icon src="AllIcons.Debugger.Db_set_breakpoint"/> 断点
            // 但您始终可以通过按 <shortcut actionId="ToggleLineBreakpoint"/> 添加更多断点。
            if (i==4){
                System.out.println("你是第" + i+"个用户,恭喜您中奖了！");
            }
            System.out.println(i);
            System.out.println("你是第" + i+"个用户，不好意思，您没有中奖");
        }
    }
}