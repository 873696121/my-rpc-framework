package top.huhong.rpc.loadbalancer;

import com.alibaba.nacos.api.naming.pojo.Instance;

import java.util.List;

public class RoundRobinLoadBalancer implements LoadBalancer {

    private int index = 0;

    @Override
    public Instance select(List<Instance> instances, String serviceName) {
        if(index >= instances.size()) {
            index %= instances.size();
        }
        return instances.get(index++);
    }

}
