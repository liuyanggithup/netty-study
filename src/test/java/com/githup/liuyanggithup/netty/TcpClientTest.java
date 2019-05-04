package com.githup.liuyanggithup.netty;

import org.junit.Test;

import com.alibaba.fastjson.JSONObject;
import com.githup.liuyanggithup.netty.client.TcpClient;
import com.githup.liuyanggithup.netty.param.Request;
import com.githup.liuyanggithup.user.model.User;

public class TcpClientTest {

	@Test
	public void testClient(){
		for(int i=0;i<100;i++){
			Request request = new Request();
			request.setCommand("saveUser");
			User user = new User();
			user.setAge("11");
			user.setId(i);
			user.setName("张三"+i);
			request.setContent(user);
			Object result = TcpClient.send(request);
			
			System.out.println("客户端长连接测试返回结果"+JSONObject.toJSONString(result));
		}
	
	}
}
