package com.globalcollect.gateway.sdk.java.payments;

import java.net.URISyntaxException;

import com.globalcollect.gateway.sdk.java.ExampleBase;
import com.globalcollect.gateway.sdk.java.gc.GcClient;
import com.globalcollect.gateway.sdk.java.gc.payment.CancelPaymentResponse;

public class CancelPaymentExample extends ExampleBase {

	public void example() throws URISyntaxException {
		GcClient client = getGcClient();

		CancelPaymentResponse response = client.merchant("merchantId").payments().cancel("paymentId");
	}
}
