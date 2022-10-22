package cn.tedu.project2022106.service;

import cn.tedu.project2022106.controller.Dto.UserDto;
import cn.tedu.project2022106.entity.Account;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author jobob
 * @since 2022-10-12
 */

public interface IAccountService extends IService<Account> {
    public UserDto login(String username, String password);
}
