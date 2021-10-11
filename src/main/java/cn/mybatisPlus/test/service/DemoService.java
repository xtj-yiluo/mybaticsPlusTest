package cn.mybatisPlus.test.service;
import cn.mybatisPlus.test.entity.Demo;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author xtj
 * @since 2021-10-10
 */
public interface DemoService extends IService<Demo> {
    public boolean existIdBoolean(List<Long>  listIds);
}
