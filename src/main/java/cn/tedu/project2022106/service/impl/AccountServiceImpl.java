package cn.tedu.project2022106.service.impl;

import cn.tedu.project2022106.controller.Dto.UserDto;
import cn.tedu.project2022106.entity.Account;
import cn.tedu.project2022106.mapper.AccountMapper;
import cn.tedu.project2022106.service.IAccountService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

import static java.lang.Integer.parseInt;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author jobob
 * @since 2022-10-12
 */
@Service
public class AccountServiceImpl extends ServiceImpl<AccountMapper, Account> implements IAccountService {

    @Resource
    AccountMapper accountMapper;
    @Override
    public UserDto login(String username, String  password) {

//        Integer accountId = accountMapper.getAccountId(username);
////        System.out.println(accountId);
//        int pw = parseInt(password);
//         int pwh = accountMapper.eqpw(accountId);
//        if(accountId!=null)
//        {
//            if(pwh==pw)
//                return "ok";
//            else
//                return "fail";
//        }else
//            return "fail";
        UserDto userDto = new UserDto();
        userDto.setUsername("aaa");
        userDto.setPassword("3717958");
        return userDto;
    }


}
