package com.coolweather.android.db;

import org.litepal.crud.DataSupport;

/**
 * Created by 海贝 on 2017/3/25.
 */

public class Province extends DataSupport {

    private int id;
    private String provinceName;
    private int provinceCode;//记录省的代号

    public int getId() {
        return id;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public int getProvinceCode() {
        return provinceCode;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }
}
