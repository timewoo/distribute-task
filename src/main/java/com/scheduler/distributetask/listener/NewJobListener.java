//package com.scheduler.distributetask.listener;
//
//import com.fasterxml.jackson.core.JsonGenerator;
//import com.fasterxml.jackson.core.JsonParser;
//import com.fasterxml.jackson.databind.DeserializationFeature;
//import com.fasterxml.jackson.databind.ObjectMapper;
//import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
//import com.fasterxml.jackson.dataformat.yaml.YAMLParser;
//import com.scheduler.distributetask.job.JobConfig;
//import com.scheduler.distributetask.job.MyJob;
//import lombok.SneakyThrows;
//import lombok.extern.slf4j.Slf4j;
//import org.apache.curator.framework.recipes.cache.ChildData;
//import org.apache.curator.framework.recipes.cache.CuratorCacheListener;
//import org.apache.shardingsphere.elasticjob.api.JobConfiguration;
//import org.apache.shardingsphere.elasticjob.lite.api.bootstrap.impl.ScheduleJobBootstrap;
//import org.apache.shardingsphere.elasticjob.reg.base.CoordinatorRegistryCenter;
//import org.springframework.stereotype.Component;
//
//import javax.annotation.Resource;
//import java.util.regex.Matcher;
//import java.util.regex.Pattern;
//
///**
// * @author yanglin
// * @date 2021/12/29 10:10
// */
//@Slf4j
//@Component
//public class NewJobListener implements CuratorCacheListener {
//
//    private static final Pattern CONFIG_PATH_PATTERN = Pattern.compile("/([^/]+)/config");
//
//    @Resource
//    private CoordinatorRegistryCenter coordinatorRegistryCenter;
//
//    @SneakyThrows
//    @Override
//    public void event(Type type, ChildData oldData, ChildData data) {
//        Matcher matcher;
//        if (Type.NODE_CREATED != type || !(matcher = CONFIG_PATH_PATTERN.matcher(data.getPath())).matches()) {
//            return;
//        }
//        String jobName = matcher.group(1);
//        byte[] bytes = data.getData();
//        ObjectMapper objectMapper = new ObjectMapper(new YAMLFactory());
//        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES,false);
//        JobConfig jobConfig = objectMapper.readValue(bytes, JobConfig.class);
//        log.info("New job:{},data:{}", jobName, jobConfig);
//        new ScheduleJobBootstrap(coordinatorRegistryCenter, new MyJob(),
//                JobConfiguration.newBuilder(jobConfig.getJobName(), jobConfig.getShardingTotalCount())
//                        .cron(jobConfig.getCron()).build()).schedule();
//    }
//}
