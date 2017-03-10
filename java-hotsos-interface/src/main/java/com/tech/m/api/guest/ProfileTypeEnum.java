
package com.tech.m.api.guest;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProfileTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ProfileTypeEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="GUEST"/&gt;
 *     &lt;enumeration value="COMPANY"/&gt;
 *     &lt;enumeration value="TRAVEL_AGENT"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ProfileTypeEnum")
@XmlEnum
public enum ProfileTypeEnum {

    GUEST,
    COMPANY,
    TRAVEL_AGENT;

    public String value() {
        return name();
    }

    public static ProfileTypeEnum fromValue(String v) {
        return valueOf(v);
    }

}
