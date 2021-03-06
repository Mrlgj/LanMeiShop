package com.lanmei.commodity.dao.mapper;

import com.lanmei.commodity.dao.model.CommoditySkuCollect;
import java.util.List;

public interface CommoditySkuCollectMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table commodity_sku_collect
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer skuCollectId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table commodity_sku_collect
     *
     * @mbggenerated
     */
    int insert(CommoditySkuCollect record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table commodity_sku_collect
     *
     * @mbggenerated
     */
    CommoditySkuCollect selectByPrimaryKey(Integer skuCollectId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table commodity_sku_collect
     *
     * @mbggenerated
     */
    List<CommoditySkuCollect> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table commodity_sku_collect
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(CommoditySkuCollect record);
}