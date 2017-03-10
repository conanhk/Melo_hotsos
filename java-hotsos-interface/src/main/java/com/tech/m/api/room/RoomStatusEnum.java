
package com.tech.m.api.room;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RoomStatusEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RoomStatusEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CLEAN"/&gt;
 *     &lt;enumeration value="DIRTY"/&gt;
 *     &lt;enumeration value="OUT_OF_ORDER"/&gt;
 *     &lt;enumeration value="OUT_OF_SERVICE"/&gt;
 *     &lt;enumeration value="INSPECTED"/&gt;
 *     &lt;enumeration value="PICKUP"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "RoomStatusEnum")
@XmlEnum
public enum RoomStatusEnum {

    CLEAN,
    DIRTY,
    OUT_OF_ORDER,
    OUT_OF_SERVICE,
    INSPECTED,
    PICKUP;

    public String value() {
        return name();
    }

    public static RoomStatusEnum fromValue(String v) {
        return valueOf(v);
    }

}
