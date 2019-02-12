package cn.com.api.demo;

import java.util.List;

/**
 * 服务接口，需要独立打包
 */
public interface DemoService {
    List<String> getPremissions(Long id);
}
