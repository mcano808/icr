db.attributeType.save([{
	  "id" : null,
	  "name" : "ID",
	  "dataType" : "STRING",
	  "description" : "Attribute that repesents a unique identifier for a record",
	  "unique": true
	},{
	  "id" : null,
	  "name" : "START_DATE_TIME",
	  "dataType" : "DATE",
	  "description" : "The official start date/time of the record",
	  "unique": true
	},{
	  "id" : null,
	  "name" : "END_DATE_TIME",
	  "dataType" : "DATE",
	  "description" : "The official end date/time of the record",
	  "unique": true
	},{
	  "id" : null,
	  "name" : "LAT",
	  "dataType" : "DECIMAL",
	  "description" : "Attribute that repesents a latitude in decimal degrees",
	  "unique": true
	},{
	  "id" : null,
	  "name" : "LON",
	  "dataType" : "DECIMAL",
	  "description" : "Attribute that repesents a longitude in decimal degrees",
	  "unique": true
	},{
	  "id" : null,
	  "name" : "FREQ",
	  "dataType" : "DECIMAL",
	  "description" : "Attribute that repesents a frequency in megahertz",
	  "unique": true
	},{
	  "id" : null,
	  "name" : "POINT_GEOM",
	  "dataType" : "STRING",
	  "description" : "Attribute that repesents a latitude longitude pair in decimal degrees",
	  "unique": false
	},{
	  "id" : null,
	  "name" : "POLY_GEOM",
	  "dataType" : "STRING",
	  "description" : "Attribute that repesents a polygon, with lats and lons stored in decimal degrees",
	  "unique": false
	},{
	  "id" : null,
	  "name" : "LINE_GEOM",
	  "dataType" : "STRING",
	  "description" : "Attribute that repesents a line string with lats and lons store in decimal degrees",
	  "unique": false
	},{
	  "id" : null,
	  "name" : "OTHER",
	  "dataType" : null,
	  "description" : "Attribute that repesents a undefined piece of data. Any data type can be defined.",
	  "unique": false
	}]
)