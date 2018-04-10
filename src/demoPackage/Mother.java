package demoPackage;

public class Mother implements Work {

	Work sonWork = new Son();
	
	public Mother(Work work) {
		this.sonWork = work;
	}
	
	@Override
	public void work() {
		
		sonWork.work();
		System.out.println("妈妈的工作是在孩子的基础上描绘");
	}

}
