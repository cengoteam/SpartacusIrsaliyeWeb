
package com.spartacus.web.soap;

import javax.xml.namespace.QName;
import javax.xml.ws.*;
import java.net.MalformedURLException;
import java.net.URL;


/**
 * e-Fatura ve e-Arsiv icin ortak yontemlerle kullanilmak uzere tasarlanmis web servis uygulamasi (ver 1.0)
 * 
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.3.0.2
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "Integration10", targetNamespace = "http://www.netle.com.tr/EDonusum/OrtakFatura/Ver1.0/", wsdlLocation = "https://test.softnet.com.tr/CommonInvoice.Web.Service/Integration10.asmx?wsdl")
public class Integration10
    extends Service
{

    private final static URL INTEGRATION10_WSDL_LOCATION;
    private final static WebServiceException INTEGRATION10_EXCEPTION;
    private final static QName INTEGRATION10_QNAME = new QName("http://www.netle.com.tr/EDonusum/OrtakFatura/Ver1.0/", "Integration10");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("https://test.softnet.com.tr/CommonInvoice.Web.Service/Integration10.asmx?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        INTEGRATION10_WSDL_LOCATION = url;
        INTEGRATION10_EXCEPTION = e;
    }

    public Integration10() {
        super(__getWsdlLocation(), INTEGRATION10_QNAME);
    }

    public Integration10(WebServiceFeature... features) {
        super(__getWsdlLocation(), INTEGRATION10_QNAME, features);
    }

    public Integration10(URL wsdlLocation) {
        super(wsdlLocation, INTEGRATION10_QNAME);
    }

    public Integration10(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, INTEGRATION10_QNAME, features);
    }

    public Integration10(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public Integration10(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns Integration10Soap
     */
    @WebEndpoint(name = "Integration10Soap")
    public Integration10Soap getIntegration10Soap() {
        return super.getPort(new QName("http://www.netle.com.tr/EDonusum/OrtakFatura/Ver1.0/", "Integration10Soap"), Integration10Soap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns Integration10Soap
     */
    @WebEndpoint(name = "Integration10Soap")
    public Integration10Soap getIntegration10Soap(WebServiceFeature... features) {
        return super.getPort(new QName("http://www.netle.com.tr/EDonusum/OrtakFatura/Ver1.0/", "Integration10Soap"), Integration10Soap.class, features);
    }

    private static URL __getWsdlLocation() {
        if (INTEGRATION10_EXCEPTION!= null) {
            throw INTEGRATION10_EXCEPTION;
        }
        return INTEGRATION10_WSDL_LOCATION;
    }

}
