//package com.scheduler.distributetask.config;
//
//import com.scheduler.distributetask.listener.NewJobListener;
//import org.apache.curator.framework.recipes.cache.CuratorCache;
//import org.apache.shardingsphere.elasticjob.reg.base.CoordinatorRegistryCenter;
//import org.apache.shardingsphere.elasticjob.reg.zookeeper.ZookeeperConfiguration;
//import org.apache.shardingsphere.elasticjob.reg.zookeeper.ZookeeperRegistryCenter;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//import javax.annotation.Resource;
//
///**
// * @author yanglin
// * @date 2021/12/28 17:38
// */
//@Configuration
//public class ZkConfig {
//
//    @Bean
//    public CoordinatorRegistryCenter createRegistryCenter(){
//        ZookeeperConfiguration zookeeperConfiguration = new ZookeeperConfiguration("118.190.37.175:2181", "task");
//        zookeeperConfiguration.setMaxSleepTimeMilliseconds(10000);
//        zookeeperConfiguration.setBaseSleepTimeMilliseconds(2000);
//        zookeeperConfiguration.setMaxRetries(4);
//        ZookeeperRegistryCenter zookeeperRegistryCenter =
//                new ZookeeperRegistryCenter(zookeeperConfiguration);
//        zookeeperRegistryCenter.init();
//        return zookeeperRegistryCenter;
//    }
//}
