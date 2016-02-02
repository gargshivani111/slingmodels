package com.practice.sling.impl;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Model;

import javax.inject.Inject;
import javax.inject.Named;

/**
 * Created by shivani on 2/2/16.
 */
@Model(adaptables=Resource.class)
public class UserInfo {
    @Inject  @Named("name")

    private String firstName;
    @Inject    @Named("surname")
    private String lastName;
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }}