package com.jk.service;

import org.springframework.cloud.openfeign.FeignClient;

/**
 * @Author wzy
 * @Date @Time $ $
 */
@FeignClient(value = "springcloud-provider",fallback = UserServiceFallback.class)
public interface UserFeignService extends UserService{
}
