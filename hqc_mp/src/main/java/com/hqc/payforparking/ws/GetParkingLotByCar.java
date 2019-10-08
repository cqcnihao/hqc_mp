
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
 *         &lt;element name="plateNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "plateNo"
})
@XmlRootElement(name = "GetParkingLotByCar")
public class GetParkingLotByCar {

    protected int appId;
    protected String key;
    protected String plateNo;

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

}
