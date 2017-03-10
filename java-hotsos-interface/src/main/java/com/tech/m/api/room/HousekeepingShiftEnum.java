
package com.tech.m.api.room;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HousekeepingShiftEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="HousekeepingShiftEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="AM"/&gt;
 *     &lt;enumeration value="PM"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "HousekeepingShiftEnum")
@XmlEnum
public enum HousekeepingShiftEnum {

    AM,
    PM;

    public String value() {
        return name();
    }

    public static HousekeepingShiftEnum fromValue(String v) {
        return valueOf(v);
    }

}
