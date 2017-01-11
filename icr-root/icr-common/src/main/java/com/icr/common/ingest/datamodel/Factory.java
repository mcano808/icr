package com.icr.common.ingest.datamodel;

import java.util.HashMap;
import java.util.Map;

public class Factory
{

    public static Transformer getArithmeticTransformer()
    {
	Map<String, Object>properties = new HashMap<>();
	properties.put("operation", "* 1000");
	return new Transformer("ArithmeticTransformer", properties);
    }
    
    public static Transformer getRegexTransformer()
    {
	Map<String, Object>properties = new HashMap<>();
	properties.put("search", ".*");
	properties.put("replace", "stuff");
	return new Transformer("RegexTransformer", properties);
    }
    
    public static Formatter getDateTransformer()
    {
	Map<String, Object>properties = new HashMap<>();
	properties.put("formatString", "yyyy-MM-dd HH:mm:SS");
	return new Formatter("DateTransformer", properties);
    }

}
