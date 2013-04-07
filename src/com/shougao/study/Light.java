package com.shougao.study;

/**
 * 这个类是“定义-实现-设置-执行”之外的实体，
 * 在执行的时候动态的设置进来的，“定义-实现-设置都是对接口的编程，
 * 只有在执行时设置进来后才有了真正的实体，就是这个类的对象light
 * @author zhangqc
 */
public class Light {
	public void on(){
		System.out.println("light is on.");
	}
	public void off(){
		System.out.println("light is off.");
	}
}
