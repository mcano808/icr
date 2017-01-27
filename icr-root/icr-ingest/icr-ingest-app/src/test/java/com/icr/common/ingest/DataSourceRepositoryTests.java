package com.icr.common.ingest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.icr.common.ingest.datamodel.AttributeMapping;
import com.icr.common.ingest.datamodel.AttributeType;
import com.icr.common.ingest.datamodel.DataSource;
import com.icr.common.ingest.datamodel.DataSourceType;
import com.icr.common.ingest.datamodel.DataType;
import com.icr.ingest.Application;
import com.icr.ingest.repositories.DataSourceRepository;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = { Application.class })
public class DataSourceRepositoryTests {

	@Autowired
	private DataSourceRepository repository;
	
	// Test Object
	private DataSource testObject;
	
	// LOGGER
	private static final Logger logger = LoggerFactory.getLogger(DataSourceRepositoryTests.class);

	@Before
	public void constructTestObject() {
		testObject = new DataSource();

		testObject.setGroupId("1001");
		testObject.setName("realestate");
		testObject.setProject("test");
		testObject.setDataSourceType(getDataSourceType());
		testObject.setAttributeMappings(getAttributeMappings());

	}

	private DataSourceType getDataSourceType() {
		return new DataSourceType("TEST", "Test data type, delete me.");
	}

	private List<AttributeMapping> getAttributeMappings() {		
		List<String> formatters = Arrays.asList("M/d/yyyy HH:mm");
		List<AttributeMapping> mappings = new ArrayList<AttributeMapping>();
		mappings.add(new AttributeMapping("MLS Number", "mls_number", new AttributeType("", "", DataType.INTEGER,false),
				null, null, null, true, false));
		mappings.add(new AttributeMapping("Last Change Timestamp", "datetime", new AttributeType("datetime", "Use this as the record time", DataType.DATE, false),
				formatters, null, null, true, false));
		mappings.add(new AttributeMapping("Type", "type", new AttributeType("", "", DataType.STRING, false),
				null, null, null, true, false));
		mappings.add(new AttributeMapping("Status", "status", new AttributeType("", "", DataType.STRING, false),
				null, null, null, true, false));
		mappings.add(new AttributeMapping("List Price", "price", new AttributeType("", "", DataType.INTEGER, false),
				null, null, null, true, false));
		mappings.add(new AttributeMapping("City", "city", new AttributeType("", "", DataType.STRING, false),
				null, null, null, true, false));
		mappings.add(new AttributeMapping("State", "state", new AttributeType("", "", DataType.STRING, false),
				null, null, null, true, false));
		mappings.add(new AttributeMapping("Zip Code", "zip", new AttributeType("", "", DataType.INTEGER, false),
				null, null, null, true, false));
		mappings.add(new AttributeMapping("County", "county", new AttributeType("", "", DataType.STRING, false),
				null, null, null, true, false));
		mappings.add(new AttributeMapping("Neighborhood", "neighborhood", new AttributeType("", "", DataType.STRING, false),
				null, null, null, true, false));
		mappings.add(new AttributeMapping("Incorporated", "incorporated", new AttributeType("", "", DataType.STRING, false),
				null, null, null, true, false));
		mappings.add(new AttributeMapping("Total Baths", "baths", new AttributeType("", "", DataType.INTEGER, false),
				null, null, null, true, false));
		mappings.add(new AttributeMapping("Total Bedrooms", "bedrooms", new AttributeType("", "", DataType.INTEGER, false),
				null, null, null, true, false));
		mappings.add(new AttributeMapping("SqFt Above", "above_sqft", new AttributeType("", "", DataType.INTEGER, false),
				null, null, null, true, false));
		mappings.add(new AttributeMapping("SqFt Finished", "finished_sqft", new AttributeType("", "", DataType.INTEGER, false),
				null, null, null, true, false));
		mappings.add(new AttributeMapping("SqFt Total", "total_sqft", new AttributeType("", "", DataType.INTEGER, false),
				null, null, null, true, false));
		mappings.add(new AttributeMapping("Measurement Source", "measurement_source", new AttributeType("", "", DataType.STRING, false),
				null, null, null, true, false));
		mappings.add(new AttributeMapping("Heating Type", "heating_type", new AttributeType("", "", DataType.STRING, false),
				null, null, null, true, false));
		mappings.add(new AttributeMapping("Fuel Type", "fuel_type", new AttributeType("", "", DataType.STRING, false),
				null, null, null, true, false));
		mappings.add(new AttributeMapping("Cooling", "cooling", new AttributeType("", "", DataType.STRING, false),
				null, null, null, true, false));
		mappings.add(new AttributeMapping("School District", "school_district", new AttributeType("", "", DataType.STRING, false),
				null, null, null, true, false));
		mappings.add(new AttributeMapping("Listing Agent Email", "agent_email", new AttributeType("", "", DataType.STRING, false),
				null, null, null, true, false));
		mappings.add(new AttributeMapping("Under Contract Date", "contract_date", new AttributeType("", "", DataType.DATE, false),
				formatters, null, null, true, false));
		mappings.add(new AttributeMapping("Sold Date", "sold_date", new AttributeType("", "", DataType.DATE, false),
				formatters, null, null, true, false));
		mappings.add(new AttributeMapping("Sold Price", "sold_price", new AttributeType("", "", DataType.INTEGER, false),
				null, null, null, true, false));
		mappings.add(new AttributeMapping("Latitude", "latitude", new AttributeType("latitude", "Latitude Field", DataType.DECIMAL, false),
				null, null, null, true, false));
		mappings.add(new AttributeMapping("Longitude", "longitude", new AttributeType("longitude", "Longitude Field", DataType.DECIMAL, false),
				null, null, null, true, false));
		return mappings;
	}

	private void testPrintDataSource() {
		ObjectMapper mapper = new ObjectMapper();
		try {
			logger.info("\n{}", mapper.writerWithDefaultPrettyPrinter().writeValueAsString(testObject));
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test 
	public void testSaveDataSource() {
		try {
			testObject = repository.save(testObject);
			testPrintDataSource();
			testDeleteDataSource(testObject);
		}
		catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	private void testDeleteDataSource(DataSource testObject) {
		int count = repository.findAll().size();
		repository.delete(testObject);
		Assert.assertNotEquals(count, repository.findAll().size());
	}
}
