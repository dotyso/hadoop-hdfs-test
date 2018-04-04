package com.divino.hadoophdfstest;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FSDataInputStream;
import org.apache.hadoop.fs.FileStatus;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.URI;

public class App {
    public static void main(String[] args) throws IOException {
    	
    	String uri = "hdfs://130.101.2.134:9000/";
    	
        // 创建Configuration对象
        Configuration conf=new Configuration();
        // 创建FileSystem对象
        FileSystem fs = FileSystem.get(URI.create(uri),conf);
        
        Path path = new Path(uri);
        FileStatus status[] = fs.listStatus(path);
        for (int i = 0; i < status.length; i++) {
        	System.out.println(status[i].getPath().toString());
        }
    }
}