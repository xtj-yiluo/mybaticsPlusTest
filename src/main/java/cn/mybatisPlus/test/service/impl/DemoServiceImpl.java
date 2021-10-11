package cn.mybatisPlus.test.service.impl;


import cn.mybatisPlus.test.mapper.DemoMapper;
import cn.mybatisPlus.test.service.DemoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import cn.mybatisPlus.test.entity.Demo;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author xtj
 * @since 2021-10-10
 */
@Service
public class DemoServiceImpl extends ServiceImpl<DemoMapper, Demo> implements DemoService {

    @Autowired
    DemoMapper demoMapper;

    @Override
    public boolean existIdBoolean(List<Long> listIds) {
        return demoMapper.existIdBoolean(listIds);
    }

}
