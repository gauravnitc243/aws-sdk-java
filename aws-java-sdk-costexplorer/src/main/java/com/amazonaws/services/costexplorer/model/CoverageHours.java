/*
 * Copyright 2013-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.costexplorer.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * How long a running instance either used a reservation or was On-Demand.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ce-2017-10-25/CoverageHours" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CoverageHours implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The number of instance running hours covered by On-Demand Instances.
     * </p>
     */
    private String onDemandHours;
    /**
     * <p>
     * The number of instance running hours covered by reservations.
     * </p>
     */
    private String reservedHours;
    /**
     * <p>
     * The total instance usage, in hours.
     * </p>
     */
    private String totalRunningHours;
    /**
     * <p>
     * The percentage of instance hours covered by a reservation.
     * </p>
     */
    private String coverageHoursPercentage;

    /**
     * <p>
     * The number of instance running hours covered by On-Demand Instances.
     * </p>
     * 
     * @param onDemandHours
     *        The number of instance running hours covered by On-Demand Instances.
     */

    public void setOnDemandHours(String onDemandHours) {
        this.onDemandHours = onDemandHours;
    }

    /**
     * <p>
     * The number of instance running hours covered by On-Demand Instances.
     * </p>
     * 
     * @return The number of instance running hours covered by On-Demand Instances.
     */

    public String getOnDemandHours() {
        return this.onDemandHours;
    }

    /**
     * <p>
     * The number of instance running hours covered by On-Demand Instances.
     * </p>
     * 
     * @param onDemandHours
     *        The number of instance running hours covered by On-Demand Instances.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CoverageHours withOnDemandHours(String onDemandHours) {
        setOnDemandHours(onDemandHours);
        return this;
    }

    /**
     * <p>
     * The number of instance running hours covered by reservations.
     * </p>
     * 
     * @param reservedHours
     *        The number of instance running hours covered by reservations.
     */

    public void setReservedHours(String reservedHours) {
        this.reservedHours = reservedHours;
    }

    /**
     * <p>
     * The number of instance running hours covered by reservations.
     * </p>
     * 
     * @return The number of instance running hours covered by reservations.
     */

    public String getReservedHours() {
        return this.reservedHours;
    }

    /**
     * <p>
     * The number of instance running hours covered by reservations.
     * </p>
     * 
     * @param reservedHours
     *        The number of instance running hours covered by reservations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CoverageHours withReservedHours(String reservedHours) {
        setReservedHours(reservedHours);
        return this;
    }

    /**
     * <p>
     * The total instance usage, in hours.
     * </p>
     * 
     * @param totalRunningHours
     *        The total instance usage, in hours.
     */

    public void setTotalRunningHours(String totalRunningHours) {
        this.totalRunningHours = totalRunningHours;
    }

    /**
     * <p>
     * The total instance usage, in hours.
     * </p>
     * 
     * @return The total instance usage, in hours.
     */

    public String getTotalRunningHours() {
        return this.totalRunningHours;
    }

    /**
     * <p>
     * The total instance usage, in hours.
     * </p>
     * 
     * @param totalRunningHours
     *        The total instance usage, in hours.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CoverageHours withTotalRunningHours(String totalRunningHours) {
        setTotalRunningHours(totalRunningHours);
        return this;
    }

    /**
     * <p>
     * The percentage of instance hours covered by a reservation.
     * </p>
     * 
     * @param coverageHoursPercentage
     *        The percentage of instance hours covered by a reservation.
     */

    public void setCoverageHoursPercentage(String coverageHoursPercentage) {
        this.coverageHoursPercentage = coverageHoursPercentage;
    }

    /**
     * <p>
     * The percentage of instance hours covered by a reservation.
     * </p>
     * 
     * @return The percentage of instance hours covered by a reservation.
     */

    public String getCoverageHoursPercentage() {
        return this.coverageHoursPercentage;
    }

    /**
     * <p>
     * The percentage of instance hours covered by a reservation.
     * </p>
     * 
     * @param coverageHoursPercentage
     *        The percentage of instance hours covered by a reservation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CoverageHours withCoverageHoursPercentage(String coverageHoursPercentage) {
        setCoverageHoursPercentage(coverageHoursPercentage);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getOnDemandHours() != null)
            sb.append("OnDemandHours: ").append(getOnDemandHours()).append(",");
        if (getReservedHours() != null)
            sb.append("ReservedHours: ").append(getReservedHours()).append(",");
        if (getTotalRunningHours() != null)
            sb.append("TotalRunningHours: ").append(getTotalRunningHours()).append(",");
        if (getCoverageHoursPercentage() != null)
            sb.append("CoverageHoursPercentage: ").append(getCoverageHoursPercentage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CoverageHours == false)
            return false;
        CoverageHours other = (CoverageHours) obj;
        if (other.getOnDemandHours() == null ^ this.getOnDemandHours() == null)
            return false;
        if (other.getOnDemandHours() != null && other.getOnDemandHours().equals(this.getOnDemandHours()) == false)
            return false;
        if (other.getReservedHours() == null ^ this.getReservedHours() == null)
            return false;
        if (other.getReservedHours() != null && other.getReservedHours().equals(this.getReservedHours()) == false)
            return false;
        if (other.getTotalRunningHours() == null ^ this.getTotalRunningHours() == null)
            return false;
        if (other.getTotalRunningHours() != null && other.getTotalRunningHours().equals(this.getTotalRunningHours()) == false)
            return false;
        if (other.getCoverageHoursPercentage() == null ^ this.getCoverageHoursPercentage() == null)
            return false;
        if (other.getCoverageHoursPercentage() != null && other.getCoverageHoursPercentage().equals(this.getCoverageHoursPercentage()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOnDemandHours() == null) ? 0 : getOnDemandHours().hashCode());
        hashCode = prime * hashCode + ((getReservedHours() == null) ? 0 : getReservedHours().hashCode());
        hashCode = prime * hashCode + ((getTotalRunningHours() == null) ? 0 : getTotalRunningHours().hashCode());
        hashCode = prime * hashCode + ((getCoverageHoursPercentage() == null) ? 0 : getCoverageHoursPercentage().hashCode());
        return hashCode;
    }

    @Override
    public CoverageHours clone() {
        try {
            return (CoverageHours) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.costexplorer.model.transform.CoverageHoursMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
