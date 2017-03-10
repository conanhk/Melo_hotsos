
package com.tech.m.api.messaging;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NotificationTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="NotificationTypeEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="MESSAGE"/&gt;
 *     &lt;enumeration value="SERVICE_ORDER"/&gt;
 *     &lt;enumeration value="REPORT"/&gt;
 *     &lt;enumeration value="ERROR"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "NotificationTypeEnum")
@XmlEnum
public enum NotificationTypeEnum {

    MESSAGE,
    SERVICE_ORDER,
    REPORT,
    ERROR;

    public String value() {
        return name();
    }

    public static NotificationTypeEnum fromValue(String v) {
        return valueOf(v);
    }

}
