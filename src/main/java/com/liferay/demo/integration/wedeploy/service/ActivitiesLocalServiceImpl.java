package com.liferay.demo.integration.wedeploy.service;

import com.liferay.demo.integration.wedeploy.model.Activity;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.MediaType;

import org.glassfish.jersey.client.JerseyClientBuilder;

public class ActivitiesLocalServiceImpl implements ActivitiesLocalService {

	/* (non-Javadoc)
	 * @see com.liferay.demo.integration.wedeploy.service.ActivitiesLocalService#getAllActivities()
	 */
	@Override
	public List<Activity> getAllActivities() {
		List<Activity> workLog = new ArrayList<Activity>();

		try {
			jsonClient = JerseyClientBuilder.newClient();

			target = jsonClient.target("http://data.demos-uk.wedeploy.io/activities");
			workLog = target.request(MediaType.APPLICATION_JSON_TYPE).get()
					.readEntity(new GenericType<List<Activity>>() {
			});

		} catch (Exception e) {
			_log.error(e.getMessage());
		}

		return workLog;
	}	

	public List<Activity> getAllActivitiesWebClient() {
		List<Activity> workLog = new ArrayList<Activity>();


		return workLog;
	}

	private Client jsonClient;
	private WebTarget target;
	
	private static Log _log = LogFactoryUtil.getLog(ActivitiesLocalServiceImpl.class);
}
