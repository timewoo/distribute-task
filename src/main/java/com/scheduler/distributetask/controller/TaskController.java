package com.scheduler.distributetask.controller;

import com.scheduler.distributetask.dto.CheckRequest;
//import com.scheduler.distributetask.job.MyJob;
import org.apache.commons.lang3.StringUtils;
import org.apache.shardingsphere.elasticjob.api.JobConfiguration;
import org.apache.shardingsphere.elasticjob.lite.api.bootstrap.impl.ScheduleJobBootstrap;
import org.apache.shardingsphere.elasticjob.reg.base.CoordinatorRegistryCenter;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author yanglin
 * @date 2021/12/28 17:16
 */
@RestController
@RequestMapping
public class TaskController {

//    @Resource
//    private CoordinatorRegistryCenter coordinatorRegistryCenter;
//
//    @RequestMapping("task")
//    public String createTask(@RequestParam("name") String name, @RequestParam("cron") String cron) {
//        new ScheduleJobBootstrap(coordinatorRegistryCenter, new MyJob(), createJobConfiguration(name, cron)).schedule();
//        return "true";
//    }
//
//    private static JobConfiguration createJobConfiguration(String name, String cron) {
//        if (StringUtils.isNotBlank(cron)){
//            return JobConfiguration.newBuilder(name, 1).cron(cron).overwrite(true).build();
//        }else {
//            return JobConfiguration.newBuilder(name,1).overwrite(true).build();
//        }
//    }

    @RequestMapping("check")
    public String check(CheckRequest checkRequest){
        System.out.println(checkRequest.toString());
        return "test";
    }

}
