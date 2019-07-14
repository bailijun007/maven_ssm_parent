package com.blj.util;

import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

public class RedisUtils {
    public static JedisPool pool;

    public static JedisPool open(String ip,int port){
        if(pool==null){
            //创建JedisPoolConfig 给config设置连接池参数，使用config创建JedisPool
            JedisPoolConfig config=new JedisPoolConfig();
          //设置最大线程数 一个线程就是一个jedis
            config.setMaxTotal(20);
            //设置最大空闲数
            config.setMaxIdle(2);
            //设置检查项为true，表示从线程池拿出来的对象一定是检查可用
            config.setTestOnBorrow(true);
            pool=new JedisPool(config,ip,port,6000,"123456");
        }
        return pool;
    }
    //关闭pool对象
    public static void close(){
        if(pool!=null){
            pool.close();
        }
    }

}
