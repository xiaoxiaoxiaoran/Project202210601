package cn.tedu.project2022106.entity;

import java.io.Serializable;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
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
@TableName("resource")
public class Resource implements Serializable {

    private static final long serialVersionUID = 1L;
    @TableId(value="id",type= IdType.AUTO)
    private Integer resourceId;

    private Integer parentId;

    private String resourceName;

    private String resourceType;

    private String url;

    private String code;

    private String sort;


}
