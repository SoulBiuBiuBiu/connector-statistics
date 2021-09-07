package com.soulbiubiubiu.connector.statistics;

import java.util.List;
import java.util.Map;

/**
 * 存储接口
 *
 * @author Barry
 * @since 2021/9/7 11:48
 */
public interface MetricsStorage {
    /**
     * 保存请求请求基础信息
     *
     * @param requestInfo Metric
     * @author Barry
     * @since 2021/9/7 11:57
     **/
    void saveRequestInfo(RequestInfo requestInfo);

    /**
     * 获取Metrics
     *
     * @param apiName           接口名称
     * @param startTimeInMillis 开始时间
     * @param endTimeInMillis   结束时间
     * @return 返回Metrics
     * @author Barry
     * @since 2021/9/7 11:57
     **/
    List<RequestInfo> getRequestInfos(String apiName, long startTimeInMillis, long endTimeInMillis);

    /**
     * 获取Metrics
     *
     * @param startTimeInMillis 开始时间
     * @param endTimeInMillis   结束时间
     * @return 返回Metrics
     * @author Barry
     * @since 2021/9/7 11:57
     **/
    Map<String, List<RequestInfo>> getRequestInfos(long startTimeInMillis, long endTimeInMillis);
}
