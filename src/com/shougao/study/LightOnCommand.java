package com.shougao.study;

/**
 *同回调一样，“定义-实现-设置-执行”
 *这个类是实现用 
 */

public class LightOnCommand implements Command {
	Light mLight;
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		mLight.on();
	}
	public LightOnCommand(Light l) {
		mLight = l;
	}
	
	//添加撤销功能，不管什么操作都需要正确撤销。
	public void undo(){
		mLight.off();
	}
}
