db.ingestJob.save({
	  "id" : null,
	  "jobType" : "DROPBOX_CSV",
	  "name" : "Dropbox CSV",
	  "description" : "Read comma (or any delimited) files from a dropbox location.",
	  "jobProperties" : [ {
	    "name" : "Scheduling Settings Strategy",
	    "description" : "Strategy to use in Scheduling Settings (Timer driven, CRON driven)",
	    "required" : true,
	    "type" : "STRING",
	    "group" : "Scheduling Settings",
	    "defaultValue" : "Timer Driven",
	    "reference" : "GetFile.Scheduling Settings Strategy"
	  }, {
	    "name" : "Concurrent Tasks",
	    "description" : "The number of concurrent tasks to run.",
	    "required" : true,
	    "type" : "INTEGER",
	    "group" : "Scheduling Settings",
	    "defaultValue" : 1,
	    "reference" : "GetFile.Concurrent Tasks"
	  }, {
	    "name" : "Run Schedule",
	    "description" : "Amount of time that should elapse between task executions",
	    "required" : true,
	    "type" : "STRING",
	    "group" : "Scheduling Settings",
	    "defaultValue" : "0 sec",
	    "reference" : "GetFile.Run Schedule"
	  }, {
	    "name" : "Input Directory",
	    "description" : "Directory from which to read files from.",
	    "required" : true,
	    "type" : "STRING",
	    "group" : "Raw Data Input Settings",
	    "defaultValue" : null,
	    "reference" : "GetFile.Input Directory"
	  }, {
	    "name" : "File Filter",
	    "description" : "Regex for files that will be picked up.",
	    "required" : true,
	    "type" : "STRING",
	    "group" : "Raw Data Input Settings",
	    "defaultValue" : null,
	    "reference" : "GetFile.File Filter"
	  }, {
	    "name" : "Path Filter",
	    "description" : "When recursing subdirectories only scan subdirectories that match this regex.",
	    "required" : true,
	    "type" : "STRING",
	    "group" : "Advanced Raw Data Input Settings Settings",
	    "defaultValue" : null,
	    "reference" : "GetFile.Path Filter"
	  }, {
	    "name" : "Batch Size",
	    "description" : "Number files to pull in at a time.",
	    "required" : true,
	    "type" : "INTEGER",
	    "group" : "Raw Data Input Settings",
	    "defaultValue" : 10,
	    "reference" : "GetFile.Batch Size"
	  }, {
	    "name" : "Keep Source File",
	    "description" : "If true keep the original source file, otherwise delete it.",
	    "required" : true,
	    "type" : "BOOLEAN",
	    "group" : "Advanced Raw Data Input Settings Settings",
	    "defaultValue" : false,
	    "reference" : "GetFile.Keep Source File"
	  }, {
	    "name" : "Recurse Subdirectories",
	    "description" : "Pull files from subdirectories",
	    "required" : true,
	    "type" : "BOOLEAN",
	    "group" : "Advanced Raw Data Input Settings Settings",
	    "defaultValue" : false,
	    "reference" : "GetFile.Recurse Subdirectories"
	  }, {
	    "name" : "Polling Interval",
	    "description" : "How long to wait for a directory listing",
	    "required" : true,
	    "type" : "STRING",
	    "group" : "Raw Data Input Settings",
	    "defaultValue" : "0 sec",
	    "reference" : "GetFile.Polling Interval"
	  }, {
	    "name" : "Ignore Hidden Files",
	    "description" : "Whether hidden files should be ignored",
	    "required" : true,
	    "type" : "BOOLEAN",
	    "group" : "Advanced Raw Data Input Settings Settings",
	    "defaultValue" : true,
	    "reference" : "GetFile.Ignore Hidden Files"
	  }, {
	    "name" : "Minimum File Age",
	    "description" : "The minimum age a file must be in order to be pulled.",
	    "required" : true,
	    "type" : "STRING",
	    "group" : "Advanced Raw Data Input Settings Settings",
	    "defaultValue" : "0 sec",
	    "reference" : "GetFile.Minimum File Age"
	  }, {
	    "name" : "Maximum File Age",
	    "description" : "The maximum age a file must be in order to be pulled. Any file older will be ignored",
	    "required" : false,
	    "type" : "STRING",
	    "group" : "Advanced Raw Data Input Settings Settings",
	    "defaultValue" : "0 sec",
	    "reference" : "GetFile.Maximum File Age"
	  }, {
	    "name" : "Minimum File Size",
	    "description" : "The minimum size a file must be in order to be pulled.",
	    "required" : true,
	    "type" : "STRING",
	    "group" : "Advanced Raw Data Input Settings Settings",
	    "defaultValue" : "0 B",
	    "reference" : "GetFile.Minimum File Size"
	  }, {
	    "name" : "Maximum File Size",
	    "description" : "The maximum size a file must be in order to be pulled.",
	    "required" : false,
	    "type" : "STRING",
	    "group" : "Advanced Raw Data Input Settings Settings",
	    "defaultValue" : "",
	    "reference" : "GetFile.Minimum File Size"
	  }, {
	    "name" : "Delimiter Character",
	    "description" : "The delimiter to use in parsing. This is a single character",
	    "required" : true,
	    "type" : "STRING",
	    "group" : "Delimited Settings",
	    "defaultValue" : ",",
	    "reference" : ""
	  }, {
	    "name" : "Quote Character",
	    "description" : "The character that can be used to quote values so that the delimiter can be used within a single field. If not specified, a double-quote (\") will be used.",
	    "required" : true,
	    "type" : "STRING",
	    "group" : "Delimited Settings",
	    "defaultValue" : "\"",
	    "reference" : ""
	  },{
	    "name" : "Escape Character",
	    "description" : "The character that can be used to escape the Quote Character or the Delimiter within a field. If not specified, a backslash (\\) is used.",
	    "required" : true,
	    "type" : "STRING",
	    "group" : "Delimited Settings",
	    "defaultValue" : "\\",
	    "reference" : ""
	  },{
	    "name" : "Strip Characters",
	    "description" : "Whether or not quote characters and escape characters should be stripped.",
	    "required" : true,
	    "type" : "BOOLEAN",
	    "group" : "Delimited Settings",
	    "defaultValue" : true,
	    "reference" : ""
	  }, {
	    "name" : "Header Line",
	    "description" : "The line number of the header line.  Lines before the header line will be skipped. Lines are counted starting with a 1.",
	    "required" : true,
	    "type" : "INTEGER",
	    "group" : "Delimited Settings",
	    "defaultValue" : 1,
	    "reference" : ""
	  }, {
	    "name" : "Skip Lines",
	    "description" : "The lines to skip in the file.  If the header line is set then this setting represents additional lines past the header line to skip.  Lines are counted starting with a 1. ",
	    "required" : true,
	    "type" : "INTEGER",
	    "group" : "Delimited Settings",
	    "defaultValue" : 0,
	    "reference" : ""
	  }],
	  "dataSourceId" : null,
	  "active" : false
	})