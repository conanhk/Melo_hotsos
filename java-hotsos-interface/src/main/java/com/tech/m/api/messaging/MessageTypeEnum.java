
package com.tech.m.api.messaging;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MessageTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MessageTypeEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="TEXT_MESSAGE"/&gt;
 *     &lt;enumeration value="SERVICE_ORDER"/&gt;
 *     &lt;enumeration value="ERROR"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "MessageTypeEnum")
@XmlEnum
public enum MessageTypeEnum {

    TEXT_MESSAGE,
    SERVICE_ORDER,
    ERROR;

    public String value() {
        return name();
    }

    public static MessageTypeEnum fromValue(String v) {
        return valueOf(v);
    }

}
