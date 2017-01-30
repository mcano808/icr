db.attributeType.save([{
	  "name" : "ID",
	  "dataType" : "STRING",
	  "description" : "Attribute that repesents a unique identifier for a record",
	  "unique": true
	},{
	  "name" : "START_DATE_TIME",
	  "dataType" : "DATE",
	  "description" : "The official start date/time of the record",
	  "unique": true
	},{
	  "name" : "END_DATE_TIME",
	  "dataType" : "DATE",
	  "description" : "The official end date/time of the record",
	  "unique": true
	},{
	  "name" : "LAT",
	  "dataType" : "DECIMAL",
	  "description" : "Attribute that repesents a latitude in decimal degrees",
	  "unique": true
	},{
	  "name" : "LON",
	  "dataType" : "DECIMAL",
	  "description" : "Attribute that repesents a longitude in decimal degrees",
	  "unique": true
	},{
	  "name" : "FREQ",
	  "dataType" : "DECIMAL",
	  "description" : "Attribute that repesents a frequency in megahertz",
	  "unique": true
	},{
	  "name" : "POINT_GEOM",
	  "dataType" : "STRING",
	  "description" : "Attribute that repesents a latitude longitude pair in decimal degrees",
	  "unique": false
	},{
	  "name" : "POLY_GEOM",
	  "dataType" : "STRING",
	  "description" : "Attribute that repesents a polygon, with lats and lons stored in decimal degrees",
	  "unique": false
	},{
	  "name" : "LINE_GEOM",
	  "dataType" : "STRING",
	  "description" : "Attribute that repesents a line string with lats and lons store in decimal degrees",
	  "unique": false
	},{
	  "name" : "OTHER",
	  "dataType" : null,
	  "description" : "Attribute that repesents a undefined piece of data. Any data type can be defined.",
	  "unique": false
	}]
)