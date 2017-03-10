
package com.tech.m.api;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UserStatusEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="UserStatusEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="LOGGED_IN"/&gt;
 *     &lt;enumeration value="LOGGED_OUT"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "UserStatusEnum")
@XmlEnum
public enum UserStatusEnum {

    LOGGED_IN,
    LOGGED_OUT;

    public String value() {
        return name();
    }

    public static UserStatusEnum fromValue(String v) {
        return valueOf(v);
    }

}
