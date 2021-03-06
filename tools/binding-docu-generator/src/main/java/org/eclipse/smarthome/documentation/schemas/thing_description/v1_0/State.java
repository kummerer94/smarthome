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

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import java.math.BigDecimal;

/**
 * <p>Java class for state complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="state">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="options" type="{http://eclipse.org/smarthome/schemas/thing-description/v1.0.0}options" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="min" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="max" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="step" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="pattern" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="readOnly" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD) @XmlType(name = "state", propOrder = { "options" }) public class State {

    protected Options options;
    @XmlAttribute(name = "min") protected BigDecimal min;
    @XmlAttribute(name = "max") protected BigDecimal max;
    @XmlAttribute(name = "step") protected BigDecimal step;
    @XmlAttribute(name = "pattern") protected String pattern;
    @XmlAttribute(name = "readOnly") protected Boolean readOnly;

    /**
     * Gets the value of the options property.
     *
     * @return possible object is
     * {@link Options }
     */
    public Options getOptions() {
        return options;
    }

    /**
     * Sets the value of the options property.
     *
     * @param value allowed object is
     *              {@link Options }
     */
    public void setOptions(Options value) {
        this.options = value;
    }

    /**
     * Gets the value of the min property.
     *
     * @return possible object is
     * {@link BigDecimal }
     */
    public BigDecimal getMin() {
        return min;
    }

    /**
     * Sets the value of the min property.
     *
     * @param value allowed object is
     *              {@link BigDecimal }
     */
    public void setMin(BigDecimal value) {
        this.min = value;
    }

    /**
     * Gets the value of the max property.
     *
     * @return possible object is
     * {@link BigDecimal }
     */
    public BigDecimal getMax() {
        return max;
    }

    /**
     * Sets the value of the max property.
     *
     * @param value allowed object is
     *              {@link BigDecimal }
     */
    public void setMax(BigDecimal value) {
        this.max = value;
    }

    /**
     * Gets the value of the step property.
     *
     * @return possible object is
     * {@link BigDecimal }
     */
    public BigDecimal getStep() {
        return step;
    }

    /**
     * Sets the value of the step property.
     *
     * @param value allowed object is
     *              {@link BigDecimal }
     */
    public void setStep(BigDecimal value) {
        this.step = value;
    }

    /**
     * Gets the value of the pattern property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getPattern() {
        return pattern;
    }

    /**
     * Sets the value of the pattern property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setPattern(String value) {
        this.pattern = value;
    }

    /**
     * Gets the value of the readOnly property.
     *
     * @return possible object is
     * {@link Boolean }
     */
    public boolean isReadOnly() {
        if (readOnly == null) {
            return false;
        } else {
            return readOnly;
        }
    }

    /**
     * Sets the value of the readOnly property.
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setReadOnly(Boolean value) {
        this.readOnly = value;
    }

}
