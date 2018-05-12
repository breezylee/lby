package com.yame.ubi.config;

import java.io.InputStream;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.yame.db.mongo.DbHelper;
import com.yame.db.mongo.client.ConnectionManage;
import com.yame.db.mongo.client.ConnectionOption;

@Component
public class MongoConfig implements ApplicationRunner {

	@Value("${db.address}")
	private String dbAddress;
	@Value("${db.name}")
	private String dbName;
	@Value("${db.auth.db}")
	private String authDbName;
	@Value("${db.auth.user}")
	private String user;
	@Value("${db.auth.pwd}")
	private String pwd;
	@Value("${db.maxConnect}")
	private int maxConnect = 200;
	
    @Override
    public void run(ApplicationArguments var1) throws Exception{
    	String[] addressStrArr = dbAddress.split(";");
		ConnectionOption mainOption = new ConnectionOption(addressStrArr, dbName).auth(authDbName, user, pwd).readPreferredSecondary();
		if(maxConnect > 0) {
			mainOption.connectNum(maxConnect);
		}
		ConnectionManage.addConnect(mainOption);// 添加默认的读写分离连接
		ClassLoader classLoader = Thread.currentThread().getContextClassLoader();  
		InputStream ips = classLoader.getResourceAsStream("collection-orm.xml");
		DbHelper.initOrm(ips);
		if(ips != null) {
			ips.close();
		}
    }

}
