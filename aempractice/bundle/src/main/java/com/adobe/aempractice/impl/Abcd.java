package com.adobe.aempractice.impl;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.api.resource.ResourceResolver;
import org.apache.sling.api.resource.ValueMap;

public class Abcd {
    private ResourceResolver resolver;
    String[] aq;
    Abcd(Resource componentResource)
    {
       resolver = componentResource.getResourceResolver();
       ValueMap properties = componentResource!=null? ValueMap.EMPTY:componentResource.adaptTo(ValueMap.class);
       aq = properties.get("aq",String[].class);
        
    }
}
