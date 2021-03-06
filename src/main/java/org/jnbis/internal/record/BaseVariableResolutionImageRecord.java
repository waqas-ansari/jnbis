package org.jnbis.internal.record;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author ericdsoto
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class BaseVariableResolutionImageRecord extends BaseImageRecord {
    // X.003 - IMP
    @JsonProperty("impression_type")
    private String impressionType;
    // X.004 - SRC
    @JsonProperty("source_agency")
    private String sourceAgency;
    // X.005 - FCD/PCD
    @JsonProperty("capture_date")
    private String captureDate;
    // X.008 - SLC
    @JsonProperty("scale_units")
    private String scaleUnits;
    // X.009 - HPS
    @JsonProperty("horizontal_pixel_scale")
    private String horizontalPixelScale;
    // X.010 - VPS
    @JsonProperty("vertical_pixel_scale")
    private String verticalPixelScale;
    // X.012 - BPX
    @JsonProperty("bits_per_pixel")
    private String bitsPerPixel;
    // X.016 - SHPS
    @JsonProperty("scanned_horizontal_pixel_scale")
    private String scannedHorizontalPixelScale;
    // X.017 - SVPS
    @JsonProperty("scanned_vertical_pixel_scale")
    private String scannedVerticalPixelScale;
    // X.020 - COM
    @JsonProperty("comment")
    private String comment;
    // X.030 - DMM
    @JsonProperty("device_monitoring_mode")
    private String deviceMonitoringMode;

    public String getImpressionType() {
        return impressionType;
    }

    public void setImpressionType(String impressionType) {
        this.impressionType = impressionType;
    }

    public String getSourceAgency() {
        return sourceAgency;
    }

    public void setSourceAgency(String sourceAgency) {
        this.sourceAgency = sourceAgency;
    }

    public String getCaptureDate() {
        return captureDate;
    }

    public void setCaptureDate(String captureDate) {
        this.captureDate = captureDate;
    }

    public String getScaleUnits() {
        return scaleUnits;
    }

    public void setScaleUnits(String scaleUnits) {
        this.scaleUnits = scaleUnits;
    }

    public String getHorizontalPixelScale() {
        return horizontalPixelScale;
    }

    public void setHorizontalPixelScale(String horizontalPixelScale) {
        this.horizontalPixelScale = horizontalPixelScale;
    }

    public String getVerticalPixelScale() {
        return verticalPixelScale;
    }

    public void setVerticalPixelScale(String verticalPixelScale) {
        this.verticalPixelScale = verticalPixelScale;
    }

    public String getBitsPerPixel() {
        return bitsPerPixel;
    }

    public void setBitsPerPixel(String bitsPerPixel) {
        this.bitsPerPixel = bitsPerPixel;
    }

    public String getScannedHorizontalPixelScale() {
        return scannedHorizontalPixelScale;
    }

    public void setScannedHorizontalPixelScale(String scannedHorizontalPixelScale) {
        this.scannedHorizontalPixelScale = scannedHorizontalPixelScale;
    }

    public String getScannedVerticalPixelScale() {
        return scannedVerticalPixelScale;
    }

    public void setScannedVerticalPixelScale(String scannedVerticalPixelScale) {
        this.scannedVerticalPixelScale = scannedVerticalPixelScale;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getDeviceMonitoringMode() {
        return deviceMonitoringMode;
    }

    public void setDeviceMonitoringMode(String deviceMonitoringMode) {
        this.deviceMonitoringMode = deviceMonitoringMode;
    }
}
