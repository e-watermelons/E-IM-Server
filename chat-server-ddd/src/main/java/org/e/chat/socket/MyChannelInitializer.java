package org.e.chat.socket;

import io.netty.channel.ChannelInitializer;
import io.netty.channel.socket.SocketChannel;
import org.e.chat.application.UserService;
import org.e.chat.codec.ObjDecoder;
import org.e.chat.codec.ObjEncoder;
import org.e.chat.socket.handler.LoginHandler;

public class MyChannelInitializer extends ChannelInitializer<SocketChannel> {
    private UserService userService;

    public MyChannelInitializer(UserService userService) {
        this.userService = userService;
    }

    @Override
    protected void initChannel(SocketChannel ch) throws Exception {
        //对象传输处理【解码】
        ch.pipeline().addLast(new ObjDecoder());
        //在管道中添加我们自己的接收数据实现方法
        ch.pipeline().addLast(new LoginHandler(userService));
        //对象传输处理[编码]
        ch.pipeline().addLast(new ObjEncoder());

    }
}
