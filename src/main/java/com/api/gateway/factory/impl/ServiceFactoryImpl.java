/** 
 * This program is free: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.api.gateway.factory.impl;

import org.hibernate.service.spi.ServiceException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.api.gateway.factory.ServiceFactory;
import com.common.enums.ServiceEnum;
import com.common.service.Service;

/**
 * @author laxman
 *
 */
@Component
public class ServiceFactoryImpl implements ServiceFactory {

	@Autowired
	private Service notificationService;

	@Autowired
	private Service taskService;

	@Autowired
	private Service userService;

	@Autowired
	private Service testService;

	@Autowired
	private Service enquiryService;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.common.factory.ServiceFactory#getService(com.common.enums.
	 * ServiceEnum)
	 */
	@Override
	public Service getService(ServiceEnum service) throws ServiceException {
		if (service.equals(ServiceEnum.NOTIFICATION)) {
			return notificationService;
		}
		if (service.equals(ServiceEnum.TASK)) {
			return taskService;
		}
		if (service.equals(ServiceEnum.USER)) {
			return userService;
		}
		if (service.equals(ServiceEnum.TEST)) {
			return testService;
		}
		if (service.equals(ServiceEnum.ENQUIRY)) {
			return enquiryService;
		}
		throw new ServiceException("Service is not available!");
	}

}
