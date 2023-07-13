package org.e.chat.protocol;

import org.e.chat.protocol.login.LoginRequest;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 协议包
 */
public abstract class Packet {

    private final static Map<Byte,Class<? extends Packet>> packetType = new ConcurrentHashMap<>();

    static {
        packetType.put(Command.loginRequest, LoginRequest.class);
    }
    public static Class<? extends Packet> get(Byte command){
        return packetType.get(command);
    }

    /**
     * 获取协议指令
     * @return 指令值
     */
    public abstract Byte getCommand();
}
