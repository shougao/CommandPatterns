package com.shougao.study;

/**
 *同回调一样，“定义-实现-设置-执行”
 *这个类是定义用 
 */

public interface Command {
	public void execute();
	public void undo();
}
