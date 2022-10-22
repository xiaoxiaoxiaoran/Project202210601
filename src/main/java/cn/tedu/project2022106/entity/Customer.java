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
@TableName("customer")
public class Customer implements Serializable {

    private static final long serialVersionUID = 1L;
    @TableId(value="id",type= IdType.AUTO)
    private Integer customerId;

    private String realName;

    private String sex;

    private String email;

    private String phone;

    private String address;


}
