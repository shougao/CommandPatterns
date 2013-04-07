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
	}
}
