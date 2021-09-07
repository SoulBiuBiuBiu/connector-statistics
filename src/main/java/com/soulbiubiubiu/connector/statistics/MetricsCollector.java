package com.soulbiubiubiu.connector.statistics;

import org.springframework.util.StringUtils;

public class MetricsCollector {
    /**
     * 基于接口而非实现编程
     */
    private MetricsStorage metricsStorage;

    /**
     * 依赖注入
     */
    public MetricsCollector(MetricsStorage metricsStorage) {
        this.metricsStorage = metricsStorage;
    }

    public void recordRequest(RequestInfo requestInfo) {
        if (requestInfo == null || StringUtils.hasText(requestInfo.getApiName())) {
            return;
        }
        metricsStorage.saveRequestInfo(requestInfo);
    }
}