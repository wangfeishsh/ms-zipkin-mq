package com.bao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.sleuth.zipkin.stream.EnableZipkinStreamServer;

@EnableZipkinStreamServer
@SpringBootApplication
public class MsZipkinMqApplication {

	public static void main(String[] args) {
		String a = "testet的阿打发斯蒂芬12425435!!@#${:,;[]}testet的阿打发斯蒂芬12425435!!@#${:,;[]}testet的阿打发斯蒂芬12425435!!@#${:,;[]}testet的阿打发斯蒂芬12425435!!@#${:,;[]}testet的阿打发斯蒂芬12425435!!@#${:,;[]}testet的阿打发斯蒂芬12425435!!@#${:,;[]}testet的阿打发斯蒂芬12425435!!@#${:,;[]}"+ (int)(1+Math.random()*10);
		System.out.println(a.length());
		SpringApplication.run(MsZipkinMqApplication.class, args);
	}
}
