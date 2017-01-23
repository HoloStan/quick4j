package com.eliteams.quick4j.demo.service.impl;

import com.eliteams.quick4j.core.generic.GenericDao;
import com.eliteams.quick4j.core.generic.GenericServiceImpl;
import com.eliteams.quick4j.demo.dao.DemoDao;
import com.eliteams.quick4j.demo.model.DemoModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by ghu on 1/23/2017.
 */
@Service
public class DemoServiceImpl extends GenericServiceImpl<DemoModel,Long> {

    @Autowired
    private DemoDao demoDao;

    @Override
    public GenericDao getDao() {
        return demoDao;
    }
}
