package org.qydata.entity;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.List;

/**
 * Created by jonhn on 2016/11/25.
 */
public class Api implements Serializable {

    private Integer id;
    private Integer apiTypeId;
    private Integer vendorId;
    private String name;
    private Integer requestType;
    private String url;
    private String testUrl;
    private String contentType;
    private String requestClass;
    private String responseClass;
    private Integer cost;
    private Integer defaultPrice;
    private Timestamp createTime;
    private Timestamp timestamp;
    private ApiVendor apiVendor;
    private ApiType apiType;
    private ApiMobileOperator apiMobileOperator;
    private List<Customer> customerList;

    public Api() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getApiTypeId() {
        return apiTypeId;
    }

    public void setApiTypeId(Integer apiTypeId) {
        this.apiTypeId = apiTypeId;
    }

    public Integer getVendorId() {
        return vendorId;
    }

    public void setVendorId(Integer vendorId) {
        this.vendorId = vendorId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getRequestType() {
        return requestType;
    }

    public void setRequestType(Integer requestType) {
        this.requestType = requestType;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getTestUrl() {
        return testUrl;
    }

    public void setTestUrl(String testUrl) {
        this.testUrl = testUrl;
    }

    public String getContentType() {
        return contentType;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    public String getRequestClass() {
        return requestClass;
    }

    public void setRequestClass(String requestClass) {
        this.requestClass = requestClass;
    }

    public String getResponseClass() {
        return responseClass;
    }

    public void setResponseClass(String responseClass) {
        this.responseClass = responseClass;
    }

    public Integer getCost() {
        return cost;
    }

    public void setCost(Integer cost) {
        this.cost = cost;
    }

    public Integer getDefaultPrice() {
        return defaultPrice;
    }

    public void setDefaultPrice(Integer defaultPrice) {
        this.defaultPrice = defaultPrice;
    }

    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    public Timestamp getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Timestamp timestamp) {
        this.timestamp = timestamp;
    }

    public ApiVendor getApiVendor() {
        return apiVendor;
    }

    public void setApiVendor(ApiVendor apiVendor) {
        this.apiVendor = apiVendor;
    }

    public ApiType getApiType() {
        return apiType;
    }

    public void setApiType(ApiType apiType) {
        this.apiType = apiType;
    }

    public ApiMobileOperator getApiMobileOperator() {
        return apiMobileOperator;
    }

    public void setApiMobileOperator(ApiMobileOperator apiMobileOperator) {
        this.apiMobileOperator = apiMobileOperator;
    }

    public List<Customer> getCustomerList() {
        return customerList;
    }

    public void setCustomerList(List<Customer> customerList) {
        this.customerList = customerList;
    }

    @Override
    public String toString() {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            return objectMapper.writeValueAsString(this);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return null;
    }
}
