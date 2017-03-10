
package com.tech.m.api.fault;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for apiFaultCode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="apiFaultCode"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="UNEXPECTED_ERROR"/&gt;
 *     &lt;enumeration value="LOGIN_FAILED"/&gt;
 *     &lt;enumeration value="OBJECT_NOT_FOUND"/&gt;
 *     &lt;enumeration value="DUPLICATE_LIMIT_EXCEEDED"/&gt;
 *     &lt;enumeration value="INVALID_REQUEST"/&gt;
 *     &lt;enumeration value="REQUEST_LIMIT_EXCEEDED"/&gt;
 *     &lt;enumeration value="COLLECTION_LIMIT_EXCEEDED"/&gt;
 *     &lt;enumeration value="ACCESS_DENIED"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "apiFaultCode")
@XmlEnum
public enum ApiFaultCode {

    UNEXPECTED_ERROR,
    LOGIN_FAILED,
    OBJECT_NOT_FOUND,
    DUPLICATE_LIMIT_EXCEEDED,
    INVALID_REQUEST,
    REQUEST_LIMIT_EXCEEDED,
    COLLECTION_LIMIT_EXCEEDED,
    ACCESS_DENIED;

    public String value() {
        return name();
    }

    public static ApiFaultCode fromValue(String v) {
        return valueOf(v);
    }

}
