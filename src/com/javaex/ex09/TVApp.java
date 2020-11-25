package com.javaex.ex09;

public class TVApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TV tv = new TV(7, 20, false);
		
		tv.status();	//(채널: 7, 볼륨: 20, 전원: false)
		
		tv.power(true);		//(채널: 7, 볼륨: 20, 전원: true)
		tv.volume(120);		//(채널: 7, 볼륨: 100, 전원: false)
		tv.status();		//(채널: 7, 볼륨: 100, 전원: false)
		
		tv.volume(false);	//(채널: 7, 볼륨: 99, 전원: false)
		tv.status();		//(채널: 7, 볼륨: 99, 전원: false)
		
		tv.channel(0);		//(채널: 1, 볼륨: 99, 전원: false)
		tv.status();		//(채널: 1, 볼륨: 99, 전원: false)
		
		tv.channel(true);	//(채널: 2, 볼륨: 99, 전원: true)
		tv.channel(true);	//(채널: 3, 볼륨: 99, 전원: true)
		tv.channel(true);	//(채널: 4, 볼륨: 99, 전원: true)
		tv.status();		//(채널: 4, 볼륨: 99, 전원: true)
		
		tv.power(false);	//(채널: 4, 볼륨: 99, 전원: flase)
		tv.status();
	}

}
