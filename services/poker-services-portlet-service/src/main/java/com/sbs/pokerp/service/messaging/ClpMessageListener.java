package com.sbs.pokerp.service.messaging;

import com.liferay.portal.kernel.messaging.BaseMessageListener;
import com.liferay.portal.kernel.messaging.Message;

import com.sbs.pokerp.service.BuyInLocalServiceUtil;
import com.sbs.pokerp.service.BuyOutLocalServiceUtil;
import com.sbs.pokerp.service.ClpSerializer;
import com.sbs.pokerp.service.PokerTableLocalServiceUtil;
import com.sbs.pokerp.service.PokerTablePlayerLocalServiceUtil;


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
            BuyInLocalServiceUtil.clearService();

            BuyOutLocalServiceUtil.clearService();

            PokerTableLocalServiceUtil.clearService();

            PokerTablePlayerLocalServiceUtil.clearService();
        }
    }
}
