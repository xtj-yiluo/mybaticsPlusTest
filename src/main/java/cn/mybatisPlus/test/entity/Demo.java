package cn.mybatisPlus.test.entity;

;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import java.util.Date;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author xtj
 * @since 2021-10-10
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class Demo implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "first", type = IdType.ID_WORKER_STR)
    private Integer first;

    private String second;

    private Date third;


}
