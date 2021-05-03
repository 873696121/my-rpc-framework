package top.huhong.test;

import top.huhong.rpc.annotation.ServiceScan;
import top.huhong.rpc.serializer.CommonSerializer;
import top.huhong.rpc.transport.RpcServer;
import top.huhong.rpc.transport.netty.server.NettyServer;

/**
 * 测试用Netty服务提供者（服务端）
 */
@ServiceScan
public class NettyTestServer {

    public static void main(String[] args) {
        RpcServer server = new NettyServer("127.0.0.1", 9999, CommonSerializer.PROTOBUF_SERIALIZER);
        server.start();
    }

}
