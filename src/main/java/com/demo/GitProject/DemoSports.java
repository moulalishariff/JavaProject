package com.demo.GitProject;

class Football implements Sports{
	@Override
	public void play() {
		System.out.println("Playing Football");
	}
	
}
class Basketball implements Sports{
	@Override
	public void play() {
		System.out.println("Playing Basketball");
	}
	
}
class Rugby implements Sports{
	@Override
	public void play() {
		System.out.println("Playing Rugby");
	}
	
}
public class DemoSports {

	public static void main(String[] args) {
		Sports f=new Football();
		f.play();
		Sports b=new Basketball();
		b.play();
		Sports r=new Rugby();
		r.play();
	}

}
