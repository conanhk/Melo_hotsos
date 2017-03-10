
package com.tech.m.api.guest;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GreenChoiceEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="GreenChoiceEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ONE_TIME"/&gt;
 *     &lt;enumeration value="ENTIRE_STAY"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "GreenChoiceEnum")
@XmlEnum
public enum GreenChoiceEnum {

    ONE_TIME,
    ENTIRE_STAY;

    public String value() {
        return name();
    }

    public static GreenChoiceEnum fromValue(String v) {
        return valueOf(v);
    }

}
