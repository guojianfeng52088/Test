package string;

/**
 * @Description 模板的用法
 * @author chuck
 * @date 2018年4月2日
 */

abstract class Tool{
	
	public final void fun(){
		System.out.println("在抽象类里边定义的工具方法");
	}
	
}

public class TemplateTest extends Tool {
	public static void main(String[] args) {
		
		TemplateTest test = new TemplateTest();
		test.fun();
	}
}
