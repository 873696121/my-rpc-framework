package top.huhong.test;

import top.huhong.rpc.api.ByeService;
import top.huhong.rpc.api.HelloObject;
import top.huhong.rpc.api.HelloService;
import top.huhong.rpc.serializer.CommonSerializer;
import top.huhong.rpc.transport.RpcClient;
import top.huhong.rpc.transport.RpcClientProxy;
import top.huhong.rpc.transport.netty.client.NettyClient;

/**
 * 测试用Netty消费者
 */
public class NettyTestClient {

    public static void main(String[] args) {
        RpcClient client = new NettyClient(CommonSerializer.PROTOBUF_SERIALIZER);
        RpcClientProxy rpcClientProxy = new RpcClientProxy(client);
        HelloService helloService = rpcClientProxy.getProxy(HelloService.class);
        HelloObject object = new HelloObject(12, "This is a message");
        String res = helloService.hello(object);
        System.out.println(res);
        ByeService byeService = rpcClientProxy.getProxy(ByeService.class);
        System.out.println(byeService.bye("Netty"));
    }
}
