package com.javaex.ex09;

public class TV {
	private int channel;
	private int volume;
	private boolean power;
	
	//생성자
	public TV() {}
	
	public TV(int channel, int volume, boolean power) {
		this.channel = channel;
		this.volume = volume;
		this.power = power;
	}
	//메소드 - getter / setter는 생략
	public int getChannel() {
		return channel;
	}
	
	public int getVolume() {
		return volume;
	}
	
	public boolean getPower() {
		return power;
	}
	//메소드 
	public void power(boolean on) {
		if (on == true) {
			this.power = true;
		} else {
			this.power = false;
		}
	}
	//1~255 채널 유지(1미만 채널은 1로 바꿔주고 256이상 채널은 255로 변경)
	public void channel(int channel) {
		if (channel < 1) {
			this.channel = 1;
		} else if (channel > 255) {
			this.channel = 255;
		} else {
			this.channel = channel;
		}
	}
	//1~255 채널 유지, true일때 1씩 증가, false일때 1씩 감소
	public void channel(boolean up) {
		if (up == true) {
			this.channel++;
		} else {
			this.channel--;
		}
	}
	//0~100 볼륨 유지(0미만 볼륨은 1로 0으로 바꾸고 101이상은 100으로 유지)
	public void volume(int volume) {
		if (volume < 0) {
			this.volume = 0;
		} else if (volume > 100) {
			this.volume = 100;
		} else {
			this.volume = volume;
		}
	}
	//0~100 볼륨 유지, true일때 1씩 증가, false일때 1씩 감소
	public void volume(boolean up) {
		if (up == true) {
			this.volume++;
		} else {
			this.volume--;
		}
	}
	//결과출력
	public void status() {
		System.out.println("채널 : " + channel + "번, 볼륨 : " + volume + " , 전원 : " + power);
	}
	
}
