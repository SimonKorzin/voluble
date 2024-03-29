package com.notehive.osgi.hibernate_samples.config;

import java.util.Map;

import org.springframework.orm.hibernate3.HibernateTransactionManager;

import com.notehive.osgi.hibernate_samples.model.a.A1;
import com.notehive.osgi.hibernate_samples.session.DynamicConfiguration;

public class DynamicConfigurationListener {

    public void onBind(DynamicConfiguration dynamicConfiguration, Map properties) {
    	dynamicConfiguration.addAnnotatedClass(A1.class);
    }

    public void onUnbind(DynamicConfiguration dynamicConfiguration, Map properties) {
    	dynamicConfiguration.removeAnnotatedClass(A1.class);
    }

}
