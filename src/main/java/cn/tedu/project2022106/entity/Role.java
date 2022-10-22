package cn.tedu.project2022106.entity;

import java.time.LocalDate;
import java.io.Serializable;

import com.baomidou.mybatisplus.annotation.*;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author jobob
 * @since 2022-10-12
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("role")
public class Role extends BaseEntity implements Serializable {

    private static final long serialVersionUID = 1L;
    @TableId(value="id",type= IdType.AUTO)
    private Integer roleId;

    private String roleName;

    private String remark;



}
