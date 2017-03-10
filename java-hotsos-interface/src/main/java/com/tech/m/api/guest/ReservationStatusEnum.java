
package com.tech.m.api.guest;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReservationStatusEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ReservationStatusEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="RESERVED"/&gt;
 *     &lt;enumeration value="CANCELLED"/&gt;
 *     &lt;enumeration value="CHECKED_IN"/&gt;
 *     &lt;enumeration value="CHECKED_OUT"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ReservationStatusEnum")
@XmlEnum
public enum ReservationStatusEnum {

    RESERVED,
    CANCELLED,
    CHECKED_IN,
    CHECKED_OUT;

    public String value() {
        return name();
    }

    public static ReservationStatusEnum fromValue(String v) {
        return valueOf(v);
    }

}
