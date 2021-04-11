package com.battcn.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("server")
public class Properes1 {
    private Integer duorou;

    private String zhoudao;

    public String getZhoudao() {
        return zhoudao;
    }

    public void setZhoudao(String zhoudao) {
        this.zhoudao = zhoudao;
    }

    public Integer getDuorou() {
        return duorou;
    }

    public void setDuorou(Integer duorou) {
        this.duorou = duorou;
    }
}
