package com.soulbiubiubiu.connector.statistics;

import java.util.List;
import java.util.Map;

/**
 * redis存储
 * 〈功能详细描述〉
 *
 * @author Barry
 * @since 2021/9/7 14:36
 */
public class RedisMetricsStorage implements MetricsStorage {
    @Override
    public void saveRequestInfo(RequestInfo requestInfo) {

    }

    @Override
    public List<RequestInfo> getRequestInfos(String apiName, long startTimeInMillis, long endTimeInMillis) {
        return null;
    }

    @Override
    public Map<String, List<RequestInfo>> getRequestInfos(long startTimeInMillis, long endTimeInMillis) {
        return null;
    }
}
