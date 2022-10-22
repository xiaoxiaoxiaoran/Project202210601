package cn.tedu.project2022106.service.impl;

import cn.tedu.project2022106.entity.Customer;
import cn.tedu.project2022106.mapper.CustomerMapper;
import cn.tedu.project2022106.service.ICustomerService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author jobob
 * @since 2022-10-12
 */
@Service
public class CustomerServiceImpl extends ServiceImpl<CustomerMapper, Customer> implements ICustomerService {

}
