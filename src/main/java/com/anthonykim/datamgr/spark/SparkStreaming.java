package com.anthonykim.datamgr.spark;

/**
 * Created by hyuk0 on 2016-11-08.
 */
@Deprecated
public interface SparkStreaming extends Runnable {
    void setTopicName(String topicName);

    String getTopicName();

    void setPartitionAmount(Integer partitionAmount);

    Integer getPartitionAmount();
}
