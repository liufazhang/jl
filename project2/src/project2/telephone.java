package project2;

public class telephone {
	private float Screen;
	private float Cpu;
	private float Mem;
	public telephone(){
		System.out.println("���ѳ���");
	}
	
	public telephone(float newScreen,float newCpu,float newMem){
		Screen = newScreen;
		Cpu = newCpu;
		Mem = newMem;
		System.out.println("screen:"+Screen+"cpu:"+Cpu+"Men:"+Mem);
	}
	
	public float getScreen(){
		return Screen;
	}
	public void setScreen(float newScreen){
		Screen = newScreen;
	}
}
