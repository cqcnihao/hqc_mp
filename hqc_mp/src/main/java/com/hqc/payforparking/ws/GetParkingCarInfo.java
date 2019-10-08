
package com.hqc.payforparking.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>anonymous complex type的 Java 类。
 *
 * <p>以下模式片段指定包含在此类中的预期内容。
 *
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="appId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="key" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="parkId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="plateNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="startTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="endTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pageIndex" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "appId",
        "key",
        "parkId",
        "plateNo",
        "startTime",
        "endTime",
        "pageIndex"
})
@XmlRootElement(name = "GetParkingCarInfo")
public class GetParkingCarInfo {

    protected int appId;
    protected String key;
    protected int parkId;
    protected String plateNo;
    protected String startTime;
    protected String endTime;
    protected String pageIndex;

    /**
     * 获取appId属性的值。
     */
    public int getAppId() {
        return appId;
    }

    /**
     * 设置appId属性的值。
     */
    public void setAppId(int value) {
        this.appId = value;
    }

    /**
     * 获取key属性的值。
     *
     * @return possible object is
     * {@link String }
     */
    public String getKey() {
        return key;
    }

    /**
     * 设置key属性的值。
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setKey(String value) {
        this.key = value;
    }

    /**
     * 获取parkId属性的值。
     */
    public int getParkId() {
        return parkId;
    }

    /**
     * 设置parkId属性的值。
     */
    public void setParkId(int value) {
        this.parkId = value;
    }

    /**
     * 获取plateNo属性的值。
     *
     * @return possible object is
     * {@link String }
     */
    public String getPlateNo() {
        return plateNo;
    }

    /**
     * 设置plateNo属性的值。
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setPlateNo(String value) {
        this.plateNo = value;
    }

    /**
     * 获取startTime属性的值。
     *
     * @return possible object is
     * {@link String }
     */
    public String getStartTime() {
        return startTime;
    }

    /**
     * 设置startTime属性的值。
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setStartTime(String value) {
        this.startTime = value;
    }

    /**
     * 获取endTime属性的值。
     *
     * @return possible object is
     * {@link String }
     */
    public String getEndTime() {
        return endTime;
    }

    /**
     * 设置endTime属性的值。
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setEndTime(String value) {
        this.endTime = value;
    }

    /**
     * 获取pageIndex属性的值。
     *
     * @return possible object is
     * {@link String }
     */
    public String getPageIndex() {
        return pageIndex;
    }

    /**
     * 设置pageIndex属性的值。
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setPageIndex(String value) {
        this.pageIndex = value;
    }

}
