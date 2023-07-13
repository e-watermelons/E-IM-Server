package org.e.chat.codec;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToByteEncoder;
import org.e.chat.protocol.Packet;
import org.e.chat.utils.SerializationUtil;

public class ObjEncoder extends MessageToByteEncoder<Packet> {
    @Override
    protected void encode(ChannelHandlerContext ctx, Packet in, ByteBuf out) throws Exception {
        byte[] data = SerializationUtil.serialize(in);
        out.writeInt(data.length + 1);
        out.writeByte(in.getCommand());//添加指令
        out.writeBytes(data);
    }
}
