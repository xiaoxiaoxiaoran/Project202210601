package cn.tedu.project2022106.entity;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableLogic;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.time.LocalDate;

@Data
@EqualsAndHashCode(callSuper = false)
public class BaseEntity {
    @TableField(value="create_time",fill = FieldFill.INSERT)
    private LocalDate createTime;
    @TableField(value="modified_time",fill= FieldFill.UPDATE)
    private LocalDate modifiedTime;
    @TableField(value="create_account",fill=FieldFill.INSERT)
    private String createAccountId;
    @TableField(value = "modified_account",fill=FieldFill.UPDATE)
    private String modifiedAccountId;
    @TableLogic(value = "1",delval = "0")
    private Integer delete;
}
