package cn.com.provider.demo;
/**
 * 实现公共接口，此实现对消费者隐藏：
 */
import cn.com.api.demo.DemoService;

import java.util.ArrayList;
import java.util.List;

public class DemoServiceImpl implements DemoService{
    @Override
    public List<String> getPremissions(Long id) {
        List<String> list = new ArrayList<>();
        list.add(String.format("Permission_%d", id - 1));
        list.add(String.format("Permission_%d", id));
        list.add(String.format("Permission_%d", id + 1));
        System.out.println("我被调用啦");
        return list;
    }
}
