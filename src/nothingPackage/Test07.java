package nothingPackage;

/**
 * @Description 所有的学生都具备学习功能,但有部分学生除了学习之外,还能赚钱
 * @author chuck
 * @date 2018年3月29日
 */
class Student{
	String name;
	
	public void study(String name){
		System.out.println("学生:"+name+"在学习");
	}
}

interface Money{
	public void makeMoney(String name);
}

interface Practice{
	public void makeExceries(String name);
}

interface D extends Money,Practice{
	public void fun(); 
}

class GoodStudent extends Student implements Money,Practice,D {

	@Override
	public void makeMoney(String name) {
		System.out.println("学生:"+name+"在赚钱");	
	}

	@Override
	public void makeExceries(String name) {
		System.out.println("学生:"+name+"在锻炼");
	}

	@Override
	public void fun() {
		System.out.println("纯属无聊");
	}
}



abstract class C implements Money,Practice{
	
}

public class Test07 {

	public static void main(String[] args) {
		GoodStudent stu = new GoodStudent();
//		stu.name = "张三";
		stu.study("张三");
		stu.makeExceries("张三");
		stu.fun();
		
		GoodStudent stu2 = new GoodStudent();
		stu2.study("李四");
		stu2.makeMoney("李四");
		stu2.makeExceries("李四");
		stu2.fun();
	}
	
}
