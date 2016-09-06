package com.evsward.facade;

/**
 * 只有一个对外发言人，在调用时看起来就像是在创建一个简单的类的实例，然后调用其方法而已。但实际上，内部玄机很深。
 * 
 * @author xp020154
 *
 */
public class App {
	public static void main(String[] args) {
		AthleteFacade athleteFacade = new AthleteFacade();
		athleteFacade.beginToTrain();
		athleteFacade.warmUp();
		athleteFacade.study();
	}
}
