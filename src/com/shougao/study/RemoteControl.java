package com.shougao.study;
/**
 *同回调一样，“定义-实现-设置-执行”
 *这个类是设置用 
 */


public class RemoteControl {

	Command myCommand;
	
	public RemoteControl() {
		
	}
	
	void setCommand(Command c){
		myCommand = c;
	}
	
	void buttonPrssed(){
		myCommand.execute();
	}

}
