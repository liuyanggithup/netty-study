package com.githup.liuyanggithup.netty;

import com.alibaba.fastjson.JSONObject;
import com.githup.liuyanggithup.netty.core.DefaultFuture;
import com.githup.liuyanggithup.netty.param.Response;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;

public class ClientHandler extends ChannelInboundHandlerAdapter {

	@Override
	public void channelRead(ChannelHandlerContext ctx, Object msg)
			throws Exception {
	
		if(msg.toString().equals("ping")){
			ctx.channel().writeAndFlush("ping\r\n");
			return ;
		}
//		ctx.channel().attr(AttributeKey.valueOf("ChannelKey")).set(msg.toString());
	
		System.out.println("客户端返回数据==="+msg.toString());
		Response res = JSONObject.parseObject(msg.toString(), Response.class);
		DefaultFuture.recive(res);
//		ctx.channel().close();
	}
	
	

}
