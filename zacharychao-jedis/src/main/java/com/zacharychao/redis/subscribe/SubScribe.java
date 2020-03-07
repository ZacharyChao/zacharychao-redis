package com.zacharychao.redis.subscribe;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPubSub;

public class SubScribe extends JedisPubSub{
	@Override
	public void onMessage(String channel, String message) {
		System.out.println("channel name = " + channel + " ,message = " + message);
	}
	public static void main(String[] args) {
		Jedis jedis = new Jedis("47.98.163.175",6379);
		jedis.auth("zacharychao");
		SubScribe sub = new SubScribe();
		System.out.println("session redis client ready");
		jedis.subscribe(sub, "cctv5");
	}
}
