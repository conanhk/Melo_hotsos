
package com.tech.m.api.serviceorder;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ServiceOrderStatusEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ServiceOrderStatusEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CREATED"/&gt;
 *     &lt;enumeration value="DIRECTED"/&gt;
 *     &lt;enumeration value="STARTED"/&gt;
 *     &lt;enumeration value="STOPPED"/&gt;
 *     &lt;enumeration value="COMPLETED"/&gt;
 *     &lt;enumeration value="CLOSED"/&gt;
 *     &lt;enumeration value="DEFERRED"/&gt;
 *     &lt;enumeration value="VOIDED"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ServiceOrderStatusEnum")
@XmlEnum
public enum ServiceOrderStatusEnum {

    CREATED,
    DIRECTED,
    STARTED,
    STOPPED,
    COMPLETED,
    CLOSED,
    DEFERRED,
    VOIDED;

    public String value() {
        return name();
    }

    public static ServiceOrderStatusEnum fromValue(String v) {
        return valueOf(v);
    }

}
