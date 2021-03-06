package com.lanmei.commodity.dao.model;

import java.util.Date;

public class CommodityImage {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column commodity_image.image_id
     *
     * @mbggenerated
     */
    private Integer imageId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column commodity_image.sku_collect_id
     *
     * @mbggenerated
     */
    private Integer skuCollectId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column commodity_image.path
     *
     * @mbggenerated
     */
    private String path;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column commodity_image.name
     *
     * @mbggenerated
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column commodity_image.is_main_img
     *
     * @mbggenerated
     */
    private Byte isMainImg;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column commodity_image.is_attr_img
     *
     * @mbggenerated
     */
    private Byte isAttrImg;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column commodity_image.upload_by
     *
     * @mbggenerated
     */
    private String uploadBy;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column commodity_image.upload_time
     *
     * @mbggenerated
     */
    private Date uploadTime;


    public CommodityImage(Integer commodityId, String path,String name, Byte isListDisplay, String uploadBy, Date uploadTime) {
        super();
        this.path = path;
        this.name = name;
        this.uploadBy = uploadBy;
        this.uploadTime = uploadTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column commodity_image.image_id
     *
     * @return the value of commodity_image.image_id
     *
     * @mbggenerated
     */
    public Integer getImageId() {
        return imageId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column commodity_image.image_id
     *
     * @param imageId the value for commodity_image.image_id
     *
     * @mbggenerated
     */
    public void setImageId(Integer imageId) {
        this.imageId = imageId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column commodity_image.sku_collect_id
     *
     * @return the value of commodity_image.sku_collect_id
     *
     * @mbggenerated
     */
    public Integer getSkuCollectId() {
        return skuCollectId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column commodity_image.sku_collect_id
     *
     * @param skuCollectId the value for commodity_image.sku_collect_id
     *
     * @mbggenerated
     */
    public void setSkuCollectId(Integer skuCollectId) {
        this.skuCollectId = skuCollectId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column commodity_image.path
     *
     * @return the value of commodity_image.path
     *
     * @mbggenerated
     */
    public String getPath() {
        return path;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column commodity_image.path
     *
     * @param path the value for commodity_image.path
     *
     * @mbggenerated
     */
    public void setPath(String path) {
        this.path = path;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column commodity_image.name
     *
     * @return the value of commodity_image.name
     *
     * @mbggenerated
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column commodity_image.name
     *
     * @param name the value for commodity_image.name
     *
     * @mbggenerated
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column commodity_image.is_main_img
     *
     * @return the value of commodity_image.is_main_img
     *
     * @mbggenerated
     */
    public Byte getIsMainImg() {
        return isMainImg;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column commodity_image.is_main_img
     *
     * @param isMainImg the value for commodity_image.is_main_img
     *
     * @mbggenerated
     */
    public void setIsMainImg(Byte isMainImg) {
        this.isMainImg = isMainImg;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column commodity_image.is_attr_img
     *
     * @return the value of commodity_image.is_attr_img
     *
     * @mbggenerated
     */
    public Byte getIsAttrImg() {
        return isAttrImg;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column commodity_image.is_attr_img
     *
     * @param isAttrImg the value for commodity_image.is_attr_img
     *
     * @mbggenerated
     */
    public void setIsAttrImg(Byte isAttrImg) {
        this.isAttrImg = isAttrImg;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column commodity_image.upload_by
     *
     * @return the value of commodity_image.upload_by
     *
     * @mbggenerated
     */
    public String getUploadBy() {
        return uploadBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column commodity_image.upload_by
     *
     * @param uploadBy the value for commodity_image.upload_by
     *
     * @mbggenerated
     */
    public void setUploadBy(String uploadBy) {
        this.uploadBy = uploadBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column commodity_image.upload_time
     *
     * @return the value of commodity_image.upload_time
     *
     * @mbggenerated
     */
    public Date getUploadTime() {
        return uploadTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column commodity_image.upload_time
     *
     * @param uploadTime the value for commodity_image.upload_time
     *
     * @mbggenerated
     */
    public void setUploadTime(Date uploadTime) {
        this.uploadTime = uploadTime;
    }
}