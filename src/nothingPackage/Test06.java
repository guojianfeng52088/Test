package nothingPackage;

/**
 * @Description 接口和继承
 * @author chuck
 * @date 2018年3月29日
 */

class Pencil{
	String name;
	public Pencil(String name){
		this.name = name;
	}
	
	public void write(){
		System.out.println(name+"牌子的铅笔写字");
	}
}

interface Eraser{
	public void remove();
}


class PencilWithEraser extends Pencil implements Eraser{

	
	public PencilWithEraser(String name) {
		super(name);
	}

	@Override
	public void remove() {
		System.out.println("橡皮擦掉笔记");
	}
}

public class Test06 {

	public static void main(String[] args) {
		PencilWithEraser p = new PencilWithEraser("2B");
		p.write();
		p.remove();
	}
}
