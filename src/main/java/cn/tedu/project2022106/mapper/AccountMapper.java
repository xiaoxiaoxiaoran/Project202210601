package cn.tedu.project2022106.mapper;

import cn.tedu.project2022106.entity.Account;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Select;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author jobob
 * @since 2022-10-12
 */
public interface AccountMapper extends BaseMapper<Account> {
    @Select("select `account_id` from `account` where username = #{username}")
    Integer getAccountId(String username);
    @Select("select `password` from `account` where `account_Id` = #{accountId}")
    Integer eqpw(Integer accountId);
}
