/*
 * Copyright (c) Alexander Kammerer 2015.
 *
 * All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 */

//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.08.18 at 07:48:00 PM CEST 
//

package org.eclipse.smarthome.documentation.schemas.config_description.v1_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>Java class for parameterType.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;simpleType name="parameterType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="text"/>
 *     &lt;enumeration value="integer"/>
 *     &lt;enumeration value="decimal"/>
 *     &lt;enumeration value="boolean"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 */
@XmlType(name = "parameterType") @XmlEnum public enum ParameterType {

    @XmlEnumValue("text")
    TEXT("text"),
    @XmlEnumValue("integer")
    INTEGER("integer"),
    @XmlEnumValue("decimal")
    DECIMAL("decimal"),
    @XmlEnumValue("boolean")
    BOOLEAN("boolean");
    private final String value;

    ParameterType(String v) {
        value = v;
    }

    public static ParameterType fromValue(String v) {
        for (ParameterType c : ParameterType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

    public String value() {
        return value;
    }

}
