
package com.tech.m.api.room;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ServiceStatusEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ServiceStatusEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="AWAITING_SERVICE"/&gt;
 *     &lt;enumeration value="VACANT_CLEANED"/&gt;
 *     &lt;enumeration value="OCCUPIED_CLEANED"/&gt;
 *     &lt;enumeration value="CLEANING_STARTED"/&gt;
 *     &lt;enumeration value="DO_NOT_DISTURB"/&gt;
 *     &lt;enumeration value="SERVICE_REFUSED"/&gt;
 *     &lt;enumeration value="STOPPED"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ServiceStatusEnum")
@XmlEnum
public enum ServiceStatusEnum {

    AWAITING_SERVICE,
    VACANT_CLEANED,
    OCCUPIED_CLEANED,
    CLEANING_STARTED,
    DO_NOT_DISTURB,
    SERVICE_REFUSED,
    STOPPED;

    public String value() {
        return name();
    }

    public static ServiceStatusEnum fromValue(String v) {
        return valueOf(v);
    }

}
