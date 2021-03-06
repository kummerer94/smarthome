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
 * <p>Java class for channelGroupType complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="channelGroupType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="label" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="channels" type="{http://eclipse.org/smarthome/schemas/thing-description/v1.0.0}channels"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" use="required" type="{http://eclipse.org/smarthome/schemas/config-description/v1.0.0}idRestrictionPattern" />
 *       &lt;attribute name="advanced" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD) @XmlType(name = "channelGroupType", propOrder = { "label", "description",
        "channels" }) public class ChannelGroupType {

    @XmlElement(required = true) protected String label;
    protected String description;
    @XmlElement(required = true) protected Channels channels;
    @XmlAttribute(name = "id", required = true) protected String id;
    @XmlAttribute(name = "advanced") protected Boolean advanced;

    /**
     * Gets the value of the label property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getLabel() {
        return label;
    }

    /**
     * Sets the value of the label property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setLabel(String value) {
        this.label = value;
    }

    /**
     * Gets the value of the description property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the channels property.
     *
     * @return possible object is
     * {@link Channels }
     */
    public Channels getChannels() {
        return channels;
    }

    /**
     * Sets the value of the channels property.
     *
     * @param value allowed object is
     *              {@link Channels }
     */
    public void setChannels(Channels value) {
        this.channels = value;
    }

    /**
     * Gets the value of the id property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the advanced property.
     *
     * @return possible object is
     * {@link Boolean }
     */
    public boolean isAdvanced() {
        if (advanced == null) {
            return false;
        } else {
            return advanced;
        }
    }

    /**
     * Sets the value of the advanced property.
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setAdvanced(Boolean value) {
        this.advanced = value;
    }

}
