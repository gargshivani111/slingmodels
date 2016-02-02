package com.practice.sling.impl;

import org.apache.felix.scr.annotations.sling.SlingServlet;
import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.SlingHttpServletResponse;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.api.servlets.SlingAllMethodsServlet;

import java.io.IOException;

/**
 * Created by shivani on 2/2/16.
 */
@SlingServlet(paths="/bin/service/sling" ,methods ="GET")
public class MyServlet extends SlingAllMethodsServlet{
    public void doGet(SlingHttpServletRequest request ,SlingHttpServletResponse response) throws IOException
    {
    try{
    Resource resource=request.getResourceResolver().getResource("/content/sling");
        System.out.print(resource.getPath());
    UserInfo userInfo= resource.adaptTo(UserInfo.class);


    response.getWriter().write( userInfo.getFirstName() +" "+userInfo.getLastName());

}
    catch (Exception e) {
        System.out.print("hi");
    }
    }}
