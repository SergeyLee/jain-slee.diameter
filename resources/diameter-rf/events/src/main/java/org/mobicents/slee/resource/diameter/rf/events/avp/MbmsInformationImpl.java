/*
 * JBoss, Home of Professional Open Source
 * Copyright 2011, Red Hat, Inc. and individual contributors
 * by the @authors tag. See the copyright.txt in the distribution for a
 * full listing of individual contributors.
 *
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2.1 of
 * the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 */

package org.mobicents.slee.resource.diameter.rf.events.avp;

import net.java.slee.resource.diameter.rf.events.avp.FileRepairSupported;
import net.java.slee.resource.diameter.rf.events.avp.Mbms2g3gIndicator;
import net.java.slee.resource.diameter.rf.events.avp.MbmsInformation;
import net.java.slee.resource.diameter.rf.events.avp.MbmsServiceType;
import net.java.slee.resource.diameter.rf.events.avp.MbmsUserServiceType;

import org.mobicents.slee.resource.diameter.base.events.avp.GroupedAvpImpl;

/**
 * MbmsInformationImpl.java
 *
 * <br>Project:  mobicents
 * <br>12:22:57 PM Apr 12, 2009 
 * <br>
 * @author <a href="mailto:brainslog@gmail.com"> Alexandre Mendonca </a>
 */ 
public class MbmsInformationImpl extends GroupedAvpImpl implements MbmsInformation {

  public MbmsInformationImpl() {
    super();
  }

  /**
   * @param code
   * @param vendorId
   * @param mnd
   * @param prt
   * @param value
   */
  public MbmsInformationImpl( int code, long vendorId, int mnd, int prt, byte[] value ) {
    super( code, vendorId, mnd, prt, value );
  }

  /* (non-Javadoc)
   * @see net.java.slee.resource.diameter.rf.events.avp.MbmsInformation#getFileRepairSupported()
   */
  public FileRepairSupported getFileRepairSupported() {
    return (FileRepairSupported) getAvpAsEnumerated(DiameterRfAvpCodes.FILE_REPAIR_SUPPORTED, DiameterRfAvpCodes.TGPP_VENDOR_ID, FileRepairSupported.class);
  }

  /* (non-Javadoc)
   * @see net.java.slee.resource.diameter.rf.events.avp.MbmsInformation#getMbms2g3gIndicator()
   */
  public Mbms2g3gIndicator getMbms2g3gIndicator() {
    return (Mbms2g3gIndicator) getAvpAsEnumerated(DiameterRfAvpCodes.MBMS_2G_3G_INDICATOR, DiameterRfAvpCodes.TGPP_VENDOR_ID, Mbms2g3gIndicator.class);
  }

  /* (non-Javadoc)
   * @see net.java.slee.resource.diameter.rf.events.avp.MbmsInformation#getMbmsServiceAreas()
   */
  public byte[][] getMbmsServiceAreas() {
    return getAvpsAsOctetString(DiameterRfAvpCodes.MBMS_SERVICE_AREA, DiameterRfAvpCodes.TGPP_VENDOR_ID);
  }

  /* (non-Javadoc)
   * @see net.java.slee.resource.diameter.rf.events.avp.MbmsInformation#getMbmsServiceType()
   */
  public MbmsServiceType getMbmsServiceType() {
    return (MbmsServiceType) getAvpAsEnumerated(DiameterRfAvpCodes.MBMS_SERVICE_TYPE, DiameterRfAvpCodes.TGPP_VENDOR_ID, MbmsServiceType.class);
  }

  /* (non-Javadoc)
   * @see net.java.slee.resource.diameter.rf.events.avp.MbmsInformation#getMbmsSessionIdentity()
   */
  public byte[] getMbmsSessionIdentity() {
    return getAvpAsOctetString(DiameterRfAvpCodes.MBMS_SESSION_IDENTITY, DiameterRfAvpCodes.TGPP_VENDOR_ID);
  }

  /* (non-Javadoc)
   * @see net.java.slee.resource.diameter.rf.events.avp.MbmsInformation#getMbmsUserServiceType()
   */
  public MbmsUserServiceType getMbmsUserServiceType() {
    return (MbmsUserServiceType) getAvpAsEnumerated(DiameterRfAvpCodes.MBMS_USER_SERVICE_TYPE, DiameterRfAvpCodes.TGPP_VENDOR_ID, MbmsUserServiceType.class);
  }

  /* (non-Javadoc)
   * @see net.java.slee.resource.diameter.rf.events.avp.MbmsInformation#getRai()
   */
  public String getRai() {
    return getAvpAsUTF8String(DiameterRfAvpCodes.RAI, DiameterRfAvpCodes.TGPP_VENDOR_ID);
  }

  /* (non-Javadoc)
   * @see net.java.slee.resource.diameter.rf.events.avp.MbmsInformation#getRequiredMbmsBearerCapabilities()
   */
  public String getRequiredMbmsBearerCapabilities() {
    return getAvpAsUTF8String(DiameterRfAvpCodes.REQUIRED_MBMS_BEARER_CAPABILITIES, DiameterRfAvpCodes.TGPP_VENDOR_ID);
  }

  /* (non-Javadoc)
   * @see net.java.slee.resource.diameter.rf.events.avp.MbmsInformation#getTmgi()
   */
  public byte[] getTmgi() {
    return getAvpAsOctetString(DiameterRfAvpCodes.TMGI, DiameterRfAvpCodes.TGPP_VENDOR_ID);
  }

  /* (non-Javadoc)
   * @see net.java.slee.resource.diameter.rf.events.avp.MbmsInformation#hasFileRepairSupported()
   */
  public boolean hasFileRepairSupported() {
    return hasAvp( DiameterRfAvpCodes.FILE_REPAIR_SUPPORTED, DiameterRfAvpCodes.TGPP_VENDOR_ID );
  }

  /* (non-Javadoc)
   * @see net.java.slee.resource.diameter.rf.events.avp.MbmsInformation#hasMbms2g3gIndicator()
   */
  public boolean hasMbms2g3gIndicator() {
    return hasAvp( DiameterRfAvpCodes.MBMS_2G_3G_INDICATOR, DiameterRfAvpCodes.TGPP_VENDOR_ID );
  }

  /* (non-Javadoc)
   * @see net.java.slee.resource.diameter.rf.events.avp.MbmsInformation#hasMbmsServiceType()
   */
  public boolean hasMbmsServiceType() {
    return hasAvp( DiameterRfAvpCodes.MBMS_SERVICE_TYPE, DiameterRfAvpCodes.TGPP_VENDOR_ID );
  }

  /* (non-Javadoc)
   * @see net.java.slee.resource.diameter.rf.events.avp.MbmsInformation#hasMbmsSessionIdentity()
   */
  public boolean hasMbmsSessionIdentity() {
    return hasAvp( DiameterRfAvpCodes.MBMS_SESSION_IDENTITY, DiameterRfAvpCodes.TGPP_VENDOR_ID );
  }

  /* (non-Javadoc)
   * @see net.java.slee.resource.diameter.rf.events.avp.MbmsInformation#hasMbmsUserServiceType()
   */
  public boolean hasMbmsUserServiceType() {
    return hasAvp( DiameterRfAvpCodes.MBMS_USER_SERVICE_TYPE, DiameterRfAvpCodes.TGPP_VENDOR_ID );
  }

  /* (non-Javadoc)
   * @see net.java.slee.resource.diameter.rf.events.avp.MbmsInformation#hasRai()
   */
  public boolean hasRai() {
    return hasAvp( DiameterRfAvpCodes.RAI, DiameterRfAvpCodes.TGPP_VENDOR_ID );
  }

  /* (non-Javadoc)
   * @see net.java.slee.resource.diameter.rf.events.avp.MbmsInformation#hasRequiredMbmsBearerCapabilities()
   */
  public boolean hasRequiredMbmsBearerCapabilities() {
    return hasAvp( DiameterRfAvpCodes.REQUIRED_MBMS_BEARER_CAPABILITIES, DiameterRfAvpCodes.TGPP_VENDOR_ID );
  }

  /* (non-Javadoc)
   * @see net.java.slee.resource.diameter.rf.events.avp.MbmsInformation#hasTmgi()
   */
  public boolean hasTmgi() {
    return hasAvp( DiameterRfAvpCodes.TMGI, DiameterRfAvpCodes.TGPP_VENDOR_ID );
  }

  /* (non-Javadoc)
   * @see net.java.slee.resource.diameter.rf.events.avp.MbmsInformation#setFileRepairSupported(net.java.slee.resource.diameter.rf.events.avp.FileRepairSupported)
   */
  public void setFileRepairSupported( FileRepairSupported fileRepairSupported ) {
    addAvp(DiameterRfAvpCodes.FILE_REPAIR_SUPPORTED, DiameterRfAvpCodes.TGPP_VENDOR_ID, fileRepairSupported.getValue());
  }

  /* (non-Javadoc)
   * @see net.java.slee.resource.diameter.rf.events.avp.MbmsInformation#setMbms2g3gIndicator(String)
   */
  public void setMbms2g3gIndicator( Mbms2g3gIndicator mbms2g3gIndicator ) {
    addAvp(DiameterRfAvpCodes.MBMS_2G_3G_INDICATOR, DiameterRfAvpCodes.TGPP_VENDOR_ID, mbms2g3gIndicator.getValue());
  }

  /* (non-Javadoc)
   * @see net.java.slee.resource.diameter.rf.events.avp.MbmsInformation#setMbmsServiceArea(String)
   */
  public void setMbmsServiceArea( byte[] mbmsServiceArea ) {
    addAvp(DiameterRfAvpCodes.MBMS_SERVICE_AREA, DiameterRfAvpCodes.TGPP_VENDOR_ID, mbmsServiceArea);
  }

  /* (non-Javadoc)
   * @see net.java.slee.resource.diameter.rf.events.avp.MbmsInformation#setMbmsServiceAreas(String[])
   */
  public void setMbmsServiceAreas( byte[][] mbmsServiceAreas ) {
    for(byte[] mbmsServiceArea : mbmsServiceAreas) {
      setMbmsServiceArea(mbmsServiceArea);
    }
  }

  /* (non-Javadoc)
   * @see net.java.slee.resource.diameter.rf.events.avp.MbmsInformation#setMbmsServiceType(String)
   */
  public void setMbmsServiceType( MbmsServiceType mbmsServiceType ) {
    addAvp(DiameterRfAvpCodes.MBMS_SERVICE_TYPE, DiameterRfAvpCodes.TGPP_VENDOR_ID, mbmsServiceType.getValue());
  }

  /* (non-Javadoc)
   * @see net.java.slee.resource.diameter.rf.events.avp.MbmsInformation#setMbmsSessionIdentity(String)
   */
  public void setMbmsSessionIdentity( byte[] mbmsSessionIdentity ) {
    addAvp(DiameterRfAvpCodes.MBMS_SESSION_IDENTITY, DiameterRfAvpCodes.TGPP_VENDOR_ID, mbmsSessionIdentity);
  }

  /* (non-Javadoc)
   * @see net.java.slee.resource.diameter.rf.events.avp.MbmsInformation#setMbmsUserServiceType(net.java.slee.resource.diameter.rf.events.avp.MbmsUserServiceType)
   */
  public void setMbmsUserServiceType( MbmsUserServiceType mbmsUserServiceType ) {
    addAvp(DiameterRfAvpCodes.MBMS_USER_SERVICE_TYPE, DiameterRfAvpCodes.TGPP_VENDOR_ID, mbmsUserServiceType.getValue());
  }

  /* (non-Javadoc)
   * @see net.java.slee.resource.diameter.rf.events.avp.MbmsInformation#setRai(String)
   */
  public void setRai( String rai ) {
    addAvp(DiameterRfAvpCodes.RAI, DiameterRfAvpCodes.TGPP_VENDOR_ID, rai);
  }

  /* (non-Javadoc)
   * @see net.java.slee.resource.diameter.rf.events.avp.MbmsInformation#setRequiredMbmsBearerCapabilities(String)
   */
  public void setRequiredMbmsBearerCapabilities( String requiredMbmsBearerCapabilities ) {
    addAvp(DiameterRfAvpCodes.REQUIRED_MBMS_BEARER_CAPABILITIES, DiameterRfAvpCodes.TGPP_VENDOR_ID, requiredMbmsBearerCapabilities);
  }

  /* (non-Javadoc)
   * @see net.java.slee.resource.diameter.rf.events.avp.MbmsInformation#setTmgi(String)
   */
  public void setTmgi( byte[] tmgi ) {
    addAvp(DiameterRfAvpCodes.TMGI, DiameterRfAvpCodes.TGPP_VENDOR_ID, tmgi);
  }

}
