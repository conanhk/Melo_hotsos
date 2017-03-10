
package com.tech.m.api.room;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RoomRushStatusEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RoomRushStatusEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CREATED"/&gt;
 *     &lt;enumeration value="CANCELLED"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "RoomRushStatusEnum")
@XmlEnum
public enum RoomRushStatusEnum {

    CREATED,
    CANCELLED;

    public String value() {
        return name();
    }

    public static RoomRushStatusEnum fromValue(String v) {
        return valueOf(v);
    }

}
