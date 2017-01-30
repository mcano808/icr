db.dataStoreJob.save([ {
	"name" : "ElasticSearch",
	"description" : "Data store for elastic search",
	"groupId" : null,
	"dataSourceId" : null,
	"state" : 0,
	"jobProperties" : [ {
		"name" : "host",
		"description" : "Hostname to connect to",
		"required" : true,
		"type" : "STRING",
		"group" : "ElasticSearch Settings",
		"defaultValue" : "localhost",
		"reference" : null
	}, {
		"name" : "port",
		"description" : "Port to connect on",
		"required" : true,
		"type" : "INTEGER",
		"group" : "ElasticSearch Settings",
		"defaultValue" : "9200",
		"reference" : null
	} ]
} ])