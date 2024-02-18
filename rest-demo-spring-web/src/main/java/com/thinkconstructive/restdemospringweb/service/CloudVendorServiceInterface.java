package com.thinkconstructive.restdemospringweb.service;

import com.thinkconstructive.restdemospringweb.model.CloudVendor;

import java.util.List;

public interface CloudVendorServiceInterface {
    public String createCloudVendor(CloudVendor cloudVendor);
    public String updateCloudVendor(CloudVendor cloudVendor);
    public String deleteCloudVendor(String cloudVendorId);
    public CloudVendor getCloudVendor(String cloudVendorId);
    public List<CloudVendor> getAllCloudVendors();
}
