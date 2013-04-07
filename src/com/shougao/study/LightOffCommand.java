package com.shougao.study;

/**
 * 添加关灯开关，关灯的undo也就是把灯打开的动作。
 * @author zhangqc
 *
 */
public class LightOffCommand implements Command {
	Light myLight;
	
	
	public LightOffCommand(Light l) {
		myLight = l;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		myLight.off();
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		myLight.on();
	}

}
