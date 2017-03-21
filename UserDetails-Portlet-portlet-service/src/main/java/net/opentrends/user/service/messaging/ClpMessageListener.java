package net.opentrends.user.service.messaging;

import com.liferay.portal.kernel.messaging.BaseMessageListener;
import com.liferay.portal.kernel.messaging.Message;

import net.opentrends.user.service.AddressLocalServiceUtil;
import net.opentrends.user.service.AddressServiceUtil;
import net.opentrends.user.service.ClpSerializer;
import net.opentrends.user.service.PersonLocalServiceUtil;
import net.opentrends.user.service.PersonServiceUtil;


public class ClpMessageListener extends BaseMessageListener {
    public static String getServletContextName() {
        return ClpSerializer.getServletContextName();
    }

    @Override
    protected void doReceive(Message message) throws Exception {
        String command = message.getString("command");
        String servletContextName = message.getString("servletContextName");

        if (command.equals("undeploy") &&
                servletContextName.equals(getServletContextName())) {
            AddressLocalServiceUtil.clearService();

            AddressServiceUtil.clearService();
            PersonLocalServiceUtil.clearService();

            PersonServiceUtil.clearService();
        }
    }
}
