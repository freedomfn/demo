package com.example.demo.contract;

import com.example.demo.contract.constant.ServerConstant;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name = ServerConstant.SERVER_PROVIDER)
@RequestMapping("/sample")
public interface SampleService {

}
