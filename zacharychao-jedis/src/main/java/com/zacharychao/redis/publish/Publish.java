package com.zacharychao.redis.publish;

import redis.clients.jedis.Jedis;

public class Publish {
	public static void main(String[] args) {
		Jedis jedis = new Jedis("47.98.163.175",6379);
		jedis.auth("zacharychao");
		jedis.publish("cctv5", "helloworld");
		System.out.println("message send success");
	}
}
