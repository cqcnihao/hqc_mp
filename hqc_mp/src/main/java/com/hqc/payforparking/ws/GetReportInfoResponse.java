package com.hqc.payforparking.ws;

import javax.xml.bind.annotation.*;


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
 *         &lt;element name="GetReportInfoResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "getReportInfoResult"
})
@XmlRootElement(name = "GetReportInfoResponse")
public class GetReportInfoResponse {

    @XmlElement(name = "GetReportInfoResult")
    protected String getReportInfoResult;

    /**
     * 获取getReportInfoResult属性的值。
     *
     * @return possible object is
     * {@link String }
     */
    public String getGetReportInfoResult() {
        return getReportInfoResult;
    }

    /**
     * 设置getReportInfoResult属性的值。
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setGetReportInfoResult(String value) {
        this.getReportInfoResult = value;
    }

}
