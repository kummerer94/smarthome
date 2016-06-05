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

package org.eclipse.smarthome.documentation.schemas.thing_description.v1_0;

import javax.xml.bind.annotation.*;

/**
 * <p>Java class for option complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="option">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *       &lt;attribute name="value" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD) @XmlType(name = "option", propOrder = { "value" }) public class Option {

    @XmlValue protected String value;
    @XmlAttribute(name = "value", required = true) protected String valueToFixError1;

    /**
     * Gets the value of the value property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Gets the value of the valueToFixError1 property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getValueToFixError1() {
        return valueToFixError1;
    }

    /**
     * Sets the value of the valueToFixError1 property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setValueToFixError1(String value) {
        this.valueToFixError1 = value;
    }

}