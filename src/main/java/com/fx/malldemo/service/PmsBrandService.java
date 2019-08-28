package com.fx.malldemo.service;

import com.fx.malldemo.mbg.model.PmsBrand;

import java.util.List;

/**
 * @auther: mabaofeng
 * @date: 2019/8/28 15:04
 * @description:
 */
public interface PmsBrandService {
    List<PmsBrand> listAllBrand();

    int createBrand(PmsBrand brand);

    int updateBrand(Long id, PmsBrand brand);

    int deleteBrand(Long id);

    List<PmsBrand> listBrand(int pageNum, int pageSize);

    PmsBrand getBrand(Long id);
}
