
package com.tech.m.api.serviceorder;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ServiceOrderEventEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ServiceOrderEventEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ASSIGNED"/&gt;
 *     &lt;enumeration value="CREATE"/&gt;
 *     &lt;enumeration value="COMPLETE"/&gt;
 *     &lt;enumeration value="PRIORITY_CHANGED"/&gt;
 *     &lt;enumeration value="START"/&gt;
 *     &lt;enumeration value="STOP"/&gt;
 *     &lt;enumeration value="VOIDED"/&gt;
 *     &lt;enumeration value="MEMO_ADDED"/&gt;
 *     &lt;enumeration value="TRADE_CHANGED"/&gt;
 *     &lt;enumeration value="CALLBACK_CHANGED"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ServiceOrderEventEnum")
@XmlEnum
public enum ServiceOrderEventEnum {

    ASSIGNED,
    CREATE,
    COMPLETE,
    PRIORITY_CHANGED,
    START,
    STOP,
    VOIDED,
    MEMO_ADDED,
    TRADE_CHANGED,
    CALLBACK_CHANGED;

    public String value() {
        return name();
    }

    public static ServiceOrderEventEnum fromValue(String v) {
        return valueOf(v);
    }

}
