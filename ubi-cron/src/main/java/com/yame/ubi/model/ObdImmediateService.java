package com.yame.ubi.model;

import java.util.List;

import org.bson.conversions.Bson;
import org.springframework.stereotype.Service;

import com.mongodb.client.model.Filters;
import com.yame.db.mongo.DbHelper;
import com.yame.db.mongo.operate.DbOperate;

@Service
public class ObdImmediateService {

	public ObdImmediate getById(Long id) {
		Bson filters = Filters.eq("_id", id);
		DbOperate<ObdImmediate> obOperate =  DbHelper.use(ObdImmediate.class).withId();

		ObdImmediate o = obOperate.get(filters, null, null);
		
		return o;
	}

}
