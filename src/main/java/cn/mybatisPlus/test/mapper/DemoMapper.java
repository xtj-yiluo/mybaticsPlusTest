package cn.mybatisPlus.test.mapper;

import cn.mybatisPlus.test.entity.Demo;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author xtj
 * @since 2021-10-10
 */
//test
public interface DemoMapper extends BaseMapper<Demo> {

    boolean existIdBoolean(@Param("listIds") List<Long> listIds);

    boolean existIdBoolean2(@Param("listIds") List<Long> listIds);

    boolean existIdBoolean3(@Param("listIds") List<Long> listIds);



}
