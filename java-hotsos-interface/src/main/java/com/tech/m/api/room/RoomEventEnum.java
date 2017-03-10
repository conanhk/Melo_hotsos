
package com.tech.m.api.room;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RoomEventEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RoomEventEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="VACANT_CLEANED"/&gt;
 *     &lt;enumeration value="OCCUPIED_CLEANED"/&gt;
 *     &lt;enumeration value="CLEANING_STARTED"/&gt;
 *     &lt;enumeration value="INSPECTED"/&gt;
 *     &lt;enumeration value="SERVICE_REFUSED"/&gt;
 *     &lt;enumeration value="RETURN_LATER"/&gt;
 *     &lt;enumeration value="DO_NOT_DISTURB"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "RoomEventEnum")
@XmlEnum
public enum RoomEventEnum {

    VACANT_CLEANED,
    OCCUPIED_CLEANED,
    CLEANING_STARTED,
    INSPECTED,
    SERVICE_REFUSED,
    RETURN_LATER,
    DO_NOT_DISTURB;

    public String value() {
        return name();
    }

    public static RoomEventEnum fromValue(String v) {
        return valueOf(v);
    }

}
