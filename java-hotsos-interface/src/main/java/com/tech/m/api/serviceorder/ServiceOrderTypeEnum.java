
package com.tech.m.api.serviceorder;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ServiceOrderTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ServiceOrderTypeEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="SERVICE_ORDER"/&gt;
 *     &lt;enumeration value="INCIDENT_CANDIDATE"/&gt;
 *     &lt;enumeration value="TRANSPORTATION_ORDER"/&gt;
 *     &lt;enumeration value="INSPECTION"/&gt;
 *     &lt;enumeration value="PM_ORDER"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ServiceOrderTypeEnum")
@XmlEnum
public enum ServiceOrderTypeEnum {

    SERVICE_ORDER,
    INCIDENT_CANDIDATE,
    TRANSPORTATION_ORDER,
    INSPECTION,
    PM_ORDER;

    public String value() {
        return name();
    }

    public static ServiceOrderTypeEnum fromValue(String v) {
        return valueOf(v);
    }

}
