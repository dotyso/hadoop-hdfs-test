hdfs测试

准备事项：
1. 确保hdfs配置正确
1）如使用hadoop fs -ls /
2) 如访问http://master:50070

2. 修改 vim ./etc/hadoop/core-site.xml
<configuration>
<property>
  <name>fs.default.name</name>
    <value>hdfs://130.101.2.134:9000</value>
</property>
</configuration>



