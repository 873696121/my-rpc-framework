package top.huhong.test;

import top.huhong.rpc.annotation.Service;
import top.huhong.rpc.api.ByeService;

@Service
public class ByeServiceImpl implements ByeService {

    @Override
    public String bye(String name) {
        return "bye, " + name;
    }
}
