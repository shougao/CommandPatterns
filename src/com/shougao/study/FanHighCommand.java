package com.shougao.study;
import com.shougao.study.Command;

/**
 * 给遥控器增加控制风扇的能力。
 * 风扇的实体是速度
 * @author zhangqc
 *
 */
public class FanHighCommand implements Command {
	FanSpeed myFanSpeed;
	
	
	public FanHighCommand(FanSpeed f) {
		myFanSpeed = f;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		myFanSpeed.high();
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		
	}

}
