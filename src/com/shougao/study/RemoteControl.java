package com.shougao.study;
/**
 *同回调一样，“定义-实现-设置-执行”
 *这个类是设置用，被设置了也就能调用了。
 */


public class RemoteControl {

	Command myCommand;
	
	public RemoteControl() {
	}
	
	public void setCommand(Command c){
		myCommand = c;
	}
	
	public void buttonPrssed(){
		myCommand.execute();
	}

	public void undo(){
		myCommand.undo();
	}
}
