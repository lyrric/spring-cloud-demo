package com.github.lyrric.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created on 2019-06-25.
 *
 * @author wangxiaodong
 */
@FeignClient(name = "order-service")
public interface OrderFeign {

    /**
     * 远程调用
     * @return
     */
    @GetMapping(value = "/api/v1.0/order/get")
    String getFromRemote();
}
