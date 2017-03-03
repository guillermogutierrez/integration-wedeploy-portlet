package com.liferay.demo.integration.wedeploy.service;

import com.liferay.demo.integration.wedeploy.model.Activity;

import java.util.List;

public class ActivitiesLocalServiceUtil {

	public static List<Activity> getAllActivities() {
		return getService().getAllActivities();
	}

	private static ActivitiesLocalService getService() {
		if (service == null) {
			service = new ActivitiesLocalServiceImpl();
		}

		return service;
	}

	private static ActivitiesLocalService service;

}
