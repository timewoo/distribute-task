//package com.scheduler.distributetask.dynamicJob;
//
//import com.scheduler.distributetask.listener.NewJobListener;
//import org.apache.curator.framework.CuratorFramework;
//import org.apache.curator.framework.recipes.cache.CuratorCache;
//import org.apache.shardingsphere.elasticjob.reg.zookeeper.ZookeeperRegistryCenter;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.stereotype.Component;
//
//import javax.annotation.Resource;
//import java.util.regex.Pattern;
//
///**
// * @author yanglin
// * @date 2021/12/29 11:49
// */
//@Configuration
//public class DynamicAddJob {
//
//    @Resource
//    private ZookeeperRegistryCenter zookeeperRegistryCenter;
//
//    @Resource
//    private NewJobListener newJobListener;
//
//    @Bean
//    public CuratorCache curatorCache(){
//        zookeeperRegistryCenter.addCacheData("/");
//        CuratorCache cache = (CuratorCache) zookeeperRegistryCenter.getRawCache("/");
//        cache.listenable().addListener(newJobListener);
//        return cache;
//    }
//}
