/**
 * 命令模式定义：将请求封装成对象。
 */
package com.shougao.study;

public class Main {

	/**
	 * @param args
	 * 这个是执行用
	 */
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RemoteControl mRemoteControl = new RemoteControl();
		mRemoteControl.setCommand(new LightOnCommand(new Light()));
		mRemoteControl.buttonPrssed();
		
		mRemoteControl.setCommand(new LightOffCommand(new Light()));
		mRemoteControl.buttonPrssed();
		mRemoteControl.undo();

		mRemoteControl.setCommand(new FanHighCommand(new FanSpeed()));
		mRemoteControl.buttonPrssed();
//		mRemoteControl.undo();
	}
}
