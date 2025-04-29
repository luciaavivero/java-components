package programmingtheiot.gda.connection.handlers;

import java.util.logging.Logger;

import org.eclipse.californium.core.coap.CoAP.ResponseCode;
import org.eclipse.californium.core.server.resources.CoapExchange;

import programmingtheiot.common.IDataMessageListener;
import programmingtheiot.common.ResourceNameEnum;
import programmingtheiot.data.DataUtil;

public class UpdateTelemetryResourceHandler extends GenericCoapResourceHandler {
    // static
	
	private static final Logger _Logger = Logger.getLogger(UpdateTelemetryResourceHandler.class.getName());

    // params

    private IDataMessageListener dataMsgListener = null;

    // constructors

    public UpdateTelemetryResourceHandler(String resourceName)
    {
        super(resourceName);
    }


    public void setDataMessageListener(IDataMessageListener listener)
	{
		if (listener != null) {
			this.dataMsgListener = listener;
		}
	}
}
